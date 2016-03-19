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
		Spc=6, Terminator=7, VarDecStarter=8, FuncStarter=9, ConstantStarter=10, 
		AssOp=11, IfKeyword=12, ElseKeyword=13, ElseIfKeyword=14, EventLoopKeyword=15, 
		CountLoopKeyword=16, RepeatUntilLoopKeyword=17, VoidKeyword=18, MainKeyword=19, 
		Comma=20, NullKeyword=21, BoolLit=22, AddOp=23, SubOp=24, MulOp=25, DivOp=26, 
		ModOp=27, EquaOp=28, GreaterThanOp=29, LessThanOp=30, GreaterThanEqualTo=31, 
		LessThanEqualTo=32, NotEqualToOp=33, AndOp=34, OrOp=35, IncrementOp=36, 
		DecrementOp=37, OpenBrace=38, CloseBrace=39, OpenParenthesis=40, CloseParenthesis=41, 
		ExprEnd=42;
	public static final String[] tokenNames = {
		"<INVALID>", "WS", "'int'", "'char'", "'boolean'", "'string'", "' '", 
		"'wow'", "'such'", "'much'", "'very'", "'as'", "'rily'", "'but'", "'but rily'", 
		"EventLoopKeyword", "CountLoopKeyword", "RepeatUntilLoopKeyword", "'void'", 
		"'main'", "','", "'null'", "BoolLit", "'+'", "'-'", "'*'", "'/'", "'%'", 
		"'is'", "'>'", "'<'", "'>='", "'<='", "'!='", "'and'", "'or'", "'++'", 
		"'--'", "'{'", "'}'", "'('", "')'", "'$'"
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
		public TerminalNode FuncStarter() { return getToken(DogeScriptParser.FuncStarter, 0); }
		public TerminalNode VoidKeyword() { return getToken(DogeScriptParser.VoidKeyword, 0); }
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3,\b\4\2\t\2\3\2\3"+
		"\2\3\2\3\2\2\2\3\2\2\2\6\2\4\3\2\2\2\4\5\7\13\2\2\5\6\7\24\2\2\6\3\3\2"+
		"\2\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}