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
		RULE_start = 0, RULE_main = 1, RULE_functionblock = 2, RULE_codeblock = 3, 
		RULE_all_possible = 4, RULE_single_all_possible = 5, RULE_afterthought_statement = 6, 
		RULE_function_declaration = 7, RULE_function_declaration_paramaters = 8, 
		RULE_variable_declaration = 9, RULE_literal = 10, RULE_datatype = 11, 
		RULE_variable_instance = 12, RULE_returns_value = 13, RULE_expression = 14, 
		RULE_low_prior = 15, RULE_high_prior = 16, RULE_signint = 17, RULE_top_prior = 18, 
		RULE_assignment_statement = 19, RULE_conditional_statement = 20, RULE_start_condition = 21, 
		RULE_end_condition = 22, RULE_continue_condition = 23, RULE_condition = 24, 
		RULE_comparison = 25, RULE_logical_operator = 26, RULE_loop_statement = 27, 
		RULE_event_loop_statement = 28, RULE_count_loop_statement = 29, RULE_repeatuntil_loop_statement = 30, 
		RULE_function_call = 31, RULE_function_call_parameters = 32;
	public static final String[] ruleNames = {
		"start", "main", "functionblock", "codeblock", "all_possible", "single_all_possible", 
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
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public FunctionblockContext functionblock() {
			return getRuleContext(FunctionblockContext.class,0);
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
			setState(73);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(66); main();
				setState(67); match(EndOfFile);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(69); functionblock();
				setState(70); main();
				setState(71); match(EndOfFile);
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

	public static class MainContext extends ParserRuleContext {
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
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).exitMain(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75); match(FuncStarter);
			setState(76); match(VoidKeyword);
			setState(77); match(MainKeyword);
			setState(78); match(OpenParenthesis);
			setState(79); match(CloseParenthesis);
			setState(80); match(OpenBrace);
			setState(81); codeblock();
			setState(82); match(CloseBrace);
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

	public static class FunctionblockContext extends ParserRuleContext {
		public Function_declarationContext function_declaration() {
			return getRuleContext(Function_declarationContext.class,0);
		}
		public FunctionblockContext functionblock() {
			return getRuleContext(FunctionblockContext.class,0);
		}
		public FunctionblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).enterFunctionblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DogeScriptListener ) ((DogeScriptListener)listener).exitFunctionblock(this);
		}
	}

	public final FunctionblockContext functionblock() throws RecognitionException {
		FunctionblockContext _localctx = new FunctionblockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_functionblock);
		try {
			setState(88);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(84); function_declaration();
				setState(85); functionblock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(87); function_declaration();
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
		enterRule(_localctx, 6, RULE_codeblock);
		try {
			setState(94);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(90); all_possible();
				setState(91); codeblock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(93); all_possible();
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
		enterRule(_localctx, 8, RULE_all_possible);
		try {
			setState(100);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(96); variable_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(97); assignment_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(98); conditional_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(99); function_call();
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
		enterRule(_localctx, 10, RULE_single_all_possible);
		try {
			setState(107);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(102); variable_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(103); assignment_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(104); conditional_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(105); loop_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(106); function_call();
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
		enterRule(_localctx, 12, RULE_afterthought_statement);
		try {
			setState(111);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(109); assignment_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(110); function_call();
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
		enterRule(_localctx, 14, RULE_function_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113); match(FuncStarter);
			setState(114); datatype();
			setState(115); match(VarIdentifier);
			setState(116); match(OpenParenthesis);
			setState(117); function_declaration_paramaters();
			setState(118); match(CloseParenthesis);
			setState(119); match(OpenBrace);
			setState(120); codeblock();
			setState(121); match(CloseBrace);
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
		enterRule(_localctx, 16, RULE_function_declaration_paramaters);
		try {
			setState(131);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(123); datatype();
				setState(124); match(VarIdentifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(126); datatype();
				setState(127); match(VarIdentifier);
				setState(128); match(Comma);
				setState(129); function_declaration_paramaters();
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
		enterRule(_localctx, 18, RULE_variable_declaration);
		try {
			setState(145);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(133); match(VarDecStarter);
				setState(134); datatype();
				setState(135); variable_instance();
				setState(136); match(Terminator);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(138); match(VarDecStarter);
				setState(139); datatype();
				setState(140); match(VarIdentifier);
				setState(141); match(AssOp);
				setState(142); returns_value();
				setState(143); match(Terminator);
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
		enterRule(_localctx, 20, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
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
		enterRule(_localctx, 22, RULE_datatype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
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
		enterRule(_localctx, 24, RULE_variable_instance);
		try {
			setState(155);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(151); match(VarIdentifier);
				setState(152); match(Comma);
				setState(153); variable_instance();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(154); match(VarIdentifier);
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
		enterRule(_localctx, 26, RULE_returns_value);
		try {
			setState(162);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(157); literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(158); expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(159); function_call();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(160); match(VarIdentifier);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(161); match(NullKeyword);
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
		enterRule(_localctx, 28, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164); low_prior();
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
		enterRule(_localctx, 30, RULE_low_prior);
		int _la;
		try {
			setState(178);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(167); high_prior();
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AddOp || _la==SubOp) {
					{
					setState(172);
					switch (_input.LA(1)) {
					case AddOp:
						{
						setState(168); match(AddOp);
						setState(169); high_prior();
						}
						break;
					case SubOp:
						{
						setState(170); match(SubOp);
						setState(171); high_prior();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(176);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(177); high_prior();
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
		enterRule(_localctx, 32, RULE_high_prior);
		int _la;
		try {
			setState(193);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(180); signint();
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MulOp) | (1L << DivOp) | (1L << ModOp))) != 0)) {
					{
					setState(187);
					switch (_input.LA(1)) {
					case MulOp:
						{
						setState(181); match(MulOp);
						setState(182); signint();
						}
						break;
					case DivOp:
						{
						setState(183); match(DivOp);
						setState(184); signint();
						}
						break;
					case ModOp:
						{
						setState(185); match(ModOp);
						setState(186); signint();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(191);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(192); signint();
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
		enterRule(_localctx, 34, RULE_signint);
		try {
			setState(198);
			switch (_input.LA(1)) {
			case SubOp:
				enterOuterAlt(_localctx, 1);
				{
				setState(195); match(SubOp);
				setState(196); top_prior();
				}
				break;
			case OpenParenthesis:
			case IntLit:
			case VarIdentifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(197); top_prior();
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
		enterRule(_localctx, 36, RULE_top_prior);
		try {
			setState(206);
			switch (_input.LA(1)) {
			case IntLit:
				enterOuterAlt(_localctx, 1);
				{
				setState(200); match(IntLit);
				}
				break;
			case OpenParenthesis:
				enterOuterAlt(_localctx, 2);
				{
				setState(201); match(OpenParenthesis);
				setState(202); expression();
				setState(203); match(CloseParenthesis);
				}
				break;
			case VarIdentifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(205); match(VarIdentifier);
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
		enterRule(_localctx, 38, RULE_assignment_statement);
		try {
			setState(217);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(208); match(VarIdentifier);
				setState(209); match(AssOp);
				setState(210); match(VarIdentifier);
				setState(211); match(Terminator);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(212); match(VarIdentifier);
				setState(213); match(AssOp);
				setState(214); returns_value();
				setState(215); match(Terminator);
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
		enterRule(_localctx, 40, RULE_conditional_statement);
		try {
			setState(230);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(219); start_condition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(220); start_condition();
				setState(221); end_condition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(223); start_condition();
				setState(224); continue_condition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(226); start_condition();
				setState(227); continue_condition();
				setState(228); end_condition();
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
		enterRule(_localctx, 42, RULE_start_condition);
		try {
			setState(254);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(232); match(IfKeyword);
				setState(233); match(OpenParenthesis);
				setState(234); condition();
				setState(235); match(CloseParenthesis);
				setState(236); single_all_possible();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(238); match(IfKeyword);
				setState(239); match(OpenParenthesis);
				setState(240); condition();
				setState(241); match(CloseParenthesis);
				setState(242); match(OpenBrace);
				setState(243); single_all_possible();
				setState(244); match(CloseBrace);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(246); match(IfKeyword);
				setState(247); match(OpenParenthesis);
				setState(248); condition();
				setState(249); match(CloseParenthesis);
				setState(250); match(OpenBrace);
				setState(251); codeblock();
				setState(252); match(CloseBrace);
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
		enterRule(_localctx, 44, RULE_end_condition);
		try {
			setState(280);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(256); match(ElseKeyword);
				setState(257); match(OpenParenthesis);
				setState(258); condition();
				setState(259); match(CloseParenthesis);
				setState(260); single_all_possible();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(262); match(ElseKeyword);
				setState(263); match(OpenParenthesis);
				setState(264); condition();
				setState(265); match(CloseParenthesis);
				setState(266); match(OpenBrace);
				setState(267); single_all_possible();
				setState(268); match(CloseBrace);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(270); match(ElseKeyword);
				setState(271); match(OpenParenthesis);
				setState(272); condition();
				setState(273); match(CloseParenthesis);
				setState(274); match(OpenBrace);
				setState(275); codeblock();
				setState(276); match(CloseBrace);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(278); match(ElseKeyword);
				setState(279); single_all_possible();
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
		enterRule(_localctx, 46, RULE_continue_condition);
		try {
			setState(303);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(282); match(ElseIfKeyword);
				setState(283); match(OpenParenthesis);
				setState(284); condition();
				setState(285); match(CloseParenthesis);
				setState(286); single_all_possible();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(288); match(ElseIfKeyword);
				setState(289); match(OpenParenthesis);
				setState(290); condition();
				setState(291); match(CloseParenthesis);
				setState(292); single_all_possible();
				setState(293); match(CloseBrace);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(295); match(ElseIfKeyword);
				setState(296); match(OpenParenthesis);
				setState(297); condition();
				setState(298); match(CloseParenthesis);
				setState(299); match(OpenBrace);
				setState(300); codeblock();
				setState(301); match(CloseBrace);
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
		enterRule(_localctx, 48, RULE_condition);
		try {
			setState(339);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(305); match(VarIdentifier);
				setState(306); comparison();
				setState(307); match(VarIdentifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(309); match(VarIdentifier);
				setState(310); comparison();
				setState(311); expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(313); expression();
				setState(314); comparison();
				setState(315); match(VarIdentifier);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(317); match(OpenParenthesis);
				setState(318); condition();
				setState(319); match(CloseParenthesis);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(321); match(VarIdentifier);
				setState(322); comparison();
				setState(323); match(VarIdentifier);
				setState(324); logical_operator();
				setState(325); condition();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(327); match(VarIdentifier);
				setState(328); comparison();
				setState(329); expression();
				setState(330); logical_operator();
				setState(331); condition();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(333); expression();
				setState(334); comparison();
				setState(335); match(VarIdentifier);
				setState(336); logical_operator();
				setState(337); condition();
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
		enterRule(_localctx, 50, RULE_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
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
		enterRule(_localctx, 52, RULE_logical_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
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
		enterRule(_localctx, 54, RULE_loop_statement);
		try {
			setState(348);
			switch (_input.LA(1)) {
			case EventLoopKeyword:
				enterOuterAlt(_localctx, 1);
				{
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
		enterRule(_localctx, 56, RULE_event_loop_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350); match(EventLoopKeyword);
			setState(351); match(OpenParenthesis);
			setState(352); condition();
			setState(353); match(CloseParenthesis);
			setState(354); match(OpenBrace);
			setState(355); codeblock();
			setState(356); match(CloseBrace);
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
		enterRule(_localctx, 58, RULE_count_loop_statement);
		try {
			setState(382);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(358); match(CountLoopKeyword);
				setState(359); match(OpenParenthesis);
				setState(360); variable_declaration();
				setState(361); match(Terminator);
				setState(362); condition();
				setState(363); match(Terminator);
				setState(364); afterthought_statement();
				setState(365); match(CloseParenthesis);
				setState(366); match(OpenBrace);
				setState(367); codeblock();
				setState(368); match(CloseBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(370); match(CountLoopKeyword);
				setState(371); match(OpenParenthesis);
				setState(372); assignment_statement();
				setState(373); match(Terminator);
				setState(374); condition();
				setState(375); match(Terminator);
				setState(376); afterthought_statement();
				setState(377); match(CloseParenthesis);
				setState(378); match(OpenBrace);
				setState(379); codeblock();
				setState(380); match(CloseBrace);
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
		enterRule(_localctx, 60, RULE_repeatuntil_loop_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384); match(RepeatUntilLoopKeyword);
			setState(385); match(OpenBrace);
			setState(386); codeblock();
			setState(387); match(CloseBrace);
			setState(388); match(EventLoopKeyword);
			setState(389); match(OpenParenthesis);
			setState(390); condition();
			setState(391); match(CloseParenthesis);
			setState(392); match(Terminator);
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
		enterRule(_localctx, 62, RULE_function_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394); match(VarIdentifier);
			setState(395); match(OpenParenthesis);
			setState(396); function_call_parameters();
			setState(397); match(CloseParenthesis);
			setState(398); match(Terminator);
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
		enterRule(_localctx, 64, RULE_function_call_parameters);
		try {
			setState(405);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(400); returns_value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(401); returns_value();
				setState(402); match(Comma);
				setState(403); function_call_parameters();
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\61\u019a\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2L\n\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4[\n\4\3\5\3\5\3\5\3\5\5\5a\n\5\3\6\3"+
		"\6\3\6\3\6\5\6g\n\6\3\7\3\7\3\7\3\7\3\7\5\7n\n\7\3\b\3\b\5\br\n\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5"+
		"\n\u0086\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\5\13\u0094\n\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\5\16\u009e\n\16"+
		"\3\17\3\17\3\17\3\17\3\17\5\17\u00a5\n\17\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\7\21\u00af\n\21\f\21\16\21\u00b2\13\21\3\21\5\21\u00b5\n\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u00be\n\22\f\22\16\22\u00c1\13"+
		"\22\3\22\5\22\u00c4\n\22\3\23\3\23\3\23\5\23\u00c9\n\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\5\24\u00d1\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\5\25\u00dc\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\5\26\u00e9\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0101"+
		"\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u011b\n\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0132\n\31\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\5\32\u0156\n\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\5\35\u015f"+
		"\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\5\37\u0181\n\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3"+
		" \3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\5\"\u0198\n\"\3\"\2\2#\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@B\2\6\4\2\27"+
		"\27+.\3\2\4\7\3\2\35\"\3\2#$\u01a9\2K\3\2\2\2\4M\3\2\2\2\6Z\3\2\2\2\b"+
		"`\3\2\2\2\nf\3\2\2\2\fm\3\2\2\2\16q\3\2\2\2\20s\3\2\2\2\22\u0085\3\2\2"+
		"\2\24\u0093\3\2\2\2\26\u0095\3\2\2\2\30\u0097\3\2\2\2\32\u009d\3\2\2\2"+
		"\34\u00a4\3\2\2\2\36\u00a6\3\2\2\2 \u00b4\3\2\2\2\"\u00c3\3\2\2\2$\u00c8"+
		"\3\2\2\2&\u00d0\3\2\2\2(\u00db\3\2\2\2*\u00e8\3\2\2\2,\u0100\3\2\2\2."+
		"\u011a\3\2\2\2\60\u0131\3\2\2\2\62\u0155\3\2\2\2\64\u0157\3\2\2\2\66\u0159"+
		"\3\2\2\28\u015e\3\2\2\2:\u0160\3\2\2\2<\u0180\3\2\2\2>\u0182\3\2\2\2@"+
		"\u018c\3\2\2\2B\u0197\3\2\2\2DE\5\4\3\2EF\7\61\2\2FL\3\2\2\2GH\5\6\4\2"+
		"HI\5\4\3\2IJ\7\61\2\2JL\3\2\2\2KD\3\2\2\2KG\3\2\2\2L\3\3\2\2\2MN\7\n\2"+
		"\2NO\7\23\2\2OP\7\24\2\2PQ\7)\2\2QR\7*\2\2RS\7\'\2\2ST\5\b\5\2TU\7(\2"+
		"\2U\5\3\2\2\2VW\5\20\t\2WX\5\6\4\2X[\3\2\2\2Y[\5\20\t\2ZV\3\2\2\2ZY\3"+
		"\2\2\2[\7\3\2\2\2\\]\5\n\6\2]^\5\b\5\2^a\3\2\2\2_a\5\n\6\2`\\\3\2\2\2"+
		"`_\3\2\2\2a\t\3\2\2\2bg\5\24\13\2cg\5(\25\2dg\5*\26\2eg\5@!\2fb\3\2\2"+
		"\2fc\3\2\2\2fd\3\2\2\2fe\3\2\2\2g\13\3\2\2\2hn\5\24\13\2in\5(\25\2jn\5"+
		"*\26\2kn\58\35\2ln\5@!\2mh\3\2\2\2mi\3\2\2\2mj\3\2\2\2mk\3\2\2\2ml\3\2"+
		"\2\2n\r\3\2\2\2or\5(\25\2pr\5@!\2qo\3\2\2\2qp\3\2\2\2r\17\3\2\2\2st\7"+
		"\n\2\2tu\5\30\r\2uv\7\60\2\2vw\7)\2\2wx\5\22\n\2xy\7*\2\2yz\7\'\2\2z{"+
		"\5\b\5\2{|\7(\2\2|\21\3\2\2\2}~\5\30\r\2~\177\7\60\2\2\177\u0086\3\2\2"+
		"\2\u0080\u0081\5\30\r\2\u0081\u0082\7\60\2\2\u0082\u0083\7\25\2\2\u0083"+
		"\u0084\5\22\n\2\u0084\u0086\3\2\2\2\u0085}\3\2\2\2\u0085\u0080\3\2\2\2"+
		"\u0086\23\3\2\2\2\u0087\u0088\7\t\2\2\u0088\u0089\5\30\r\2\u0089\u008a"+
		"\5\32\16\2\u008a\u008b\7\b\2\2\u008b\u0094\3\2\2\2\u008c\u008d\7\t\2\2"+
		"\u008d\u008e\5\30\r\2\u008e\u008f\7\60\2\2\u008f\u0090\7\f\2\2\u0090\u0091"+
		"\5\34\17\2\u0091\u0092\7\b\2\2\u0092\u0094\3\2\2\2\u0093\u0087\3\2\2\2"+
		"\u0093\u008c\3\2\2\2\u0094\25\3\2\2\2\u0095\u0096\t\2\2\2\u0096\27\3\2"+
		"\2\2\u0097\u0098\t\3\2\2\u0098\31\3\2\2\2\u0099\u009a\7\60\2\2\u009a\u009b"+
		"\7\25\2\2\u009b\u009e\5\32\16\2\u009c\u009e\7\60\2\2\u009d\u0099\3\2\2"+
		"\2\u009d\u009c\3\2\2\2\u009e\33\3\2\2\2\u009f\u00a5\5\26\f\2\u00a0\u00a5"+
		"\5\36\20\2\u00a1\u00a5\5@!\2\u00a2\u00a5\7\60\2\2\u00a3\u00a5\7\26\2\2"+
		"\u00a4\u009f\3\2\2\2\u00a4\u00a0\3\2\2\2\u00a4\u00a1\3\2\2\2\u00a4\u00a2"+
		"\3\2\2\2\u00a4\u00a3\3\2\2\2\u00a5\35\3\2\2\2\u00a6\u00a7\5 \21\2\u00a7"+
		"\u00a8\b\20\1\2\u00a8\37\3\2\2\2\u00a9\u00b0\5\"\22\2\u00aa\u00ab\7\30"+
		"\2\2\u00ab\u00af\5\"\22\2\u00ac\u00ad\7\31\2\2\u00ad\u00af\5\"\22\2\u00ae"+
		"\u00aa\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00ae\3\2"+
		"\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b5\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3"+
		"\u00b5\5\"\22\2\u00b4\u00a9\3\2\2\2\u00b4\u00b3\3\2\2\2\u00b5!\3\2\2\2"+
		"\u00b6\u00bf\5$\23\2\u00b7\u00b8\7\32\2\2\u00b8\u00be\5$\23\2\u00b9\u00ba"+
		"\7\33\2\2\u00ba\u00be\5$\23\2\u00bb\u00bc\7\34\2\2\u00bc\u00be\5$\23\2"+
		"\u00bd\u00b7\3\2\2\2\u00bd\u00b9\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00c1"+
		"\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c4\3\2\2\2\u00c1"+
		"\u00bf\3\2\2\2\u00c2\u00c4\5$\23\2\u00c3\u00b6\3\2\2\2\u00c3\u00c2\3\2"+
		"\2\2\u00c4#\3\2\2\2\u00c5\u00c6\7\31\2\2\u00c6\u00c9\5&\24\2\u00c7\u00c9"+
		"\5&\24\2\u00c8\u00c5\3\2\2\2\u00c8\u00c7\3\2\2\2\u00c9%\3\2\2\2\u00ca"+
		"\u00d1\7+\2\2\u00cb\u00cc\7)\2\2\u00cc\u00cd\5\36\20\2\u00cd\u00ce\7*"+
		"\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00d1\7\60\2\2\u00d0\u00ca\3\2\2\2\u00d0"+
		"\u00cb\3\2\2\2\u00d0\u00cf\3\2\2\2\u00d1\'\3\2\2\2\u00d2\u00d3\7\60\2"+
		"\2\u00d3\u00d4\7\f\2\2\u00d4\u00d5\7\60\2\2\u00d5\u00dc\7\b\2\2\u00d6"+
		"\u00d7\7\60\2\2\u00d7\u00d8\7\f\2\2\u00d8\u00d9\5\34\17\2\u00d9\u00da"+
		"\7\b\2\2\u00da\u00dc\3\2\2\2\u00db\u00d2\3\2\2\2\u00db\u00d6\3\2\2\2\u00dc"+
		")\3\2\2\2\u00dd\u00e9\5,\27\2\u00de\u00df\5,\27\2\u00df\u00e0\5.\30\2"+
		"\u00e0\u00e9\3\2\2\2\u00e1\u00e2\5,\27\2\u00e2\u00e3\5\60\31\2\u00e3\u00e9"+
		"\3\2\2\2\u00e4\u00e5\5,\27\2\u00e5\u00e6\5\60\31\2\u00e6\u00e7\5.\30\2"+
		"\u00e7\u00e9\3\2\2\2\u00e8\u00dd\3\2\2\2\u00e8\u00de\3\2\2\2\u00e8\u00e1"+
		"\3\2\2\2\u00e8\u00e4\3\2\2\2\u00e9+\3\2\2\2\u00ea\u00eb\7\r\2\2\u00eb"+
		"\u00ec\7)\2\2\u00ec\u00ed\5\62\32\2\u00ed\u00ee\7*\2\2\u00ee\u00ef\5\f"+
		"\7\2\u00ef\u0101\3\2\2\2\u00f0\u00f1\7\r\2\2\u00f1\u00f2\7)\2\2\u00f2"+
		"\u00f3\5\62\32\2\u00f3\u00f4\7*\2\2\u00f4\u00f5\7\'\2\2\u00f5\u00f6\5"+
		"\f\7\2\u00f6\u00f7\7(\2\2\u00f7\u0101\3\2\2\2\u00f8\u00f9\7\r\2\2\u00f9"+
		"\u00fa\7)\2\2\u00fa\u00fb\5\62\32\2\u00fb\u00fc\7*\2\2\u00fc\u00fd\7\'"+
		"\2\2\u00fd\u00fe\5\b\5\2\u00fe\u00ff\7(\2\2\u00ff\u0101\3\2\2\2\u0100"+
		"\u00ea\3\2\2\2\u0100\u00f0\3\2\2\2\u0100\u00f8\3\2\2\2\u0101-\3\2\2\2"+
		"\u0102\u0103\7\16\2\2\u0103\u0104\7)\2\2\u0104\u0105\5\62\32\2\u0105\u0106"+
		"\7*\2\2\u0106\u0107\5\f\7\2\u0107\u011b\3\2\2\2\u0108\u0109\7\16\2\2\u0109"+
		"\u010a\7)\2\2\u010a\u010b\5\62\32\2\u010b\u010c\7*\2\2\u010c\u010d\7\'"+
		"\2\2\u010d\u010e\5\f\7\2\u010e\u010f\7(\2\2\u010f\u011b\3\2\2\2\u0110"+
		"\u0111\7\16\2\2\u0111\u0112\7)\2\2\u0112\u0113\5\62\32\2\u0113\u0114\7"+
		"*\2\2\u0114\u0115\7\'\2\2\u0115\u0116\5\b\5\2\u0116\u0117\7(\2\2\u0117"+
		"\u011b\3\2\2\2\u0118\u0119\7\16\2\2\u0119\u011b\5\f\7\2\u011a\u0102\3"+
		"\2\2\2\u011a\u0108\3\2\2\2\u011a\u0110\3\2\2\2\u011a\u0118\3\2\2\2\u011b"+
		"/\3\2\2\2\u011c\u011d\7\17\2\2\u011d\u011e\7)\2\2\u011e\u011f\5\62\32"+
		"\2\u011f\u0120\7*\2\2\u0120\u0121\5\f\7\2\u0121\u0132\3\2\2\2\u0122\u0123"+
		"\7\17\2\2\u0123\u0124\7)\2\2\u0124\u0125\5\62\32\2\u0125\u0126\7*\2\2"+
		"\u0126\u0127\5\f\7\2\u0127\u0128\7(\2\2\u0128\u0132\3\2\2\2\u0129\u012a"+
		"\7\17\2\2\u012a\u012b\7)\2\2\u012b\u012c\5\62\32\2\u012c\u012d\7*\2\2"+
		"\u012d\u012e\7\'\2\2\u012e\u012f\5\b\5\2\u012f\u0130\7(\2\2\u0130\u0132"+
		"\3\2\2\2\u0131\u011c\3\2\2\2\u0131\u0122\3\2\2\2\u0131\u0129\3\2\2\2\u0132"+
		"\61\3\2\2\2\u0133\u0134\7\60\2\2\u0134\u0135\5\64\33\2\u0135\u0136\7\60"+
		"\2\2\u0136\u0156\3\2\2\2\u0137\u0138\7\60\2\2\u0138\u0139\5\64\33\2\u0139"+
		"\u013a\5\36\20\2\u013a\u0156\3\2\2\2\u013b\u013c\5\36\20\2\u013c\u013d"+
		"\5\64\33\2\u013d\u013e\7\60\2\2\u013e\u0156\3\2\2\2\u013f\u0140\7)\2\2"+
		"\u0140\u0141\5\62\32\2\u0141\u0142\7*\2\2\u0142\u0156\3\2\2\2\u0143\u0144"+
		"\7\60\2\2\u0144\u0145\5\64\33\2\u0145\u0146\7\60\2\2\u0146\u0147\5\66"+
		"\34\2\u0147\u0148\5\62\32\2\u0148\u0156\3\2\2\2\u0149\u014a\7\60\2\2\u014a"+
		"\u014b\5\64\33\2\u014b\u014c\5\36\20\2\u014c\u014d\5\66\34\2\u014d\u014e"+
		"\5\62\32\2\u014e\u0156\3\2\2\2\u014f\u0150\5\36\20\2\u0150\u0151\5\64"+
		"\33\2\u0151\u0152\7\60\2\2\u0152\u0153\5\66\34\2\u0153\u0154\5\62\32\2"+
		"\u0154\u0156\3\2\2\2\u0155\u0133\3\2\2\2\u0155\u0137\3\2\2\2\u0155\u013b"+
		"\3\2\2\2\u0155\u013f\3\2\2\2\u0155\u0143\3\2\2\2\u0155\u0149\3\2\2\2\u0155"+
		"\u014f\3\2\2\2\u0156\63\3\2\2\2\u0157\u0158\t\4\2\2\u0158\65\3\2\2\2\u0159"+
		"\u015a\t\5\2\2\u015a\67\3\2\2\2\u015b\u015f\5:\36\2\u015c\u015f\5<\37"+
		"\2\u015d\u015f\5> \2\u015e\u015b\3\2\2\2\u015e\u015c\3\2\2\2\u015e\u015d"+
		"\3\2\2\2\u015f9\3\2\2\2\u0160\u0161\7\20\2\2\u0161\u0162\7)\2\2\u0162"+
		"\u0163\5\62\32\2\u0163\u0164\7*\2\2\u0164\u0165\7\'\2\2\u0165\u0166\5"+
		"\b\5\2\u0166\u0167\7(\2\2\u0167;\3\2\2\2\u0168\u0169\7\21\2\2\u0169\u016a"+
		"\7)\2\2\u016a\u016b\5\24\13\2\u016b\u016c\7\b\2\2\u016c\u016d\5\62\32"+
		"\2\u016d\u016e\7\b\2\2\u016e\u016f\5\16\b\2\u016f\u0170\7*\2\2\u0170\u0171"+
		"\7\'\2\2\u0171\u0172\5\b\5\2\u0172\u0173\7(\2\2\u0173\u0181\3\2\2\2\u0174"+
		"\u0175\7\21\2\2\u0175\u0176\7)\2\2\u0176\u0177\5(\25\2\u0177\u0178\7\b"+
		"\2\2\u0178\u0179\5\62\32\2\u0179\u017a\7\b\2\2\u017a\u017b\5\16\b\2\u017b"+
		"\u017c\7*\2\2\u017c\u017d\7\'\2\2\u017d\u017e\5\b\5\2\u017e\u017f\7(\2"+
		"\2\u017f\u0181\3\2\2\2\u0180\u0168\3\2\2\2\u0180\u0174\3\2\2\2\u0181="+
		"\3\2\2\2\u0182\u0183\7\22\2\2\u0183\u0184\7\'\2\2\u0184\u0185\5\b\5\2"+
		"\u0185\u0186\7(\2\2\u0186\u0187\7\20\2\2\u0187\u0188\7)\2\2\u0188\u0189"+
		"\5\62\32\2\u0189\u018a\7*\2\2\u018a\u018b\7\b\2\2\u018b?\3\2\2\2\u018c"+
		"\u018d\7\60\2\2\u018d\u018e\7)\2\2\u018e\u018f\5B\"\2\u018f\u0190\7*\2"+
		"\2\u0190\u0191\7\b\2\2\u0191A\3\2\2\2\u0192\u0198\5\34\17\2\u0193\u0194"+
		"\5\34\17\2\u0194\u0195\7\25\2\2\u0195\u0196\5B\"\2\u0196\u0198\3\2\2\2"+
		"\u0197\u0192\3\2\2\2\u0197\u0193\3\2\2\2\u0198C\3\2\2\2\35KZ`fmq\u0085"+
		"\u0093\u009d\u00a4\u00ae\u00b0\u00b4\u00bd\u00bf\u00c3\u00c8\u00d0\u00db"+
		"\u00e8\u0100\u011a\u0131\u0155\u015e\u0180\u0197";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}