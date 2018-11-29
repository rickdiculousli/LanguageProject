// Generated from crappyC.g4 by ANTLR 4.7.1

    import wci.intermediate.TypeSpec;
    //import wci.intermediate.symtabimpl.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class crappyCParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, MUL_OP=23, DIV_OP=24, 
		ADD_OP=25, SUB_OP=26, EQ_OP=27, AND_OP=28, OR_OP=29, NE_OP=30, LT_OP=31, 
		LE_OP=32, GT_OP=33, GE_OP=34, IDENTIFIER=35, FLOAT=36, INTEGER=37, LINE_COMMENT=38, 
		COMMENT=39, NEWLINE=40, WS=41;
	public static final int
		RULE_program = 0, RULE_header = 1, RULE_declarations = 2, RULE_var_dec_list = 3, 
		RULE_var_dec = 4, RULE_varId = 5, RULE_main_def = 6, RULE_function_def = 7, 
		RULE_function_call = 8, RULE_stmt = 9, RULE_stmt_list = 10, RULE_assignment_stmt = 11, 
		RULE_if_stmt = 12, RULE_for_stmt = 13, RULE_while_stmt = 14, RULE_ret_stmt = 15, 
		RULE_expr = 16, RULE_variable = 17, RULE_number = 18, RULE_mul_div_op = 19, 
		RULE_add_sub_op = 20, RULE_bool_op = 21, RULE_rel_op = 22, RULE_typeId = 23, 
		RULE_bool_val = 24, RULE_sign = 25;
	public static final String[] ruleNames = {
		"program", "header", "declarations", "var_dec_list", "var_dec", "varId", 
		"main_def", "function_def", "function_call", "stmt", "stmt_list", "assignment_stmt", 
		"if_stmt", "for_stmt", "while_stmt", "ret_stmt", "expr", "variable", "number", 
		"mul_div_op", "add_sub_op", "bool_op", "rel_op", "typeId", "bool_val", 
		"sign"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'class'", "'variables'", "','", "'void'", "'main'", 
		"'('", "')'", "';'", "'='", "'if'", "'else'", "'for'", "'while'", "'return'", 
		"'null'", "'int'", "'float'", "'bool'", "'true'", "'false'", "'*'", "'/'", 
		"'+'", "'-'", "'=='", "'&&'", "'||'", "'!='", "'<'", "'<='", "'>'", "'>='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, "MUL_OP", 
		"DIV_OP", "ADD_OP", "SUB_OP", "EQ_OP", "AND_OP", "OR_OP", "NE_OP", "LT_OP", 
		"LE_OP", "GT_OP", "GE_OP", "IDENTIFIER", "FLOAT", "INTEGER", "LINE_COMMENT", 
		"COMMENT", "NEWLINE", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "crappyC.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public crappyCParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public HeaderContext header() {
			return getRuleContext(HeaderContext.class,0);
		}
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public Main_defContext main_def() {
			return getRuleContext(Main_defContext.class,0);
		}
		public List<Function_defContext> function_def() {
			return getRuleContexts(Function_defContext.class);
		}
		public Function_defContext function_def(int i) {
			return getRuleContext(Function_defContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof crappyCListener ) ((crappyCListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof crappyCListener ) ((crappyCListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof crappyCVisitor ) return ((crappyCVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			header();
			setState(53);
			match(T__0);
			setState(54);
			declarations();
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__18) | (1L << T__19))) != 0)) {
				{
				{
				setState(55);
				function_def();
				}
				}
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(61);
			main_def();
			setState(62);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HeaderContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(crappyCParser.IDENTIFIER, 0); }
		public HeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof crappyCListener ) ((crappyCListener)listener).enterHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof crappyCListener ) ((crappyCListener)listener).exitHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof crappyCVisitor ) return ((crappyCVisitor<? extends T>)visitor).visitHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderContext header() throws RecognitionException {
		HeaderContext _localctx = new HeaderContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_header);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(T__2);
			setState(65);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationsContext extends ParserRuleContext {
		public Var_dec_listContext var_dec_list() {
			return getRuleContext(Var_dec_listContext.class,0);
		}
		public DeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof crappyCListener ) ((crappyCListener)listener).enterDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof crappyCListener ) ((crappyCListener)listener).exitDeclarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof crappyCVisitor ) return ((crappyCVisitor<? extends T>)visitor).visitDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(T__3);
			setState(68);
			match(T__0);
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__18) | (1L << T__19))) != 0)) {
				{
				setState(69);
				var_dec_list();
				}
			}

			setState(72);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_dec_listContext extends ParserRuleContext {
		public List<Var_decContext> var_dec() {
			return getRuleContexts(Var_decContext.class);
		}
		public Var_decContext var_dec(int i) {
			return getRuleContext(Var_decContext.class,i);
		}
		public Var_dec_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_dec_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof crappyCListener ) ((crappyCListener)listener).enterVar_dec_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof crappyCListener ) ((crappyCListener)listener).exitVar_dec_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof crappyCVisitor ) return ((crappyCVisitor<? extends T>)visitor).visitVar_dec_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_dec_listContext var_dec_list() throws RecognitionException {
		Var_dec_listContext _localctx = new Var_dec_listContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_var_dec_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			var_dec();
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(75);
				match(T__4);
				setState(76);
				var_dec();
				}
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_decContext extends ParserRuleContext {
		public TypeIdContext typeId() {
			return getRuleContext(TypeIdContext.class,0);
		}
		public VarIdContext varId() {
			return getRuleContext(VarIdContext.class,0);
		}
		public Var_decContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_dec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof crappyCListener ) ((crappyCListener)listener).enterVar_dec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof crappyCListener ) ((crappyCListener)listener).exitVar_dec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof crappyCVisitor ) return ((crappyCVisitor<? extends T>)visitor).visitVar_dec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_decContext var_dec() throws RecognitionException {
		Var_decContext _localctx = new Var_decContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_var_dec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			typeId();
			setState(83);
			varId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarIdContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(crappyCParser.IDENTIFIER, 0); }
		public VarIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof crappyCListener ) ((crappyCListener)listener).enterVarId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof crappyCListener ) ((crappyCListener)listener).exitVarId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof crappyCVisitor ) return ((crappyCVisitor<? extends T>)visitor).visitVarId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarIdContext varId() throws RecognitionException {
		VarIdContext _localctx = new VarIdContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_varId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Main_defContext extends ParserRuleContext {
		public Stmt_listContext stmt_list() {
			return getRuleContext(Stmt_listContext.class,0);
		}
		public Main_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof crappyCListener ) ((crappyCListener)listener).enterMain_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof crappyCListener ) ((crappyCListener)listener).exitMain_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof crappyCVisitor ) return ((crappyCVisitor<? extends T>)visitor).visitMain_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Main_defContext main_def() throws RecognitionException {
		Main_defContext _localctx = new Main_defContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_main_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(T__5);
			setState(88);
			match(T__6);
			setState(89);
			match(T__0);
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(90);
				stmt_list();
				}
			}

			setState(93);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_defContext extends ParserRuleContext {
		public TypeIdContext typeId() {
			return getRuleContext(TypeIdContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public Var_dec_listContext var_dec_list() {
			return getRuleContext(Var_dec_listContext.class,0);
		}
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public Stmt_listContext stmt_list() {
			return getRuleContext(Stmt_listContext.class,0);
		}
		public Function_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof crappyCListener ) ((crappyCListener)listener).enterFunction_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof crappyCListener ) ((crappyCListener)listener).exitFunction_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof crappyCVisitor ) return ((crappyCVisitor<? extends T>)visitor).visitFunction_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_defContext function_def() throws RecognitionException {
		Function_defContext _localctx = new Function_defContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_function_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			typeId();
			setState(96);
			variable();
			setState(97);
			match(T__7);
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__18) | (1L << T__19))) != 0)) {
				{
				setState(98);
				var_dec_list();
				}
			}

			setState(101);
			match(T__8);
			setState(102);
			match(T__0);
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(103);
				declarations();
				}
			}

			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(106);
				stmt_list();
				}
			}

			setState(109);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_callContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof crappyCListener ) ((crappyCListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof crappyCListener ) ((crappyCListener)listener).exitFunction_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof crappyCVisitor ) return ((crappyCVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			variable();
			setState(112);
			match(T__7);
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__16) | (1L << T__20) | (1L << T__21) | (1L << ADD_OP) | (1L << SUB_OP) | (1L << IDENTIFIER) | (1L << FLOAT) | (1L << INTEGER))) != 0)) {
				{
				setState(113);
				expr(0);
				}
			}

			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(116);
				match(T__4);
				setState(117);
				expr(0);
				}
				}
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(123);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StmtContext extends ParserRuleContext {
		public Assignment_stmtContext assignment_stmt() {
			return getRuleContext(Assignment_stmtContext.class,0);
		}
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public For_stmtContext for_stmt() {
			return getRuleContext(For_stmtContext.class,0);
		}
		public While_stmtContext while_stmt() {
			return getRuleContext(While_stmtContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Ret_stmtContext ret_stmt() {
			return getRuleContext(Ret_stmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof crappyCListener ) ((crappyCListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof crappyCListener ) ((crappyCListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof crappyCVisitor ) return ((crappyCVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_stmt);
		try {
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				assignment_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				if_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(127);
				for_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(128);
				while_stmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(129);
				function_call();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(130);
				ret_stmt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Stmt_listContext extends ParserRuleContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public Stmt_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof crappyCListener ) ((crappyCListener)listener).enterStmt_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof crappyCListener ) ((crappyCListener)listener).exitStmt_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof crappyCVisitor ) return ((crappyCVisitor<? extends T>)visitor).visitStmt_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stmt_listContext stmt_list() throws RecognitionException {
		Stmt_listContext _localctx = new Stmt_listContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_stmt_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			stmt();
			setState(134);
			match(T__9);
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(135);
				stmt();
				setState(136);
				match(T__9);
				}
				}
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_stmtContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Assignment_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof crappyCListener ) ((crappyCListener)listener).enterAssignment_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof crappyCListener ) ((crappyCListener)listener).exitAssignment_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof crappyCVisitor ) return ((crappyCVisitor<? extends T>)visitor).visitAssignment_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_stmtContext assignment_stmt() throws RecognitionException {
		Assignment_stmtContext _localctx = new Assignment_stmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_assignment_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			variable();
			setState(144);
			match(T__10);
			setState(145);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_stmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<Stmt_listContext> stmt_list() {
			return getRuleContexts(Stmt_listContext.class);
		}
		public Stmt_listContext stmt_list(int i) {
			return getRuleContext(Stmt_listContext.class,i);
		}
		public List<If_stmtContext> if_stmt() {
			return getRuleContexts(If_stmtContext.class);
		}
		public If_stmtContext if_stmt(int i) {
			return getRuleContext(If_stmtContext.class,i);
		}
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof crappyCListener ) ((crappyCListener)listener).enterIf_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof crappyCListener ) ((crappyCListener)listener).exitIf_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof crappyCVisitor ) return ((crappyCVisitor<? extends T>)visitor).visitIf_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_if_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(T__11);
			setState(148);
			match(T__7);
			setState(149);
			expr(0);
			setState(150);
			match(T__8);
			setState(151);
			match(T__0);
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(152);
				stmt_list();
				}
			}

			setState(155);
			match(T__1);
			setState(160);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(156);
					match(T__12);
					setState(157);
					if_stmt();
					}
					} 
				}
				setState(162);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(163);
				match(T__12);
				setState(164);
				match(T__0);
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << IDENTIFIER))) != 0)) {
					{
					setState(165);
					stmt_list();
					}
				}

				setState(168);
				match(T__1);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_stmtContext extends ParserRuleContext {
		public List<Assignment_stmtContext> assignment_stmt() {
			return getRuleContexts(Assignment_stmtContext.class);
		}
		public Assignment_stmtContext assignment_stmt(int i) {
			return getRuleContext(Assignment_stmtContext.class,i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Stmt_listContext stmt_list() {
			return getRuleContext(Stmt_listContext.class,0);
		}
		public For_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof crappyCListener ) ((crappyCListener)listener).enterFor_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof crappyCListener ) ((crappyCListener)listener).exitFor_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof crappyCVisitor ) return ((crappyCVisitor<? extends T>)visitor).visitFor_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_stmtContext for_stmt() throws RecognitionException {
		For_stmtContext _localctx = new For_stmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_for_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(T__13);
			setState(172);
			match(T__7);
			setState(173);
			assignment_stmt();
			setState(174);
			match(T__9);
			setState(175);
			expr(0);
			setState(176);
			match(T__9);
			setState(177);
			assignment_stmt();
			setState(178);
			match(T__8);
			setState(179);
			match(T__0);
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(180);
				stmt_list();
				}
			}

			setState(183);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_stmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Stmt_listContext stmt_list() {
			return getRuleContext(Stmt_listContext.class,0);
		}
		public While_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof crappyCListener ) ((crappyCListener)listener).enterWhile_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof crappyCListener ) ((crappyCListener)listener).exitWhile_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof crappyCVisitor ) return ((crappyCVisitor<? extends T>)visitor).visitWhile_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_stmtContext while_stmt() throws RecognitionException {
		While_stmtContext _localctx = new While_stmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_while_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(T__14);
			setState(186);
			match(T__7);
			setState(187);
			expr(0);
			setState(188);
			match(T__8);
			setState(189);
			match(T__0);
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(190);
				stmt_list();
				}
			}

			setState(193);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ret_stmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Ret_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ret_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof crappyCListener ) ((crappyCListener)listener).enterRet_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof crappyCListener ) ((crappyCListener)listener).exitRet_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof crappyCVisitor ) return ((crappyCVisitor<? extends T>)visitor).visitRet_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ret_stmtContext ret_stmt() throws RecognitionException {
		Ret_stmtContext _localctx = new Ret_stmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_ret_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(T__15);
			setState(196);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public TypeSpec type = null;
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
			this.type = ctx.type;
		}
	}
	public static class VarExprContext extends ExprContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public VarExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof crappyCListener ) ((crappyCListener)listener).enterVarExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof crappyCListener ) ((crappyCListener)listener).exitVarExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof crappyCVisitor ) return ((crappyCVisitor<? extends T>)visitor).visitVarExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncExprContext extends ExprContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public FuncExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof crappyCListener ) ((crappyCListener)listener).enterFuncExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof crappyCListener ) ((crappyCListener)listener).exitFuncExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof crappyCVisitor ) return ((crappyCVisitor<? extends T>)visitor).visitFuncExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddSubExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Add_sub_opContext add_sub_op() {
			return getRuleContext(Add_sub_opContext.class,0);
		}
		public AddSubExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof crappyCListener ) ((crappyCListener)listener).enterAddSubExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof crappyCListener ) ((crappyCListener)listener).exitAddSubExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof crappyCVisitor ) return ((crappyCVisitor<? extends T>)visitor).visitAddSubExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NullExprContext extends ExprContext {
		public NullExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof crappyCListener ) ((crappyCListener)listener).enterNullExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof crappyCListener ) ((crappyCListener)listener).exitNullExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof crappyCVisitor ) return ((crappyCVisitor<? extends T>)visitor).visitNullExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberExprContext extends ExprContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public NumberExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof crappyCListener ) ((crappyCListener)listener).enterNumberExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof crappyCListener ) ((crappyCListener)listener).exitNumberExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof crappyCVisitor ) return ((crappyCVisitor<? extends T>)visitor).visitNumberExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolValExprContext extends ExprContext {
		public Bool_valContext bool_val() {
			return getRuleContext(Bool_valContext.class,0);
		}
		public BoolValExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof crappyCListener ) ((crappyCListener)listener).enterBoolValExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof crappyCListener ) ((crappyCListener)listener).exitBoolValExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof crappyCVisitor ) return ((crappyCVisitor<? extends T>)visitor).visitBoolValExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Rel_opContext rel_op() {
			return getRuleContext(Rel_opContext.class,0);
		}
		public RelExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof crappyCListener ) ((crappyCListener)listener).enterRelExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof crappyCListener ) ((crappyCListener)listener).exitRelExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof crappyCVisitor ) return ((crappyCVisitor<? extends T>)visitor).visitRelExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Bool_opContext bool_op() {
			return getRuleContext(Bool_opContext.class,0);
		}
		public BoolExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof crappyCListener ) ((crappyCListener)listener).enterBoolExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof crappyCListener ) ((crappyCListener)listener).exitBoolExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof crappyCVisitor ) return ((crappyCVisitor<? extends T>)visitor).visitBoolExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulDivExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Mul_div_opContext mul_div_op() {
			return getRuleContext(Mul_div_opContext.class,0);
		}
		public MulDivExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof crappyCListener ) ((crappyCListener)listener).enterMulDivExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof crappyCListener ) ((crappyCListener)listener).exitMulDivExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof crappyCVisitor ) return ((crappyCVisitor<? extends T>)visitor).visitMulDivExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParenExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof crappyCListener ) ((crappyCListener)listener).enterParenExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof crappyCListener ) ((crappyCListener)listener).exitParenExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof crappyCVisitor ) return ((crappyCVisitor<? extends T>)visitor).visitParenExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				_localctx = new NumberExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(199);
				number();
				}
				break;
			case 2:
				{
				_localctx = new BoolValExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(200);
				bool_val();
				}
				break;
			case 3:
				{
				_localctx = new VarExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(201);
				variable();
				}
				break;
			case 4:
				{
				_localctx = new FuncExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(202);
				function_call();
				}
				break;
			case 5:
				{
				_localctx = new ParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(203);
				match(T__7);
				setState(204);
				expr(0);
				setState(205);
				match(T__8);
				}
				break;
			case 6:
				{
				_localctx = new NullExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(207);
				match(T__16);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(228);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(226);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(210);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(211);
						mul_div_op();
						setState(212);
						expr(11);
						}
						break;
					case 2:
						{
						_localctx = new AddSubExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(214);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(215);
						add_sub_op();
						setState(216);
						expr(10);
						}
						break;
					case 3:
						{
						_localctx = new RelExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(218);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(219);
						rel_op();
						setState(220);
						expr(9);
						}
						break;
					case 4:
						{
						_localctx = new BoolExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(222);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(223);
						bool_op();
						setState(224);
						expr(8);
						}
						break;
					}
					} 
				}
				setState(230);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(crappyCParser.IDENTIFIER, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof crappyCListener ) ((crappyCListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof crappyCListener ) ((crappyCListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof crappyCVisitor ) return ((crappyCVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public TypeSpec type = null;
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	 
		public NumberContext() { }
		public void copyFrom(NumberContext ctx) {
			super.copyFrom(ctx);
			this.type = ctx.type;
		}
	}
	public static class FloatConstContext extends NumberContext {
		public TerminalNode FLOAT() { return getToken(crappyCParser.FLOAT, 0); }
		public SignContext sign() {
			return getRuleContext(SignContext.class,0);
		}
		public FloatConstContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof crappyCListener ) ((crappyCListener)listener).enterFloatConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof crappyCListener ) ((crappyCListener)listener).exitFloatConst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof crappyCVisitor ) return ((crappyCVisitor<? extends T>)visitor).visitFloatConst(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerConstContext extends NumberContext {
		public TerminalNode INTEGER() { return getToken(crappyCParser.INTEGER, 0); }
		public SignContext sign() {
			return getRuleContext(SignContext.class,0);
		}
		public IntegerConstContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof crappyCListener ) ((crappyCListener)listener).enterIntegerConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof crappyCListener ) ((crappyCListener)listener).exitIntegerConst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof crappyCVisitor ) return ((crappyCVisitor<? extends T>)visitor).visitIntegerConst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_number);
		int _la;
		try {
			setState(241);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				_localctx = new IntegerConstContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ADD_OP || _la==SUB_OP) {
					{
					setState(233);
					sign();
					}
				}

				setState(236);
				match(INTEGER);
				}
				break;
			case 2:
				_localctx = new FloatConstContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ADD_OP || _la==SUB_OP) {
					{
					setState(237);
					sign();
					}
				}

				setState(240);
				match(FLOAT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Mul_div_opContext extends ParserRuleContext {
		public TerminalNode MUL_OP() { return getToken(crappyCParser.MUL_OP, 0); }
		public TerminalNode DIV_OP() { return getToken(crappyCParser.DIV_OP, 0); }
		public Mul_div_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mul_div_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof crappyCListener ) ((crappyCListener)listener).enterMul_div_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof crappyCListener ) ((crappyCListener)listener).exitMul_div_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof crappyCVisitor ) return ((crappyCVisitor<? extends T>)visitor).visitMul_div_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mul_div_opContext mul_div_op() throws RecognitionException {
		Mul_div_opContext _localctx = new Mul_div_opContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_mul_div_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			_la = _input.LA(1);
			if ( !(_la==MUL_OP || _la==DIV_OP) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Add_sub_opContext extends ParserRuleContext {
		public TerminalNode ADD_OP() { return getToken(crappyCParser.ADD_OP, 0); }
		public TerminalNode SUB_OP() { return getToken(crappyCParser.SUB_OP, 0); }
		public Add_sub_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_sub_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof crappyCListener ) ((crappyCListener)listener).enterAdd_sub_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof crappyCListener ) ((crappyCListener)listener).exitAdd_sub_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof crappyCVisitor ) return ((crappyCVisitor<? extends T>)visitor).visitAdd_sub_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Add_sub_opContext add_sub_op() throws RecognitionException {
		Add_sub_opContext _localctx = new Add_sub_opContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_add_sub_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			_la = _input.LA(1);
			if ( !(_la==ADD_OP || _la==SUB_OP) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_opContext extends ParserRuleContext {
		public TerminalNode AND_OP() { return getToken(crappyCParser.AND_OP, 0); }
		public TerminalNode OR_OP() { return getToken(crappyCParser.OR_OP, 0); }
		public Bool_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof crappyCListener ) ((crappyCListener)listener).enterBool_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof crappyCListener ) ((crappyCListener)listener).exitBool_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof crappyCVisitor ) return ((crappyCVisitor<? extends T>)visitor).visitBool_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_opContext bool_op() throws RecognitionException {
		Bool_opContext _localctx = new Bool_opContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_bool_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			_la = _input.LA(1);
			if ( !(_la==AND_OP || _la==OR_OP) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rel_opContext extends ParserRuleContext {
		public TerminalNode EQ_OP() { return getToken(crappyCParser.EQ_OP, 0); }
		public TerminalNode NE_OP() { return getToken(crappyCParser.NE_OP, 0); }
		public TerminalNode LT_OP() { return getToken(crappyCParser.LT_OP, 0); }
		public TerminalNode LE_OP() { return getToken(crappyCParser.LE_OP, 0); }
		public TerminalNode GT_OP() { return getToken(crappyCParser.GT_OP, 0); }
		public TerminalNode GE_OP() { return getToken(crappyCParser.GE_OP, 0); }
		public Rel_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rel_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof crappyCListener ) ((crappyCListener)listener).enterRel_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof crappyCListener ) ((crappyCListener)listener).exitRel_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof crappyCVisitor ) return ((crappyCVisitor<? extends T>)visitor).visitRel_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rel_opContext rel_op() throws RecognitionException {
		Rel_opContext _localctx = new Rel_opContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_rel_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ_OP) | (1L << NE_OP) | (1L << LT_OP) | (1L << LE_OP) | (1L << GT_OP) | (1L << GE_OP))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeIdContext extends ParserRuleContext {
		public TypeIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof crappyCListener ) ((crappyCListener)listener).enterTypeId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof crappyCListener ) ((crappyCListener)listener).exitTypeId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof crappyCVisitor ) return ((crappyCVisitor<? extends T>)visitor).visitTypeId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeIdContext typeId() throws RecognitionException {
		TypeIdContext _localctx = new TypeIdContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_typeId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__18) | (1L << T__19))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_valContext extends ParserRuleContext {
		public TypeSpec type = null;
		public Bool_valContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_val; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof crappyCListener ) ((crappyCListener)listener).enterBool_val(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof crappyCListener ) ((crappyCListener)listener).exitBool_val(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof crappyCVisitor ) return ((crappyCVisitor<? extends T>)visitor).visitBool_val(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_valContext bool_val() throws RecognitionException {
		Bool_valContext _localctx = new Bool_valContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_bool_val);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			_la = _input.LA(1);
			if ( !(_la==T__20 || _la==T__21) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SignContext extends ParserRuleContext {
		public TerminalNode ADD_OP() { return getToken(crappyCParser.ADD_OP, 0); }
		public TerminalNode SUB_OP() { return getToken(crappyCParser.SUB_OP, 0); }
		public SignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof crappyCListener ) ((crappyCListener)listener).enterSign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof crappyCListener ) ((crappyCListener)listener).exitSign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof crappyCVisitor ) return ((crappyCVisitor<? extends T>)visitor).visitSign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignContext sign() throws RecognitionException {
		SignContext _localctx = new SignContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_sign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			_la = _input.LA(1);
			if ( !(_la==ADD_OP || _la==SUB_OP) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 16:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u0104\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\2\7\2;\n\2\f\2\16\2>\13\2\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\4\3\4\3\4\5\4I\n\4\3\4\3\4\3\5\3\5\3\5\7\5P\n\5\f\5\16"+
		"\5S\13\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\5\b^\n\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\5\tf\n\t\3\t\3\t\3\t\5\tk\n\t\3\t\5\tn\n\t\3\t\3\t\3\n\3\n\3"+
		"\n\5\nu\n\n\3\n\3\n\7\ny\n\n\f\n\16\n|\13\n\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\5\13\u0086\n\13\3\f\3\f\3\f\3\f\3\f\7\f\u008d\n\f\f\f\16\f"+
		"\u0090\13\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u009c\n"+
		"\16\3\16\3\16\3\16\7\16\u00a1\n\16\f\16\16\16\u00a4\13\16\3\16\3\16\3"+
		"\16\5\16\u00a9\n\16\3\16\5\16\u00ac\n\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\5\17\u00b8\n\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\5\20\u00c2\n\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\5\22\u00d3\n\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u00e5\n\22\f\22"+
		"\16\22\u00e8\13\22\3\23\3\23\3\24\5\24\u00ed\n\24\3\24\3\24\5\24\u00f1"+
		"\n\24\3\24\5\24\u00f4\n\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31"+
		"\3\31\3\32\3\32\3\33\3\33\3\33\2\3\"\34\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\2\b\3\2\31\32\3\2\33\34\3\2\36\37\4\2\35\35"+
		" $\3\2\24\26\3\2\27\30\2\u010a\2\66\3\2\2\2\4B\3\2\2\2\6E\3\2\2\2\bL\3"+
		"\2\2\2\nT\3\2\2\2\fW\3\2\2\2\16Y\3\2\2\2\20a\3\2\2\2\22q\3\2\2\2\24\u0085"+
		"\3\2\2\2\26\u0087\3\2\2\2\30\u0091\3\2\2\2\32\u0095\3\2\2\2\34\u00ad\3"+
		"\2\2\2\36\u00bb\3\2\2\2 \u00c5\3\2\2\2\"\u00d2\3\2\2\2$\u00e9\3\2\2\2"+
		"&\u00f3\3\2\2\2(\u00f5\3\2\2\2*\u00f7\3\2\2\2,\u00f9\3\2\2\2.\u00fb\3"+
		"\2\2\2\60\u00fd\3\2\2\2\62\u00ff\3\2\2\2\64\u0101\3\2\2\2\66\67\5\4\3"+
		"\2\678\7\3\2\28<\5\6\4\29;\5\20\t\2:9\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3"+
		"\2\2\2=?\3\2\2\2><\3\2\2\2?@\5\16\b\2@A\7\4\2\2A\3\3\2\2\2BC\7\5\2\2C"+
		"D\7%\2\2D\5\3\2\2\2EF\7\6\2\2FH\7\3\2\2GI\5\b\5\2HG\3\2\2\2HI\3\2\2\2"+
		"IJ\3\2\2\2JK\7\4\2\2K\7\3\2\2\2LQ\5\n\6\2MN\7\7\2\2NP\5\n\6\2OM\3\2\2"+
		"\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2R\t\3\2\2\2SQ\3\2\2\2TU\5\60\31\2UV\5"+
		"\f\7\2V\13\3\2\2\2WX\7%\2\2X\r\3\2\2\2YZ\7\b\2\2Z[\7\t\2\2[]\7\3\2\2\\"+
		"^\5\26\f\2]\\\3\2\2\2]^\3\2\2\2^_\3\2\2\2_`\7\4\2\2`\17\3\2\2\2ab\5\60"+
		"\31\2bc\5$\23\2ce\7\n\2\2df\5\b\5\2ed\3\2\2\2ef\3\2\2\2fg\3\2\2\2gh\7"+
		"\13\2\2hj\7\3\2\2ik\5\6\4\2ji\3\2\2\2jk\3\2\2\2km\3\2\2\2ln\5\26\f\2m"+
		"l\3\2\2\2mn\3\2\2\2no\3\2\2\2op\7\4\2\2p\21\3\2\2\2qr\5$\23\2rt\7\n\2"+
		"\2su\5\"\22\2ts\3\2\2\2tu\3\2\2\2uz\3\2\2\2vw\7\7\2\2wy\5\"\22\2xv\3\2"+
		"\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{}\3\2\2\2|z\3\2\2\2}~\7\13\2\2~\23"+
		"\3\2\2\2\177\u0086\5\30\r\2\u0080\u0086\5\32\16\2\u0081\u0086\5\34\17"+
		"\2\u0082\u0086\5\36\20\2\u0083\u0086\5\22\n\2\u0084\u0086\5 \21\2\u0085"+
		"\177\3\2\2\2\u0085\u0080\3\2\2\2\u0085\u0081\3\2\2\2\u0085\u0082\3\2\2"+
		"\2\u0085\u0083\3\2\2\2\u0085\u0084\3\2\2\2\u0086\25\3\2\2\2\u0087\u0088"+
		"\5\24\13\2\u0088\u008e\7\f\2\2\u0089\u008a\5\24\13\2\u008a\u008b\7\f\2"+
		"\2\u008b\u008d\3\2\2\2\u008c\u0089\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c"+
		"\3\2\2\2\u008e\u008f\3\2\2\2\u008f\27\3\2\2\2\u0090\u008e\3\2\2\2\u0091"+
		"\u0092\5$\23\2\u0092\u0093\7\r\2\2\u0093\u0094\5\"\22\2\u0094\31\3\2\2"+
		"\2\u0095\u0096\7\16\2\2\u0096\u0097\7\n\2\2\u0097\u0098\5\"\22\2\u0098"+
		"\u0099\7\13\2\2\u0099\u009b\7\3\2\2\u009a\u009c\5\26\f\2\u009b\u009a\3"+
		"\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u00a2\7\4\2\2\u009e"+
		"\u009f\7\17\2\2\u009f\u00a1\5\32\16\2\u00a0\u009e\3\2\2\2\u00a1\u00a4"+
		"\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00ab\3\2\2\2\u00a4"+
		"\u00a2\3\2\2\2\u00a5\u00a6\7\17\2\2\u00a6\u00a8\7\3\2\2\u00a7\u00a9\5"+
		"\26\f\2\u00a8\u00a7\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa"+
		"\u00ac\7\4\2\2\u00ab\u00a5\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\33\3\2\2"+
		"\2\u00ad\u00ae\7\20\2\2\u00ae\u00af\7\n\2\2\u00af\u00b0\5\30\r\2\u00b0"+
		"\u00b1\7\f\2\2\u00b1\u00b2\5\"\22\2\u00b2\u00b3\7\f\2\2\u00b3\u00b4\5"+
		"\30\r\2\u00b4\u00b5\7\13\2\2\u00b5\u00b7\7\3\2\2\u00b6\u00b8\5\26\f\2"+
		"\u00b7\u00b6\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba"+
		"\7\4\2\2\u00ba\35\3\2\2\2\u00bb\u00bc\7\21\2\2\u00bc\u00bd\7\n\2\2\u00bd"+
		"\u00be\5\"\22\2\u00be\u00bf\7\13\2\2\u00bf\u00c1\7\3\2\2\u00c0\u00c2\5"+
		"\26\f\2\u00c1\u00c0\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3"+
		"\u00c4\7\4\2\2\u00c4\37\3\2\2\2\u00c5\u00c6\7\22\2\2\u00c6\u00c7\5\"\22"+
		"\2\u00c7!\3\2\2\2\u00c8\u00c9\b\22\1\2\u00c9\u00d3\5&\24\2\u00ca\u00d3"+
		"\5\62\32\2\u00cb\u00d3\5$\23\2\u00cc\u00d3\5\22\n\2\u00cd\u00ce\7\n\2"+
		"\2\u00ce\u00cf\5\"\22\2\u00cf\u00d0\7\13\2\2\u00d0\u00d3\3\2\2\2\u00d1"+
		"\u00d3\7\23\2\2\u00d2\u00c8\3\2\2\2\u00d2\u00ca\3\2\2\2\u00d2\u00cb\3"+
		"\2\2\2\u00d2\u00cc\3\2\2\2\u00d2\u00cd\3\2\2\2\u00d2\u00d1\3\2\2\2\u00d3"+
		"\u00e6\3\2\2\2\u00d4\u00d5\f\f\2\2\u00d5\u00d6\5(\25\2\u00d6\u00d7\5\""+
		"\22\r\u00d7\u00e5\3\2\2\2\u00d8\u00d9\f\13\2\2\u00d9\u00da\5*\26\2\u00da"+
		"\u00db\5\"\22\f\u00db\u00e5\3\2\2\2\u00dc\u00dd\f\n\2\2\u00dd\u00de\5"+
		".\30\2\u00de\u00df\5\"\22\13\u00df\u00e5\3\2\2\2\u00e0\u00e1\f\t\2\2\u00e1"+
		"\u00e2\5,\27\2\u00e2\u00e3\5\"\22\n\u00e3\u00e5\3\2\2\2\u00e4\u00d4\3"+
		"\2\2\2\u00e4\u00d8\3\2\2\2\u00e4\u00dc\3\2\2\2\u00e4\u00e0\3\2\2\2\u00e5"+
		"\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7#\3\2\2\2"+
		"\u00e8\u00e6\3\2\2\2\u00e9\u00ea\7%\2\2\u00ea%\3\2\2\2\u00eb\u00ed\5\64"+
		"\33\2\u00ec\u00eb\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee"+
		"\u00f4\7\'\2\2\u00ef\u00f1\5\64\33\2\u00f0\u00ef\3\2\2\2\u00f0\u00f1\3"+
		"\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f4\7&\2\2\u00f3\u00ec\3\2\2\2\u00f3"+
		"\u00f0\3\2\2\2\u00f4\'\3\2\2\2\u00f5\u00f6\t\2\2\2\u00f6)\3\2\2\2\u00f7"+
		"\u00f8\t\3\2\2\u00f8+\3\2\2\2\u00f9\u00fa\t\4\2\2\u00fa-\3\2\2\2\u00fb"+
		"\u00fc\t\5\2\2\u00fc/\3\2\2\2\u00fd\u00fe\t\6\2\2\u00fe\61\3\2\2\2\u00ff"+
		"\u0100\t\7\2\2\u0100\63\3\2\2\2\u0101\u0102\t\3\2\2\u0102\65\3\2\2\2\31"+
		"<HQ]ejmtz\u0085\u008e\u009b\u00a2\u00a8\u00ab\u00b7\u00c1\u00d2\u00e4"+
		"\u00e6\u00ec\u00f0\u00f3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}