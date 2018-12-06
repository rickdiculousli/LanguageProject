import java.io.PrintWriter;
import java.util.ArrayList;

import wci.intermediate.SymTab;
import wci.intermediate.SymTabEntry;
import wci.intermediate.TypeSpec;
import wci.intermediate.symtabimpl.Predefined;
import wci.intermediate.symtabimpl.SymTabKeyImpl;

public class Pass2Visitor extends crappyCBaseVisitor<Integer>{

	String programName;
    private PrintWriter jFile;
    private int labelNum = 0;
    private SymTab localVariables = null;
    public Pass2Visitor(PrintWriter jFile)
    {
        this.jFile = jFile;
    }
    
    @Override 
    public Integer visitProgram(crappyCParser.ProgramContext ctx) 
    { 
        Integer value = visitChildren(ctx); 
        jFile.close();
        return value;
    }
    
    @Override 
    public Integer visitHeader(crappyCParser.HeaderContext ctx) 
    { 
        programName = ctx.IDENTIFIER().toString();       
        return visitChildren(ctx); 
    }
    
    @Override 
    public Integer visitMain_def(crappyCParser.Main_defContext ctx) 
    { 
        // Emit the main program header.
        jFile.println();
        jFile.println(".method public static main([Ljava/lang/String;)V");
        jFile.println();
        jFile.println("\tnew RunTimer");
        jFile.println("\tdup");
        jFile.println("\tinvokenonvirtual RunTimer/<init>()V");
        jFile.println("\tputstatic        " + programName + "/_runTimer LRunTimer;");
        jFile.println("\tnew PascalTextIn");
        jFile.println("\tdup");
        jFile.println("\tinvokenonvirtual PascalTextIn/<init>()V");
        jFile.println("\tputstatic        " + programName + "/_standardIn LPascalTextIn;");
        
        Integer value = visitChildren(ctx);
        
        // Emit the main program epilogue.
        jFile.println();
        jFile.println("\tgetstatic     " + programName + "/_runTimer LRunTimer;");
        jFile.println("\tinvokevirtual RunTimer.printElapsedTime()V");
        jFile.println();
        jFile.println("\treturn");
        jFile.println();
        jFile.println(".limit locals 16");
        jFile.println(".limit stack 16");
        jFile.println(".end method");
        
        return value;
    }
    
    /****************VISITING STATEMENTS*********************/
    @Override 
    public Integer visitStmt(crappyCParser.StmtContext ctx) 
    { 
    	// Emit statement as comment for debug
        jFile.println("\n; " + ctx.getText() + "\n");
        
        return visitChildren(ctx); 
    }
    
    @Override
    public Integer visitAssignment_stmt(crappyCParser.Assignment_stmtContext ctx)
    {
    	// Put expression on top of stack
        Integer value = visit(ctx.expr());
        
        String typeInd = getTypeInd(ctx.expr().type);
        String varName = ctx.variable().IDENTIFIER().toString();
        
        // Emit local/static assignment
        if(localVariables != null && localVariables.lookup(varName) != null) {
        	// Local
        	SymTabEntry entry = localVariables.lookup(varName);
        	jFile.println("\t" + typeInd.toLowerCase() + "store\t" + entry.getAttribute(SymTabKeyImpl.SLOT)); // TODO: Optimize: use istore_0..3 
        }
        else {
        	// Static
        	jFile.println("\tputstatic\t" + programName +  "/" + varName + " " + typeInd);
        }
        return value; 
    }

    @Override 
    public Integer visitIf_stmt(crappyCParser.If_stmtContext ctx)
    { 	
    	String nextLabel = getLabel();
    	String falseLabel = "";
    	boolean hasElse = ctx.else_block() != null;
    	if(hasElse) falseLabel = getLabel();
    	
    	//Put test case boolean on top of stack
    	Integer value = visit(ctx.expr()); 			// Assuming expression is boolean expression
    	
    	//Emit IF-ELSE
    	if(hasElse) {
    		
    		jFile.println("\tifeq\t" + falseLabel);
    		
    		visit(ctx.then_block());
    		
    		jFile.println("\tgoto\t" + nextLabel);
    		jFile.println(falseLabel + ":");
    		
    		visit(ctx.else_block());
    		
    		jFile.println(nextLabel + ":");
    	}
    	//Emit IF
    	else {
    		jFile.println("\tifeq\t" + nextLabel);
    		
    		visit(ctx.then_block());
    		
    		jFile.println(nextLabel + ":");
    	}
    	
    	return value; 
    }
	
