// Generated from DogeScript.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DogeScriptParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, CommentBlock=2, IntDataType=3, CharDataType=4, BoolDataType=5, StringDataType=6, 
		Terminator=7, VarDecStarter=8, FuncStarter=9, ConstantStarter=10, AssOp=11, 
		IfKeyword=12, ElseKeyword=13, ElseIfKeyword=14, EventLoopKeyword=15, CountLoopKeyword=16, 
		RepeatUntilLoopKeyword=17, VoidKeyword=18, MainKeyword=19, Comma=20, NullKeyword=21, 
		BoolLit=22, AddOp=23, SubOp=24, MulOp=25, DivOp=26, ModOp=27, EquaOp=28, 
		GreaterThanOp=29, LessThanOp=30, GreaterThanEqualTo=31, LessThanEqualTo=32, 
		NotEqualToOp=33, AndOp=34, OrOp=35, IncrementOp=36, DecrementOp=37, OpenBrace=38, 
		CloseBrace=39, OpenParenthesis=40, CloseParenthesis=41, IntLit=42, FloatLit=43, 
		StringLit=44, CharLit=45, Array=46, VarIdentifier=47, EndOfFile=48;
	public static final String[] tokenNames = {
		"<INVALID>", "WS", "CommentBlock", "'int'", "'char'", "'boolean'", "'string'", 
		"Terminator", "'such'", "'much'", "'very'", "'as'", "'rily'", "'but'", 
		"'but rily'", "'so'", "'many'", "'nice'", "'void'", "'dogeIntensifies'", 
		"','", "'null'", "BoolLit", "'+'", "'-'", "'*'", "'/'", "'%'", "'is'", 
		"'>'", "'<'", "'>='", "'<='", "'!='", "'and'", "'or'", "'++'", "'--'", 
		"'{'", "'}'", "'('", "')'", "IntLit", "FloatLit", "StringLit", "CharLit", 
		"Array", "VarIdentifier", "'$'"
	};
	public static final int
		RULE_start = 0, RULE_source_code = 1, RULE_main_function = 2, RULE_function_block = 3, 
		RULE_codeblock = 4, RULE_all_possible_statements = 5, RULE_all_possible_single_statements = 6, 
		RULE_afterthought_statement = 7, RULE_function_declaration = 8, RULE_function_declaration_paramaters = 9, 
		RULE_variable_declaration = 10, RULE_literal = 11, RULE_datatype = 12, 
		RULE_variable_instance = 13, RULE_returns_value = 14, RULE_expression = 15, 
		RULE_low_prior = 16, RULE_high_prior = 17, RULE_signint = 18, RULE_top_prior = 19, 
		RULE_assignment_statement = 20, RULE_conditional_statement = 21, RULE_start_condition = 22, 
		RULE_end_condition = 23, RULE_continue_condition = 24, RULE_loop_statement = 25, 
		RULE_event_loop_statement = 26, RULE_count_loop_statement = 27, RULE_repeatuntil_loop_statement = 28, 
		RULE_condition = 29, RULE_conditionB = 30, RULE_conditionV = 31, RULE_conditionE = 32, 
		RULE_conditionF = 33, RULE_comparison_bool_lit = 34, RULE_comparison = 35, 
		RULE_logical_operator = 36, RULE_function_call = 37, RULE_function_call_parameters = 38;
	public static final String[] ruleNames = {
		"start", "source_code", "main_function", "function_block", "codeblock", 
		"all_possible_statements", "all_possible_single_statements", "afterthought_statement", 
		"function_declaration", "function_declaration_paramaters", "variable_declaration", 
		"literal", "datatype", "variable_instance", "returns_value", "expression", 
		"low_prior", "high_prior", "signint", "top_prior", "assignment_statement", 
		"conditional_statement", "start_condition", "end_condition", "continue_condition", 
		"loop_statement", "event_loop_statement", "count_loop_statement", "repeatuntil_loop_statement", 
		"condition", "conditionB", "conditionV", "conditionE", "conditionF", "comparison_bool_lit", 
		"comparison", "logical_operator", "function_call", "function_call_parameters"
	};

	@Override
	public String getGrammarFileName() { return "DogeScript.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DogeScriptParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(DogeScriptParser.EOF, 0); }
		public Source_codeContext source_code() {
			return getRuleContext(Source_codeContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78); source_code();
			setState(79); match(EOF);
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

	public static class Source_codeContext extends ParserRuleContext {
		public Function_blockContext function_block(int i) {
			return getRuleContext(Function_blockContext.class,i);
		}
		public Main_functionContext main_function() {
			return getRuleContext(Main_functionContext.class,0);
		}
		public List<Function_blockContext> function_block() {
			return getRuleContexts(Function_blockContext.class);
		}
		public Source_codeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_source_code; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).enterSource_code(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).exitSource_code(this);
		}
	}

	public final Source_codeContext source_code() throws RecognitionException {
		Source_codeContext _localctx = new Source_codeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_source_code);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81); function_block();
			setState(82); main_function();
			setState(83); function_block();
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

	public static class Main_functionContext extends ParserRuleContext {
		public TerminalNode CloseBrace() { return getToken(DogeScriptParser.CloseBrace, 0); }
		public TerminalNode OpenParenthesis() { return getToken(DogeScriptParser.OpenParenthesis, 0); }
		public TerminalNode CloseParenthesis() { return getToken(DogeScriptParser.CloseParenthesis, 0); }
		public TerminalNode FuncStarter() { return getToken(DogeScriptParser.FuncStarter, 0); }
		public TerminalNode VoidKeyword() { return getToken(DogeScriptParser.VoidKeyword, 0); }
		public TerminalNode MainKeyword() { return getToken(DogeScriptParser.MainKeyword, 0); }
		public TerminalNode OpenBrace() { return getToken(DogeScriptParser.OpenBrace, 0); }
		public CodeblockContext codeblock() {
			return getRuleContext(CodeblockContext.class,0);
		}
		public Main_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).enterMain_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).exitMain_function(this);
		}
	}

	public final Main_functionContext main_function() throws RecognitionException {
		Main_functionContext _localctx = new Main_functionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_main_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			System.out.println("in main_function");
			setState(86); match(FuncStarter);
			setState(87); match(VoidKeyword);
			setState(88); match(MainKeyword);
			setState(89); match(OpenParenthesis);
			setState(90); match(CloseParenthesis);
			setState(91); match(OpenBrace);
			setState(92); codeblock();
			setState(93); match(CloseBrace);
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

	public static class Function_blockContext extends ParserRuleContext {
		public Function_declarationContext function_declaration() {
			return getRuleContext(Function_declarationContext.class,0);
		}
		public Function_blockContext function_block() {
			return getRuleContext(Function_blockContext.class,0);
		}
		public Function_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).enterFunction_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).exitFunction_block(this);
		}
	}

	public final Function_blockContext function_block() throws RecognitionException {
		Function_blockContext _localctx = new Function_blockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_function_block);
		try {
			setState(100);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				System.out.println("in function_block");
				setState(96); function_declaration();
				setState(97); function_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class CodeblockContext extends ParserRuleContext {
		public All_possible_statementsContext all_possible_statements() {
			return getRuleContext(All_possible_statementsContext.class,0);
		}
		public CodeblockContext codeblock() {
			return getRuleContext(CodeblockContext.class,0);
		}
		public CodeblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codeblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).enterCodeblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).exitCodeblock(this);
		}
	}

	public final CodeblockContext codeblock() throws RecognitionException {
		CodeblockContext _localctx = new CodeblockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_codeblock);
		try {
			setState(107);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				System.out.println("in code_block");
				setState(103); all_possible_statements();
				setState(104); codeblock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(106); all_possible_statements();
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

	public static class All_possible_statementsContext extends ParserRuleContext {
		public Conditional_statementContext conditional_statement() {
			return getRuleContext(Conditional_statementContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public TerminalNode Terminator() { return getToken(DogeScriptParser.Terminator, 0); }
		public Assignment_statementContext assignment_statement() {
			return getRuleContext(Assignment_statementContext.class,0);
		}
		public Loop_statementContext loop_statement() {
			return getRuleContext(Loop_statementContext.class,0);
		}
		public All_possible_statementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_all_possible_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).enterAll_possible_statements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).exitAll_possible_statements(this);
		}
	}

	public final All_possible_statementsContext all_possible_statements() throws RecognitionException {
		All_possible_statementsContext _localctx = new All_possible_statementsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_all_possible_statements);
		try {
			setState(122);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				System.out.println("in all_possible");
				setState(110); variable_declaration();
				setState(111); match(Terminator);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(113); assignment_statement();
				setState(114); match(Terminator);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(116); function_call();
				setState(117); match(Terminator);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(119); conditional_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(120); loop_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(121); match(Terminator);
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

	public static class All_possible_single_statementsContext extends ParserRuleContext {
		public Conditional_statementContext conditional_statement() {
			return getRuleContext(Conditional_statementContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public TerminalNode Terminator() { return getToken(DogeScriptParser.Terminator, 0); }
		public Assignment_statementContext assignment_statement() {
			return getRuleContext(Assignment_statementContext.class,0);
		}
		public Loop_statementContext loop_statement() {
			return getRuleContext(Loop_statementContext.class,0);
		}
		public All_possible_single_statementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_all_possible_single_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).enterAll_possible_single_statements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).exitAll_possible_single_statements(this);
		}
	}

	public final All_possible_single_statementsContext all_possible_single_statements() throws RecognitionException {
		All_possible_single_statementsContext _localctx = new All_possible_single_statementsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_all_possible_single_statements);
		try {
			setState(137);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				System.out.println("in single_all_possible");
				setState(125); variable_declaration();
				setState(126); match(Terminator);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(128); assignment_statement();
				setState(129); match(Terminator);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(131); function_call();
				setState(132); match(Terminator);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(134); conditional_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(135); loop_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(136); match(Terminator);
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

	public static class Afterthought_statementContext extends ParserRuleContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Assignment_statementContext assignment_statement() {
			return getRuleContext(Assignment_statementContext.class,0);
		}
		public Afterthought_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_afterthought_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).enterAfterthought_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).exitAfterthought_statement(this);
		}
	}

	public final Afterthought_statementContext afterthought_statement() throws RecognitionException {
		Afterthought_statementContext _localctx = new Afterthought_statementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_afterthought_statement);
		try {
			setState(142);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				System.out.println("in afterthought_statement");
				setState(140); assignment_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(141); function_call();
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

	public static class Function_declarationContext extends ParserRuleContext {
		public TerminalNode CloseBrace() { return getToken(DogeScriptParser.CloseBrace, 0); }
		public TerminalNode OpenParenthesis() { return getToken(DogeScriptParser.OpenParenthesis, 0); }
		public TerminalNode CloseParenthesis() { return getToken(DogeScriptParser.CloseParenthesis, 0); }
		public TerminalNode FuncStarter() { return getToken(DogeScriptParser.FuncStarter, 0); }
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public TerminalNode OpenBrace() { return getToken(DogeScriptParser.OpenBrace, 0); }
		public Function_declaration_paramatersContext function_declaration_paramaters() {
			return getRuleContext(Function_declaration_paramatersContext.class,0);
		}
		public TerminalNode VarIdentifier() { return getToken(DogeScriptParser.VarIdentifier, 0); }
		public CodeblockContext codeblock() {
			return getRuleContext(CodeblockContext.class,0);
		}
		public Function_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).enterFunction_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).exitFunction_declaration(this);
		}
	}

	public final Function_declarationContext function_declaration() throws RecognitionException {
		Function_declarationContext _localctx = new Function_declarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_function_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			System.out.println("in function_declaration");
			setState(145); match(FuncStarter);
			setState(146); datatype();
			setState(147); match(VarIdentifier);
			setState(148); match(OpenParenthesis);
			setState(149); function_declaration_paramaters();
			setState(150); match(CloseParenthesis);
			setState(151); match(OpenBrace);
			setState(152); codeblock();
			setState(153); match(CloseBrace);
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

	public static class Function_declaration_paramatersContext extends ParserRuleContext {
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public TerminalNode Comma() { return getToken(DogeScriptParser.Comma, 0); }
		public Function_declaration_paramatersContext function_declaration_paramaters() {
			return getRuleContext(Function_declaration_paramatersContext.class,0);
		}
		public TerminalNode VarIdentifier() { return getToken(DogeScriptParser.VarIdentifier, 0); }
		public Function_declaration_paramatersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_declaration_paramaters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).enterFunction_declaration_paramaters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).exitFunction_declaration_paramaters(this);
		}
	}

	public final Function_declaration_paramatersContext function_declaration_paramaters() throws RecognitionException {
		Function_declaration_paramatersContext _localctx = new Function_declaration_paramatersContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_function_declaration_paramaters);
		try {
			setState(164);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				System.out.println("in function_declaration_paramaters");
				setState(156); datatype();
				setState(157); match(VarIdentifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(159); datatype();
				setState(160); match(VarIdentifier);
				setState(161); match(Comma);
				setState(162); function_declaration_paramaters();
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

	public static class Variable_declarationContext extends ParserRuleContext {
		public Returns_valueContext returns_value() {
			return getRuleContext(Returns_valueContext.class,0);
		}
		public TerminalNode VarDecStarter() { return getToken(DogeScriptParser.VarDecStarter, 0); }
		public Variable_instanceContext variable_instance() {
			return getRuleContext(Variable_instanceContext.class,0);
		}
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public TerminalNode AssOp() { return getToken(DogeScriptParser.AssOp, 0); }
		public TerminalNode VarIdentifier() { return getToken(DogeScriptParser.VarIdentifier, 0); }
		public Variable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).enterVariable_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).exitVariable_declaration(this);
		}
	}

	public final Variable_declarationContext variable_declaration() throws RecognitionException {
		Variable_declarationContext _localctx = new Variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_variable_declaration);
		try {
			setState(177);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				System.out.println("in variable_declaration");
				setState(167); match(VarDecStarter);
				setState(168); datatype();
				setState(169); variable_instance();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(171); match(VarDecStarter);
				setState(172); datatype();
				setState(173); match(VarIdentifier);
				setState(174); match(AssOp);
				setState(175); returns_value();
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode CharLit() { return getToken(DogeScriptParser.CharLit, 0); }
		public TerminalNode BoolLit() { return getToken(DogeScriptParser.BoolLit, 0); }
		public TerminalNode FloatLit() { return getToken(DogeScriptParser.FloatLit, 0); }
		public TerminalNode IntLit() { return getToken(DogeScriptParser.IntLit, 0); }
		public TerminalNode StringLit() { return getToken(DogeScriptParser.StringLit, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_literal);
		try {
			setState(185);
			switch (_input.LA(1)) {
			case IntLit:
				enterOuterAlt(_localctx, 1);
				{
				System.out.println("in literal");
				setState(180); match(IntLit);
				}
				break;
			case FloatLit:
				enterOuterAlt(_localctx, 2);
				{
				setState(181); match(FloatLit);
				}
				break;
			case StringLit:
				enterOuterAlt(_localctx, 3);
				{
				setState(182); match(StringLit);
				}
				break;
			case CharLit:
				enterOuterAlt(_localctx, 4);
				{
				setState(183); match(CharLit);
				}
				break;
			case BoolLit:
				enterOuterAlt(_localctx, 5);
				{
				setState(184); match(BoolLit);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class DatatypeContext extends ParserRuleContext {
		public TerminalNode IntDataType() { return getToken(DogeScriptParser.IntDataType, 0); }
		public TerminalNode BoolDataType() { return getToken(DogeScriptParser.BoolDataType, 0); }
		public TerminalNode CharDataType() { return getToken(DogeScriptParser.CharDataType, 0); }
		public TerminalNode Array() { return getToken(DogeScriptParser.Array, 0); }
		public TerminalNode StringDataType() { return getToken(DogeScriptParser.StringDataType, 0); }
		public DatatypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datatype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).enterDatatype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).exitDatatype(this);
		}
	}

	public final DatatypeContext datatype() throws RecognitionException {
		DatatypeContext _localctx = new DatatypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_datatype);
		try {
			setState(200);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				System.out.println("in datatype");
				setState(188); match(IntDataType);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(189); match(CharDataType);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(190); match(BoolDataType);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(191); match(StringDataType);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(192); match(IntDataType);
				setState(193); match(Array);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(194); match(CharDataType);
				setState(195); match(Array);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(196); match(BoolDataType);
				setState(197); match(Array);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(198); match(StringDataType);
				setState(199); match(Array);
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

	public static class Variable_instanceContext extends ParserRuleContext {
		public Variable_instanceContext variable_instance() {
			return getRuleContext(Variable_instanceContext.class,0);
		}
		public TerminalNode Comma() { return getToken(DogeScriptParser.Comma, 0); }
		public TerminalNode VarIdentifier() { return getToken(DogeScriptParser.VarIdentifier, 0); }
		public Variable_instanceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_instance; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).enterVariable_instance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).exitVariable_instance(this);
		}
	}

	public final Variable_instanceContext variable_instance() throws RecognitionException {
		Variable_instanceContext _localctx = new Variable_instanceContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_variable_instance);
		try {
			setState(207);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				System.out.println("in variable_instance");
				setState(203); match(VarIdentifier);
				setState(204); match(Comma);
				setState(205); variable_instance();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(206); match(VarIdentifier);
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

	public static class Returns_valueContext extends ParserRuleContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode NullKeyword() { return getToken(DogeScriptParser.NullKeyword, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode VarIdentifier() { return getToken(DogeScriptParser.VarIdentifier, 0); }
		public Returns_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returns_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).enterReturns_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).exitReturns_value(this);
		}
	}

	public final Returns_valueContext returns_value() throws RecognitionException {
		Returns_valueContext _localctx = new Returns_valueContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_returns_value);
		try {
			setState(215);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				System.out.println("in returns_value");
				setState(210); literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(211); expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(212); function_call();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(213); match(VarIdentifier);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(214); match(NullKeyword);
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

	public static class ExpressionContext extends ParserRuleContext {
		public Low_priorContext low_prior() {
			return getRuleContext(Low_priorContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217); low_prior();
			System.out.println("in expression");
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

	public static class Low_priorContext extends ParserRuleContext {
		public TerminalNode SubOp(int i) {
			return getToken(DogeScriptParser.SubOp, i);
		}
		public List<High_priorContext> high_prior() {
			return getRuleContexts(High_priorContext.class);
		}
		public High_priorContext high_prior(int i) {
			return getRuleContext(High_priorContext.class,i);
		}
		public List<TerminalNode> AddOp() { return getTokens(DogeScriptParser.AddOp); }
		public TerminalNode AddOp(int i) {
			return getToken(DogeScriptParser.AddOp, i);
		}
		public List<TerminalNode> SubOp() { return getTokens(DogeScriptParser.SubOp); }
		public Low_priorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_low_prior; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).enterLow_prior(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).exitLow_prior(this);
		}
	}

	public final Low_priorContext low_prior() throws RecognitionException {
		Low_priorContext _localctx = new Low_priorContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_low_prior);
		int _la;
		try {
			setState(231);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(220); high_prior();
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AddOp || _la==SubOp) {
					{
					setState(225);
					switch (_input.LA(1)) {
					case AddOp:
						{
						setState(221); match(AddOp);
						setState(222); high_prior();
						}
						break;
					case SubOp:
						{
						setState(223); match(SubOp);
						setState(224); high_prior();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(229);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(230); high_prior();
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

	public static class High_priorContext extends ParserRuleContext {
		public TerminalNode ModOp(int i) {
			return getToken(DogeScriptParser.ModOp, i);
		}
		public List<TerminalNode> MulOp() { return getTokens(DogeScriptParser.MulOp); }
		public List<TerminalNode> DivOp() { return getTokens(DogeScriptParser.DivOp); }
		public SignintContext signint(int i) {
			return getRuleContext(SignintContext.class,i);
		}
		public TerminalNode MulOp(int i) {
			return getToken(DogeScriptParser.MulOp, i);
		}
		public TerminalNode DivOp(int i) {
			return getToken(DogeScriptParser.DivOp, i);
		}
		public List<TerminalNode> ModOp() { return getTokens(DogeScriptParser.ModOp); }
		public List<SignintContext> signint() {
			return getRuleContexts(SignintContext.class);
		}
		public High_priorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_high_prior; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).enterHigh_prior(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).exitHigh_prior(this);
		}
	}

	public final High_priorContext high_prior() throws RecognitionException {
		High_priorContext _localctx = new High_priorContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_high_prior);
		int _la;
		try {
			setState(246);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(233); signint();
				setState(242);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MulOp) | (1L << DivOp) | (1L << ModOp))) != 0)) {
					{
					setState(240);
					switch (_input.LA(1)) {
					case MulOp:
						{
						setState(234); match(MulOp);
						setState(235); signint();
						}
						break;
					case DivOp:
						{
						setState(236); match(DivOp);
						setState(237); signint();
						}
						break;
					case ModOp:
						{
						setState(238); match(ModOp);
						setState(239); signint();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(244);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(245); signint();
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

	public static class SignintContext extends ParserRuleContext {
		public Top_priorContext top_prior() {
			return getRuleContext(Top_priorContext.class,0);
		}
		public SignintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).enterSignint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).exitSignint(this);
		}
	}

	public final SignintContext signint() throws RecognitionException {
		SignintContext _localctx = new SignintContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_signint);
		try {
			setState(251);
			switch (_input.LA(1)) {
			case SubOp:
				enterOuterAlt(_localctx, 1);
				{
				setState(248); match(SubOp);
				setState(249); top_prior();
				}
				break;
			case OpenParenthesis:
			case IntLit:
			case VarIdentifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(250); top_prior();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Top_priorContext extends ParserRuleContext {
		public TerminalNode OpenParenthesis() { return getToken(DogeScriptParser.OpenParenthesis, 0); }
		public TerminalNode CloseParenthesis() { return getToken(DogeScriptParser.CloseParenthesis, 0); }
		public TerminalNode IntLit() { return getToken(DogeScriptParser.IntLit, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode VarIdentifier() { return getToken(DogeScriptParser.VarIdentifier, 0); }
		public Top_priorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_top_prior; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).enterTop_prior(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).exitTop_prior(this);
		}
	}

	public final Top_priorContext top_prior() throws RecognitionException {
		Top_priorContext _localctx = new Top_priorContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_top_prior);
		try {
			setState(259);
			switch (_input.LA(1)) {
			case IntLit:
				enterOuterAlt(_localctx, 1);
				{
				setState(253); match(IntLit);
				}
				break;
			case OpenParenthesis:
				enterOuterAlt(_localctx, 2);
				{
				setState(254); match(OpenParenthesis);
				setState(255); expression();
				setState(256); match(CloseParenthesis);
				}
				break;
			case VarIdentifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(258); match(VarIdentifier);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Assignment_statementContext extends ParserRuleContext {
		public TerminalNode VarIdentifier(int i) {
			return getToken(DogeScriptParser.VarIdentifier, i);
		}
		public TerminalNode IncrementOp() { return getToken(DogeScriptParser.IncrementOp, 0); }
		public Returns_valueContext returns_value() {
			return getRuleContext(Returns_valueContext.class,0);
		}
		public TerminalNode DecrementOp() { return getToken(DogeScriptParser.DecrementOp, 0); }
		public TerminalNode AssOp() { return getToken(DogeScriptParser.AssOp, 0); }
		public List<TerminalNode> VarIdentifier() { return getTokens(DogeScriptParser.VarIdentifier); }
		public Assignment_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).enterAssignment_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).exitAssignment_statement(this);
		}
	}

	public final Assignment_statementContext assignment_statement() throws RecognitionException {
		Assignment_statementContext _localctx = new Assignment_statementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_assignment_statement);
		try {
			setState(272);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				System.out.println("in assignment_statement");
				setState(262); match(VarIdentifier);
				setState(263); match(AssOp);
				setState(264); match(VarIdentifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(265); match(VarIdentifier);
				setState(266); match(AssOp);
				setState(267); returns_value();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(268); match(VarIdentifier);
				setState(269); match(IncrementOp);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(270); match(VarIdentifier);
				setState(271); match(DecrementOp);
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

	public static class Conditional_statementContext extends ParserRuleContext {
		public Continue_conditionContext continue_condition() {
			return getRuleContext(Continue_conditionContext.class,0);
		}
		public Start_conditionContext start_condition() {
			return getRuleContext(Start_conditionContext.class,0);
		}
		public End_conditionContext end_condition() {
			return getRuleContext(End_conditionContext.class,0);
		}
		public Conditional_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).enterConditional_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).exitConditional_statement(this);
		}
	}

	public final Conditional_statementContext conditional_statement() throws RecognitionException {
		Conditional_statementContext _localctx = new Conditional_statementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_conditional_statement);
		try {
			setState(286);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				System.out.println("in conditional_statement");
				setState(275); start_condition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(276); start_condition();
				setState(277); end_condition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(279); start_condition();
				setState(280); continue_condition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(282); start_condition();
				setState(283); continue_condition();
				setState(284); end_condition();
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

	public static class Start_conditionContext extends ParserRuleContext {
		public All_possible_single_statementsContext all_possible_single_statements() {
			return getRuleContext(All_possible_single_statementsContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(DogeScriptParser.CloseBrace, 0); }
		public TerminalNode OpenParenthesis() { return getToken(DogeScriptParser.OpenParenthesis, 0); }
		public TerminalNode CloseParenthesis() { return getToken(DogeScriptParser.CloseParenthesis, 0); }
		public TerminalNode OpenBrace() { return getToken(DogeScriptParser.OpenBrace, 0); }
		public TerminalNode IfKeyword() { return getToken(DogeScriptParser.IfKeyword, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public CodeblockContext codeblock() {
			return getRuleContext(CodeblockContext.class,0);
		}
		public Start_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).enterStart_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).exitStart_condition(this);
		}
	}

	public final Start_conditionContext start_condition() throws RecognitionException {
		Start_conditionContext _localctx = new Start_conditionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_start_condition);
		try {
			setState(311);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				System.out.println("in start_condition");
				setState(289); match(IfKeyword);
				setState(290); match(OpenParenthesis);
				setState(291); condition();
				setState(292); match(CloseParenthesis);
				setState(293); all_possible_single_statements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(295); match(IfKeyword);
				setState(296); match(OpenParenthesis);
				setState(297); condition();
				setState(298); match(CloseParenthesis);
				setState(299); match(OpenBrace);
				setState(300); all_possible_single_statements();
				setState(301); match(CloseBrace);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(303); match(IfKeyword);
				setState(304); match(OpenParenthesis);
				setState(305); condition();
				setState(306); match(CloseParenthesis);
				setState(307); match(OpenBrace);
				setState(308); codeblock();
				setState(309); match(CloseBrace);
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

	public static class End_conditionContext extends ParserRuleContext {
		public All_possible_single_statementsContext all_possible_single_statements() {
			return getRuleContext(All_possible_single_statementsContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(DogeScriptParser.CloseBrace, 0); }
		public TerminalNode OpenParenthesis() { return getToken(DogeScriptParser.OpenParenthesis, 0); }
		public TerminalNode CloseParenthesis() { return getToken(DogeScriptParser.CloseParenthesis, 0); }
		public TerminalNode OpenBrace() { return getToken(DogeScriptParser.OpenBrace, 0); }
		public TerminalNode ElseKeyword() { return getToken(DogeScriptParser.ElseKeyword, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public CodeblockContext codeblock() {
			return getRuleContext(CodeblockContext.class,0);
		}
		public End_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).enterEnd_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).exitEnd_condition(this);
		}
	}

	public final End_conditionContext end_condition() throws RecognitionException {
		End_conditionContext _localctx = new End_conditionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_end_condition);
		try {
			setState(338);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				System.out.println("in end_condition");
				setState(314); match(ElseKeyword);
				setState(315); match(OpenParenthesis);
				setState(316); condition();
				setState(317); match(CloseParenthesis);
				setState(318); all_possible_single_statements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(320); match(ElseKeyword);
				setState(321); match(OpenParenthesis);
				setState(322); condition();
				setState(323); match(CloseParenthesis);
				setState(324); match(OpenBrace);
				setState(325); all_possible_single_statements();
				setState(326); match(CloseBrace);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(328); match(ElseKeyword);
				setState(329); match(OpenParenthesis);
				setState(330); condition();
				setState(331); match(CloseParenthesis);
				setState(332); match(OpenBrace);
				setState(333); codeblock();
				setState(334); match(CloseBrace);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(336); match(ElseKeyword);
				setState(337); all_possible_single_statements();
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

	public static class Continue_conditionContext extends ParserRuleContext {
		public All_possible_single_statementsContext all_possible_single_statements() {
			return getRuleContext(All_possible_single_statementsContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(DogeScriptParser.CloseBrace, 0); }
		public TerminalNode OpenParenthesis() { return getToken(DogeScriptParser.OpenParenthesis, 0); }
		public TerminalNode CloseParenthesis() { return getToken(DogeScriptParser.CloseParenthesis, 0); }
		public TerminalNode OpenBrace() { return getToken(DogeScriptParser.OpenBrace, 0); }
		public TerminalNode ElseIfKeyword() { return getToken(DogeScriptParser.ElseIfKeyword, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public CodeblockContext codeblock() {
			return getRuleContext(CodeblockContext.class,0);
		}
		public Continue_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continue_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).enterContinue_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).exitContinue_condition(this);
		}
	}

	public final Continue_conditionContext continue_condition() throws RecognitionException {
		Continue_conditionContext _localctx = new Continue_conditionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_continue_condition);
		try {
			setState(362);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				System.out.println("in continue_condition");
				setState(341); match(ElseIfKeyword);
				setState(342); match(OpenParenthesis);
				setState(343); condition();
				setState(344); match(CloseParenthesis);
				setState(345); all_possible_single_statements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(347); match(ElseIfKeyword);
				setState(348); match(OpenParenthesis);
				setState(349); condition();
				setState(350); match(CloseParenthesis);
				setState(351); all_possible_single_statements();
				setState(352); match(CloseBrace);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(354); match(ElseIfKeyword);
				setState(355); match(OpenParenthesis);
				setState(356); condition();
				setState(357); match(CloseParenthesis);
				setState(358); match(OpenBrace);
				setState(359); codeblock();
				setState(360); match(CloseBrace);
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

	public static class Loop_statementContext extends ParserRuleContext {
		public Event_loop_statementContext event_loop_statement() {
			return getRuleContext(Event_loop_statementContext.class,0);
		}
		public Count_loop_statementContext count_loop_statement() {
			return getRuleContext(Count_loop_statementContext.class,0);
		}
		public Repeatuntil_loop_statementContext repeatuntil_loop_statement() {
			return getRuleContext(Repeatuntil_loop_statementContext.class,0);
		}
		public Loop_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).enterLoop_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).exitLoop_statement(this);
		}
	}

	public final Loop_statementContext loop_statement() throws RecognitionException {
		Loop_statementContext _localctx = new Loop_statementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_loop_statement);
		try {
			setState(368);
			switch (_input.LA(1)) {
			case EventLoopKeyword:
				enterOuterAlt(_localctx, 1);
				{
				System.out.println("in LOOPS");
				setState(365); event_loop_statement();
				}
				break;
			case CountLoopKeyword:
				enterOuterAlt(_localctx, 2);
				{
				setState(366); count_loop_statement();
				}
				break;
			case RepeatUntilLoopKeyword:
				enterOuterAlt(_localctx, 3);
				{
				setState(367); repeatuntil_loop_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Event_loop_statementContext extends ParserRuleContext {
		public All_possible_single_statementsContext all_possible_single_statements() {
			return getRuleContext(All_possible_single_statementsContext.class,0);
		}
		public TerminalNode EventLoopKeyword() { return getToken(DogeScriptParser.EventLoopKeyword, 0); }
		public TerminalNode CloseBrace() { return getToken(DogeScriptParser.CloseBrace, 0); }
		public TerminalNode OpenParenthesis() { return getToken(DogeScriptParser.OpenParenthesis, 0); }
		public TerminalNode CloseParenthesis() { return getToken(DogeScriptParser.CloseParenthesis, 0); }
		public TerminalNode OpenBrace() { return getToken(DogeScriptParser.OpenBrace, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public CodeblockContext codeblock() {
			return getRuleContext(CodeblockContext.class,0);
		}
		public Event_loop_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_event_loop_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).enterEvent_loop_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).exitEvent_loop_statement(this);
		}
	}

	public final Event_loop_statementContext event_loop_statement() throws RecognitionException {
		Event_loop_statementContext _localctx = new Event_loop_statementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_event_loop_statement);
		try {
			setState(385);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				System.out.println("in event_loop_statement");
				setState(371); match(EventLoopKeyword);
				setState(372); match(OpenParenthesis);
				setState(373); condition();
				setState(374); match(CloseParenthesis);
				setState(375); match(OpenBrace);
				setState(376); codeblock();
				setState(377); match(CloseBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(379); match(EventLoopKeyword);
				setState(380); match(OpenParenthesis);
				setState(381); condition();
				setState(382); match(CloseParenthesis);
				setState(383); all_possible_single_statements();
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

	public static class Count_loop_statementContext extends ParserRuleContext {
		public TerminalNode Terminator(int i) {
			return getToken(DogeScriptParser.Terminator, i);
		}
		public TerminalNode CloseBrace() { return getToken(DogeScriptParser.CloseBrace, 0); }
		public TerminalNode OpenParenthesis() { return getToken(DogeScriptParser.OpenParenthesis, 0); }
		public Afterthought_statementContext afterthought_statement() {
			return getRuleContext(Afterthought_statementContext.class,0);
		}
		public TerminalNode CloseParenthesis() { return getToken(DogeScriptParser.CloseParenthesis, 0); }
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public List<TerminalNode> Terminator() { return getTokens(DogeScriptParser.Terminator); }
		public TerminalNode OpenBrace() { return getToken(DogeScriptParser.OpenBrace, 0); }
		public Assignment_statementContext assignment_statement() {
			return getRuleContext(Assignment_statementContext.class,0);
		}
		public TerminalNode CountLoopKeyword() { return getToken(DogeScriptParser.CountLoopKeyword, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public CodeblockContext codeblock() {
			return getRuleContext(CodeblockContext.class,0);
		}
		public Count_loop_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_count_loop_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).enterCount_loop_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).exitCount_loop_statement(this);
		}
	}

	public final Count_loop_statementContext count_loop_statement() throws RecognitionException {
		Count_loop_statementContext _localctx = new Count_loop_statementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_count_loop_statement);
		try {
			setState(412);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				System.out.println("in count_loop_statement");
				setState(388); match(CountLoopKeyword);
				setState(389); match(OpenParenthesis);
				setState(390); variable_declaration();
				setState(391); match(Terminator);
				setState(392); condition();
				setState(393); match(Terminator);
				setState(394); afterthought_statement();
				setState(395); match(CloseParenthesis);
				setState(396); match(OpenBrace);
				setState(397); codeblock();
				setState(398); match(CloseBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(400); match(CountLoopKeyword);
				setState(401); match(OpenParenthesis);
				setState(402); assignment_statement();
				setState(403); match(Terminator);
				setState(404); condition();
				setState(405); match(Terminator);
				setState(406); afterthought_statement();
				setState(407); match(CloseParenthesis);
				setState(408); match(OpenBrace);
				setState(409); codeblock();
				setState(410); match(CloseBrace);
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

	public static class Repeatuntil_loop_statementContext extends ParserRuleContext {
		public TerminalNode RepeatUntilLoopKeyword() { return getToken(DogeScriptParser.RepeatUntilLoopKeyword, 0); }
		public TerminalNode CloseBrace() { return getToken(DogeScriptParser.CloseBrace, 0); }
		public TerminalNode EventLoopKeyword() { return getToken(DogeScriptParser.EventLoopKeyword, 0); }
		public TerminalNode OpenParenthesis() { return getToken(DogeScriptParser.OpenParenthesis, 0); }
		public TerminalNode CloseParenthesis() { return getToken(DogeScriptParser.CloseParenthesis, 0); }
		public TerminalNode OpenBrace() { return getToken(DogeScriptParser.OpenBrace, 0); }
		public TerminalNode Terminator() { return getToken(DogeScriptParser.Terminator, 0); }
		public CodeblockContext codeblock() {
			return getRuleContext(CodeblockContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public Repeatuntil_loop_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeatuntil_loop_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).enterRepeatuntil_loop_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).exitRepeatuntil_loop_statement(this);
		}
	}

	public final Repeatuntil_loop_statementContext repeatuntil_loop_statement() throws RecognitionException {
		Repeatuntil_loop_statementContext _localctx = new Repeatuntil_loop_statementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_repeatuntil_loop_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			System.out.println("in repeatuntil_loop_statement");
			setState(415); match(RepeatUntilLoopKeyword);
			setState(416); match(OpenBrace);
			setState(417); codeblock();
			setState(418); match(CloseBrace);
			setState(419); match(EventLoopKeyword);
			setState(420); match(OpenParenthesis);
			setState(421); condition();
			setState(422); match(CloseParenthesis);
			setState(423); match(Terminator);
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

	public static class ConditionContext extends ParserRuleContext {
		public Logical_operatorContext logical_operator() {
			return getRuleContext(Logical_operatorContext.class,0);
		}
		public ConditionBContext conditionB() {
			return getRuleContext(ConditionBContext.class,0);
		}
		public TerminalNode OpenParenthesis() { return getToken(DogeScriptParser.OpenParenthesis, 0); }
		public TerminalNode CloseParenthesis() { return getToken(DogeScriptParser.CloseParenthesis, 0); }
		public ConditionEContext conditionE() {
			return getRuleContext(ConditionEContext.class,0);
		}
		public ConditionVContext conditionV() {
			return getRuleContext(ConditionVContext.class,0);
		}
		public ConditionFContext conditionF() {
			return getRuleContext(ConditionFContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_condition);
		try {
			setState(449);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(425); conditionV();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(426); conditionE();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(427); conditionF();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(428); conditionB();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(429); match(OpenParenthesis);
				setState(430); condition();
				setState(431); match(CloseParenthesis);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(433); conditionV();
				setState(434); logical_operator();
				setState(435); condition();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(437); conditionE();
				setState(438); logical_operator();
				setState(439); condition();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(441); conditionF();
				setState(442); logical_operator();
				setState(443); condition();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(445); conditionB();
				setState(446); logical_operator();
				setState(447); condition();
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

	public static class ConditionBContext extends ParserRuleContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public TerminalNode BoolLit() { return getToken(DogeScriptParser.BoolLit, 0); }
		public Comparison_bool_litContext comparison_bool_lit() {
			return getRuleContext(Comparison_bool_litContext.class,0);
		}
		public ConditionBContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionB; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).enterConditionB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).exitConditionB(this);
		}
	}

	public final ConditionBContext conditionB() throws RecognitionException {
		ConditionBContext _localctx = new ConditionBContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_conditionB);
		try {
			setState(456);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(451); match(BoolLit);
				setState(452); comparison_bool_lit();
				setState(453); function_call();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(455); match(BoolLit);
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

	public static class ConditionVContext extends ParserRuleContext {
		public TerminalNode VarIdentifier(int i) {
			return getToken(DogeScriptParser.VarIdentifier, i);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> VarIdentifier() { return getTokens(DogeScriptParser.VarIdentifier); }
		public ConditionVContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionV; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).enterConditionV(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).exitConditionV(this);
		}
	}

	public final ConditionVContext conditionV() throws RecognitionException {
		ConditionVContext _localctx = new ConditionVContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_conditionV);
		try {
			setState(471);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(458); match(VarIdentifier);
				setState(459); comparison();
				setState(460); match(VarIdentifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(462); match(VarIdentifier);
				setState(463); comparison();
				setState(464); expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(466); match(VarIdentifier);
				setState(467); comparison();
				setState(468); function_call();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(470); match(VarIdentifier);
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

	public static class ConditionEContext extends ParserRuleContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode VarIdentifier() { return getToken(DogeScriptParser.VarIdentifier, 0); }
		public ConditionEContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionE; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).enterConditionE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).exitConditionE(this);
		}
	}

	public final ConditionEContext conditionE() throws RecognitionException {
		ConditionEContext _localctx = new ConditionEContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_conditionE);
		try {
			setState(485);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(473); expression();
				setState(474); comparison();
				setState(475); match(VarIdentifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(477); expression();
				setState(478); comparison();
				setState(479); expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(481); expression();
				setState(482); comparison();
				setState(483); function_call();
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

	public static class ConditionFContext extends ParserRuleContext {
		public Function_callContext function_call(int i) {
			return getRuleContext(Function_callContext.class,i);
		}
		public List<Function_callContext> function_call() {
			return getRuleContexts(Function_callContext.class);
		}
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public TerminalNode BoolLit() { return getToken(DogeScriptParser.BoolLit, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode VarIdentifier() { return getToken(DogeScriptParser.VarIdentifier, 0); }
		public ConditionFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).enterConditionF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).exitConditionF(this);
		}
	}

	public final ConditionFContext conditionF() throws RecognitionException {
		ConditionFContext _localctx = new ConditionFContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_conditionF);
		try {
			setState(504);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(487); function_call();
				setState(488); comparison();
				setState(489); function_call();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(491); function_call();
				setState(492); comparison();
				setState(493); match(VarIdentifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(495); function_call();
				setState(496); comparison();
				setState(497); expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(499); function_call();
				setState(500); comparison();
				setState(501); match(BoolLit);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(503); function_call();
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

	public static class Comparison_bool_litContext extends ParserRuleContext {
		public TerminalNode NotEqualToOp() { return getToken(DogeScriptParser.NotEqualToOp, 0); }
		public TerminalNode EquaOp() { return getToken(DogeScriptParser.EquaOp, 0); }
		public Comparison_bool_litContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison_bool_lit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).enterComparison_bool_lit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).exitComparison_bool_lit(this);
		}
	}

	public final Comparison_bool_litContext comparison_bool_lit() throws RecognitionException {
		Comparison_bool_litContext _localctx = new Comparison_bool_litContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_comparison_bool_lit);
		try {
			setState(509);
			switch (_input.LA(1)) {
			case EquaOp:
				enterOuterAlt(_localctx, 1);
				{
				System.out.println("in comparison bool lit");
				setState(507); match(EquaOp);
				}
				break;
			case NotEqualToOp:
				enterOuterAlt(_localctx, 2);
				{
				setState(508); match(NotEqualToOp);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ComparisonContext extends ParserRuleContext {
		public TerminalNode LessThanOp() { return getToken(DogeScriptParser.LessThanOp, 0); }
		public TerminalNode GreaterThanEqualTo() { return getToken(DogeScriptParser.GreaterThanEqualTo, 0); }
		public TerminalNode GreaterThanOp() { return getToken(DogeScriptParser.GreaterThanOp, 0); }
		public TerminalNode LessThanEqualTo() { return getToken(DogeScriptParser.LessThanEqualTo, 0); }
		public TerminalNode NotEqualToOp() { return getToken(DogeScriptParser.NotEqualToOp, 0); }
		public TerminalNode EquaOp() { return getToken(DogeScriptParser.EquaOp, 0); }
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).exitComparison(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_comparison);
		try {
			setState(518);
			switch (_input.LA(1)) {
			case EquaOp:
				enterOuterAlt(_localctx, 1);
				{
				System.out.println("in comparison");
				setState(512); match(EquaOp);
				}
				break;
			case GreaterThanOp:
				enterOuterAlt(_localctx, 2);
				{
				setState(513); match(GreaterThanOp);
				}
				break;
			case LessThanOp:
				enterOuterAlt(_localctx, 3);
				{
				setState(514); match(LessThanOp);
				}
				break;
			case GreaterThanEqualTo:
				enterOuterAlt(_localctx, 4);
				{
				setState(515); match(GreaterThanEqualTo);
				}
				break;
			case LessThanEqualTo:
				enterOuterAlt(_localctx, 5);
				{
				setState(516); match(LessThanEqualTo);
				}
				break;
			case NotEqualToOp:
				enterOuterAlt(_localctx, 6);
				{
				setState(517); match(NotEqualToOp);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Logical_operatorContext extends ParserRuleContext {
		public TerminalNode AndOp() { return getToken(DogeScriptParser.AndOp, 0); }
		public TerminalNode OrOp() { return getToken(DogeScriptParser.OrOp, 0); }
		public Logical_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).enterLogical_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).exitLogical_operator(this);
		}
	}

	public final Logical_operatorContext logical_operator() throws RecognitionException {
		Logical_operatorContext _localctx = new Logical_operatorContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_logical_operator);
		try {
			setState(523);
			switch (_input.LA(1)) {
			case AndOp:
				enterOuterAlt(_localctx, 1);
				{
				System.out.println("in logical_operator");
				setState(521); match(AndOp);
				}
				break;
			case OrOp:
				enterOuterAlt(_localctx, 2);
				{
				setState(522); match(OrOp);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		public TerminalNode OpenParenthesis() { return getToken(DogeScriptParser.OpenParenthesis, 0); }
		public TerminalNode CloseParenthesis() { return getToken(DogeScriptParser.CloseParenthesis, 0); }
		public TerminalNode VarIdentifier() { return getToken(DogeScriptParser.VarIdentifier, 0); }
		public Function_call_parametersContext function_call_parameters() {
			return getRuleContext(Function_call_parametersContext.class,0);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).exitFunction_call(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_function_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			System.out.println("in function_call");
			setState(526); match(VarIdentifier);
			setState(527); match(OpenParenthesis);
			setState(528); function_call_parameters();
			setState(529); match(CloseParenthesis);
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

	public static class Function_call_parametersContext extends ParserRuleContext {
		public Returns_valueContext returns_value() {
			return getRuleContext(Returns_valueContext.class,0);
		}
		public TerminalNode Comma() { return getToken(DogeScriptParser.Comma, 0); }
		public Function_call_parametersContext function_call_parameters() {
			return getRuleContext(Function_call_parametersContext.class,0);
		}
		public Function_call_parametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).enterFunction_call_parameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).exitFunction_call_parameters(this);
		}
	}

	public final Function_call_parametersContext function_call_parameters() throws RecognitionException {
		Function_call_parametersContext _localctx = new Function_call_parametersContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_function_call_parameters);
		try {
			setState(537);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				System.out.println("in function_call_parameters");
				setState(532); returns_value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(533); returns_value();
				setState(534); match(Comma);
				setState(535); function_call_parameters();
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\62\u021e\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\5"+
		"\5g\n\5\3\6\3\6\3\6\3\6\3\6\5\6n\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\5\7}\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\5\b\u008c\n\b\3\t\3\t\3\t\5\t\u0091\n\t\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\5\13\u00a7\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00b4"+
		"\n\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00bc\n\r\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00cb\n\16\3\17\3\17\3\17"+
		"\3\17\3\17\5\17\u00d2\n\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00da\n"+
		"\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\7\22\u00e4\n\22\f\22\16\22"+
		"\u00e7\13\22\3\22\5\22\u00ea\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7"+
		"\23\u00f3\n\23\f\23\16\23\u00f6\13\23\3\23\5\23\u00f9\n\23\3\24\3\24\3"+
		"\24\5\24\u00fe\n\24\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0106\n\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0113\n\26\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0121\n\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u013a\n\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0155\n\31\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u016d\n\32\3\33\3\33\3\33\3\33\5\33"+
		"\u0173\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\5\34\u0184\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\5\35\u019f\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37"+
		"\u01c4\n\37\3 \3 \3 \3 \3 \5 \u01cb\n \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3"+
		"!\3!\3!\5!\u01da\n!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5"+
		"\"\u01e8\n\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u01fb"+
		"\n#\3$\3$\3$\5$\u0200\n$\3%\3%\3%\3%\3%\3%\3%\5%\u0209\n%\3&\3&\3&\5&"+
		"\u020e\n&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\5(\u021c\n(\3(\2\2"+
		")\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDF"+
		"HJLN\2\2\u024a\2P\3\2\2\2\4S\3\2\2\2\6W\3\2\2\2\bf\3\2\2\2\nm\3\2\2\2"+
		"\f|\3\2\2\2\16\u008b\3\2\2\2\20\u0090\3\2\2\2\22\u0092\3\2\2\2\24\u00a6"+
		"\3\2\2\2\26\u00b3\3\2\2\2\30\u00bb\3\2\2\2\32\u00ca\3\2\2\2\34\u00d1\3"+
		"\2\2\2\36\u00d9\3\2\2\2 \u00db\3\2\2\2\"\u00e9\3\2\2\2$\u00f8\3\2\2\2"+
		"&\u00fd\3\2\2\2(\u0105\3\2\2\2*\u0112\3\2\2\2,\u0120\3\2\2\2.\u0139\3"+
		"\2\2\2\60\u0154\3\2\2\2\62\u016c\3\2\2\2\64\u0172\3\2\2\2\66\u0183\3\2"+
		"\2\28\u019e\3\2\2\2:\u01a0\3\2\2\2<\u01c3\3\2\2\2>\u01ca\3\2\2\2@\u01d9"+
		"\3\2\2\2B\u01e7\3\2\2\2D\u01fa\3\2\2\2F\u01ff\3\2\2\2H\u0208\3\2\2\2J"+
		"\u020d\3\2\2\2L\u020f\3\2\2\2N\u021b\3\2\2\2PQ\5\4\3\2QR\7\2\2\3R\3\3"+
		"\2\2\2ST\5\b\5\2TU\5\6\4\2UV\5\b\5\2V\5\3\2\2\2WX\b\4\1\2XY\7\13\2\2Y"+
		"Z\7\24\2\2Z[\7\25\2\2[\\\7*\2\2\\]\7+\2\2]^\7(\2\2^_\5\n\6\2_`\7)\2\2"+
		"`\7\3\2\2\2ab\b\5\1\2bc\5\22\n\2cd\5\b\5\2dg\3\2\2\2eg\3\2\2\2fa\3\2\2"+
		"\2fe\3\2\2\2g\t\3\2\2\2hi\b\6\1\2ij\5\f\7\2jk\5\n\6\2kn\3\2\2\2ln\5\f"+
		"\7\2mh\3\2\2\2ml\3\2\2\2n\13\3\2\2\2op\b\7\1\2pq\5\26\f\2qr\7\t\2\2r}"+
		"\3\2\2\2st\5*\26\2tu\7\t\2\2u}\3\2\2\2vw\5L\'\2wx\7\t\2\2x}\3\2\2\2y}"+
		"\5,\27\2z}\5\64\33\2{}\7\t\2\2|o\3\2\2\2|s\3\2\2\2|v\3\2\2\2|y\3\2\2\2"+
		"|z\3\2\2\2|{\3\2\2\2}\r\3\2\2\2~\177\b\b\1\2\177\u0080\5\26\f\2\u0080"+
		"\u0081\7\t\2\2\u0081\u008c\3\2\2\2\u0082\u0083\5*\26\2\u0083\u0084\7\t"+
		"\2\2\u0084\u008c\3\2\2\2\u0085\u0086\5L\'\2\u0086\u0087\7\t\2\2\u0087"+
		"\u008c\3\2\2\2\u0088\u008c\5,\27\2\u0089\u008c\5\64\33\2\u008a\u008c\7"+
		"\t\2\2\u008b~\3\2\2\2\u008b\u0082\3\2\2\2\u008b\u0085\3\2\2\2\u008b\u0088"+
		"\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008a\3\2\2\2\u008c\17\3\2\2\2\u008d"+
		"\u008e\b\t\1\2\u008e\u0091\5*\26\2\u008f\u0091\5L\'\2\u0090\u008d\3\2"+
		"\2\2\u0090\u008f\3\2\2\2\u0091\21\3\2\2\2\u0092\u0093\b\n\1\2\u0093\u0094"+
		"\7\13\2\2\u0094\u0095\5\32\16\2\u0095\u0096\7\61\2\2\u0096\u0097\7*\2"+
		"\2\u0097\u0098\5\24\13\2\u0098\u0099\7+\2\2\u0099\u009a\7(\2\2\u009a\u009b"+
		"\5\n\6\2\u009b\u009c\7)\2\2\u009c\23\3\2\2\2\u009d\u009e\b\13\1\2\u009e"+
		"\u009f\5\32\16\2\u009f\u00a0\7\61\2\2\u00a0\u00a7\3\2\2\2\u00a1\u00a2"+
		"\5\32\16\2\u00a2\u00a3\7\61\2\2\u00a3\u00a4\7\26\2\2\u00a4\u00a5\5\24"+
		"\13\2\u00a5\u00a7\3\2\2\2\u00a6\u009d\3\2\2\2\u00a6\u00a1\3\2\2\2\u00a7"+
		"\25\3\2\2\2\u00a8\u00a9\b\f\1\2\u00a9\u00aa\7\n\2\2\u00aa\u00ab\5\32\16"+
		"\2\u00ab\u00ac\5\34\17\2\u00ac\u00b4\3\2\2\2\u00ad\u00ae\7\n\2\2\u00ae"+
		"\u00af\5\32\16\2\u00af\u00b0\7\61\2\2\u00b0\u00b1\7\r\2\2\u00b1\u00b2"+
		"\5\36\20\2\u00b2\u00b4\3\2\2\2\u00b3\u00a8\3\2\2\2\u00b3\u00ad\3\2\2\2"+
		"\u00b4\27\3\2\2\2\u00b5\u00b6\b\r\1\2\u00b6\u00bc\7,\2\2\u00b7\u00bc\7"+
		"-\2\2\u00b8\u00bc\7.\2\2\u00b9\u00bc\7/\2\2\u00ba\u00bc\7\30\2\2\u00bb"+
		"\u00b5\3\2\2\2\u00bb\u00b7\3\2\2\2\u00bb\u00b8\3\2\2\2\u00bb\u00b9\3\2"+
		"\2\2\u00bb\u00ba\3\2\2\2\u00bc\31\3\2\2\2\u00bd\u00be\b\16\1\2\u00be\u00cb"+
		"\7\5\2\2\u00bf\u00cb\7\6\2\2\u00c0\u00cb\7\7\2\2\u00c1\u00cb\7\b\2\2\u00c2"+
		"\u00c3\7\5\2\2\u00c3\u00cb\7\60\2\2\u00c4\u00c5\7\6\2\2\u00c5\u00cb\7"+
		"\60\2\2\u00c6\u00c7\7\7\2\2\u00c7\u00cb\7\60\2\2\u00c8\u00c9\7\b\2\2\u00c9"+
		"\u00cb\7\60\2\2\u00ca\u00bd\3\2\2\2\u00ca\u00bf\3\2\2\2\u00ca\u00c0\3"+
		"\2\2\2\u00ca\u00c1\3\2\2\2\u00ca\u00c2\3\2\2\2\u00ca\u00c4\3\2\2\2\u00ca"+
		"\u00c6\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\33\3\2\2\2\u00cc\u00cd\b\17\1"+
		"\2\u00cd\u00ce\7\61\2\2\u00ce\u00cf\7\26\2\2\u00cf\u00d2\5\34\17\2\u00d0"+
		"\u00d2\7\61\2\2\u00d1\u00cc\3\2\2\2\u00d1\u00d0\3\2\2\2\u00d2\35\3\2\2"+
		"\2\u00d3\u00d4\b\20\1\2\u00d4\u00da\5\30\r\2\u00d5\u00da\5 \21\2\u00d6"+
		"\u00da\5L\'\2\u00d7\u00da\7\61\2\2\u00d8\u00da\7\27\2\2\u00d9\u00d3\3"+
		"\2\2\2\u00d9\u00d5\3\2\2\2\u00d9\u00d6\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9"+
		"\u00d8\3\2\2\2\u00da\37\3\2\2\2\u00db\u00dc\5\"\22\2\u00dc\u00dd\b\21"+
		"\1\2\u00dd!\3\2\2\2\u00de\u00e5\5$\23\2\u00df\u00e0\7\31\2\2\u00e0\u00e4"+
		"\5$\23\2\u00e1\u00e2\7\32\2\2\u00e2\u00e4\5$\23\2\u00e3\u00df\3\2\2\2"+
		"\u00e3\u00e1\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6"+
		"\3\2\2\2\u00e6\u00ea\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00ea\5$\23\2\u00e9"+
		"\u00de\3\2\2\2\u00e9\u00e8\3\2\2\2\u00ea#\3\2\2\2\u00eb\u00f4\5&\24\2"+
		"\u00ec\u00ed\7\33\2\2\u00ed\u00f3\5&\24\2\u00ee\u00ef\7\34\2\2\u00ef\u00f3"+
		"\5&\24\2\u00f0\u00f1\7\35\2\2\u00f1\u00f3\5&\24\2\u00f2\u00ec\3\2\2\2"+
		"\u00f2\u00ee\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4\u00f2"+
		"\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f9\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7"+
		"\u00f9\5&\24\2\u00f8\u00eb\3\2\2\2\u00f8\u00f7\3\2\2\2\u00f9%\3\2\2\2"+
		"\u00fa\u00fb\7\32\2\2\u00fb\u00fe\5(\25\2\u00fc\u00fe\5(\25\2\u00fd\u00fa"+
		"\3\2\2\2\u00fd\u00fc\3\2\2\2\u00fe\'\3\2\2\2\u00ff\u0106\7,\2\2\u0100"+
		"\u0101\7*\2\2\u0101\u0102\5 \21\2\u0102\u0103\7+\2\2\u0103\u0106\3\2\2"+
		"\2\u0104\u0106\7\61\2\2\u0105\u00ff\3\2\2\2\u0105\u0100\3\2\2\2\u0105"+
		"\u0104\3\2\2\2\u0106)\3\2\2\2\u0107\u0108\b\26\1\2\u0108\u0109\7\61\2"+
		"\2\u0109\u010a\7\r\2\2\u010a\u0113\7\61\2\2\u010b\u010c\7\61\2\2\u010c"+
		"\u010d\7\r\2\2\u010d\u0113\5\36\20\2\u010e\u010f\7\61\2\2\u010f\u0113"+
		"\7&\2\2\u0110\u0111\7\61\2\2\u0111\u0113\7\'\2\2\u0112\u0107\3\2\2\2\u0112"+
		"\u010b\3\2\2\2\u0112\u010e\3\2\2\2\u0112\u0110\3\2\2\2\u0113+\3\2\2\2"+
		"\u0114\u0115\b\27\1\2\u0115\u0121\5.\30\2\u0116\u0117\5.\30\2\u0117\u0118"+
		"\5\60\31\2\u0118\u0121\3\2\2\2\u0119\u011a\5.\30\2\u011a\u011b\5\62\32"+
		"\2\u011b\u0121\3\2\2\2\u011c\u011d\5.\30\2\u011d\u011e\5\62\32\2\u011e"+
		"\u011f\5\60\31\2\u011f\u0121\3\2\2\2\u0120\u0114\3\2\2\2\u0120\u0116\3"+
		"\2\2\2\u0120\u0119\3\2\2\2\u0120\u011c\3\2\2\2\u0121-\3\2\2\2\u0122\u0123"+
		"\b\30\1\2\u0123\u0124\7\16\2\2\u0124\u0125\7*\2\2\u0125\u0126\5<\37\2"+
		"\u0126\u0127\7+\2\2\u0127\u0128\5\16\b\2\u0128\u013a\3\2\2\2\u0129\u012a"+
		"\7\16\2\2\u012a\u012b\7*\2\2\u012b\u012c\5<\37\2\u012c\u012d\7+\2\2\u012d"+
		"\u012e\7(\2\2\u012e\u012f\5\16\b\2\u012f\u0130\7)\2\2\u0130\u013a\3\2"+
		"\2\2\u0131\u0132\7\16\2\2\u0132\u0133\7*\2\2\u0133\u0134\5<\37\2\u0134"+
		"\u0135\7+\2\2\u0135\u0136\7(\2\2\u0136\u0137\5\n\6\2\u0137\u0138\7)\2"+
		"\2\u0138\u013a\3\2\2\2\u0139\u0122\3\2\2\2\u0139\u0129\3\2\2\2\u0139\u0131"+
		"\3\2\2\2\u013a/\3\2\2\2\u013b\u013c\b\31\1\2\u013c\u013d\7\17\2\2\u013d"+
		"\u013e\7*\2\2\u013e\u013f\5<\37\2\u013f\u0140\7+\2\2\u0140\u0141\5\16"+
		"\b\2\u0141\u0155\3\2\2\2\u0142\u0143\7\17\2\2\u0143\u0144\7*\2\2\u0144"+
		"\u0145\5<\37\2\u0145\u0146\7+\2\2\u0146\u0147\7(\2\2\u0147\u0148\5\16"+
		"\b\2\u0148\u0149\7)\2\2\u0149\u0155\3\2\2\2\u014a\u014b\7\17\2\2\u014b"+
		"\u014c\7*\2\2\u014c\u014d\5<\37\2\u014d\u014e\7+\2\2\u014e\u014f\7(\2"+
		"\2\u014f\u0150\5\n\6\2\u0150\u0151\7)\2\2\u0151\u0155\3\2\2\2\u0152\u0153"+
		"\7\17\2\2\u0153\u0155\5\16\b\2\u0154\u013b\3\2\2\2\u0154\u0142\3\2\2\2"+
		"\u0154\u014a\3\2\2\2\u0154\u0152\3\2\2\2\u0155\61\3\2\2\2\u0156\u0157"+
		"\b\32\1\2\u0157\u0158\7\20\2\2\u0158\u0159\7*\2\2\u0159\u015a\5<\37\2"+
		"\u015a\u015b\7+\2\2\u015b\u015c\5\16\b\2\u015c\u016d\3\2\2\2\u015d\u015e"+
		"\7\20\2\2\u015e\u015f\7*\2\2\u015f\u0160\5<\37\2\u0160\u0161\7+\2\2\u0161"+
		"\u0162\5\16\b\2\u0162\u0163\7)\2\2\u0163\u016d\3\2\2\2\u0164\u0165\7\20"+
		"\2\2\u0165\u0166\7*\2\2\u0166\u0167\5<\37\2\u0167\u0168\7+\2\2\u0168\u0169"+
		"\7(\2\2\u0169\u016a\5\n\6\2\u016a\u016b\7)\2\2\u016b\u016d\3\2\2\2\u016c"+
		"\u0156\3\2\2\2\u016c\u015d\3\2\2\2\u016c\u0164\3\2\2\2\u016d\63\3\2\2"+
		"\2\u016e\u016f\b\33\1\2\u016f\u0173\5\66\34\2\u0170\u0173\58\35\2\u0171"+
		"\u0173\5:\36\2\u0172\u016e\3\2\2\2\u0172\u0170\3\2\2\2\u0172\u0171\3\2"+
		"\2\2\u0173\65\3\2\2\2\u0174\u0175\b\34\1\2\u0175\u0176\7\21\2\2\u0176"+
		"\u0177\7*\2\2\u0177\u0178\5<\37\2\u0178\u0179\7+\2\2\u0179\u017a\7(\2"+
		"\2\u017a\u017b\5\n\6\2\u017b\u017c\7)\2\2\u017c\u0184\3\2\2\2\u017d\u017e"+
		"\7\21\2\2\u017e\u017f\7*\2\2\u017f\u0180\5<\37\2\u0180\u0181\7+\2\2\u0181"+
		"\u0182\5\16\b\2\u0182\u0184\3\2\2\2\u0183\u0174\3\2\2\2\u0183\u017d\3"+
		"\2\2\2\u0184\67\3\2\2\2\u0185\u0186\b\35\1\2\u0186\u0187\7\22\2\2\u0187"+
		"\u0188\7*\2\2\u0188\u0189\5\26\f\2\u0189\u018a\7\t\2\2\u018a\u018b\5<"+
		"\37\2\u018b\u018c\7\t\2\2\u018c\u018d\5\20\t\2\u018d\u018e\7+\2\2\u018e"+
		"\u018f\7(\2\2\u018f\u0190\5\n\6\2\u0190\u0191\7)\2\2\u0191\u019f\3\2\2"+
		"\2\u0192\u0193\7\22\2\2\u0193\u0194\7*\2\2\u0194\u0195\5*\26\2\u0195\u0196"+
		"\7\t\2\2\u0196\u0197\5<\37\2\u0197\u0198\7\t\2\2\u0198\u0199\5\20\t\2"+
		"\u0199\u019a\7+\2\2\u019a\u019b\7(\2\2\u019b\u019c\5\n\6\2\u019c\u019d"+
		"\7)\2\2\u019d\u019f\3\2\2\2\u019e\u0185\3\2\2\2\u019e\u0192\3\2\2\2\u019f"+
		"9\3\2\2\2\u01a0\u01a1\b\36\1\2\u01a1\u01a2\7\23\2\2\u01a2\u01a3\7(\2\2"+
		"\u01a3\u01a4\5\n\6\2\u01a4\u01a5\7)\2\2\u01a5\u01a6\7\21\2\2\u01a6\u01a7"+
		"\7*\2\2\u01a7\u01a8\5<\37\2\u01a8\u01a9\7+\2\2\u01a9\u01aa\7\t\2\2\u01aa"+
		";\3\2\2\2\u01ab\u01c4\5@!\2\u01ac\u01c4\5B\"\2\u01ad\u01c4\5D#\2\u01ae"+
		"\u01c4\5> \2\u01af\u01b0\7*\2\2\u01b0\u01b1\5<\37\2\u01b1\u01b2\7+\2\2"+
		"\u01b2\u01c4\3\2\2\2\u01b3\u01b4\5@!\2\u01b4\u01b5\5J&\2\u01b5\u01b6\5"+
		"<\37\2\u01b6\u01c4\3\2\2\2\u01b7\u01b8\5B\"\2\u01b8\u01b9\5J&\2\u01b9"+
		"\u01ba\5<\37\2\u01ba\u01c4\3\2\2\2\u01bb\u01bc\5D#\2\u01bc\u01bd\5J&\2"+
		"\u01bd\u01be\5<\37\2\u01be\u01c4\3\2\2\2\u01bf\u01c0\5> \2\u01c0\u01c1"+
		"\5J&\2\u01c1\u01c2\5<\37\2\u01c2\u01c4\3\2\2\2\u01c3\u01ab\3\2\2\2\u01c3"+
		"\u01ac\3\2\2\2\u01c3\u01ad\3\2\2\2\u01c3\u01ae\3\2\2\2\u01c3\u01af\3\2"+
		"\2\2\u01c3\u01b3\3\2\2\2\u01c3\u01b7\3\2\2\2\u01c3\u01bb\3\2\2\2\u01c3"+
		"\u01bf\3\2\2\2\u01c4=\3\2\2\2\u01c5\u01c6\7\30\2\2\u01c6\u01c7\5F$\2\u01c7"+
		"\u01c8\5L\'\2\u01c8\u01cb\3\2\2\2\u01c9\u01cb\7\30\2\2\u01ca\u01c5\3\2"+
		"\2\2\u01ca\u01c9\3\2\2\2\u01cb?\3\2\2\2\u01cc\u01cd\7\61\2\2\u01cd\u01ce"+
		"\5H%\2\u01ce\u01cf\7\61\2\2\u01cf\u01da\3\2\2\2\u01d0\u01d1\7\61\2\2\u01d1"+
		"\u01d2\5H%\2\u01d2\u01d3\5 \21\2\u01d3\u01da\3\2\2\2\u01d4\u01d5\7\61"+
		"\2\2\u01d5\u01d6\5H%\2\u01d6\u01d7\5L\'\2\u01d7\u01da\3\2\2\2\u01d8\u01da"+
		"\7\61\2\2\u01d9\u01cc\3\2\2\2\u01d9\u01d0\3\2\2\2\u01d9\u01d4\3\2\2\2"+
		"\u01d9\u01d8\3\2\2\2\u01daA\3\2\2\2\u01db\u01dc\5 \21\2\u01dc\u01dd\5"+
		"H%\2\u01dd\u01de\7\61\2\2\u01de\u01e8\3\2\2\2\u01df\u01e0\5 \21\2\u01e0"+
		"\u01e1\5H%\2\u01e1\u01e2\5 \21\2\u01e2\u01e8\3\2\2\2\u01e3\u01e4\5 \21"+
		"\2\u01e4\u01e5\5H%\2\u01e5\u01e6\5L\'\2\u01e6\u01e8\3\2\2\2\u01e7\u01db"+
		"\3\2\2\2\u01e7\u01df\3\2\2\2\u01e7\u01e3\3\2\2\2\u01e8C\3\2\2\2\u01e9"+
		"\u01ea\5L\'\2\u01ea\u01eb\5H%\2\u01eb\u01ec\5L\'\2\u01ec\u01fb\3\2\2\2"+
		"\u01ed\u01ee\5L\'\2\u01ee\u01ef\5H%\2\u01ef\u01f0\7\61\2\2\u01f0\u01fb"+
		"\3\2\2\2\u01f1\u01f2\5L\'\2\u01f2\u01f3\5H%\2\u01f3\u01f4\5 \21\2\u01f4"+
		"\u01fb\3\2\2\2\u01f5\u01f6\5L\'\2\u01f6\u01f7\5H%\2\u01f7\u01f8\7\30\2"+
		"\2\u01f8\u01fb\3\2\2\2\u01f9\u01fb\5L\'\2\u01fa\u01e9\3\2\2\2\u01fa\u01ed"+
		"\3\2\2\2\u01fa\u01f1\3\2\2\2\u01fa\u01f5\3\2\2\2\u01fa\u01f9\3\2\2\2\u01fb"+
		"E\3\2\2\2\u01fc\u01fd\b$\1\2\u01fd\u0200\7\36\2\2\u01fe\u0200\7#\2\2\u01ff"+
		"\u01fc\3\2\2\2\u01ff\u01fe\3\2\2\2\u0200G\3\2\2\2\u0201\u0202\b%\1\2\u0202"+
		"\u0209\7\36\2\2\u0203\u0209\7\37\2\2\u0204\u0209\7 \2\2\u0205\u0209\7"+
		"!\2\2\u0206\u0209\7\"\2\2\u0207\u0209\7#\2\2\u0208\u0201\3\2\2\2\u0208"+
		"\u0203\3\2\2\2\u0208\u0204\3\2\2\2\u0208\u0205\3\2\2\2\u0208\u0206\3\2"+
		"\2\2\u0208\u0207\3\2\2\2\u0209I\3\2\2\2\u020a\u020b\b&\1\2\u020b\u020e"+
		"\7$\2\2\u020c\u020e\7%\2\2\u020d\u020a\3\2\2\2\u020d\u020c\3\2\2\2\u020e"+
		"K\3\2\2\2\u020f\u0210\b\'\1\2\u0210\u0211\7\61\2\2\u0211\u0212\7*\2\2"+
		"\u0212\u0213\5N(\2\u0213\u0214\7+\2\2\u0214M\3\2\2\2\u0215\u0216\b(\1"+
		"\2\u0216\u021c\5\36\20\2\u0217\u0218\5\36\20\2\u0218\u0219\7\26\2\2\u0219"+
		"\u021a\5N(\2\u021a\u021c\3\2\2\2\u021b\u0215\3\2\2\2\u021b\u0217\3\2\2"+
		"\2\u021cO\3\2\2\2&fm|\u008b\u0090\u00a6\u00b3\u00bb\u00ca\u00d1\u00d9"+
		"\u00e3\u00e5\u00e9\u00f2\u00f4\u00f8\u00fd\u0105\u0112\u0120\u0139\u0154"+
		"\u016c\u0172\u0183\u019e\u01c3\u01ca\u01d9\u01e7\u01fa\u01ff\u0208\u020d"+
		"\u021b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}