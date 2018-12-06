// Generated from crappyC.g4 by ANTLR 4.7.1

    import wci.intermediate.TypeSpec;
    import java.lang.String;
    import java.util.*;
    import wci.intermediate.SymTab;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link crappyCParser}.
 */
public interface crappyCListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link crappyCParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(crappyCParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link crappyCParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(crappyCParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link crappyCParser#header}.
	 * @param ctx the parse tree
	 */
	void enterHeader(crappyCParser.HeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link crappyCParser#header}.
	 * @param ctx the parse tree
	 */
	void exitHeader(crappyCParser.HeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link crappyCParser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterDeclarations(crappyCParser.DeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link crappyCParser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitDeclarations(crappyCParser.DeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link crappyCParser#var_dec_list}.
	 * @param ctx the parse tree
	 */
	void enterVar_dec_list(crappyCParser.Var_dec_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link crappyCParser#var_dec_list}.
	 * @param ctx the parse tree
	 */
	void exitVar_dec_list(crappyCParser.Var_dec_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link crappyCParser#var_dec}.
	 * @param ctx the parse tree
	 */
	void enterVar_dec(crappyCParser.Var_decContext ctx);
	/**
	 * Exit a parse tree produced by {@link crappyCParser#var_dec}.
	 * @param ctx the parse tree
	 */
	void exitVar_dec(crappyCParser.Var_decContext ctx);
	/**
	 * Enter a parse tree produced by {@link crappyCParser#varId}.
	 * @param ctx the parse tree
	 */
	void enterVarId(crappyCParser.VarIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link crappyCParser#varId}.
	 * @param ctx the parse tree
	 */
	void exitVarId(crappyCParser.VarIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link crappyCParser#main_def}.
	 * @param ctx the parse tree
	 */
	void enterMain_def(crappyCParser.Main_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link crappyCParser#main_def}.
	 * @param ctx the parse tree
	 */
	void exitMain_def(crappyCParser.Main_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link crappyCParser#function_def}.
	 * @param ctx the parse tree
	 */
	void enterFunction_def(crappyCParser.Function_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link crappyCParser#function_def}.
	 * @param ctx the parse tree
	 */
	void exitFunction_def(crappyCParser.Function_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link crappyCParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(crappyCParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link crappyCParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(crappyCParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link crappyCParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(crappyCParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link crappyCParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(crappyCParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link crappyCParser#stmt_list}.
	 * @param ctx the parse tree
	 */
	void enterStmt_list(crappyCParser.Stmt_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link crappyCParser#stmt_list}.
	 * @param ctx the parse tree
	 */
	void exitStmt_list(crappyCParser.Stmt_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link crappyCParser#assignment_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_stmt(crappyCParser.Assignment_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link crappyCParser#assignment_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_stmt(crappyCParser.Assignment_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link crappyCParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(crappyCParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link crappyCParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(crappyCParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link crappyCParser#then_block}.
	 * @param ctx the parse tree
	 */
	void enterThen_block(crappyCParser.Then_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link crappyCParser#then_block}.
	 * @param ctx the parse tree
	 */
	void exitThen_block(crappyCParser.Then_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link crappyCParser#else_block}.
	 * @param ctx the parse tree
	 */
	void enterElse_block(crappyCParser.Else_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link crappyCParser#else_block}.
	 * @param ctx the parse tree
	 */
	void exitElse_block(crappyCParser.Else_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link crappyCParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFor_stmt(crappyCParser.For_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link crappyCParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFor_stmt(crappyCParser.For_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link crappyCParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stmt(crappyCParser.While_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link crappyCParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stmt(crappyCParser.While_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link crappyCParser#ret_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRet_stmt(crappyCParser.Ret_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link crappyCParser#ret_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRet_stmt(crappyCParser.Ret_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link crappyCParser#print_stmt}.
	 * @param ctx the parse tree
	 */
	void enterPrint_stmt(crappyCParser.Print_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link crappyCParser#print_stmt}.
	 * @param ctx the parse tree
	 */
	void exitPrint_stmt(crappyCParser.Print_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varExpr}
	 * labeled alternative in {@link crappyCParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVarExpr(crappyCParser.VarExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varExpr}
	 * labeled alternative in {@link crappyCParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVarExpr(crappyCParser.VarExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcExpr}
	 * labeled alternative in {@link crappyCParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFuncExpr(crappyCParser.FuncExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcExpr}
	 * labeled alternative in {@link crappyCParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFuncExpr(crappyCParser.FuncExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addSubExpr}
	 * labeled alternative in {@link crappyCParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSubExpr(crappyCParser.AddSubExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addSubExpr}
	 * labeled alternative in {@link crappyCParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSubExpr(crappyCParser.AddSubExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nullExpr}
	 * labeled alternative in {@link crappyCParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNullExpr(crappyCParser.NullExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nullExpr}
	 * labeled alternative in {@link crappyCParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNullExpr(crappyCParser.NullExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unsignedNumberExpr}
	 * labeled alternative in {@link crappyCParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedNumberExpr(crappyCParser.UnsignedNumberExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unsignedNumberExpr}
	 * labeled alternative in {@link crappyCParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedNumberExpr(crappyCParser.UnsignedNumberExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolValExpr}
	 * labeled alternative in {@link crappyCParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBoolValExpr(crappyCParser.BoolValExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolValExpr}
	 * labeled alternative in {@link crappyCParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBoolValExpr(crappyCParser.BoolValExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relExpr}
	 * labeled alternative in {@link crappyCParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRelExpr(crappyCParser.RelExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relExpr}
	 * labeled alternative in {@link crappyCParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRelExpr(crappyCParser.RelExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolExpr}
	 * labeled alternative in {@link crappyCParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBoolExpr(crappyCParser.BoolExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolExpr}
	 * labeled alternative in {@link crappyCParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBoolExpr(crappyCParser.BoolExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mulDivExpr}
	 * labeled alternative in {@link crappyCParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDivExpr(crappyCParser.MulDivExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulDivExpr}
	 * labeled alternative in {@link crappyCParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDivExpr(crappyCParser.MulDivExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link crappyCParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParenExpr(crappyCParser.ParenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link crappyCParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParenExpr(crappyCParser.ParenExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code signedNumberExpr}
	 * labeled alternative in {@link crappyCParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSignedNumberExpr(crappyCParser.SignedNumberExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code signedNumberExpr}
	 * labeled alternative in {@link crappyCParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSignedNumberExpr(crappyCParser.SignedNumberExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link crappyCParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(crappyCParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link crappyCParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(crappyCParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link crappyCParser#signedNumber}.
	 * @param ctx the parse tree
	 */
	void enterSignedNumber(crappyCParser.SignedNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link crappyCParser#signedNumber}.
	 * @param ctx the parse tree
	 */
	void exitSignedNumber(crappyCParser.SignedNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integerConst}
	 * labeled alternative in {@link crappyCParser#number}.
	 * @param ctx the parse tree
	 */
	void enterIntegerConst(crappyCParser.IntegerConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integerConst}
	 * labeled alternative in {@link crappyCParser#number}.
	 * @param ctx the parse tree
	 */
	void exitIntegerConst(crappyCParser.IntegerConstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code floatConst}
	 * labeled alternative in {@link crappyCParser#number}.
	 * @param ctx the parse tree
	 */
	void enterFloatConst(crappyCParser.FloatConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code floatConst}
	 * labeled alternative in {@link crappyCParser#number}.
	 * @param ctx the parse tree
	 */
	void exitFloatConst(crappyCParser.FloatConstContext ctx);
	/**
	 * Enter a parse tree produced by {@link crappyCParser#mul_div_op}.
	 * @param ctx the parse tree
	 */
	void enterMul_div_op(crappyCParser.Mul_div_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link crappyCParser#mul_div_op}.
	 * @param ctx the parse tree
	 */
	void exitMul_div_op(crappyCParser.Mul_div_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link crappyCParser#add_sub_op}.
	 * @param ctx the parse tree
	 */
	void enterAdd_sub_op(crappyCParser.Add_sub_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link crappyCParser#add_sub_op}.
	 * @param ctx the parse tree
	 */
	void exitAdd_sub_op(crappyCParser.Add_sub_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link crappyCParser#bool_op}.
	 * @param ctx the parse tree
	 */
	void enterBool_op(crappyCParser.Bool_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link crappyCParser#bool_op}.
	 * @param ctx the parse tree
	 */
	void exitBool_op(crappyCParser.Bool_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link crappyCParser#rel_op}.
	 * @param ctx the parse tree
	 */
	void enterRel_op(crappyCParser.Rel_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link crappyCParser#rel_op}.
	 * @param ctx the parse tree
	 */
	void exitRel_op(crappyCParser.Rel_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link crappyCParser#typeId}.
	 * @param ctx the parse tree
	 */
	void enterTypeId(crappyCParser.TypeIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link crappyCParser#typeId}.
	 * @param ctx the parse tree
	 */
	void exitTypeId(crappyCParser.TypeIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link crappyCParser#bool_val}.
	 * @param ctx the parse tree
	 */
	void enterBool_val(crappyCParser.Bool_valContext ctx);
	/**
	 * Exit a parse tree produced by {@link crappyCParser#bool_val}.
	 * @param ctx the parse tree
	 */
	void exitBool_val(crappyCParser.Bool_valContext ctx);
	/**
	 * Enter a parse tree produced by {@link crappyCParser#sign}.
	 * @param ctx the parse tree
	 */
	void enterSign(crappyCParser.SignContext ctx);
	/**
	 * Exit a parse tree produced by {@link crappyCParser#sign}.
	 * @param ctx the parse tree
	 */
	void exitSign(crappyCParser.SignContext ctx);
}