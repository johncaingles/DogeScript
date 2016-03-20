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
		RULE_start = 0, RULE_codeblock = 1, RULE_all_possible = 2, RULE_single_all_possible = 3, 
		RULE_afterthought_statement = 4, RULE_function_declaration = 5, RULE_function_declaration_paramaters = 6, 
		RULE_variable_declaration = 7, RULE_literal = 8, RULE_datatype = 9, RULE_variable_instance = 10, 
		RULE_returns_value = 11, RULE_expression = 12, RULE_low_prior = 13, RULE_high_prior = 14, 
		RULE_signint = 15, RULE_top_prior = 16, RULE_assignment_statement = 17, 
		RULE_conditional_statement = 18, RULE_start_condition = 19, RULE_end_condition = 20, 
		RULE_continue_condition = 21, RULE_condition = 22, RULE_comparison = 23, 
		RULE_logical_operator = 24, RULE_loop_statement = 25, RULE_event_loop_statement = 26, 
		RULE_count_loop_statement = 27, RULE_repeatuntil_loop_statement = 28, 
		RULE_function_call = 29, RULE_function_call_parameters = 30;
	public static final String[] ruleNames = {
		"start", "codeblock", "all_possible", "single_all_possible", "afterthought_statement", 
		"function_declaration", "function_declaration_paramaters", "variable_declaration", 
		"literal", "datatype", "variable_instance", "returns_value", "expression", 
		"low_prior", "high_prior", "signint", "top_prior", "assignment_statement", 
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
			setState(62); match(FuncStarter);
			setState(63); match(VoidKeyword);
			setState(64); match(MainKeyword);
			setState(65); match(OpenParenthesis);
			setState(66); match(CloseParenthesis);
			setState(67); match(OpenBrace);
			setState(68); codeblock();
			setState(69); match(CloseBrace);
			setState(70); match(EndOfFile);
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
		enterRule(_localctx, 2, RULE_codeblock);
		try {
			setState(76);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(72); all_possible();
				setState(73); codeblock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(75); all_possible();
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
		enterRule(_localctx, 4, RULE_all_possible);
		try {
			setState(82);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(78); variable_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(79); assignment_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(80); conditional_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(81); function_call();
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
		enterRule(_localctx, 6, RULE_single_all_possible);
		try {
			setState(89);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(84); variable_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(85); assignment_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(86); conditional_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(87); loop_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(88); function_call();
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
		enterRule(_localctx, 8, RULE_afterthought_statement);
		try {
			setState(93);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(91); assignment_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
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
		enterRule(_localctx, 10, RULE_function_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95); match(FuncStarter);
			setState(96); datatype();
			setState(97); match(VarIdentifier);
			setState(98); match(OpenParenthesis);
			setState(99); function_declaration_paramaters();
			setState(100); match(CloseParenthesis);
			setState(101); match(OpenBrace);
			setState(102); codeblock();
			setState(103); match(CloseBrace);
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
		enterRule(_localctx, 12, RULE_function_declaration_paramaters);
		try {
			setState(113);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(105); datatype();
				setState(106); match(VarIdentifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(108); datatype();
				setState(109); match(VarIdentifier);
				setState(110); match(Comma);
				setState(111); function_declaration_paramaters();
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
		enterRule(_localctx, 14, RULE_variable_declaration);
		try {
			setState(127);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(115); match(VarDecStarter);
				setState(116); datatype();
				setState(117); variable_instance();
				setState(118); match(Terminator);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(120); match(VarDecStarter);
				setState(121); datatype();
				setState(122); match(VarIdentifier);
				setState(123); match(AssOp);
				setState(124); returns_value();
				setState(125); match(Terminator);
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
		enterRule(_localctx, 16, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
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
		enterRule(_localctx, 18, RULE_datatype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
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
		enterRule(_localctx, 20, RULE_variable_instance);
		try {
			setState(137);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(133); match(VarIdentifier);
				setState(134); match(Comma);
				setState(135); variable_instance();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(136); match(VarIdentifier);
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
		enterRule(_localctx, 22, RULE_returns_value);
		try {
			setState(144);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(139); literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(140); expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(141); function_call();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(142); match(VarIdentifier);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(143); match(NullKeyword);
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
		enterRule(_localctx, 24, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146); low_prior();
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
		enterRule(_localctx, 26, RULE_low_prior);
		int _la;
		try {
			setState(160);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(149); high_prior();
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AddOp || _la==SubOp) {
					{
					setState(154);
					switch (_input.LA(1)) {
					case AddOp:
						{
						setState(150); match(AddOp);
						setState(151); high_prior();
						}
						break;
					case SubOp:
						{
						setState(152); match(SubOp);
						setState(153); high_prior();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(158);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(159); high_prior();
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
		enterRule(_localctx, 28, RULE_high_prior);
		int _la;
		try {
			setState(175);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(162); signint();
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MulOp) | (1L << DivOp) | (1L << ModOp))) != 0)) {
					{
					setState(169);
					switch (_input.LA(1)) {
					case MulOp:
						{
						setState(163); match(MulOp);
						setState(164); signint();
						}
						break;
					case DivOp:
						{
						setState(165); match(DivOp);
						setState(166); signint();
						}
						break;
					case ModOp:
						{
						setState(167); match(ModOp);
						setState(168); signint();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(173);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(174); signint();
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
		enterRule(_localctx, 30, RULE_signint);
		try {
			setState(180);
			switch (_input.LA(1)) {
			case SubOp:
				enterOuterAlt(_localctx, 1);
				{
				setState(177); match(SubOp);
				setState(178); top_prior();
				}
				break;
			case OpenParenthesis:
			case IntLit:
				enterOuterAlt(_localctx, 2);
				{
				setState(179); top_prior();
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
		enterRule(_localctx, 32, RULE_top_prior);
		try {
			setState(187);
			switch (_input.LA(1)) {
			case IntLit:
				enterOuterAlt(_localctx, 1);
				{
				setState(182); match(IntLit);
				}
				break;
			case OpenParenthesis:
				enterOuterAlt(_localctx, 2);
				{
				setState(183); match(OpenParenthesis);
				setState(184); expression();
				setState(185); match(CloseParenthesis);
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
		enterRule(_localctx, 34, RULE_assignment_statement);
		try {
			setState(198);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(189); match(VarIdentifier);
				setState(190); match(AssOp);
				setState(191); match(VarIdentifier);
				setState(192); match(Terminator);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(193); match(VarIdentifier);
				setState(194); match(AssOp);
				setState(195); returns_value();
				setState(196); match(Terminator);
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
		enterRule(_localctx, 36, RULE_conditional_statement);
		try {
			setState(211);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(200); start_condition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(201); start_condition();
				setState(202); end_condition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(204); start_condition();
				setState(205); continue_condition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(207); start_condition();
				setState(208); continue_condition();
				setState(209); end_condition();
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
		enterRule(_localctx, 38, RULE_start_condition);
		try {
			setState(235);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(213); match(IfKeyword);
				setState(214); match(OpenParenthesis);
				setState(215); condition();
				setState(216); match(CloseParenthesis);
				setState(217); single_all_possible();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(219); match(IfKeyword);
				setState(220); match(OpenParenthesis);
				setState(221); condition();
				setState(222); match(CloseParenthesis);
				setState(223); match(OpenBrace);
				setState(224); single_all_possible();
				setState(225); match(CloseBrace);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(227); match(IfKeyword);
				setState(228); match(OpenParenthesis);
				setState(229); condition();
				setState(230); match(CloseParenthesis);
				setState(231); match(OpenBrace);
				setState(232); codeblock();
				setState(233); match(CloseBrace);
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
		enterRule(_localctx, 40, RULE_end_condition);
		try {
			setState(261);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(237); match(ElseKeyword);
				setState(238); match(OpenParenthesis);
				setState(239); condition();
				setState(240); match(CloseParenthesis);
				setState(241); single_all_possible();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(243); match(ElseKeyword);
				setState(244); match(OpenParenthesis);
				setState(245); condition();
				setState(246); match(CloseParenthesis);
				setState(247); match(OpenBrace);
				setState(248); single_all_possible();
				setState(249); match(CloseBrace);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(251); match(ElseKeyword);
				setState(252); match(OpenParenthesis);
				setState(253); condition();
				setState(254); match(CloseParenthesis);
				setState(255); match(OpenBrace);
				setState(256); codeblock();
				setState(257); match(CloseBrace);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(259); match(ElseKeyword);
				setState(260); single_all_possible();
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
		enterRule(_localctx, 42, RULE_continue_condition);
		try {
			setState(284);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(263); match(ElseIfKeyword);
				setState(264); match(OpenParenthesis);
				setState(265); condition();
				setState(266); match(CloseParenthesis);
				setState(267); single_all_possible();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(269); match(ElseIfKeyword);
				setState(270); match(OpenParenthesis);
				setState(271); condition();
				setState(272); match(CloseParenthesis);
				setState(273); single_all_possible();
				setState(274); match(CloseBrace);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(276); match(ElseIfKeyword);
				setState(277); match(OpenParenthesis);
				setState(278); condition();
				setState(279); match(CloseParenthesis);
				setState(280); match(OpenBrace);
				setState(281); codeblock();
				setState(282); match(CloseBrace);
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
		enterRule(_localctx, 44, RULE_condition);
		try {
			setState(320);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(286); match(VarIdentifier);
				setState(287); comparison();
				setState(288); match(VarIdentifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(290); match(VarIdentifier);
				setState(291); comparison();
				setState(292); expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(294); expression();
				setState(295); comparison();
				setState(296); match(VarIdentifier);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(298); match(OpenParenthesis);
				setState(299); condition();
				setState(300); match(CloseParenthesis);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(302); match(VarIdentifier);
				setState(303); comparison();
				setState(304); match(VarIdentifier);
				setState(305); logical_operator();
				setState(306); condition();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(308); match(VarIdentifier);
				setState(309); comparison();
				setState(310); expression();
				setState(311); logical_operator();
				setState(312); condition();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(314); expression();
				setState(315); comparison();
				setState(316); match(VarIdentifier);
				setState(317); logical_operator();
				setState(318); condition();
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
		enterRule(_localctx, 46, RULE_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
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
		enterRule(_localctx, 48, RULE_logical_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
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
		enterRule(_localctx, 50, RULE_loop_statement);
		try {
			setState(329);
			switch (_input.LA(1)) {
			case EventLoopKeyword:
				enterOuterAlt(_localctx, 1);
				{
				setState(326); event_loop_statement();
				}
				break;
			case CountLoopKeyword:
				enterOuterAlt(_localctx, 2);
				{
				setState(327); count_loop_statement();
				}
				break;
			case RepeatUntilLoopKeyword:
				enterOuterAlt(_localctx, 3);
				{
				setState(328); repeatuntil_loop_statement();
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
		enterRule(_localctx, 52, RULE_event_loop_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331); match(EventLoopKeyword);
			setState(332); match(OpenParenthesis);
			setState(333); condition();
			setState(334); match(CloseParenthesis);
			setState(335); match(OpenBrace);
			setState(336); codeblock();
			setState(337); match(CloseBrace);
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
			setState(363);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(339); match(CountLoopKeyword);
				setState(340); match(OpenParenthesis);
				setState(341); variable_declaration();
				setState(342); match(Terminator);
				setState(343); condition();
				setState(344); match(Terminator);
				setState(345); afterthought_statement();
				setState(346); match(CloseParenthesis);
				setState(347); match(OpenBrace);
				setState(348); codeblock();
				setState(349); match(CloseBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(351); match(CountLoopKeyword);
				setState(352); match(OpenParenthesis);
				setState(353); assignment_statement();
				setState(354); match(Terminator);
				setState(355); condition();
				setState(356); match(Terminator);
				setState(357); afterthought_statement();
				setState(358); match(CloseParenthesis);
				setState(359); match(OpenBrace);
				setState(360); codeblock();
				setState(361); match(CloseBrace);
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
			setState(365); match(RepeatUntilLoopKeyword);
			setState(366); match(OpenBrace);
			setState(367); codeblock();
			setState(368); match(CloseBrace);
			setState(369); match(EventLoopKeyword);
			setState(370); match(OpenParenthesis);
			setState(371); condition();
			setState(372); match(CloseParenthesis);
			setState(373); match(Terminator);
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
		enterRule(_localctx, 58, RULE_function_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375); match(VarIdentifier);
			setState(376); match(OpenParenthesis);
			setState(377); function_call_parameters();
			setState(378); match(CloseParenthesis);
			setState(379); match(Terminator);
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
		enterRule(_localctx, 60, RULE_function_call_parameters);
		try {
			setState(386);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(381); returns_value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(382); returns_value();
				setState(383); match(Comma);
				setState(384); function_call_parameters();
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\61\u0187\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3O\n\3\3\4\3\4"+
		"\3\4\3\4\5\4U\n\4\3\5\3\5\3\5\3\5\3\5\5\5\\\n\5\3\6\3\6\5\6`\n\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b"+
		"t\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0082\n\t\3"+
		"\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\5\f\u008c\n\f\3\r\3\r\3\r\3\r\3\r\5\r"+
		"\u0093\n\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\7\17\u009d\n\17\f\17"+
		"\16\17\u00a0\13\17\3\17\5\17\u00a3\n\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\7\20\u00ac\n\20\f\20\16\20\u00af\13\20\3\20\5\20\u00b2\n\20\3\21"+
		"\3\21\3\21\5\21\u00b7\n\21\3\22\3\22\3\22\3\22\3\22\5\22\u00be\n\22\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00c9\n\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00d6\n\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00ee\n\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\5\26\u0108\n\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\5\27\u011f\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0143\n\30\3\31"+
		"\3\31\3\32\3\32\3\33\3\33\3\33\5\33\u014c\n\33\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35"+
		"\u016e\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \5 \u0185\n \3 \2\2!\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>\2\6\4\2\27\27+.\3\2"+
		"\4\7\3\2\35\"\3\2#$\u0195\2@\3\2\2\2\4N\3\2\2\2\6T\3\2\2\2\b[\3\2\2\2"+
		"\n_\3\2\2\2\fa\3\2\2\2\16s\3\2\2\2\20\u0081\3\2\2\2\22\u0083\3\2\2\2\24"+
		"\u0085\3\2\2\2\26\u008b\3\2\2\2\30\u0092\3\2\2\2\32\u0094\3\2\2\2\34\u00a2"+
		"\3\2\2\2\36\u00b1\3\2\2\2 \u00b6\3\2\2\2\"\u00bd\3\2\2\2$\u00c8\3\2\2"+
		"\2&\u00d5\3\2\2\2(\u00ed\3\2\2\2*\u0107\3\2\2\2,\u011e\3\2\2\2.\u0142"+
		"\3\2\2\2\60\u0144\3\2\2\2\62\u0146\3\2\2\2\64\u014b\3\2\2\2\66\u014d\3"+
		"\2\2\28\u016d\3\2\2\2:\u016f\3\2\2\2<\u0179\3\2\2\2>\u0184\3\2\2\2@A\7"+
		"\n\2\2AB\7\23\2\2BC\7\24\2\2CD\7)\2\2DE\7*\2\2EF\7\'\2\2FG\5\4\3\2GH\7"+
		"(\2\2HI\7\61\2\2I\3\3\2\2\2JK\5\6\4\2KL\5\4\3\2LO\3\2\2\2MO\5\6\4\2NJ"+
		"\3\2\2\2NM\3\2\2\2O\5\3\2\2\2PU\5\20\t\2QU\5$\23\2RU\5&\24\2SU\5<\37\2"+
		"TP\3\2\2\2TQ\3\2\2\2TR\3\2\2\2TS\3\2\2\2U\7\3\2\2\2V\\\5\20\t\2W\\\5$"+
		"\23\2X\\\5&\24\2Y\\\5\64\33\2Z\\\5<\37\2[V\3\2\2\2[W\3\2\2\2[X\3\2\2\2"+
		"[Y\3\2\2\2[Z\3\2\2\2\\\t\3\2\2\2]`\5$\23\2^`\5<\37\2_]\3\2\2\2_^\3\2\2"+
		"\2`\13\3\2\2\2ab\7\n\2\2bc\5\24\13\2cd\7\60\2\2de\7)\2\2ef\5\16\b\2fg"+
		"\7*\2\2gh\7\'\2\2hi\5\4\3\2ij\7(\2\2j\r\3\2\2\2kl\5\24\13\2lm\7\60\2\2"+
		"mt\3\2\2\2no\5\24\13\2op\7\60\2\2pq\7\25\2\2qr\5\16\b\2rt\3\2\2\2sk\3"+
		"\2\2\2sn\3\2\2\2t\17\3\2\2\2uv\7\t\2\2vw\5\24\13\2wx\5\26\f\2xy\7\b\2"+
		"\2y\u0082\3\2\2\2z{\7\t\2\2{|\5\24\13\2|}\7\60\2\2}~\7\f\2\2~\177\5\30"+
		"\r\2\177\u0080\7\b\2\2\u0080\u0082\3\2\2\2\u0081u\3\2\2\2\u0081z\3\2\2"+
		"\2\u0082\21\3\2\2\2\u0083\u0084\t\2\2\2\u0084\23\3\2\2\2\u0085\u0086\t"+
		"\3\2\2\u0086\25\3\2\2\2\u0087\u0088\7\60\2\2\u0088\u0089\7\25\2\2\u0089"+
		"\u008c\5\26\f\2\u008a\u008c\7\60\2\2\u008b\u0087\3\2\2\2\u008b\u008a\3"+
		"\2\2\2\u008c\27\3\2\2\2\u008d\u0093\5\22\n\2\u008e\u0093\5\32\16\2\u008f"+
		"\u0093\5<\37\2\u0090\u0093\7\60\2\2\u0091\u0093\7\26\2\2\u0092\u008d\3"+
		"\2\2\2\u0092\u008e\3\2\2\2\u0092\u008f\3\2\2\2\u0092\u0090\3\2\2\2\u0092"+
		"\u0091\3\2\2\2\u0093\31\3\2\2\2\u0094\u0095\5\34\17\2\u0095\u0096\b\16"+
		"\1\2\u0096\33\3\2\2\2\u0097\u009e\5\36\20\2\u0098\u0099\7\30\2\2\u0099"+
		"\u009d\5\36\20\2\u009a\u009b\7\31\2\2\u009b\u009d\5\36\20\2\u009c\u0098"+
		"\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e"+
		"\u009f\3\2\2\2\u009f\u00a3\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a3\5\36"+
		"\20\2\u00a2\u0097\3\2\2\2\u00a2\u00a1\3\2\2\2\u00a3\35\3\2\2\2\u00a4\u00ad"+
		"\5 \21\2\u00a5\u00a6\7\32\2\2\u00a6\u00ac\5 \21\2\u00a7\u00a8\7\33\2\2"+
		"\u00a8\u00ac\5 \21\2\u00a9\u00aa\7\34\2\2\u00aa\u00ac\5 \21\2\u00ab\u00a5"+
		"\3\2\2\2\u00ab\u00a7\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad"+
		"\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00b2\3\2\2\2\u00af\u00ad\3\2"+
		"\2\2\u00b0\u00b2\5 \21\2\u00b1\u00a4\3\2\2\2\u00b1\u00b0\3\2\2\2\u00b2"+
		"\37\3\2\2\2\u00b3\u00b4\7\31\2\2\u00b4\u00b7\5\"\22\2\u00b5\u00b7\5\""+
		"\22\2\u00b6\u00b3\3\2\2\2\u00b6\u00b5\3\2\2\2\u00b7!\3\2\2\2\u00b8\u00be"+
		"\7+\2\2\u00b9\u00ba\7)\2\2\u00ba\u00bb\5\32\16\2\u00bb\u00bc\7*\2\2\u00bc"+
		"\u00be\3\2\2\2\u00bd\u00b8\3\2\2\2\u00bd\u00b9\3\2\2\2\u00be#\3\2\2\2"+
		"\u00bf\u00c0\7\60\2\2\u00c0\u00c1\7\f\2\2\u00c1\u00c2\7\60\2\2\u00c2\u00c9"+
		"\7\b\2\2\u00c3\u00c4\7\60\2\2\u00c4\u00c5\7\f\2\2\u00c5\u00c6\5\30\r\2"+
		"\u00c6\u00c7\7\b\2\2\u00c7\u00c9\3\2\2\2\u00c8\u00bf\3\2\2\2\u00c8\u00c3"+
		"\3\2\2\2\u00c9%\3\2\2\2\u00ca\u00d6\5(\25\2\u00cb\u00cc\5(\25\2\u00cc"+
		"\u00cd\5*\26\2\u00cd\u00d6\3\2\2\2\u00ce\u00cf\5(\25\2\u00cf\u00d0\5,"+
		"\27\2\u00d0\u00d6\3\2\2\2\u00d1\u00d2\5(\25\2\u00d2\u00d3\5,\27\2\u00d3"+
		"\u00d4\5*\26\2\u00d4\u00d6\3\2\2\2\u00d5\u00ca\3\2\2\2\u00d5\u00cb\3\2"+
		"\2\2\u00d5\u00ce\3\2\2\2\u00d5\u00d1\3\2\2\2\u00d6\'\3\2\2\2\u00d7\u00d8"+
		"\7\r\2\2\u00d8\u00d9\7)\2\2\u00d9\u00da\5.\30\2\u00da\u00db\7*\2\2\u00db"+
		"\u00dc\5\b\5\2\u00dc\u00ee\3\2\2\2\u00dd\u00de\7\r\2\2\u00de\u00df\7)"+
		"\2\2\u00df\u00e0\5.\30\2\u00e0\u00e1\7*\2\2\u00e1\u00e2\7\'\2\2\u00e2"+
		"\u00e3\5\b\5\2\u00e3\u00e4\7(\2\2\u00e4\u00ee\3\2\2\2\u00e5\u00e6\7\r"+
		"\2\2\u00e6\u00e7\7)\2\2\u00e7\u00e8\5.\30\2\u00e8\u00e9\7*\2\2\u00e9\u00ea"+
		"\7\'\2\2\u00ea\u00eb\5\4\3\2\u00eb\u00ec\7(\2\2\u00ec\u00ee\3\2\2\2\u00ed"+
		"\u00d7\3\2\2\2\u00ed\u00dd\3\2\2\2\u00ed\u00e5\3\2\2\2\u00ee)\3\2\2\2"+
		"\u00ef\u00f0\7\16\2\2\u00f0\u00f1\7)\2\2\u00f1\u00f2\5.\30\2\u00f2\u00f3"+
		"\7*\2\2\u00f3\u00f4\5\b\5\2\u00f4\u0108\3\2\2\2\u00f5\u00f6\7\16\2\2\u00f6"+
		"\u00f7\7)\2\2\u00f7\u00f8\5.\30\2\u00f8\u00f9\7*\2\2\u00f9\u00fa\7\'\2"+
		"\2\u00fa\u00fb\5\b\5\2\u00fb\u00fc\7(\2\2\u00fc\u0108\3\2\2\2\u00fd\u00fe"+
		"\7\16\2\2\u00fe\u00ff\7)\2\2\u00ff\u0100\5.\30\2\u0100\u0101\7*\2\2\u0101"+
		"\u0102\7\'\2\2\u0102\u0103\5\4\3\2\u0103\u0104\7(\2\2\u0104\u0108\3\2"+
		"\2\2\u0105\u0106\7\16\2\2\u0106\u0108\5\b\5\2\u0107\u00ef\3\2\2\2\u0107"+
		"\u00f5\3\2\2\2\u0107\u00fd\3\2\2\2\u0107\u0105\3\2\2\2\u0108+\3\2\2\2"+
		"\u0109\u010a\7\17\2\2\u010a\u010b\7)\2\2\u010b\u010c\5.\30\2\u010c\u010d"+
		"\7*\2\2\u010d\u010e\5\b\5\2\u010e\u011f\3\2\2\2\u010f\u0110\7\17\2\2\u0110"+
		"\u0111\7)\2\2\u0111\u0112\5.\30\2\u0112\u0113\7*\2\2\u0113\u0114\5\b\5"+
		"\2\u0114\u0115\7(\2\2\u0115\u011f\3\2\2\2\u0116\u0117\7\17\2\2\u0117\u0118"+
		"\7)\2\2\u0118\u0119\5.\30\2\u0119\u011a\7*\2\2\u011a\u011b\7\'\2\2\u011b"+
		"\u011c\5\4\3\2\u011c\u011d\7(\2\2\u011d\u011f\3\2\2\2\u011e\u0109\3\2"+
		"\2\2\u011e\u010f\3\2\2\2\u011e\u0116\3\2\2\2\u011f-\3\2\2\2\u0120\u0121"+
		"\7\60\2\2\u0121\u0122\5\60\31\2\u0122\u0123\7\60\2\2\u0123\u0143\3\2\2"+
		"\2\u0124\u0125\7\60\2\2\u0125\u0126\5\60\31\2\u0126\u0127\5\32\16\2\u0127"+
		"\u0143\3\2\2\2\u0128\u0129\5\32\16\2\u0129\u012a\5\60\31\2\u012a\u012b"+
		"\7\60\2\2\u012b\u0143\3\2\2\2\u012c\u012d\7)\2\2\u012d\u012e\5.\30\2\u012e"+
		"\u012f\7*\2\2\u012f\u0143\3\2\2\2\u0130\u0131\7\60\2\2\u0131\u0132\5\60"+
		"\31\2\u0132\u0133\7\60\2\2\u0133\u0134\5\62\32\2\u0134\u0135\5.\30\2\u0135"+
		"\u0143\3\2\2\2\u0136\u0137\7\60\2\2\u0137\u0138\5\60\31\2\u0138\u0139"+
		"\5\32\16\2\u0139\u013a\5\62\32\2\u013a\u013b\5.\30\2\u013b\u0143\3\2\2"+
		"\2\u013c\u013d\5\32\16\2\u013d\u013e\5\60\31\2\u013e\u013f\7\60\2\2\u013f"+
		"\u0140\5\62\32\2\u0140\u0141\5.\30\2\u0141\u0143\3\2\2\2\u0142\u0120\3"+
		"\2\2\2\u0142\u0124\3\2\2\2\u0142\u0128\3\2\2\2\u0142\u012c\3\2\2\2\u0142"+
		"\u0130\3\2\2\2\u0142\u0136\3\2\2\2\u0142\u013c\3\2\2\2\u0143/\3\2\2\2"+
		"\u0144\u0145\t\4\2\2\u0145\61\3\2\2\2\u0146\u0147\t\5\2\2\u0147\63\3\2"+
		"\2\2\u0148\u014c\5\66\34\2\u0149\u014c\58\35\2\u014a\u014c\5:\36\2\u014b"+
		"\u0148\3\2\2\2\u014b\u0149\3\2\2\2\u014b\u014a\3\2\2\2\u014c\65\3\2\2"+
		"\2\u014d\u014e\7\20\2\2\u014e\u014f\7)\2\2\u014f\u0150\5.\30\2\u0150\u0151"+
		"\7*\2\2\u0151\u0152\7\'\2\2\u0152\u0153\5\4\3\2\u0153\u0154\7(\2\2\u0154"+
		"\67\3\2\2\2\u0155\u0156\7\21\2\2\u0156\u0157\7)\2\2\u0157\u0158\5\20\t"+
		"\2\u0158\u0159\7\b\2\2\u0159\u015a\5.\30\2\u015a\u015b\7\b\2\2\u015b\u015c"+
		"\5\n\6\2\u015c\u015d\7*\2\2\u015d\u015e\7\'\2\2\u015e\u015f\5\4\3\2\u015f"+
		"\u0160\7(\2\2\u0160\u016e\3\2\2\2\u0161\u0162\7\21\2\2\u0162\u0163\7)"+
		"\2\2\u0163\u0164\5$\23\2\u0164\u0165\7\b\2\2\u0165\u0166\5.\30\2\u0166"+
		"\u0167\7\b\2\2\u0167\u0168\5\n\6\2\u0168\u0169\7*\2\2\u0169\u016a\7\'"+
		"\2\2\u016a\u016b\5\4\3\2\u016b\u016c\7(\2\2\u016c\u016e\3\2\2\2\u016d"+
		"\u0155\3\2\2\2\u016d\u0161\3\2\2\2\u016e9\3\2\2\2\u016f\u0170\7\22\2\2"+
		"\u0170\u0171\7\'\2\2\u0171\u0172\5\4\3\2\u0172\u0173\7(\2\2\u0173\u0174"+
		"\7\20\2\2\u0174\u0175\7)\2\2\u0175\u0176\5.\30\2\u0176\u0177\7*\2\2\u0177"+
		"\u0178\7\b\2\2\u0178;\3\2\2\2\u0179\u017a\7\60\2\2\u017a\u017b\7)\2\2"+
		"\u017b\u017c\5> \2\u017c\u017d\7*\2\2\u017d\u017e\7\b\2\2\u017e=\3\2\2"+
		"\2\u017f\u0185\5\30\r\2\u0180\u0181\5\30\r\2\u0181\u0182\7\25\2\2\u0182"+
		"\u0183\5> \2\u0183\u0185\3\2\2\2\u0184\u017f\3\2\2\2\u0184\u0180\3\2\2"+
		"\2\u0185?\3\2\2\2\33NT[_s\u0081\u008b\u0092\u009c\u009e\u00a2\u00ab\u00ad"+
		"\u00b1\u00b6\u00bd\u00c8\u00d5\u00ed\u0107\u011e\u0142\u014b\u016d\u0184";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}