    @Override 
    public Integer visitWhile_stmt(crappyCParser.While_stmtContext ctx) 
    { 
    	String loopLabel = getLabel();
    	String nextLabel = getLabel();
    	
    	jFile.println(loopLabel + ":");
    	
    	Integer value = visit(ctx.expr());
    	
    	jFile.println("\tifeq\t" + nextLabel);
    	
    	if(ctx.stmt_list() != null) visit(ctx.stmt_list());
    	
    	jFile.println("\tgoto\t" + loopLabel);
    	jFile.println(nextLabel + ":");
    	
    	return value; 
    }
    @Override public Integer visitFor_stmt(crappyCParser.For_stmtContext ctx) 
    { 
    	Integer value = visit(ctx.assignment_stmt(0));
    	String loopLabel = getLabel();
    	String nextLabel = getLabel();
    	
    	jFile.println(loopLabel + ":");
    	visit(ctx.expr());
    	jFile.println("\tifeq\t" + nextLabel);
    	
    	if(ctx.stmt_list() != null) visit(ctx.stmt_list());
    	
    	visit(ctx.assignment_stmt(1));
    	jFile.println("\tgoto\t" + loopLabel);
    	jFile.println(nextLabel + ":");	
    	
    	return value; 
    }

    
    /**************VISITING EXPRESSIONS********************/
    @Override 
    public Integer visitAddSubExpr(crappyCParser.AddSubExprContext ctx)
    {
        Integer value = visitChildren(ctx);                
        TypeSpec type1 = ctx.expr(0).type;
        TypeSpec type2 = ctx.expr(1).type;
        
        boolean integerMode =    (type1 == Predefined.integerType)
                              && (type2 == Predefined.integerType);
        boolean realMode    =    (type1 == Predefined.realType)
                              && (type2 == Predefined.realType);
        
        String op = ctx.add_sub_op().getText();
        String opcode;

        if (op.equals("+")) {
            opcode = integerMode ? "iadd"
                   : realMode    ? "fadd"
                   :               "????";
        }
        else {
            opcode = integerMode ? "isub"
                   : realMode    ? "fsub"
                   :               "????";
        }
        
        // Emit an add or subtract instruction.
        jFile.println("\t" + opcode);
        
        return value; 
    }

    @Override 
    public Integer visitMulDivExpr(crappyCParser.MulDivExprContext ctx)
    {
        Integer value = visitChildren(ctx);
                
        TypeSpec type1 = ctx.expr(0).type;
        TypeSpec type2 = ctx.expr(1).type;
        
        boolean integerMode =    (type1 == Predefined.integerType)
                              && (type2 == Predefined.integerType);
        boolean realMode    =    (type1 == Predefined.realType)
                              && (type2 == Predefined.realType);
        
        String op = ctx.mul_div_op().getText();
        String opcode;

        if (op.equals("*")) {
            opcode = integerMode ? "imul"
                   : realMode    ? "fmul"
                   :               "f???";
        }
        else {
            opcode = integerMode ? "idiv"
                   : realMode    ? "fdiv"
                   :               "????";
        }
        
        // Emit a multiply or divide instruction.
        jFile.println("\t" + opcode);
        
        return value; 
    }
    
