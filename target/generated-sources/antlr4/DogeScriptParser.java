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
		"<INVALID>", "WS", "'int'", "'char'", "'boolean'", "'string'", "'wow'", 
		"'such'", "'much'", "'very'", "'as'", "'rily'", "'but'", "'but rily'", 
		"EventLoopKeyword", "CountLoopKeyword", "RepeatUntilLoopKeyword", "'void'", 
		"'main'", "','", "'null'", "BoolLit", "'+'", "'-'", "'*'", "'/'", "'%'", 
		"'is'", "'>'", "'<'", "'>='", "'<='", "'!='", "'and'", "'or'", "'++'", 
		"'--'", "'{'", "'}'", "'('", "')'", "IntLit", "FloatLit", "StringLit", 
		"CharLit", "Array", "VarIdentifier", "'$'"
	};
	public static final int
		RULE_start = 0, RULE_main_function = 1, RULE_codeblock = 2, RULE_all_possible = 3, 
		RULE_single_all_possible = 4, RULE_afterthought_statement = 5, RULE_function_declaration = 6, 
		RULE_function_declaration_paramaters = 7, RULE_variable_declaration = 8, 
		RULE_literal = 9, RULE_datatype = 10, RULE_variable_instance = 11, RULE_returns_value = 12, 
		RULE_expression = 13, RULE_low_prior = 14, RULE_high_prior = 15, RULE_signint = 16, 
		RULE_top_prior = 17, RULE_assignment_statement = 18, RULE_conditional_statement = 19, 
		RULE_start_condition = 20, RULE_end_condition = 21, RULE_continue_condition = 22, 
		RULE_condition = 23, RULE_comparison = 24, RULE_logical_operator = 25, 
		RULE_loop_statement = 26, RULE_event_loop_statement = 27, RULE_count_loop_statement = 28, 
		RULE_repeatuntil_loop_statement = 29, RULE_function_call = 30, RULE_function_call_parameters = 31;
	public static final String[] ruleNames = {
		"start", "main_function", "codeblock", "all_possible", "single_all_possible", 
		"afterthought_statement", "function_declaration", "function_declaration_paramaters", 
		"variable_declaration", "literal", "datatype", "variable_instance", "returns_value", 
		"expression", "low_prior", "high_prior", "signint", "top_prior", "assignment_statement", 
		"conditional_statement", "start_condition", "end_condition", "continue_condition", 
		"condition", "comparison", "logical_operator", "loop_statement", "event_loop_statement", 
		"count_loop_statement", "repeatuntil_loop_statement", "function_call", 
		"function_call_parameters"
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
		public Main_functionContext main_function() {
			return getRuleContext(Main_functionContext.class,0);
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
			setState(64); main_function();
			setState(65); match(EndOfFile);
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
		enterRule(_localctx, 2, RULE_main_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67); match(FuncStarter);
			setState(68); match(VoidKeyword);
			setState(69); match(MainKeyword);
			setState(70); match(OpenParenthesis);
			setState(71); match(CloseParenthesis);
			setState(72); match(OpenBrace);
			setState(73); codeblock();
			setState(74); match(CloseBrace);
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
		public All_possibleContext all_possible() {
			return getRuleContext(All_possibleContext.class,0);
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
		enterRule(_localctx, 4, RULE_codeblock);
		try {
			setState(80);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(76); all_possible();
				setState(77); codeblock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(79); all_possible();
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

	public static class All_possibleContext extends ParserRuleContext {
		public Conditional_statementContext conditional_statement() {
			return getRuleContext(Conditional_statementContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public Assignment_statementContext assignment_statement() {
			return getRuleContext(Assignment_statementContext.class,0);
		}
		public All_possibleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_all_possible; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).enterAll_possible(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).exitAll_possible(this);
		}
	}

	public final All_possibleContext all_possible() throws RecognitionException {
		All_possibleContext _localctx = new All_possibleContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_all_possible);
		try {
			setState(86);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(82); variable_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(83); assignment_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(84); conditional_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(85); function_call();
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

	public static class Single_all_possibleContext extends ParserRuleContext {
		public Conditional_statementContext conditional_statement() {
			return getRuleContext(Conditional_statementContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public Assignment_statementContext assignment_statement() {
			return getRuleContext(Assignment_statementContext.class,0);
		}
		public Loop_statementContext loop_statement() {
			return getRuleContext(Loop_statementContext.class,0);
		}
		public Single_all_possibleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_all_possible; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).enterSingle_all_possible(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).exitSingle_all_possible(this);
		}
	}

	public final Single_all_possibleContext single_all_possible() throws RecognitionException {
		Single_all_possibleContext _localctx = new Single_all_possibleContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_single_all_possible);
		try {
			setState(93);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(88); variable_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(89); assignment_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(90); conditional_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(91); loop_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(92); function_call();
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
		enterRule(_localctx, 10, RULE_afterthought_statement);
		try {
			setState(97);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(95); assignment_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(96); function_call();
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
		enterRule(_localctx, 12, RULE_function_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99); match(FuncStarter);
			setState(100); datatype();
			setState(101); match(VarIdentifier);
			setState(102); match(OpenParenthesis);
			setState(103); function_declaration_paramaters();
			setState(104); match(CloseParenthesis);
			setState(105); match(OpenBrace);
			setState(106); codeblock();
			setState(107); match(CloseBrace);
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
		enterRule(_localctx, 14, RULE_function_declaration_paramaters);
		try {
			setState(117);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(109); datatype();
				setState(110); match(VarIdentifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(112); datatype();
				setState(113); match(VarIdentifier);
				setState(114); match(Comma);
				setState(115); function_declaration_paramaters();
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
		public TerminalNode Terminator() { return getToken(DogeScriptParser.Terminator, 0); }
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
		enterRule(_localctx, 16, RULE_variable_declaration);
		try {
			setState(131);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(119); match(VarDecStarter);
				setState(120); datatype();
				setState(121); variable_instance();
				setState(122); match(Terminator);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(124); match(VarDecStarter);
				setState(125); datatype();
				setState(126); match(VarIdentifier);
				setState(127); match(AssOp);
				setState(128); returns_value();
				setState(129); match(Terminator);
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
		enterRule(_localctx, 18, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BoolLit) | (1L << IntLit) | (1L << FloatLit) | (1L << StringLit) | (1L << CharLit))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		enterRule(_localctx, 20, RULE_datatype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntDataType) | (1L << CharDataType) | (1L << BoolDataType) | (1L << StringDataType))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		enterRule(_localctx, 22, RULE_variable_instance);
		try {
			setState(141);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(137); match(VarIdentifier);
				setState(138); match(Comma);
				setState(139); variable_instance();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(140); match(VarIdentifier);
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
		enterRule(_localctx, 24, RULE_returns_value);
		try {
			setState(148);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(143); literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(144); expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(145); function_call();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(146); match(VarIdentifier);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(147); match(NullKeyword);
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
		enterRule(_localctx, 26, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150); low_prior();
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
		enterRule(_localctx, 28, RULE_low_prior);
		int _la;
		try {
			setState(164);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(153); high_prior();
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AddOp || _la==SubOp) {
					{
					setState(158);
					switch (_input.LA(1)) {
					case AddOp:
						{
						setState(154); match(AddOp);
						setState(155); high_prior();
						}
						break;
					case SubOp:
						{
						setState(156); match(SubOp);
						setState(157); high_prior();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(162);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(163); high_prior();
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
		enterRule(_localctx, 30, RULE_high_prior);
		int _la;
		try {
			setState(179);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(166); signint();
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MulOp) | (1L << DivOp) | (1L << ModOp))) != 0)) {
					{
					setState(173);
					switch (_input.LA(1)) {
					case MulOp:
						{
						setState(167); match(MulOp);
						setState(168); signint();
						}
						break;
					case DivOp:
						{
						setState(169); match(DivOp);
						setState(170); signint();
						}
						break;
					case ModOp:
						{
						setState(171); match(ModOp);
						setState(172); signint();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(177);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(178); signint();
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
		enterRule(_localctx, 32, RULE_signint);
		try {
			setState(184);
			switch (_input.LA(1)) {
			case SubOp:
				enterOuterAlt(_localctx, 1);
				{
				setState(181); match(SubOp);
				setState(182); top_prior();
				}
				break;
			case OpenParenthesis:
			case IntLit:
				enterOuterAlt(_localctx, 2);
				{
				setState(183); top_prior();
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
		enterRule(_localctx, 34, RULE_top_prior);
		try {
			setState(191);
			switch (_input.LA(1)) {
			case IntLit:
				enterOuterAlt(_localctx, 1);
				{
				setState(186); match(IntLit);
				}
				break;
			case OpenParenthesis:
				enterOuterAlt(_localctx, 2);
				{
				setState(187); match(OpenParenthesis);
				setState(188); expression();
				setState(189); match(CloseParenthesis);
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
		public Returns_valueContext returns_value() {
			return getRuleContext(Returns_valueContext.class,0);
		}
		public TerminalNode Terminator() { return getToken(DogeScriptParser.Terminator, 0); }
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
		enterRule(_localctx, 36, RULE_assignment_statement);
		try {
			setState(202);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(193); match(VarIdentifier);
				setState(194); match(AssOp);
				setState(195); match(VarIdentifier);
				setState(196); match(Terminator);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(197); match(VarIdentifier);
				setState(198); match(AssOp);
				setState(199); returns_value();
				setState(200); match(Terminator);
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
		enterRule(_localctx, 38, RULE_conditional_statement);
		try {
			setState(215);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(204); start_condition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(205); start_condition();
				setState(206); end_condition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(208); start_condition();
				setState(209); continue_condition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(211); start_condition();
				setState(212); continue_condition();
				setState(213); end_condition();
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
		public TerminalNode CloseBrace() { return getToken(DogeScriptParser.CloseBrace, 0); }
		public TerminalNode OpenParenthesis() { return getToken(DogeScriptParser.OpenParenthesis, 0); }
		public TerminalNode CloseParenthesis() { return getToken(DogeScriptParser.CloseParenthesis, 0); }
		public TerminalNode OpenBrace() { return getToken(DogeScriptParser.OpenBrace, 0); }
		public TerminalNode IfKeyword() { return getToken(DogeScriptParser.IfKeyword, 0); }
		public Single_all_possibleContext single_all_possible() {
			return getRuleContext(Single_all_possibleContext.class,0);
		}
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
		enterRule(_localctx, 40, RULE_start_condition);
		try {
			setState(239);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(217); match(IfKeyword);
				setState(218); match(OpenParenthesis);
				setState(219); condition();
				setState(220); match(CloseParenthesis);
				setState(221); single_all_possible();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(223); match(IfKeyword);
				setState(224); match(OpenParenthesis);
				setState(225); condition();
				setState(226); match(CloseParenthesis);
				setState(227); match(OpenBrace);
				setState(228); single_all_possible();
				setState(229); match(CloseBrace);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(231); match(IfKeyword);
				setState(232); match(OpenParenthesis);
				setState(233); condition();
				setState(234); match(CloseParenthesis);
				setState(235); match(OpenBrace);
				setState(236); codeblock();
				setState(237); match(CloseBrace);
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
		public TerminalNode CloseBrace() { return getToken(DogeScriptParser.CloseBrace, 0); }
		public TerminalNode OpenParenthesis() { return getToken(DogeScriptParser.OpenParenthesis, 0); }
		public TerminalNode CloseParenthesis() { return getToken(DogeScriptParser.CloseParenthesis, 0); }
		public TerminalNode OpenBrace() { return getToken(DogeScriptParser.OpenBrace, 0); }
		public Single_all_possibleContext single_all_possible() {
			return getRuleContext(Single_all_possibleContext.class,0);
		}
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
		enterRule(_localctx, 42, RULE_end_condition);
		try {
			setState(265);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(241); match(ElseKeyword);
				setState(242); match(OpenParenthesis);
				setState(243); condition();
				setState(244); match(CloseParenthesis);
				setState(245); single_all_possible();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(247); match(ElseKeyword);
				setState(248); match(OpenParenthesis);
				setState(249); condition();
				setState(250); match(CloseParenthesis);
				setState(251); match(OpenBrace);
				setState(252); single_all_possible();
				setState(253); match(CloseBrace);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(255); match(ElseKeyword);
				setState(256); match(OpenParenthesis);
				setState(257); condition();
				setState(258); match(CloseParenthesis);
				setState(259); match(OpenBrace);
				setState(260); codeblock();
				setState(261); match(CloseBrace);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(263); match(ElseKeyword);
				setState(264); single_all_possible();
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
		public TerminalNode CloseBrace() { return getToken(DogeScriptParser.CloseBrace, 0); }
		public TerminalNode OpenParenthesis() { return getToken(DogeScriptParser.OpenParenthesis, 0); }
		public TerminalNode CloseParenthesis() { return getToken(DogeScriptParser.CloseParenthesis, 0); }
		public TerminalNode OpenBrace() { return getToken(DogeScriptParser.OpenBrace, 0); }
		public TerminalNode ElseIfKeyword() { return getToken(DogeScriptParser.ElseIfKeyword, 0); }
		public Single_all_possibleContext single_all_possible() {
			return getRuleContext(Single_all_possibleContext.class,0);
		}
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
		enterRule(_localctx, 44, RULE_continue_condition);
		try {
			setState(288);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(267); match(ElseIfKeyword);
				setState(268); match(OpenParenthesis);
				setState(269); condition();
				setState(270); match(CloseParenthesis);
				setState(271); single_all_possible();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(273); match(ElseIfKeyword);
				setState(274); match(OpenParenthesis);
				setState(275); condition();
				setState(276); match(CloseParenthesis);
				setState(277); single_all_possible();
				setState(278); match(CloseBrace);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(280); match(ElseIfKeyword);
				setState(281); match(OpenParenthesis);
				setState(282); condition();
				setState(283); match(CloseParenthesis);
				setState(284); match(OpenBrace);
				setState(285); codeblock();
				setState(286); match(CloseBrace);
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
		enterRule(_localctx, 46, RULE_condition);
		try {
			setState(324);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(290); match(VarIdentifier);
				setState(291); comparison();
				setState(292); match(VarIdentifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(294); match(VarIdentifier);
				setState(295); comparison();
				setState(296); expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(298); expression();
				setState(299); comparison();
				setState(300); match(VarIdentifier);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(302); match(OpenParenthesis);
				setState(303); condition();
				setState(304); match(CloseParenthesis);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(306); match(VarIdentifier);
				setState(307); comparison();
				setState(308); match(VarIdentifier);
				setState(309); logical_operator();
				setState(310); condition();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(312); match(VarIdentifier);
				setState(313); comparison();
				setState(314); expression();
				setState(315); logical_operator();
				setState(316); condition();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(318); expression();
				setState(319); comparison();
				setState(320); match(VarIdentifier);
				setState(321); logical_operator();
				setState(322); condition();
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
		enterRule(_localctx, 48, RULE_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EquaOp) | (1L << GreaterThanOp) | (1L << LessThanOp) | (1L << GreaterThanEqualTo) | (1L << LessThanEqualTo) | (1L << NotEqualToOp))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		enterRule(_localctx, 50, RULE_logical_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			_la = _input.LA(1);
			if ( !(_la==AndOp || _la==OrOp) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		enterRule(_localctx, 52, RULE_loop_statement);
		try {
			setState(333);
			switch (_input.LA(1)) {
			case EventLoopKeyword:
				enterOuterAlt(_localctx, 1);
				{
				setState(330); event_loop_statement();
				}
				break;
			case CountLoopKeyword:
				enterOuterAlt(_localctx, 2);
				{
				setState(331); count_loop_statement();
				}
				break;
			case RepeatUntilLoopKeyword:
				enterOuterAlt(_localctx, 3);
				{
				setState(332); repeatuntil_loop_statement();
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
		enterRule(_localctx, 54, RULE_event_loop_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335); match(EventLoopKeyword);
			setState(336); match(OpenParenthesis);
			setState(337); condition();
			setState(338); match(CloseParenthesis);
			setState(339); match(OpenBrace);
			setState(340); codeblock();
			setState(341); match(CloseBrace);
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
		enterRule(_localctx, 56, RULE_count_loop_statement);
		try {
			setState(367);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(343); match(CountLoopKeyword);
				setState(344); match(OpenParenthesis);
				setState(345); variable_declaration();
				setState(346); match(Terminator);
				setState(347); condition();
				setState(348); match(Terminator);
				setState(349); afterthought_statement();
				setState(350); match(CloseParenthesis);
				setState(351); match(OpenBrace);
				setState(352); codeblock();
				setState(353); match(CloseBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(355); match(CountLoopKeyword);
				setState(356); match(OpenParenthesis);
				setState(357); assignment_statement();
				setState(358); match(Terminator);
				setState(359); condition();
				setState(360); match(Terminator);
				setState(361); afterthought_statement();
				setState(362); match(CloseParenthesis);
				setState(363); match(OpenBrace);
				setState(364); codeblock();
				setState(365); match(CloseBrace);
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
		enterRule(_localctx, 58, RULE_repeatuntil_loop_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369); match(RepeatUntilLoopKeyword);
			setState(370); match(OpenBrace);
			setState(371); codeblock();
			setState(372); match(CloseBrace);
			setState(373); match(EventLoopKeyword);
			setState(374); match(OpenParenthesis);
			setState(375); condition();
			setState(376); match(CloseParenthesis);
			setState(377); match(Terminator);
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
		public TerminalNode Terminator() { return getToken(DogeScriptParser.Terminator, 0); }
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
		enterRule(_localctx, 60, RULE_function_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379); match(VarIdentifier);
			setState(380); match(OpenParenthesis);
			setState(381); function_call_parameters();
			setState(382); match(CloseParenthesis);
			setState(383); match(Terminator);
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
		enterRule(_localctx, 62, RULE_function_call_parameters);
		try {
			setState(390);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(385); returns_value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(386); returns_value();
				setState(387); match(Comma);
				setState(388); function_call_parameters();
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\61\u018b\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\5"+
		"\4S\n\4\3\5\3\5\3\5\3\5\5\5Y\n\5\3\6\3\6\3\6\3\6\3\6\5\6`\n\6\3\7\3\7"+
		"\5\7d\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\5\tx\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\5\n\u0086\n\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\5\r\u0090\n\r\3\16\3"+
		"\16\3\16\3\16\3\16\5\16\u0097\n\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\7\20\u00a1\n\20\f\20\16\20\u00a4\13\20\3\20\5\20\u00a7\n\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00b0\n\21\f\21\16\21\u00b3\13\21"+
		"\3\21\5\21\u00b6\n\21\3\22\3\22\3\22\5\22\u00bb\n\22\3\23\3\23\3\23\3"+
		"\23\3\23\5\23\u00c2\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\5\24\u00cd\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\5\25\u00da\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00f2\n\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u010c\n\27\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0123\n\30\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\5\31\u0147\n\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\5\34\u0150\n"+
		"\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\5\36\u0172\n\36\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\5!\u0189\n!\3!\2"+
		"\2\"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@"+
		"\2\6\4\2\27\27+.\3\2\4\7\3\2\35\"\3\2#$\u0198\2B\3\2\2\2\4E\3\2\2\2\6"+
		"R\3\2\2\2\bX\3\2\2\2\n_\3\2\2\2\fc\3\2\2\2\16e\3\2\2\2\20w\3\2\2\2\22"+
		"\u0085\3\2\2\2\24\u0087\3\2\2\2\26\u0089\3\2\2\2\30\u008f\3\2\2\2\32\u0096"+
		"\3\2\2\2\34\u0098\3\2\2\2\36\u00a6\3\2\2\2 \u00b5\3\2\2\2\"\u00ba\3\2"+
		"\2\2$\u00c1\3\2\2\2&\u00cc\3\2\2\2(\u00d9\3\2\2\2*\u00f1\3\2\2\2,\u010b"+
		"\3\2\2\2.\u0122\3\2\2\2\60\u0146\3\2\2\2\62\u0148\3\2\2\2\64\u014a\3\2"+
		"\2\2\66\u014f\3\2\2\28\u0151\3\2\2\2:\u0171\3\2\2\2<\u0173\3\2\2\2>\u017d"+
		"\3\2\2\2@\u0188\3\2\2\2BC\5\4\3\2CD\7\61\2\2D\3\3\2\2\2EF\7\n\2\2FG\7"+
		"\23\2\2GH\7\24\2\2HI\7)\2\2IJ\7*\2\2JK\7\'\2\2KL\5\6\4\2LM\7(\2\2M\5\3"+
		"\2\2\2NO\5\b\5\2OP\5\6\4\2PS\3\2\2\2QS\5\b\5\2RN\3\2\2\2RQ\3\2\2\2S\7"+
		"\3\2\2\2TY\5\22\n\2UY\5&\24\2VY\5(\25\2WY\5> \2XT\3\2\2\2XU\3\2\2\2XV"+
		"\3\2\2\2XW\3\2\2\2Y\t\3\2\2\2Z`\5\22\n\2[`\5&\24\2\\`\5(\25\2]`\5\66\34"+
		"\2^`\5> \2_Z\3\2\2\2_[\3\2\2\2_\\\3\2\2\2_]\3\2\2\2_^\3\2\2\2`\13\3\2"+
		"\2\2ad\5&\24\2bd\5> \2ca\3\2\2\2cb\3\2\2\2d\r\3\2\2\2ef\7\n\2\2fg\5\26"+
		"\f\2gh\7\60\2\2hi\7)\2\2ij\5\20\t\2jk\7*\2\2kl\7\'\2\2lm\5\6\4\2mn\7("+
		"\2\2n\17\3\2\2\2op\5\26\f\2pq\7\60\2\2qx\3\2\2\2rs\5\26\f\2st\7\60\2\2"+
		"tu\7\25\2\2uv\5\20\t\2vx\3\2\2\2wo\3\2\2\2wr\3\2\2\2x\21\3\2\2\2yz\7\t"+
		"\2\2z{\5\26\f\2{|\5\30\r\2|}\7\b\2\2}\u0086\3\2\2\2~\177\7\t\2\2\177\u0080"+
		"\5\26\f\2\u0080\u0081\7\60\2\2\u0081\u0082\7\f\2\2\u0082\u0083\5\32\16"+
		"\2\u0083\u0084\7\b\2\2\u0084\u0086\3\2\2\2\u0085y\3\2\2\2\u0085~\3\2\2"+
		"\2\u0086\23\3\2\2\2\u0087\u0088\t\2\2\2\u0088\25\3\2\2\2\u0089\u008a\t"+
		"\3\2\2\u008a\27\3\2\2\2\u008b\u008c\7\60\2\2\u008c\u008d\7\25\2\2\u008d"+
		"\u0090\5\30\r\2\u008e\u0090\7\60\2\2\u008f\u008b\3\2\2\2\u008f\u008e\3"+
		"\2\2\2\u0090\31\3\2\2\2\u0091\u0097\5\24\13\2\u0092\u0097\5\34\17\2\u0093"+
		"\u0097\5> \2\u0094\u0097\7\60\2\2\u0095\u0097\7\26\2\2\u0096\u0091\3\2"+
		"\2\2\u0096\u0092\3\2\2\2\u0096\u0093\3\2\2\2\u0096\u0094\3\2\2\2\u0096"+
		"\u0095\3\2\2\2\u0097\33\3\2\2\2\u0098\u0099\5\36\20\2\u0099\u009a\b\17"+
		"\1\2\u009a\35\3\2\2\2\u009b\u00a2\5 \21\2\u009c\u009d\7\30\2\2\u009d\u00a1"+
		"\5 \21\2\u009e\u009f\7\31\2\2\u009f\u00a1\5 \21\2\u00a0\u009c\3\2\2\2"+
		"\u00a0\u009e\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3"+
		"\3\2\2\2\u00a3\u00a7\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a7\5 \21\2\u00a6"+
		"\u009b\3\2\2\2\u00a6\u00a5\3\2\2\2\u00a7\37\3\2\2\2\u00a8\u00b1\5\"\22"+
		"\2\u00a9\u00aa\7\32\2\2\u00aa\u00b0\5\"\22\2\u00ab\u00ac\7\33\2\2\u00ac"+
		"\u00b0\5\"\22\2\u00ad\u00ae\7\34\2\2\u00ae\u00b0\5\"\22\2\u00af\u00a9"+
		"\3\2\2\2\u00af\u00ab\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1"+
		"\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b6\3\2\2\2\u00b3\u00b1\3\2"+
		"\2\2\u00b4\u00b6\5\"\22\2\u00b5\u00a8\3\2\2\2\u00b5\u00b4\3\2\2\2\u00b6"+
		"!\3\2\2\2\u00b7\u00b8\7\31\2\2\u00b8\u00bb\5$\23\2\u00b9\u00bb\5$\23\2"+
		"\u00ba\u00b7\3\2\2\2\u00ba\u00b9\3\2\2\2\u00bb#\3\2\2\2\u00bc\u00c2\7"+
		"+\2\2\u00bd\u00be\7)\2\2\u00be\u00bf\5\34\17\2\u00bf\u00c0\7*\2\2\u00c0"+
		"\u00c2\3\2\2\2\u00c1\u00bc\3\2\2\2\u00c1\u00bd\3\2\2\2\u00c2%\3\2\2\2"+
		"\u00c3\u00c4\7\60\2\2\u00c4\u00c5\7\f\2\2\u00c5\u00c6\7\60\2\2\u00c6\u00cd"+
		"\7\b\2\2\u00c7\u00c8\7\60\2\2\u00c8\u00c9\7\f\2\2\u00c9\u00ca\5\32\16"+
		"\2\u00ca\u00cb\7\b\2\2\u00cb\u00cd\3\2\2\2\u00cc\u00c3\3\2\2\2\u00cc\u00c7"+
		"\3\2\2\2\u00cd\'\3\2\2\2\u00ce\u00da\5*\26\2\u00cf\u00d0\5*\26\2\u00d0"+
		"\u00d1\5,\27\2\u00d1\u00da\3\2\2\2\u00d2\u00d3\5*\26\2\u00d3\u00d4\5."+
		"\30\2\u00d4\u00da\3\2\2\2\u00d5\u00d6\5*\26\2\u00d6\u00d7\5.\30\2\u00d7"+
		"\u00d8\5,\27\2\u00d8\u00da\3\2\2\2\u00d9\u00ce\3\2\2\2\u00d9\u00cf\3\2"+
		"\2\2\u00d9\u00d2\3\2\2\2\u00d9\u00d5\3\2\2\2\u00da)\3\2\2\2\u00db\u00dc"+
		"\7\r\2\2\u00dc\u00dd\7)\2\2\u00dd\u00de\5\60\31\2\u00de\u00df\7*\2\2\u00df"+
		"\u00e0\5\n\6\2\u00e0\u00f2\3\2\2\2\u00e1\u00e2\7\r\2\2\u00e2\u00e3\7)"+
		"\2\2\u00e3\u00e4\5\60\31\2\u00e4\u00e5\7*\2\2\u00e5\u00e6\7\'\2\2\u00e6"+
		"\u00e7\5\n\6\2\u00e7\u00e8\7(\2\2\u00e8\u00f2\3\2\2\2\u00e9\u00ea\7\r"+
		"\2\2\u00ea\u00eb\7)\2\2\u00eb\u00ec\5\60\31\2\u00ec\u00ed\7*\2\2\u00ed"+
		"\u00ee\7\'\2\2\u00ee\u00ef\5\6\4\2\u00ef\u00f0\7(\2\2\u00f0\u00f2\3\2"+
		"\2\2\u00f1\u00db\3\2\2\2\u00f1\u00e1\3\2\2\2\u00f1\u00e9\3\2\2\2\u00f2"+
		"+\3\2\2\2\u00f3\u00f4\7\16\2\2\u00f4\u00f5\7)\2\2\u00f5\u00f6\5\60\31"+
		"\2\u00f6\u00f7\7*\2\2\u00f7\u00f8\5\n\6\2\u00f8\u010c\3\2\2\2\u00f9\u00fa"+
		"\7\16\2\2\u00fa\u00fb\7)\2\2\u00fb\u00fc\5\60\31\2\u00fc\u00fd\7*\2\2"+
		"\u00fd\u00fe\7\'\2\2\u00fe\u00ff\5\n\6\2\u00ff\u0100\7(\2\2\u0100\u010c"+
		"\3\2\2\2\u0101\u0102\7\16\2\2\u0102\u0103\7)\2\2\u0103\u0104\5\60\31\2"+
		"\u0104\u0105\7*\2\2\u0105\u0106\7\'\2\2\u0106\u0107\5\6\4\2\u0107\u0108"+
		"\7(\2\2\u0108\u010c\3\2\2\2\u0109\u010a\7\16\2\2\u010a\u010c\5\n\6\2\u010b"+
		"\u00f3\3\2\2\2\u010b\u00f9\3\2\2\2\u010b\u0101\3\2\2\2\u010b\u0109\3\2"+
		"\2\2\u010c-\3\2\2\2\u010d\u010e\7\17\2\2\u010e\u010f\7)\2\2\u010f\u0110"+
		"\5\60\31\2\u0110\u0111\7*\2\2\u0111\u0112\5\n\6\2\u0112\u0123\3\2\2\2"+
		"\u0113\u0114\7\17\2\2\u0114\u0115\7)\2\2\u0115\u0116\5\60\31\2\u0116\u0117"+
		"\7*\2\2\u0117\u0118\5\n\6\2\u0118\u0119\7(\2\2\u0119\u0123\3\2\2\2\u011a"+
		"\u011b\7\17\2\2\u011b\u011c\7)\2\2\u011c\u011d\5\60\31\2\u011d\u011e\7"+
		"*\2\2\u011e\u011f\7\'\2\2\u011f\u0120\5\6\4\2\u0120\u0121\7(\2\2\u0121"+
		"\u0123\3\2\2\2\u0122\u010d\3\2\2\2\u0122\u0113\3\2\2\2\u0122\u011a\3\2"+
		"\2\2\u0123/\3\2\2\2\u0124\u0125\7\60\2\2\u0125\u0126\5\62\32\2\u0126\u0127"+
		"\7\60\2\2\u0127\u0147\3\2\2\2\u0128\u0129\7\60\2\2\u0129\u012a\5\62\32"+
		"\2\u012a\u012b\5\34\17\2\u012b\u0147\3\2\2\2\u012c\u012d\5\34\17\2\u012d"+
		"\u012e\5\62\32\2\u012e\u012f\7\60\2\2\u012f\u0147\3\2\2\2\u0130\u0131"+
		"\7)\2\2\u0131\u0132\5\60\31\2\u0132\u0133\7*\2\2\u0133\u0147\3\2\2\2\u0134"+
		"\u0135\7\60\2\2\u0135\u0136\5\62\32\2\u0136\u0137\7\60\2\2\u0137\u0138"+
		"\5\64\33\2\u0138\u0139\5\60\31\2\u0139\u0147\3\2\2\2\u013a\u013b\7\60"+
		"\2\2\u013b\u013c\5\62\32\2\u013c\u013d\5\34\17\2\u013d\u013e\5\64\33\2"+
		"\u013e\u013f\5\60\31\2\u013f\u0147\3\2\2\2\u0140\u0141\5\34\17\2\u0141"+
		"\u0142\5\62\32\2\u0142\u0143\7\60\2\2\u0143\u0144\5\64\33\2\u0144\u0145"+
		"\5\60\31\2\u0145\u0147\3\2\2\2\u0146\u0124\3\2\2\2\u0146\u0128\3\2\2\2"+
		"\u0146\u012c\3\2\2\2\u0146\u0130\3\2\2\2\u0146\u0134\3\2\2\2\u0146\u013a"+
		"\3\2\2\2\u0146\u0140\3\2\2\2\u0147\61\3\2\2\2\u0148\u0149\t\4\2\2\u0149"+
		"\63\3\2\2\2\u014a\u014b\t\5\2\2\u014b\65\3\2\2\2\u014c\u0150\58\35\2\u014d"+
		"\u0150\5:\36\2\u014e\u0150\5<\37\2\u014f\u014c\3\2\2\2\u014f\u014d\3\2"+
		"\2\2\u014f\u014e\3\2\2\2\u0150\67\3\2\2\2\u0151\u0152\7\20\2\2\u0152\u0153"+
		"\7)\2\2\u0153\u0154\5\60\31\2\u0154\u0155\7*\2\2\u0155\u0156\7\'\2\2\u0156"+
		"\u0157\5\6\4\2\u0157\u0158\7(\2\2\u01589\3\2\2\2\u0159\u015a\7\21\2\2"+
		"\u015a\u015b\7)\2\2\u015b\u015c\5\22\n\2\u015c\u015d\7\b\2\2\u015d\u015e"+
		"\5\60\31\2\u015e\u015f\7\b\2\2\u015f\u0160\5\f\7\2\u0160\u0161\7*\2\2"+
		"\u0161\u0162\7\'\2\2\u0162\u0163\5\6\4\2\u0163\u0164\7(\2\2\u0164\u0172"+
		"\3\2\2\2\u0165\u0166\7\21\2\2\u0166\u0167\7)\2\2\u0167\u0168\5&\24\2\u0168"+
		"\u0169\7\b\2\2\u0169\u016a\5\60\31\2\u016a\u016b\7\b\2\2\u016b\u016c\5"+
		"\f\7\2\u016c\u016d\7*\2\2\u016d\u016e\7\'\2\2\u016e\u016f\5\6\4\2\u016f"+
		"\u0170\7(\2\2\u0170\u0172\3\2\2\2\u0171\u0159\3\2\2\2\u0171\u0165\3\2"+
		"\2\2\u0172;\3\2\2\2\u0173\u0174\7\22\2\2\u0174\u0175\7\'\2\2\u0175\u0176"+
		"\5\6\4\2\u0176\u0177\7(\2\2\u0177\u0178\7\20\2\2\u0178\u0179\7)\2\2\u0179"+
		"\u017a\5\60\31\2\u017a\u017b\7*\2\2\u017b\u017c\7\b\2\2\u017c=\3\2\2\2"+
		"\u017d\u017e\7\60\2\2\u017e\u017f\7)\2\2\u017f\u0180\5@!\2\u0180\u0181"+
		"\7*\2\2\u0181\u0182\7\b\2\2\u0182?\3\2\2\2\u0183\u0189\5\32\16\2\u0184"+
		"\u0185\5\32\16\2\u0185\u0186\7\25\2\2\u0186\u0187\5@!\2\u0187\u0189\3"+
		"\2\2\2\u0188\u0183\3\2\2\2\u0188\u0184\3\2\2\2\u0189A\3\2\2\2\33RX_cw"+
		"\u0085\u008f\u0096\u00a0\u00a2\u00a6\u00af\u00b1\u00b5\u00ba\u00c1\u00cc"+
		"\u00d9\u00f1\u010b\u0122\u0146\u014f\u0171\u0188";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}