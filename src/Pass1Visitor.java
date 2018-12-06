import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

import wci.intermediate.*;
import wci.intermediate.symtabimpl.*;
import wci.util.CrossReferencer;

public class Pass1Visitor extends crappyCBaseVisitor<Integer>{
	private SymTabStack symTabStack;
    private SymTabEntry programId;
    private SymTabEntry variableId;
    private TypeSpec type;
    private String typeIndicator;
    private String functionInputBuilder;
    private ArrayList<String> localVarNames = new ArrayList<String>();
    private PrintWriter jFile;
    
    public Pass1Visitor()
    {
        // Create and initialize the symbol table stack.
        symTabStack = SymTabFactory.createSymTabStack();
        Predefined.initialize(symTabStack);
    }
    public PrintWriter getAssemblyFile() { return jFile; }
    
    @Override 
    public Integer visitProgram(crappyCParser.ProgramContext ctx) 
    { 
        Integer value = visitChildren(ctx); 
        
        // Print the cross-reference table.
        CrossReferencer crossReferencer = new CrossReferencer();
        crossReferencer.print(symTabStack);
        return value;
    }
    
    @Override 
    public Integer visitHeader(crappyCParser.HeaderContext ctx) 
    { 
        String programName = ctx.IDENTIFIER().toString();
        
        // Initialize Program Symbol Table
        programId = symTabStack.enterLocal(programName);
        programId.setDefinition(DefinitionImpl.PROGRAM);
        programId.setAttribute(SymTabKeyImpl.ROUTINE_SYMTAB, symTabStack.push());
        symTabStack.setProgramId(programId);
        
        // Create the assembly output file.
        try {
            jFile = new PrintWriter(new FileWriter(programName + ".j"));
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return 0;
        }
        
        // Emit the program header.
        jFile.println(".class public " + programName);
        jFile.println(".super java/lang/Object");
        
        // Emit the RunTimer and PascalTextIn fields.
        jFile.println();
        jFile.println(".field private static _runTimer LRunTimer;");
        jFile.println(".field private static _standardIn LPascalTextIn;");

        return visitChildren(ctx);
    }

    @Override 
    public Integer visitDeclarations(crappyCParser.DeclarationsContext ctx) 
    { 
        Integer value = visitChildren(ctx); 
        
        // Emit the program object epilogue if base nesting level
       if(symTabStack.getCurrentNestingLevel() == 1)
       {
	        jFile.println();
	        jFile.println(".method public <init>()V");
	        jFile.println();
	        jFile.println("\taload_0");
	        jFile.println("\tinvokenonvirtual    java/lang/Object/<init>()V");
	        jFile.println("\treturn");
	        jFile.println();
	        jFile.println(".limit locals 1");
	        jFile.println(".limit stack 1");
	        jFile.println(".end method");
       }
        return value;
    }

	@Override 
	public Integer visitVar_dec(crappyCParser.Var_decContext ctx) 
	{ 
		// Emit declaration line as comment for debug
		jFile.println("\n; " + ctx.getText() + "\n");
		return visitChildren(ctx); 
	
	}
	
	@Override public Integer visitVarId(crappyCParser.VarIdContext ctx) 
	{ 	
		// Enter variable into the local symbol table
		String variableName = ctx.IDENTIFIER().toString();
        variableId = symTabStack.enterLocal(variableName);
        variableId.setDefinition(DefinitionImpl.VARIABLE);
        variableId.setTypeSpec(type);  							// type from visitTypeId => stored in instance variable
        
        // Emit .field or .var of variable
        if(symTabStack.getCurrentNestingLevel() == 1) {
        jFile.println(".field private static " +
                variableId.getName() + " " + typeIndicator);
        }else {
        	int slotNum = localVarNames.size();
        	jFile.println(".var " + slotNum + " is " + 
        					variableId.getName() + " " + typeIndicator);
        	functionInputBuilder = functionInputBuilder + typeIndicator; // during building function input
        	localVarNames.add(variableId.getName());
        }
		return visitChildren(ctx); 
	}

	@Override public Integer visitTypeId(crappyCParser.TypeIdContext ctx) 
	{ 
		String typeName = ctx.getText();
		
		//Providing TypeSpec for context rules
	    if (typeName.equalsIgnoreCase("int")) {
	        type = Predefined.integerType;
	        typeIndicator = "I";
	    }
	    else if (typeName.equalsIgnoreCase("float")) {
	        type = Predefined.realType;
	        typeIndicator = "F";
	    }
	    else if(typeName.equalsIgnoreCase("bool")) {
	    	type = Predefined.booleanType;
	        typeIndicator = "I"; 			// boolean is expressed as a integer
	    }
	    else {
	        type = null;
	        typeIndicator = "?";
	    }
	    
	    return visitChildren(ctx);
	}
	@Override 
	public Integer visitFunction_def(crappyCParser.Function_defContext ctx) 
	{
		// Set function return type
		Integer value = visit(ctx.typeId());
		ctx.returnType = (type == null) ? "V" : typeIndicator;
		
		//Enter function into symbol table
		String variableName = ctx.variable().IDENTIFIER().toString();
        variableId = symTabStack.enterLocal(variableName);
        variableId.setDefinition(DefinitionImpl.FUNCTION);
        variableId.setTypeSpec(type);
        
        //Reset function helper variables
		functionInputBuilder = "";
		localVarNames = new ArrayList<String> ();
		
        // Create new symbol table for local variables
        symTabStack.push();
        
        // Visit function inputs
        visit(ctx.var_dec_list());
        ctx.inputTypes = functionInputBuilder;      // collected from each visitVarId()
        
        //Visit function declarations
        visit(ctx.declarations());
        ctx.varList = localVarNames;				// also from each visitVarId()
    
        // local variable limit
        ctx.localLim = localVarNames.size();
        
        // local stack limit;
        ctx.stackLim = 8;
        
        // remove the SymTab for local variables.
        symTabStack.pop();
		return value;
	}
	
