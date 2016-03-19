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
		CODEBLOCK=1, ALL_POSSIBLE=2, SINGLE_ALL_POSSIBLE=3, AFTERTHOUGHT_STATEMENT=4, 
		FUNCTION_DECLARATION=5, FUNCTION_DECLARATION_PARAMETERS=6, VARIABLE_DECLARATION=7, 
		LITERAL=8, DATATYPE=9, VARIABLE_INSTANCE=10, RETURNS_VALUE=11, EXPRESSION=12, 
		LOWPRIOR=13, HIGHPRIOR=14, SIGNINT=15, TOPPRIOR=16, ASSIGNMENT_STATEMENT=17, 
		CONDITIONAL_STATEMENT=18, START_CONDITION=19, END_CONDITION=20, CONTINUE_CONDITION=21, 
		CONDITION=22, COMPARISON=23, LOGICAL_OPERATOR=24, LOOP_STATEMENT=25, EVENT_LOOP_STATEMENT=26, 
		COUNT_LOOP_STATEMENT=27, REPEATUNTIL_LOOP_STATEMENT=28, FUNCTION_CALL=29, 
		FUNCTION_CALL_PARAMETERS=30, WS=31, IntDataType=32, CharDataType=33, BoolDataType=34, 
		StringDataType=35, Terminator=36, VarDecStarter=37, FuncStarter=38, ConstantStarter=39, 
		AssOp=40, IfKeyword=41, ElseKeyword=42, ElseIfKeyword=43, EventLoopKeyword=44, 
		CountLoopKeyword=45, RepeatUntilLoopKeyword=46, VoidKeyword=47, MainKeyword=48, 
		Comma=49, NullKeyword=50, BoolLit=51, AddOp=52, SubOp=53, MulOp=54, DivOp=55, 
		ModOp=56, EquaOp=57, GreaterThanOp=58, LessThanOp=59, GreaterThanEqualTo=60, 
		LessThanEqualTo=61, NotEqualToOp=62, AndOp=63, OrOp=64, IncrementOp=65, 
		DecrementOp=66, OpenBrace=67, CloseBrace=68, OpenParenthesis=69, CloseParenthesis=70, 
		IntLit=71, FloatLit=72, Array=73, VarIdentifier=74, EndOfFile=75;
	public static final String[] tokenNames = {
		"<INVALID>", "CODEBLOCK", "ALL_POSSIBLE", "SINGLE_ALL_POSSIBLE", "AFTERTHOUGHT_STATEMENT", 
		"FUNCTION_DECLARATION", "FUNCTION_DECLARATION_PARAMETERS", "VARIABLE_DECLARATION", 
		"LITERAL", "DATATYPE", "VARIABLE_INSTANCE", "RETURNS_VALUE", "EXPRESSION", 
		"LOWPRIOR", "HIGHPRIOR", "SIGNINT", "TOPPRIOR", "ASSIGNMENT_STATEMENT", 
		"CONDITIONAL_STATEMENT", "START_CONDITION", "END_CONDITION", "CONTINUE_CONDITION", 
		"CONDITION", "COMPARISON", "LOGICAL_OPERATOR", "LOOP_STATEMENT", "EVENT_LOOP_STATEMENT", 
		"COUNT_LOOP_STATEMENT", "REPEATUNTIL_LOOP_STATEMENT", "FUNCTION_CALL", 
		"FUNCTION_CALL_PARAMETERS", "WS", "'int'", "'char'", "'boolean'", "'string'", 
		"'wow'", "'such'", "'much'", "'very'", "'as'", "'rily'", "'but'", "'but rily'", 
		"EventLoopKeyword", "CountLoopKeyword", "RepeatUntilLoopKeyword", "'void'", 
		"'main'", "','", "'null'", "BoolLit", "'+'", "'-'", "'*'", "'/'", "'%'", 
		"'is'", "'>'", "'<'", "'>='", "'<='", "'!='", "'and'", "'or'", "'++'", 
		"'--'", "'{'", "'}'", "'('", "')'", "IntLit", "FloatLit", "Array", "VarIdentifier", 
		"'$'"
	};
	public static final int
		RULE_start = 0;
	public static final String[] ruleNames = {
		"start"
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
		public TerminalNode DATATYPE() { return getToken(DogeScriptParser.DATATYPE, 0); }
		public TerminalNode CloseParenthesis() { return getToken(DogeScriptParser.CloseParenthesis, 0); }
		public TerminalNode VarDecStarter() { return getToken(DogeScriptParser.VarDecStarter, 0); }
		public TerminalNode FuncStarter() { return getToken(DogeScriptParser.FuncStarter, 0); }
		public TerminalNode VoidKeyword() { return getToken(DogeScriptParser.VoidKeyword, 0); }
		public TerminalNode MainKeyword() { return getToken(DogeScriptParser.MainKeyword, 0); }
		public TerminalNode OpenBrace() { return getToken(DogeScriptParser.OpenBrace, 0); }
		public TerminalNode Terminator() { return getToken(DogeScriptParser.Terminator, 0); }
		public TerminalNode VarIdentifier() { return getToken(DogeScriptParser.VarIdentifier, 0); }
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
			setState(2); match(FuncStarter);
			setState(3); match(VoidKeyword);
			setState(4); match(MainKeyword);
			setState(5); match(OpenParenthesis);
			setState(6); match(CloseParenthesis);
			setState(7); match(OpenBrace);
			setState(8); match(VarDecStarter);
			setState(9); match(DATATYPE);
			setState(10); match(VarIdentifier);
			setState(11); match(Terminator);
			setState(12); match(CloseBrace);
			setState(13); match(EndOfFile);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3M\22\4\2\t\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\2\2\3\2\2\2\20\2\4"+
		"\3\2\2\2\4\5\7(\2\2\5\6\7\61\2\2\6\7\7\62\2\2\7\b\7G\2\2\b\t\7H\2\2\t"+
		"\n\7E\2\2\n\13\7\'\2\2\13\f\7\13\2\2\f\r\7L\2\2\r\16\7&\2\2\16\17\7F\2"+
		"\2\17\20\7M\2\2\20\3\3\2\2\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}