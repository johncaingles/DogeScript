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
		WS=1, IntDataType=2, CharDataType=3, BoolDataType=4, StringDataType=5, 
		Terminator=6, VarDecStarter=7, FuncStarter=8, ConstantStarter=9, AssOp=10, 
		IfKeyword=11, ElseKeyword=12, ElseIfKeyword=13, EventLoopKeyword=14, CountLoopKeyword=15, 
		RepeatUntilLoopKeyword=16, VoidKeyword=17, MainKeyword=18, Comma=19, NullKeyword=20, 
		BoolLit=21, AddOp=22, SubOp=23, MulOp=24, DivOp=25, ModOp=26, EquaOp=27, 
		GreaterThanOp=28, LessThanOp=29, GreaterThanEqualTo=30, LessThanEqualTo=31, 
		NotEqualToOp=32, AndOp=33, OrOp=34, IncrementOp=35, DecrementOp=36, OpenBrace=37, 
		CloseBrace=38, OpenParenthesis=39, CloseParenthesis=40, IntLit=41, FloatLit=42, 
		StringLit=43, CharLit=44, Array=45, VarIdentifier=46, EndOfFile=47;
	public static final String[] tokenNames = {
		"<INVALID>", "WS", "'int'", "'char'", "'boolean'", "'string'", "Terminator", 
		"'such'", "'much'", "'very'", "'as'", "'rily'", "'but'", "'but rily'", 
		"'so'", "'many'", "'nice'", "'void'", "'main'", "','", "'null'", "BoolLit", 
		"'+'", "'-'", "'*'", "'/'", "'%'", "'is'", "'>'", "'<'", "'>='", "'<='", 
		"'!='", "'and'", "'or'", "'++'", "'--'", "'{'", "'}'", "'('", "')'", "IntLit", 
		"FloatLit", "StringLit", "CharLit", "Array", "VarIdentifier", "'$'"
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
		RULE_condition = 29, RULE_comparison = 30, RULE_logical_operator = 31, 
		RULE_function_call = 32, RULE_function_call_parameters = 33;
	public static final String[] ruleNames = {
		"start", "source_code", "main_function", "function_block", "codeblock", 
		"all_possible_statements", "all_possible_single_statements", "afterthought_statement", 
		"function_declaration", "function_declaration_paramaters", "variable_declaration", 
		"literal", "datatype", "variable_instance", "returns_value", "expression", 
		"low_prior", "high_prior", "signint", "top_prior", "assignment_statement", 
		"conditional_statement", "start_condition", "end_condition", "continue_condition", 
		"loop_statement", "event_loop_statement", "count_loop_statement", "repeatuntil_loop_statement", 
		"condition", "comparison", "logical_operator", "function_call", "function_call_parameters"
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
		public TerminalNode EndOfFile() { return getToken(DogeScriptParser.EndOfFile, 0); }
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
			setState(68); source_code();
			setState(69); match(EndOfFile);
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
			setState(71); function_block();
			setState(72); main_function();
			setState(73); function_block();
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
			setState(76); match(FuncStarter);
			setState(77); match(VoidKeyword);
			setState(78); match(MainKeyword);
			setState(79); match(OpenParenthesis);
			setState(80); match(CloseParenthesis);
			setState(81); match(OpenBrace);
			setState(82); codeblock();
			setState(83); match(CloseBrace);
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
			setState(90);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				System.out.println("in function_block");
				setState(86); function_declaration();
				setState(87); function_block();
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
			setState(97);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				System.out.println("in code_block");
				setState(93); all_possible_statements();
				setState(94); codeblock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(96); all_possible_statements();
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
			setState(111);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				System.out.println("in all_possible");
				setState(100); variable_declaration();
				setState(101); match(Terminator);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(103); assignment_statement();
				setState(104); match(Terminator);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(106); function_call();
				setState(107); match(Terminator);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(109); conditional_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(110); loop_statement();
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
			setState(125);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				System.out.println("in single_all_possible");
				setState(114); variable_declaration();
				setState(115); match(Terminator);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(117); assignment_statement();
				setState(118); match(Terminator);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(120); function_call();
				setState(121); match(Terminator);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(123); conditional_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(124); loop_statement();
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
			setState(130);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				System.out.println("in afterthought_statement");
				setState(128); assignment_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(129); function_call();
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
			setState(133); match(FuncStarter);
			setState(134); datatype();
			setState(135); match(VarIdentifier);
			setState(136); match(OpenParenthesis);
			setState(137); function_declaration_paramaters();
			setState(138); match(CloseParenthesis);
			setState(139); match(OpenBrace);
			setState(140); codeblock();
			setState(141); match(CloseBrace);
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
			setState(152);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				System.out.println("in function_declaration_paramaters");
				setState(144); datatype();
				setState(145); match(VarIdentifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(147); datatype();
				setState(148); match(VarIdentifier);
				setState(149); match(Comma);
				setState(150); function_declaration_paramaters();
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
			setState(165);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				System.out.println("in variable_declaration");
				setState(155); match(VarDecStarter);
				setState(156); datatype();
				setState(157); variable_instance();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(159); match(VarDecStarter);
				setState(160); datatype();
				setState(161); match(VarIdentifier);
				setState(162); match(AssOp);
				setState(163); returns_value();
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
			setState(173);
			switch (_input.LA(1)) {
			case IntLit:
				enterOuterAlt(_localctx, 1);
				{
				System.out.println("in literal");
				setState(168); match(IntLit);
				}
				break;
			case FloatLit:
				enterOuterAlt(_localctx, 2);
				{
				setState(169); match(FloatLit);
				}
				break;
			case StringLit:
				enterOuterAlt(_localctx, 3);
				{
				setState(170); match(StringLit);
				}
				break;
			case CharLit:
				enterOuterAlt(_localctx, 4);
				{
				setState(171); match(CharLit);
				}
				break;
			case BoolLit:
				enterOuterAlt(_localctx, 5);
				{
				setState(172); match(BoolLit);
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
			setState(180);
			switch (_input.LA(1)) {
			case IntDataType:
				enterOuterAlt(_localctx, 1);
				{
				System.out.println("in datatype");
				setState(176); match(IntDataType);
				}
				break;
			case CharDataType:
				enterOuterAlt(_localctx, 2);
				{
				setState(177); match(CharDataType);
				}
				break;
			case BoolDataType:
				enterOuterAlt(_localctx, 3);
				{
				setState(178); match(BoolDataType);
				}
				break;
			case StringDataType:
				enterOuterAlt(_localctx, 4);
				{
				setState(179); match(StringDataType);
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
			setState(187);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				System.out.println("in variable_instance");
				setState(183); match(VarIdentifier);
				setState(184); match(Comma);
				setState(185); variable_instance();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(186); match(VarIdentifier);
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
			setState(195);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				System.out.println("in returns_value");
				setState(190); literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(191); expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(192); function_call();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(193); match(VarIdentifier);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(194); match(NullKeyword);
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
			setState(197); low_prior();
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
			setState(211);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(200); high_prior();
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AddOp || _la==SubOp) {
					{
					setState(205);
					switch (_input.LA(1)) {
					case AddOp:
						{
						setState(201); match(AddOp);
						setState(202); high_prior();
						}
						break;
					case SubOp:
						{
						setState(203); match(SubOp);
						setState(204); high_prior();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(209);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(210); high_prior();
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
			setState(226);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(213); signint();
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MulOp) | (1L << DivOp) | (1L << ModOp))) != 0)) {
					{
					setState(220);
					switch (_input.LA(1)) {
					case MulOp:
						{
						setState(214); match(MulOp);
						setState(215); signint();
						}
						break;
					case DivOp:
						{
						setState(216); match(DivOp);
						setState(217); signint();
						}
						break;
					case ModOp:
						{
						setState(218); match(ModOp);
						setState(219); signint();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(224);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(225); signint();
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
			setState(231);
			switch (_input.LA(1)) {
			case SubOp:
				enterOuterAlt(_localctx, 1);
				{
				setState(228); match(SubOp);
				setState(229); top_prior();
				}
				break;
			case OpenParenthesis:
			case IntLit:
			case VarIdentifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(230); top_prior();
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
			setState(239);
			switch (_input.LA(1)) {
			case IntLit:
				enterOuterAlt(_localctx, 1);
				{
				setState(233); match(IntLit);
				}
				break;
			case OpenParenthesis:
				enterOuterAlt(_localctx, 2);
				{
				setState(234); match(OpenParenthesis);
				setState(235); expression();
				setState(236); match(CloseParenthesis);
				}
				break;
			case VarIdentifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(238); match(VarIdentifier);
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
			setState(252);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				System.out.println("in assignment_statement");
				setState(242); match(VarIdentifier);
				setState(243); match(AssOp);
				setState(244); match(VarIdentifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(245); match(VarIdentifier);
				setState(246); match(AssOp);
				setState(247); returns_value();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(248); match(VarIdentifier);
				setState(249); match(IncrementOp);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(250); match(VarIdentifier);
				setState(251); match(DecrementOp);
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
			setState(266);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				System.out.println("in conditional_statement");
				setState(255); start_condition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(256); start_condition();
				setState(257); end_condition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(259); start_condition();
				setState(260); continue_condition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(262); start_condition();
				setState(263); continue_condition();
				setState(264); end_condition();
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
			setState(291);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				System.out.println("in start_condition");
				setState(269); match(IfKeyword);
				setState(270); match(OpenParenthesis);
				setState(271); condition();
				setState(272); match(CloseParenthesis);
				setState(273); all_possible_single_statements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(275); match(IfKeyword);
				setState(276); match(OpenParenthesis);
				setState(277); condition();
				setState(278); match(CloseParenthesis);
				setState(279); match(OpenBrace);
				setState(280); all_possible_single_statements();
				setState(281); match(CloseBrace);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(283); match(IfKeyword);
				setState(284); match(OpenParenthesis);
				setState(285); condition();
				setState(286); match(CloseParenthesis);
				setState(287); match(OpenBrace);
				setState(288); codeblock();
				setState(289); match(CloseBrace);
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
			setState(318);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				System.out.println("in end_condition");
				setState(294); match(ElseKeyword);
				setState(295); match(OpenParenthesis);
				setState(296); condition();
				setState(297); match(CloseParenthesis);
				setState(298); all_possible_single_statements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(300); match(ElseKeyword);
				setState(301); match(OpenParenthesis);
				setState(302); condition();
				setState(303); match(CloseParenthesis);
				setState(304); match(OpenBrace);
				setState(305); all_possible_single_statements();
				setState(306); match(CloseBrace);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(308); match(ElseKeyword);
				setState(309); match(OpenParenthesis);
				setState(310); condition();
				setState(311); match(CloseParenthesis);
				setState(312); match(OpenBrace);
				setState(313); codeblock();
				setState(314); match(CloseBrace);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(316); match(ElseKeyword);
				setState(317); all_possible_single_statements();
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
			setState(342);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				System.out.println("in continue_condition");
				setState(321); match(ElseIfKeyword);
				setState(322); match(OpenParenthesis);
				setState(323); condition();
				setState(324); match(CloseParenthesis);
				setState(325); all_possible_single_statements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(327); match(ElseIfKeyword);
				setState(328); match(OpenParenthesis);
				setState(329); condition();
				setState(330); match(CloseParenthesis);
				setState(331); all_possible_single_statements();
				setState(332); match(CloseBrace);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(334); match(ElseIfKeyword);
				setState(335); match(OpenParenthesis);
				setState(336); condition();
				setState(337); match(CloseParenthesis);
				setState(338); match(OpenBrace);
				setState(339); codeblock();
				setState(340); match(CloseBrace);
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
			setState(348);
			switch (_input.LA(1)) {
			case EventLoopKeyword:
				enterOuterAlt(_localctx, 1);
				{
				System.out.println("in LOOPS");
				setState(345); event_loop_statement();
				}
				break;
			case CountLoopKeyword:
				enterOuterAlt(_localctx, 2);
				{
				setState(346); count_loop_statement();
				}
				break;
			case RepeatUntilLoopKeyword:
				enterOuterAlt(_localctx, 3);
				{
				setState(347); repeatuntil_loop_statement();
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
			setState(365);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				System.out.println("in event_loop_statement");
				setState(351); match(EventLoopKeyword);
				setState(352); match(OpenParenthesis);
				setState(353); condition();
				setState(354); match(CloseParenthesis);
				setState(355); match(OpenBrace);
				setState(356); codeblock();
				setState(357); match(CloseBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(359); match(EventLoopKeyword);
				setState(360); match(OpenParenthesis);
				setState(361); condition();
				setState(362); match(CloseParenthesis);
				setState(363); all_possible_single_statements();
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
			setState(392);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				System.out.println("in count_loop_statement");
				setState(368); match(CountLoopKeyword);
				setState(369); match(OpenParenthesis);
				setState(370); variable_declaration();
				setState(371); match(Terminator);
				setState(372); condition();
				setState(373); match(Terminator);
				setState(374); afterthought_statement();
				setState(375); match(CloseParenthesis);
				setState(376); match(OpenBrace);
				setState(377); codeblock();
				setState(378); match(CloseBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(380); match(CountLoopKeyword);
				setState(381); match(OpenParenthesis);
				setState(382); assignment_statement();
				setState(383); match(Terminator);
				setState(384); condition();
				setState(385); match(Terminator);
				setState(386); afterthought_statement();
				setState(387); match(CloseParenthesis);
				setState(388); match(OpenBrace);
				setState(389); codeblock();
				setState(390); match(CloseBrace);
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
			setState(395); match(RepeatUntilLoopKeyword);
			setState(396); match(OpenBrace);
			setState(397); codeblock();
			setState(398); match(CloseBrace);
			setState(399); match(EventLoopKeyword);
			setState(400); match(OpenParenthesis);
			setState(401); condition();
			setState(402); match(CloseParenthesis);
			setState(403); match(Terminator);
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
		public TerminalNode VarIdentifier(int i) {
			return getToken(DogeScriptParser.VarIdentifier, i);
		}
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public TerminalNode BoolLit() { return getToken(DogeScriptParser.BoolLit, 0); }
		public TerminalNode OpenParenthesis() { return getToken(DogeScriptParser.OpenParenthesis, 0); }
		public TerminalNode CloseParenthesis() { return getToken(DogeScriptParser.CloseParenthesis, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> VarIdentifier() { return getTokens(DogeScriptParser.VarIdentifier); }
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
			setState(441);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				System.out.println("in condition");
				setState(406); match(VarIdentifier);
				setState(407); comparison();
				setState(408); match(VarIdentifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(410); match(VarIdentifier);
				setState(411); comparison();
				setState(412); expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(414); expression();
				setState(415); comparison();
				setState(416); match(VarIdentifier);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(418); match(OpenParenthesis);
				setState(419); condition();
				setState(420); match(CloseParenthesis);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(422); match(VarIdentifier);
				setState(423); comparison();
				setState(424); match(VarIdentifier);
				setState(425); logical_operator();
				setState(426); condition();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(428); match(VarIdentifier);
				setState(429); comparison();
				setState(430); expression();
				setState(431); logical_operator();
				setState(432); condition();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(434); expression();
				setState(435); comparison();
				setState(436); match(VarIdentifier);
				setState(437); logical_operator();
				setState(438); condition();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(440); match(BoolLit);
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
		enterRule(_localctx, 60, RULE_comparison);
		try {
			setState(450);
			switch (_input.LA(1)) {
			case EquaOp:
				enterOuterAlt(_localctx, 1);
				{
				System.out.println("in comparison");
				setState(444); match(EquaOp);
				}
				break;
			case GreaterThanOp:
				enterOuterAlt(_localctx, 2);
				{
				setState(445); match(GreaterThanOp);
				}
				break;
			case LessThanOp:
				enterOuterAlt(_localctx, 3);
				{
				setState(446); match(LessThanOp);
				}
				break;
			case GreaterThanEqualTo:
				enterOuterAlt(_localctx, 4);
				{
				setState(447); match(GreaterThanEqualTo);
				}
				break;
			case LessThanEqualTo:
				enterOuterAlt(_localctx, 5);
				{
				setState(448); match(LessThanEqualTo);
				}
				break;
			case NotEqualToOp:
				enterOuterAlt(_localctx, 6);
				{
				setState(449); match(NotEqualToOp);
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
		enterRule(_localctx, 62, RULE_logical_operator);
		try {
			setState(455);
			switch (_input.LA(1)) {
			case AndOp:
				enterOuterAlt(_localctx, 1);
				{
				System.out.println("in logical_operator");
				setState(453); match(AndOp);
				}
				break;
			case OrOp:
				enterOuterAlt(_localctx, 2);
				{
				setState(454); match(OrOp);
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
		enterRule(_localctx, 64, RULE_function_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			System.out.println("in function_call");
			setState(458); match(VarIdentifier);
			setState(459); match(OpenParenthesis);
			setState(460); function_call_parameters();
			setState(461); match(CloseParenthesis);
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
		enterRule(_localctx, 66, RULE_function_call_parameters);
		try {
			setState(469);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				System.out.println("in function_call_parameters");
				setState(464); returns_value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(465); returns_value();
				setState(466); match(Comma);
				setState(467); function_call_parameters();
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\61\u01da\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\5\5]\n\5\3\6\3\6\3\6\3\6\3\6\5\6"+
		"d\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7r\n\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0080\n\b\3\t\3\t\3\t\5\t"+
		"\u0085\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u009b\n\13\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\5\f\u00a8\n\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00b0\n"+
		"\r\3\16\3\16\3\16\3\16\3\16\5\16\u00b7\n\16\3\17\3\17\3\17\3\17\3\17\5"+
		"\17\u00be\n\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00c6\n\20\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\7\22\u00d0\n\22\f\22\16\22\u00d3\13\22"+
		"\3\22\5\22\u00d6\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u00df\n"+
		"\23\f\23\16\23\u00e2\13\23\3\23\5\23\u00e5\n\23\3\24\3\24\3\24\5\24\u00ea"+
		"\n\24\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00f2\n\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00ff\n\26\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u010d\n\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0126\n\30\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0141\n\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\5\32\u0159\n\32\3\33\3\33\3\33\3\33\5\33\u015f\n\33\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\5\34\u0170\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\5\35\u018b\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u01bc\n\37\3 \3 \3"+
		" \3 \3 \3 \3 \5 \u01c5\n \3!\3!\3!\5!\u01ca\n!\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3#\3#\3#\3#\3#\3#\5#\u01d8\n#\3#\2\2$\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<>@BD\2\2\u01f9\2F\3\2\2\2\4I\3\2\2\2\6M"+
		"\3\2\2\2\b\\\3\2\2\2\nc\3\2\2\2\fq\3\2\2\2\16\177\3\2\2\2\20\u0084\3\2"+
		"\2\2\22\u0086\3\2\2\2\24\u009a\3\2\2\2\26\u00a7\3\2\2\2\30\u00af\3\2\2"+
		"\2\32\u00b6\3\2\2\2\34\u00bd\3\2\2\2\36\u00c5\3\2\2\2 \u00c7\3\2\2\2\""+
		"\u00d5\3\2\2\2$\u00e4\3\2\2\2&\u00e9\3\2\2\2(\u00f1\3\2\2\2*\u00fe\3\2"+
		"\2\2,\u010c\3\2\2\2.\u0125\3\2\2\2\60\u0140\3\2\2\2\62\u0158\3\2\2\2\64"+
		"\u015e\3\2\2\2\66\u016f\3\2\2\28\u018a\3\2\2\2:\u018c\3\2\2\2<\u01bb\3"+
		"\2\2\2>\u01c4\3\2\2\2@\u01c9\3\2\2\2B\u01cb\3\2\2\2D\u01d7\3\2\2\2FG\5"+
		"\4\3\2GH\7\61\2\2H\3\3\2\2\2IJ\5\b\5\2JK\5\6\4\2KL\5\b\5\2L\5\3\2\2\2"+
		"MN\b\4\1\2NO\7\n\2\2OP\7\23\2\2PQ\7\24\2\2QR\7)\2\2RS\7*\2\2ST\7\'\2\2"+
		"TU\5\n\6\2UV\7(\2\2V\7\3\2\2\2WX\b\5\1\2XY\5\22\n\2YZ\5\b\5\2Z]\3\2\2"+
		"\2[]\3\2\2\2\\W\3\2\2\2\\[\3\2\2\2]\t\3\2\2\2^_\b\6\1\2_`\5\f\7\2`a\5"+
		"\n\6\2ad\3\2\2\2bd\5\f\7\2c^\3\2\2\2cb\3\2\2\2d\13\3\2\2\2ef\b\7\1\2f"+
		"g\5\26\f\2gh\7\b\2\2hr\3\2\2\2ij\5*\26\2jk\7\b\2\2kr\3\2\2\2lm\5B\"\2"+
		"mn\7\b\2\2nr\3\2\2\2or\5,\27\2pr\5\64\33\2qe\3\2\2\2qi\3\2\2\2ql\3\2\2"+
		"\2qo\3\2\2\2qp\3\2\2\2r\r\3\2\2\2st\b\b\1\2tu\5\26\f\2uv\7\b\2\2v\u0080"+
		"\3\2\2\2wx\5*\26\2xy\7\b\2\2y\u0080\3\2\2\2z{\5B\"\2{|\7\b\2\2|\u0080"+
		"\3\2\2\2}\u0080\5,\27\2~\u0080\5\64\33\2\177s\3\2\2\2\177w\3\2\2\2\177"+
		"z\3\2\2\2\177}\3\2\2\2\177~\3\2\2\2\u0080\17\3\2\2\2\u0081\u0082\b\t\1"+
		"\2\u0082\u0085\5*\26\2\u0083\u0085\5B\"\2\u0084\u0081\3\2\2\2\u0084\u0083"+
		"\3\2\2\2\u0085\21\3\2\2\2\u0086\u0087\b\n\1\2\u0087\u0088\7\n\2\2\u0088"+
		"\u0089\5\32\16\2\u0089\u008a\7\60\2\2\u008a\u008b\7)\2\2\u008b\u008c\5"+
		"\24\13\2\u008c\u008d\7*\2\2\u008d\u008e\7\'\2\2\u008e\u008f\5\n\6\2\u008f"+
		"\u0090\7(\2\2\u0090\23\3\2\2\2\u0091\u0092\b\13\1\2\u0092\u0093\5\32\16"+
		"\2\u0093\u0094\7\60\2\2\u0094\u009b\3\2\2\2\u0095\u0096\5\32\16\2\u0096"+
		"\u0097\7\60\2\2\u0097\u0098\7\25\2\2\u0098\u0099\5\24\13\2\u0099\u009b"+
		"\3\2\2\2\u009a\u0091\3\2\2\2\u009a\u0095\3\2\2\2\u009b\25\3\2\2\2\u009c"+
		"\u009d\b\f\1\2\u009d\u009e\7\t\2\2\u009e\u009f\5\32\16\2\u009f\u00a0\5"+
		"\34\17\2\u00a0\u00a8\3\2\2\2\u00a1\u00a2\7\t\2\2\u00a2\u00a3\5\32\16\2"+
		"\u00a3\u00a4\7\60\2\2\u00a4\u00a5\7\f\2\2\u00a5\u00a6\5\36\20\2\u00a6"+
		"\u00a8\3\2\2\2\u00a7\u009c\3\2\2\2\u00a7\u00a1\3\2\2\2\u00a8\27\3\2\2"+
		"\2\u00a9\u00aa\b\r\1\2\u00aa\u00b0\7+\2\2\u00ab\u00b0\7,\2\2\u00ac\u00b0"+
		"\7-\2\2\u00ad\u00b0\7.\2\2\u00ae\u00b0\7\27\2\2\u00af\u00a9\3\2\2\2\u00af"+
		"\u00ab\3\2\2\2\u00af\u00ac\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00ae\3\2"+
		"\2\2\u00b0\31\3\2\2\2\u00b1\u00b2\b\16\1\2\u00b2\u00b7\7\4\2\2\u00b3\u00b7"+
		"\7\5\2\2\u00b4\u00b7\7\6\2\2\u00b5\u00b7\7\7\2\2\u00b6\u00b1\3\2\2\2\u00b6"+
		"\u00b3\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b5\3\2\2\2\u00b7\33\3\2\2"+
		"\2\u00b8\u00b9\b\17\1\2\u00b9\u00ba\7\60\2\2\u00ba\u00bb\7\25\2\2\u00bb"+
		"\u00be\5\34\17\2\u00bc\u00be\7\60\2\2\u00bd\u00b8\3\2\2\2\u00bd\u00bc"+
		"\3\2\2\2\u00be\35\3\2\2\2\u00bf\u00c0\b\20\1\2\u00c0\u00c6\5\30\r\2\u00c1"+
		"\u00c6\5 \21\2\u00c2\u00c6\5B\"\2\u00c3\u00c6\7\60\2\2\u00c4\u00c6\7\26"+
		"\2\2\u00c5\u00bf\3\2\2\2\u00c5\u00c1\3\2\2\2\u00c5\u00c2\3\2\2\2\u00c5"+
		"\u00c3\3\2\2\2\u00c5\u00c4\3\2\2\2\u00c6\37\3\2\2\2\u00c7\u00c8\5\"\22"+
		"\2\u00c8\u00c9\b\21\1\2\u00c9!\3\2\2\2\u00ca\u00d1\5$\23\2\u00cb\u00cc"+
		"\7\30\2\2\u00cc\u00d0\5$\23\2\u00cd\u00ce\7\31\2\2\u00ce\u00d0\5$\23\2"+
		"\u00cf\u00cb\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf"+
		"\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d6\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4"+
		"\u00d6\5$\23\2\u00d5\u00ca\3\2\2\2\u00d5\u00d4\3\2\2\2\u00d6#\3\2\2\2"+
		"\u00d7\u00e0\5&\24\2\u00d8\u00d9\7\32\2\2\u00d9\u00df\5&\24\2\u00da\u00db"+
		"\7\33\2\2\u00db\u00df\5&\24\2\u00dc\u00dd\7\34\2\2\u00dd\u00df\5&\24\2"+
		"\u00de\u00d8\3\2\2\2\u00de\u00da\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00e2"+
		"\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e5\3\2\2\2\u00e2"+
		"\u00e0\3\2\2\2\u00e3\u00e5\5&\24\2\u00e4\u00d7\3\2\2\2\u00e4\u00e3\3\2"+
		"\2\2\u00e5%\3\2\2\2\u00e6\u00e7\7\31\2\2\u00e7\u00ea\5(\25\2\u00e8\u00ea"+
		"\5(\25\2\u00e9\u00e6\3\2\2\2\u00e9\u00e8\3\2\2\2\u00ea\'\3\2\2\2\u00eb"+
		"\u00f2\7+\2\2\u00ec\u00ed\7)\2\2\u00ed\u00ee\5 \21\2\u00ee\u00ef\7*\2"+
		"\2\u00ef\u00f2\3\2\2\2\u00f0\u00f2\7\60\2\2\u00f1\u00eb\3\2\2\2\u00f1"+
		"\u00ec\3\2\2\2\u00f1\u00f0\3\2\2\2\u00f2)\3\2\2\2\u00f3\u00f4\b\26\1\2"+
		"\u00f4\u00f5\7\60\2\2\u00f5\u00f6\7\f\2\2\u00f6\u00ff\7\60\2\2\u00f7\u00f8"+
		"\7\60\2\2\u00f8\u00f9\7\f\2\2\u00f9\u00ff\5\36\20\2\u00fa\u00fb\7\60\2"+
		"\2\u00fb\u00ff\7%\2\2\u00fc\u00fd\7\60\2\2\u00fd\u00ff\7&\2\2\u00fe\u00f3"+
		"\3\2\2\2\u00fe\u00f7\3\2\2\2\u00fe\u00fa\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff"+
		"+\3\2\2\2\u0100\u0101\b\27\1\2\u0101\u010d\5.\30\2\u0102\u0103\5.\30\2"+
		"\u0103\u0104\5\60\31\2\u0104\u010d\3\2\2\2\u0105\u0106\5.\30\2\u0106\u0107"+
		"\5\62\32\2\u0107\u010d\3\2\2\2\u0108\u0109\5.\30\2\u0109\u010a\5\62\32"+
		"\2\u010a\u010b\5\60\31\2\u010b\u010d\3\2\2\2\u010c\u0100\3\2\2\2\u010c"+
		"\u0102\3\2\2\2\u010c\u0105\3\2\2\2\u010c\u0108\3\2\2\2\u010d-\3\2\2\2"+
		"\u010e\u010f\b\30\1\2\u010f\u0110\7\r\2\2\u0110\u0111\7)\2\2\u0111\u0112"+
		"\5<\37\2\u0112\u0113\7*\2\2\u0113\u0114\5\16\b\2\u0114\u0126\3\2\2\2\u0115"+
		"\u0116\7\r\2\2\u0116\u0117\7)\2\2\u0117\u0118\5<\37\2\u0118\u0119\7*\2"+
		"\2\u0119\u011a\7\'\2\2\u011a\u011b\5\16\b\2\u011b\u011c\7(\2\2\u011c\u0126"+
		"\3\2\2\2\u011d\u011e\7\r\2\2\u011e\u011f\7)\2\2\u011f\u0120\5<\37\2\u0120"+
		"\u0121\7*\2\2\u0121\u0122\7\'\2\2\u0122\u0123\5\n\6\2\u0123\u0124\7(\2"+
		"\2\u0124\u0126\3\2\2\2\u0125\u010e\3\2\2\2\u0125\u0115\3\2\2\2\u0125\u011d"+
		"\3\2\2\2\u0126/\3\2\2\2\u0127\u0128\b\31\1\2\u0128\u0129\7\16\2\2\u0129"+
		"\u012a\7)\2\2\u012a\u012b\5<\37\2\u012b\u012c\7*\2\2\u012c\u012d\5\16"+
		"\b\2\u012d\u0141\3\2\2\2\u012e\u012f\7\16\2\2\u012f\u0130\7)\2\2\u0130"+
		"\u0131\5<\37\2\u0131\u0132\7*\2\2\u0132\u0133\7\'\2\2\u0133\u0134\5\16"+
		"\b\2\u0134\u0135\7(\2\2\u0135\u0141\3\2\2\2\u0136\u0137\7\16\2\2\u0137"+
		"\u0138\7)\2\2\u0138\u0139\5<\37\2\u0139\u013a\7*\2\2\u013a\u013b\7\'\2"+
		"\2\u013b\u013c\5\n\6\2\u013c\u013d\7(\2\2\u013d\u0141\3\2\2\2\u013e\u013f"+
		"\7\16\2\2\u013f\u0141\5\16\b\2\u0140\u0127\3\2\2\2\u0140\u012e\3\2\2\2"+
		"\u0140\u0136\3\2\2\2\u0140\u013e\3\2\2\2\u0141\61\3\2\2\2\u0142\u0143"+
		"\b\32\1\2\u0143\u0144\7\17\2\2\u0144\u0145\7)\2\2\u0145\u0146\5<\37\2"+
		"\u0146\u0147\7*\2\2\u0147\u0148\5\16\b\2\u0148\u0159\3\2\2\2\u0149\u014a"+
		"\7\17\2\2\u014a\u014b\7)\2\2\u014b\u014c\5<\37\2\u014c\u014d\7*\2\2\u014d"+
		"\u014e\5\16\b\2\u014e\u014f\7(\2\2\u014f\u0159\3\2\2\2\u0150\u0151\7\17"+
		"\2\2\u0151\u0152\7)\2\2\u0152\u0153\5<\37\2\u0153\u0154\7*\2\2\u0154\u0155"+
		"\7\'\2\2\u0155\u0156\5\n\6\2\u0156\u0157\7(\2\2\u0157\u0159\3\2\2\2\u0158"+
		"\u0142\3\2\2\2\u0158\u0149\3\2\2\2\u0158\u0150\3\2\2\2\u0159\63\3\2\2"+
		"\2\u015a\u015b\b\33\1\2\u015b\u015f\5\66\34\2\u015c\u015f\58\35\2\u015d"+
		"\u015f\5:\36\2\u015e\u015a\3\2\2\2\u015e\u015c\3\2\2\2\u015e\u015d\3\2"+
		"\2\2\u015f\65\3\2\2\2\u0160\u0161\b\34\1\2\u0161\u0162\7\20\2\2\u0162"+
		"\u0163\7)\2\2\u0163\u0164\5<\37\2\u0164\u0165\7*\2\2\u0165\u0166\7\'\2"+
		"\2\u0166\u0167\5\n\6\2\u0167\u0168\7(\2\2\u0168\u0170\3\2\2\2\u0169\u016a"+
		"\7\20\2\2\u016a\u016b\7)\2\2\u016b\u016c\5<\37\2\u016c\u016d\7*\2\2\u016d"+
		"\u016e\5\16\b\2\u016e\u0170\3\2\2\2\u016f\u0160\3\2\2\2\u016f\u0169\3"+
		"\2\2\2\u0170\67\3\2\2\2\u0171\u0172\b\35\1\2\u0172\u0173\7\21\2\2\u0173"+
		"\u0174\7)\2\2\u0174\u0175\5\26\f\2\u0175\u0176\7\b\2\2\u0176\u0177\5<"+
		"\37\2\u0177\u0178\7\b\2\2\u0178\u0179\5\20\t\2\u0179\u017a\7*\2\2\u017a"+
		"\u017b\7\'\2\2\u017b\u017c\5\n\6\2\u017c\u017d\7(\2\2\u017d\u018b\3\2"+
		"\2\2\u017e\u017f\7\21\2\2\u017f\u0180\7)\2\2\u0180\u0181\5*\26\2\u0181"+
		"\u0182\7\b\2\2\u0182\u0183\5<\37\2\u0183\u0184\7\b\2\2\u0184\u0185\5\20"+
		"\t\2\u0185\u0186\7*\2\2\u0186\u0187\7\'\2\2\u0187\u0188\5\n\6\2\u0188"+
		"\u0189\7(\2\2\u0189\u018b\3\2\2\2\u018a\u0171\3\2\2\2\u018a\u017e\3\2"+
		"\2\2\u018b9\3\2\2\2\u018c\u018d\b\36\1\2\u018d\u018e\7\22\2\2\u018e\u018f"+
		"\7\'\2\2\u018f\u0190\5\n\6\2\u0190\u0191\7(\2\2\u0191\u0192\7\20\2\2\u0192"+
		"\u0193\7)\2\2\u0193\u0194\5<\37\2\u0194\u0195\7*\2\2\u0195\u0196\7\b\2"+
		"\2\u0196;\3\2\2\2\u0197\u0198\b\37\1\2\u0198\u0199\7\60\2\2\u0199\u019a"+
		"\5> \2\u019a\u019b\7\60\2\2\u019b\u01bc\3\2\2\2\u019c\u019d\7\60\2\2\u019d"+
		"\u019e\5> \2\u019e\u019f\5 \21\2\u019f\u01bc\3\2\2\2\u01a0\u01a1\5 \21"+
		"\2\u01a1\u01a2\5> \2\u01a2\u01a3\7\60\2\2\u01a3\u01bc\3\2\2\2\u01a4\u01a5"+
		"\7)\2\2\u01a5\u01a6\5<\37\2\u01a6\u01a7\7*\2\2\u01a7\u01bc\3\2\2\2\u01a8"+
		"\u01a9\7\60\2\2\u01a9\u01aa\5> \2\u01aa\u01ab\7\60\2\2\u01ab\u01ac\5@"+
		"!\2\u01ac\u01ad\5<\37\2\u01ad\u01bc\3\2\2\2\u01ae\u01af\7\60\2\2\u01af"+
		"\u01b0\5> \2\u01b0\u01b1\5 \21\2\u01b1\u01b2\5@!\2\u01b2\u01b3\5<\37\2"+
		"\u01b3\u01bc\3\2\2\2\u01b4\u01b5\5 \21\2\u01b5\u01b6\5> \2\u01b6\u01b7"+
		"\7\60\2\2\u01b7\u01b8\5@!\2\u01b8\u01b9\5<\37\2\u01b9\u01bc\3\2\2\2\u01ba"+
		"\u01bc\7\27\2\2\u01bb\u0197\3\2\2\2\u01bb\u019c\3\2\2\2\u01bb\u01a0\3"+
		"\2\2\2\u01bb\u01a4\3\2\2\2\u01bb\u01a8\3\2\2\2\u01bb\u01ae\3\2\2\2\u01bb"+
		"\u01b4\3\2\2\2\u01bb\u01ba\3\2\2\2\u01bc=\3\2\2\2\u01bd\u01be\b \1\2\u01be"+
		"\u01c5\7\35\2\2\u01bf\u01c5\7\36\2\2\u01c0\u01c5\7\37\2\2\u01c1\u01c5"+
		"\7 \2\2\u01c2\u01c5\7!\2\2\u01c3\u01c5\7\"\2\2\u01c4\u01bd\3\2\2\2\u01c4"+
		"\u01bf\3\2\2\2\u01c4\u01c0\3\2\2\2\u01c4\u01c1\3\2\2\2\u01c4\u01c2\3\2"+
		"\2\2\u01c4\u01c3\3\2\2\2\u01c5?\3\2\2\2\u01c6\u01c7\b!\1\2\u01c7\u01ca"+
		"\7#\2\2\u01c8\u01ca\7$\2\2\u01c9\u01c6\3\2\2\2\u01c9\u01c8\3\2\2\2\u01ca"+
		"A\3\2\2\2\u01cb\u01cc\b\"\1\2\u01cc\u01cd\7\60\2\2\u01cd\u01ce\7)\2\2"+
		"\u01ce\u01cf\5D#\2\u01cf\u01d0\7*\2\2\u01d0C\3\2\2\2\u01d1\u01d2\b#\1"+
		"\2\u01d2\u01d8\5\36\20\2\u01d3\u01d4\5\36\20\2\u01d4\u01d5\7\25\2\2\u01d5"+
		"\u01d6\5D#\2\u01d6\u01d8\3\2\2\2\u01d7\u01d1\3\2\2\2\u01d7\u01d3\3\2\2"+
		"\2\u01d8E\3\2\2\2!\\cq\177\u0084\u009a\u00a7\u00af\u00b6\u00bd\u00c5\u00cf"+
		"\u00d1\u00d5\u00de\u00e0\u00e4\u00e9\u00f1\u00fe\u010c\u0125\u0140\u0158"+
		"\u015e\u016f\u018a\u01bb\u01c4\u01c9\u01d7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}