	@Override 
	public Integer visitVarExpr(crappyCParser.VarExprContext ctx) 
	{ 
		//Lookup variable in symbol table
		String variableName = ctx.variable().IDENTIFIER().toString();
        SymTabEntry variableId = symTabStack.lookup(variableName);
        
        //Assign TypeSpec to context
        ctx.type = variableId.getTypeSpec();
        return visitChildren(ctx); 
    }
	
	@Override 
	public Integer visitFuncExpr(crappyCParser.FuncExprContext ctx) 
	{ 
		//Assigning TypeSpec
		Integer value = visitChildren(ctx); 
		ctx.type = ctx.function_call().type;
		return value;
	}
	
	@Override 
	public Integer visitAddSubExpr(crappyCParser.AddSubExprContext ctx) 
	{ 
		// Assigning TypeSpec
		Integer value = visitChildren(ctx);
        
        TypeSpec type1 = ctx.expr(0).type;
        TypeSpec type2 = ctx.expr(1).type;
        
        boolean integerMode =    (type1 == Predefined.integerType)
                              && (type2 == Predefined.integerType);
        boolean realMode    =    (type1 == Predefined.realType)
                              && (type2 == Predefined.realType);
        
        TypeSpec type = integerMode ? Predefined.integerType
                      : realMode    ? Predefined.realType
                      :               null;
        ctx.type = type;
        
        return value;
    }
	
	@Override 
	public Integer visitSignedNumberExpr(crappyCParser.SignedNumberExprContext ctx) 
	{ 
		// Assigning TypeSpec
		Integer value = visitChildren(ctx);
        ctx.type = ctx.signedNumber().type;
        return value; 
    }
	@Override 
	public Integer visitUnsignedNumberExpr(crappyCParser.UnsignedNumberExprContext ctx) 
	{ 
		// Assigning TypeSpec
		Integer value = visit(ctx.number());
        ctx.type = ctx.number().type;
        return value; 
    }
	
	@Override 
	public Integer visitBoolExpr(crappyCParser.BoolExprContext ctx) 
	{ 
		// Assigning TypeSpec
		Integer value = visitChildren(ctx);
		TypeSpec type1 = ctx.expr(0).type;
	    TypeSpec type2 = ctx.expr(1).type;
	     
	    TypeSpec type = (type1 == Predefined.booleanType) &&
	    				(type2 == Predefined.booleanType)
	    				? Predefined.booleanType
	    				: null;
	    ctx.type = type;
		return value; 
	}
	
	@Override 
	public Integer visitBoolValExpr(crappyCParser.BoolValExprContext ctx) 
	{ 
		// Assigning TypeSpec
		Integer value = visit(ctx.bool_val());
		ctx.type = ctx.bool_val().type;
		return value; 
	}
	@Override 
	public Integer visitRelExpr(crappyCParser.RelExprContext ctx) 
	{ 
		// Assigning TypeSpec
		Integer value = visitChildren(ctx);
		TypeSpec type1 = ctx.expr(0).type;
        TypeSpec type2 = ctx.expr(1).type;
        
        boolean numberMode =    (type1 == Predefined.integerType || type1 == Predefined.realType)
                              && (type2 == Predefined.integerType || type2 == Predefined.realType);
        
        TypeSpec type = numberMode ? Predefined.booleanType
                      			   : null;
        ctx.type = type;
        
        return value;
	}
	
	@Override 
	public Integer visitMulDivExpr(crappyCParser.MulDivExprContext ctx) 
	{ 
		// Assigning TypeSpec
		Integer value = visitChildren(ctx);
        
        TypeSpec type1 = ctx.expr(0).type;
        TypeSpec type2 = ctx.expr(1).type;
        
        boolean integerMode =    (type1 == Predefined.integerType)
                              && (type2 == Predefined.integerType);
        boolean realMode    =    (type1 == Predefined.realType)
                              && (type2 == Predefined.realType);
        
        TypeSpec type = integerMode ? Predefined.integerType
                      : realMode    ? Predefined.realType
                      :               null;
        ctx.type = type;
        
        return value;
    }
	
	@Override 
	public Integer visitParenExpr(crappyCParser.ParenExprContext ctx) 
	{ 
		// Assigning TypeSpec
		 Integer value = visitChildren(ctx); 
	     ctx.type = ctx.expr().type;
	     return value;
	}
	
//	@Override 
//	public Integer visitFunction_call(crappyCParser.Function_callContext ctx) 
//	{ 
//		ctx.type = symTabStack.lookupLocal(ctx.variable().IDENTIFIER().toString()).getTypeSpec();
//		
//		return visitChildren(ctx); 
//	}
	
	@Override 
	public Integer visitSignedNumber(crappyCParser.SignedNumberContext ctx) 
	{ 
		// Assigning TypeSpec
		Integer value = visit(ctx.number());
        ctx.type = ctx.number().type;
        return value; 
    }
	@Override 
	public Integer visitIntegerConst(crappyCParser.IntegerConstContext ctx) 
	{ 
		// Assigning TypeSpec
		ctx.type = Predefined.integerType;
		return visitChildren(ctx); 
	}
	@Override 
	public Integer visitFloatConst(crappyCParser.FloatConstContext ctx) 
	{ 
		// Assigning TypeSpec
		ctx.type = Predefined.realType;
		return visitChildren(ctx); 
	}
	@Override 
	public Integer visitBool_val(crappyCParser.Bool_valContext ctx) 
	{ 
		// Assigning TypeSpec
		ctx.type = Predefined.booleanType;
		return visitChildren(ctx); 
	}

}