    @Override public Integer visitRelExpr(crappyCParser.RelExprContext ctx) 
    { 	
    	Integer value = visitChildren(ctx);
    	
    	TypeSpec type1 = ctx.expr(0).type;
        TypeSpec type2 = ctx.expr(1).type;
        
        boolean integerMode =    (type1 == Predefined.integerType)
                              && (type2 == Predefined.integerType);
        boolean realMode    =    (type1 == Predefined.realType)
                              && (type2 == Predefined.realType);
        
    	String op = ctx.rel_op().getText();
    	String opcode = "????";
    	
    	String trueLabel = getLabel();
    	String nextLabel = getLabel();
    	
    	// Do integer compare
    	if(integerMode) {
    		if (op.equals("==")) {
				opcode = "\tif_icmpeq\t";
		    }
		    else if(op.equals("!=")){
		    	opcode = "\tif_icmpne\t";
		    }
		    else if(op.equals("<")){
		    	opcode = "\tif_icmplt\t";
		    }
		    else if(op.equals("<=")){
		    	opcode = "\tif_icmple\t";
		    }
		    else if(op.equals(">")){
		    	opcode = "\tif_icmpgt\t";
		    }
		    else if(op.equals(">=")){
		    	opcode = "\tif_icmpge\t";
		    }
    	}
    	// Do float compare
    	else if(realMode) {
    		jFile.println("\tfcmpl");
			if (op.equals("==")) {
				opcode = "\tifeq\t";
		    }
		    else if(op.equals("!=")){
		    	opcode = "\tifne\t";
		    }
		    else if(op.equals("<")){
		    	opcode = "\tiflt\t";
		    }
		    else if(op.equals("<=")){
		    	opcode = "\tifle\t";
		    }
		    else if(op.equals(">")){
		    	opcode = "\tifgt\t";
		    }
		    else if(op.equals(">=")){
		    	opcode = "\tifge\t";
		    }
    	}
    	
    	jFile.println(opcode + trueLabel);
    	jFile.println("\ticonst_0");
    	jFile.println("\tgoto\t" + nextLabel);
    	jFile.println(trueLabel + ":");
    	jFile.println("\ticonst_1");
    	jFile.println(nextLabel + ":");
    	
    	return value; 
    }
    
	@Override public Integer visitBoolExpr(crappyCParser.BoolExprContext ctx) 
	{ 
		Integer value = visitChildren(ctx);
		String opcode;
		if(ctx.bool_op().getChild(0) == ctx.bool_op().AND_OP()) {
			opcode = "iand";
		}
		else {
			opcode = "ior";
		}
		
		jFile.println("\t" + opcode);
		
		return value; 
	}
    @Override 
    public Integer visitVarExpr(crappyCParser.VarExprContext ctx)
    {
        String varName = ctx.variable().IDENTIFIER().toString();
        String typeInd = getTypeInd(ctx.type);
        if(localVariables != null && localVariables.lookup(varName) != null) {
        	// Emit a local variable get instruction.
        	
        	jFile.println("\t" + typeInd.toLowerCase() + "load\t" + localVariables.lookup(varName).getAttribute(SymTabKeyImpl.SLOT));
        }
        else
        {
        	// Emit a field get instruction.
        	jFile.println("\tgetstatic\t" + programName +
        				"/" + varName + " " + typeInd);
        }
        return visitChildren(ctx); 
    }

//    @Override 
//    public Integer visitFuncExpr(crappyCParser.FuncExprContext ctx) 
//    { 
//    	return visitChildren(ctx); 
//    }
    
    /**************VISITING VALUES*****************/
    @Override 
    public Integer visitSignedNumber(crappyCParser.SignedNumberContext ctx)
    {
        Integer value = visitChildren(ctx);         
        TypeSpec type = ctx.number().type;
        
        if (ctx.sign().getChild(0) == ctx.sign().SUB_OP()) {
            String opcode = (type == Predefined.integerType) ? "ineg"
                          : (type == Predefined.realType)    ? "fneg"
                          :                                    "?neg";
            
            // Emit a negate instruction.
            jFile.println("\t" + opcode);
        }
        
        return value;
    }
    @Override 
    public Integer visitIntegerConst(crappyCParser.IntegerConstContext ctx)
    {
        // Emit a load constant instruction.
        jFile.println("\tldc\t" + ctx.getText());
        return visitChildren(ctx); 
    }

