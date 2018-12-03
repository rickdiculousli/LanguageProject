// Generated from crappyC.g4 by ANTLR 4.7.1

    import wci.intermediate.TypeSpec;
    import java.lang.String;
    import java.util.*;
    //import wci.intermediate.symtabimpl.*;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link crappyCParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface crappyCVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link crappyCParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(crappyCParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link crappyCParser#header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeader(crappyCParser.HeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link crappyCParser#declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarations(crappyCParser.DeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link crappyCParser#var_dec_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_dec_list(crappyCParser.Var_dec_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link crappyCParser#var_dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_dec(crappyCParser.Var_decContext ctx);
	/**
	 * Visit a parse tree produced by {@link crappyCParser#varId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarId(crappyCParser.VarIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link crappyCParser#main_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain_def(crappyCParser.Main_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link crappyCParser#function_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_def(crappyCParser.Function_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link crappyCParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(crappyCParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link crappyCParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(crappyCParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link crappyCParser#stmt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_list(crappyCParser.Stmt_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link crappyCParser#assignment_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_stmt(crappyCParser.Assignment_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link crappyCParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(crappyCParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link crappyCParser#then_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThen_block(crappyCParser.Then_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link crappyCParser#else_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_block(crappyCParser.Else_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link crappyCParser#for_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_stmt(crappyCParser.For_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link crappyCParser#while_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stmt(crappyCParser.While_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link crappyCParser#ret_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRet_stmt(crappyCParser.Ret_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link crappyCParser#print_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_stmt(crappyCParser.Print_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varExpr}
	 * labeled alternative in {@link crappyCParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarExpr(crappyCParser.VarExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcExpr}
	 * labeled alternative in {@link crappyCParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncExpr(crappyCParser.FuncExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addSubExpr}
	 * labeled alternative in {@link crappyCParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSubExpr(crappyCParser.AddSubExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nullExpr}
	 * labeled alternative in {@link crappyCParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullExpr(crappyCParser.NullExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unsignedNumberExpr}
	 * labeled alternative in {@link crappyCParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsignedNumberExpr(crappyCParser.UnsignedNumberExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolValExpr}
	 * labeled alternative in {@link crappyCParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolValExpr(crappyCParser.BoolValExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relExpr}
	 * labeled alternative in {@link crappyCParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelExpr(crappyCParser.RelExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolExpr}
	 * labeled alternative in {@link crappyCParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExpr(crappyCParser.BoolExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mulDivExpr}
	 * labeled alternative in {@link crappyCParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivExpr(crappyCParser.MulDivExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link crappyCParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpr(crappyCParser.ParenExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code signedNumberExpr}
	 * labeled alternative in {@link crappyCParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignedNumberExpr(crappyCParser.SignedNumberExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link crappyCParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(crappyCParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link crappyCParser#signedNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignedNumber(crappyCParser.SignedNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code integerConst}
	 * labeled alternative in {@link crappyCParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerConst(crappyCParser.IntegerConstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code floatConst}
	 * labeled alternative in {@link crappyCParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatConst(crappyCParser.FloatConstContext ctx);
	/**
	 * Visit a parse tree produced by {@link crappyCParser#mul_div_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul_div_op(crappyCParser.Mul_div_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link crappyCParser#add_sub_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_sub_op(crappyCParser.Add_sub_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link crappyCParser#bool_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_op(crappyCParser.Bool_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link crappyCParser#rel_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRel_op(crappyCParser.Rel_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link crappyCParser#typeId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeId(crappyCParser.TypeIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link crappyCParser#bool_val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_val(crappyCParser.Bool_valContext ctx);
	/**
	 * Visit a parse tree produced by {@link crappyCParser#sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSign(crappyCParser.SignContext ctx);
}