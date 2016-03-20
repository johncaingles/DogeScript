// Generated from Expression.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExpressionParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, IntLit=2, AddOp=3, SubOp=4, MulOp=5, DivOp=6, ModOp=7, OpenOp=8, 
		CloseOp=9, ExprEnd=10;
	public static final String[] tokenNames = {
		"<INVALID>", "WS", "IntLit", "'+'", "'-'", "'*'", "'/'", "'%'", "'('", 
		"')'", "'$'"
	};
	public static final int
		RULE_start = 0, RULE_expr = 1, RULE_lowPrior = 2, RULE_highPrior = 3, 
		RULE_signInt = 4, RULE_topPrior = 5;
	public static final String[] ruleNames = {
		"start", "expr", "lowPrior", "highPrior", "signInt", "topPrior"
	};

	@Override
	public String getGrammarFileName() { return "Expression.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExpressionParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public int res;
		public ExprContext result;
		public TerminalNode ExprEnd() { return getToken(ExpressionParser.ExprEnd, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12); ((StartContext)_localctx).result = expr();
			((StartContext)_localctx).res =  ((StartContext)_localctx).result.res;
			setState(14); match(ExprEnd);
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
		public int res;
		public LowPriorContext e;
		public LowPriorContext lowPrior() {
			return getRuleContext(LowPriorContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16); ((ExprContext)_localctx).e = lowPrior();
			((ExprContext)_localctx).res =  ((ExprContext)_localctx).e.res;
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

	public static class LowPriorContext extends ParserRuleContext {
		public int res;
		public HighPriorContext lp;
		public HighPriorContext temp;
		public TerminalNode SubOp(int i) {
			return getToken(ExpressionParser.SubOp, i);
		}
		public HighPriorContext highPrior(int i) {
			return getRuleContext(HighPriorContext.class,i);
		}
		public List<HighPriorContext> highPrior() {
			return getRuleContexts(HighPriorContext.class);
		}
		public List<TerminalNode> AddOp() { return getTokens(ExpressionParser.AddOp); }
		public TerminalNode AddOp(int i) {
			return getToken(ExpressionParser.AddOp, i);
		}
		public List<TerminalNode> SubOp() { return getTokens(ExpressionParser.SubOp); }
		public LowPriorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lowPrior; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterLowPrior(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitLowPrior(this);
		}
	}

	public final LowPriorContext lowPrior() throws RecognitionException {
		LowPriorContext _localctx = new LowPriorContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_lowPrior);
		int _la;
		try {
			setState(37);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(19); ((LowPriorContext)_localctx).lp = highPrior();
				((LowPriorContext)_localctx).res =  ((LowPriorContext)_localctx).lp.res;
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AddOp || _la==SubOp) {
					{
					setState(29);
					switch (_input.LA(1)) {
					case AddOp:
						{
						setState(21); match(AddOp);
						setState(22); ((LowPriorContext)_localctx).temp = highPrior();
						_localctx.res += ((LowPriorContext)_localctx).temp.res;
						}
						break;
					case SubOp:
						{
						setState(25); match(SubOp);
						setState(26); ((LowPriorContext)_localctx).temp = highPrior();
						_localctx.res -= ((LowPriorContext)_localctx).temp.res;
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(33);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(34); ((LowPriorContext)_localctx).lp = highPrior();
				((LowPriorContext)_localctx).res =  ((LowPriorContext)_localctx).lp.res;
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

	public static class HighPriorContext extends ParserRuleContext {
		public int res;
		public SignIntContext hp;
		public SignIntContext temp;
		public TerminalNode ModOp(int i) {
			return getToken(ExpressionParser.ModOp, i);
		}
		public List<TerminalNode> MulOp() { return getTokens(ExpressionParser.MulOp); }
		public List<TerminalNode> DivOp() { return getTokens(ExpressionParser.DivOp); }
		public TerminalNode MulOp(int i) {
			return getToken(ExpressionParser.MulOp, i);
		}
		public TerminalNode DivOp(int i) {
			return getToken(ExpressionParser.DivOp, i);
		}
		public SignIntContext signInt(int i) {
			return getRuleContext(SignIntContext.class,i);
		}
		public List<TerminalNode> ModOp() { return getTokens(ExpressionParser.ModOp); }
		public List<SignIntContext> signInt() {
			return getRuleContexts(SignIntContext.class);
		}
		public HighPriorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_highPrior; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterHighPrior(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitHighPrior(this);
		}
	}

	public final HighPriorContext highPrior() throws RecognitionException {
		HighPriorContext _localctx = new HighPriorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_highPrior);
		int _la;
		try {
			setState(61);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(39); ((HighPriorContext)_localctx).hp = signInt();
				((HighPriorContext)_localctx).res =  ((HighPriorContext)_localctx).hp.res;
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MulOp) | (1L << DivOp) | (1L << ModOp))) != 0)) {
					{
					setState(53);
					switch (_input.LA(1)) {
					case MulOp:
						{
						setState(41); match(MulOp);
						setState(42); ((HighPriorContext)_localctx).temp = signInt();
						_localctx.res *= ((HighPriorContext)_localctx).temp.res;
						}
						break;
					case DivOp:
						{
						setState(45); match(DivOp);
						setState(46); ((HighPriorContext)_localctx).temp = signInt();
						_localctx.res /= ((HighPriorContext)_localctx).temp.res;
						}
						break;
					case ModOp:
						{
						setState(49); match(ModOp);
						setState(50); ((HighPriorContext)_localctx).temp = signInt();
						_localctx.res %= ((HighPriorContext)_localctx).temp.res;
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(57);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(58); ((HighPriorContext)_localctx).hp = signInt();
				((HighPriorContext)_localctx).res =  ((HighPriorContext)_localctx).hp.res;
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

	public static class SignIntContext extends ParserRuleContext {
		public int res;
		public TopPriorContext temp;
		public TopPriorContext topPrior() {
			return getRuleContext(TopPriorContext.class,0);
		}
		public SignIntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signInt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterSignInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitSignInt(this);
		}
	}

	public final SignIntContext signInt() throws RecognitionException {
		SignIntContext _localctx = new SignIntContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_signInt);
		try {
			setState(72);
			switch (_input.LA(1)) {
			case SubOp:
				enterOuterAlt(_localctx, 1);
				{
				setState(63); match(SubOp);
				setState(64); ((SignIntContext)_localctx).temp = topPrior();
				((SignIntContext)_localctx).res =  ((SignIntContext)_localctx).temp.res *-1;
				System.out.println("signed(-): " + _localctx.res);
				}
				break;
			case IntLit:
			case OpenOp:
				enterOuterAlt(_localctx, 2);
				{
				setState(68); ((SignIntContext)_localctx).temp = topPrior();
				((SignIntContext)_localctx).res =  ((SignIntContext)_localctx).temp.res;
				System.out.println("unsigned: " + _localctx.res);
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

	public static class TopPriorContext extends ParserRuleContext {
		public int res;
		public Token r;
		public ExprContext rec;
		public TerminalNode CloseOp() { return getToken(ExpressionParser.CloseOp, 0); }
		public TerminalNode OpenOp() { return getToken(ExpressionParser.OpenOp, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode IntLit() { return getToken(ExpressionParser.IntLit, 0); }
		public TopPriorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topPrior; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterTopPrior(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitTopPrior(this);
		}
	}

	public final TopPriorContext topPrior() throws RecognitionException {
		TopPriorContext _localctx = new TopPriorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_topPrior);
		try {
			setState(82);
			switch (_input.LA(1)) {
			case IntLit:
				enterOuterAlt(_localctx, 1);
				{
				setState(74); ((TopPriorContext)_localctx).r = match(IntLit);
				((TopPriorContext)_localctx).res =  Integer.parseInt((((TopPriorContext)_localctx).r!=null?((TopPriorContext)_localctx).r.getText():null));
				System.out.println("returned from bottom: " + _localctx.res);
				}
				break;
			case OpenOp:
				enterOuterAlt(_localctx, 2);
				{
				setState(77); match(OpenOp);
				setState(78); ((TopPriorContext)_localctx).rec = expr();
				setState(79); match(CloseOp);
				((TopPriorContext)_localctx).res =  ((TopPriorContext)_localctx).rec.res;
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\fW\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4 \n\4\f\4\16\4#\13\4\3\4\3\4\3\4\5"+
		"\4(\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\58\n"+
		"\5\f\5\16\5;\13\5\3\5\3\5\3\5\5\5@\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\5\6K\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7U\n\7\3\7\2\2\b\2\4\6"+
		"\b\n\f\2\2Y\2\16\3\2\2\2\4\22\3\2\2\2\6\'\3\2\2\2\b?\3\2\2\2\nJ\3\2\2"+
		"\2\fT\3\2\2\2\16\17\5\4\3\2\17\20\b\2\1\2\20\21\7\f\2\2\21\3\3\2\2\2\22"+
		"\23\5\6\4\2\23\24\b\3\1\2\24\5\3\2\2\2\25\26\5\b\5\2\26!\b\4\1\2\27\30"+
		"\7\5\2\2\30\31\5\b\5\2\31\32\b\4\1\2\32 \3\2\2\2\33\34\7\6\2\2\34\35\5"+
		"\b\5\2\35\36\b\4\1\2\36 \3\2\2\2\37\27\3\2\2\2\37\33\3\2\2\2 #\3\2\2\2"+
		"!\37\3\2\2\2!\"\3\2\2\2\"(\3\2\2\2#!\3\2\2\2$%\5\b\5\2%&\b\4\1\2&(\3\2"+
		"\2\2\'\25\3\2\2\2\'$\3\2\2\2(\7\3\2\2\2)*\5\n\6\2*9\b\5\1\2+,\7\7\2\2"+
		",-\5\n\6\2-.\b\5\1\2.8\3\2\2\2/\60\7\b\2\2\60\61\5\n\6\2\61\62\b\5\1\2"+
		"\628\3\2\2\2\63\64\7\t\2\2\64\65\5\n\6\2\65\66\b\5\1\2\668\3\2\2\2\67"+
		"+\3\2\2\2\67/\3\2\2\2\67\63\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:@"+
		"\3\2\2\2;9\3\2\2\2<=\5\n\6\2=>\b\5\1\2>@\3\2\2\2?)\3\2\2\2?<\3\2\2\2@"+
		"\t\3\2\2\2AB\7\6\2\2BC\5\f\7\2CD\b\6\1\2DE\b\6\1\2EK\3\2\2\2FG\5\f\7\2"+
		"GH\b\6\1\2HI\b\6\1\2IK\3\2\2\2JA\3\2\2\2JF\3\2\2\2K\13\3\2\2\2LM\7\4\2"+
		"\2MN\b\7\1\2NU\b\7\1\2OP\7\n\2\2PQ\5\4\3\2QR\7\13\2\2RS\b\7\1\2SU\3\2"+
		"\2\2TL\3\2\2\2TO\3\2\2\2U\r\3\2\2\2\n\37!\'\679?JT";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}