    @Override 
    public Integer visitFloatConst(crappyCParser.FloatConstContext ctx)
    {
        // Emit a load constant instruction.
        jFile.println("\tldc\t" + ctx.getText());
        return visitChildren(ctx); 
    }

    @Override
    public Integer visitBool_val(crappyCParser.Bool_valContext ctx)
    {
    	String bool = (ctx.getText().equalsIgnoreCase("true"))? 
    				"1" : "0";

    	jFile.println("\ticonst_" + bool);
    	return visitChildren(ctx);
    }
    /************PRINT STATEMENT FOR NATIVE JVM PRINT***************/
    @Override 
    public Integer visitPrint_stmt(crappyCParser.Print_stmtContext ctx) 
    { 
    	Integer value = visit(ctx.STRING_CONST());
    	int args = ctx.expr().size();
    	String string = ctx.STRING_CONST().getText();
    	
    	jFile.println("\tgetstatic\tjava/lang/System/out Ljava/io/PrintStream;");
    	jFile.println("\tldc\t" + string);
    	jFile.println("\tldc\t" + args);
		jFile.println("\tanewarray\tjava/lang/Object");
		// load arg num into stack
    	if(args > 0)
    	{
    		int index = 0;
        	while(index < args) 
        	{
            	jFile.println("\tdup");
        		jFile.println("\tldc\t" + index);
        		
        		visit(ctx.expr(index));
        		TypeSpec type = ctx.expr(index).type;
        		if(type == Predefined.integerType)
        		{
        			jFile.println("\tinvokestatic\tjava/lang/Integer.valueOf(I)Ljava/lang/Integer;");
        		}else
        		{
        			jFile.println("\tinvokestatic\tjava/lang/Float.valueOf(F)Ljava/lang/Float;");
        		}
        		jFile.println("\taastore");
        		
        		index++;
        	}
    	}
    	// Emit a printf method invokation
    	jFile.println("\tinvokevirtual\tjava/io/PrintStream.printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;");
    	jFile.println("\tpop");
    	return value;
    }
    
    
	@Override 
	public Integer visitFunction_def(crappyCParser.Function_defContext ctx) 
	{ 
		// Use symbol table to store var  slot and type
		String methodName = ctx.variable().IDENTIFIER().toString();
		String retString = getTypeInd(ctx.type);
		retString = retString.equals("?") ? "V" : retString;
		jFile.println();
		
		jFile.println(".method private static "
						+ methodName 
						+"("
						+ ctx.inputTypes
						+")"
						+ retString);
		
		localVariables = ctx.variables; // guaranteed to have one, no fear of null pointer
		ArrayList<SymTabEntry> listOfEntries = localVariables.sortedEntries();
		for(SymTabEntry e : listOfEntries)
		{
			String name = e.getName();
			String typeInd = getTypeInd(e.getTypeSpec());
			Integer slot = (Integer) e.getAttribute(SymTabKeyImpl.SLOT);
			jFile.println("\t.var " + slot + " is " + name + " " + typeInd);
		}
		for(int i = ctx.inputTypes.length() - 1; i > 0;i--) 
		{
			Character c = ctx.inputTypes.charAt(i); // type
			jFile.println("\t" + Character.toLowerCase(c) + "store\t" + i);
		}
		Integer value = visit(ctx.stmt_list());
		
		visit(ctx.ret_stmt());
		jFile.println("\t" + retString.toLowerCase() + "return");
		
		jFile.println(".limit locals " + listOfEntries.size());
        jFile.println(".limit stack 8");
        jFile.println(".end method");
        localVariables = null;
		return value;
	}
	
	//TODO:FUNCTION CALL
	@Override public Integer visitFunction_call(crappyCParser.Function_callContext ctx) 
	{ 
		Integer value = visitChildren(ctx);
		return value; 
	}

    private String getLabel() {
    	String s = String.format("L%03d", labelNum);
    	labelNum++;
    	return s;
    }
    
    private String getTypeInd(TypeSpec type) {
    	return (type == Predefined.integerType) ? "I"
                : (type == Predefined.realType)    ? "F"
                : (type == Predefined.booleanType) ? "I"
                :                                    "?";
    }
    
}
