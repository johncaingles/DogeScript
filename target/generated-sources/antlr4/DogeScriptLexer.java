// Generated from DogeScript.g4 by ANTLR 4.4
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DogeScriptLexer extends Lexer {
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'", "'\"'", "'#'", "'$'", "'%'", "'&'", "'''", 
		"'('", "')'", "'*'"
	};
	public static final String[] ruleNames = {
		"WS", "IntDataType", "CharDataType", "BoolDataType", "StringDataType", 
		"Spc", "Terminator", "VarDecStarter", "FuncStarter", "ConstantStarter", 
		"AssOp", "IfKeyword", "ElseKeyword", "ElseIfKeyword", "EventLoopKeyword", 
		"CountLoopKeyword", "RepeatUntilLoopKeyword", "VoidKeyword", "MainKeyword", 
		"Comma", "NullKeyword", "BoolLit", "AddOp", "SubOp", "MulOp", "DivOp", 
		"ModOp", "EquaOp", "GreaterThanOp", "LessThanOp", "GreaterThanEqualTo", 
		"LessThanEqualTo", "NotEqualToOp", "AndOp", "OrOp", "IncrementOp", "DecrementOp", 
		"OpenBrace", "CloseBrace", "OpenParenthesis", "CloseParenthesis", "ExprEnd"
	};


	public DogeScriptLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "DogeScript.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2,\u00f5\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\6\2Y\n\2\r\2\16\2Z\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3"+
		"\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3"+
		"\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\5\27\u00c3"+
		"\n\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35"+
		"\3\36\3\36\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3"+
		"$\3%\3%\3%\3&\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\2\2,\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
		"%I&K\'M(O)Q*S+U,\3\2\3\5\2\13\f\17\17\"\"\u00f6\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\3X\3\2\2\2\5"+
		"^\3\2\2\2\7b\3\2\2\2\tg\3\2\2\2\13o\3\2\2\2\rv\3\2\2\2\17x\3\2\2\2\21"+
		"|\3\2\2\2\23\u0081\3\2\2\2\25\u0086\3\2\2\2\27\u008b\3\2\2\2\31\u008e"+
		"\3\2\2\2\33\u0093\3\2\2\2\35\u0097\3\2\2\2\37\u00a0\3\2\2\2!\u00a4\3\2"+
		"\2\2#\u00a8\3\2\2\2%\u00ac\3\2\2\2\'\u00b1\3\2\2\2)\u00b6\3\2\2\2+\u00b8"+
		"\3\2\2\2-\u00c2\3\2\2\2/\u00c4\3\2\2\2\61\u00c6\3\2\2\2\63\u00c8\3\2\2"+
		"\2\65\u00ca\3\2\2\2\67\u00cc\3\2\2\29\u00ce\3\2\2\2;\u00d1\3\2\2\2=\u00d3"+
		"\3\2\2\2?\u00d5\3\2\2\2A\u00d8\3\2\2\2C\u00db\3\2\2\2E\u00de\3\2\2\2G"+
		"\u00e2\3\2\2\2I\u00e5\3\2\2\2K\u00e8\3\2\2\2M\u00eb\3\2\2\2O\u00ed\3\2"+
		"\2\2Q\u00ef\3\2\2\2S\u00f1\3\2\2\2U\u00f3\3\2\2\2WY\t\2\2\2XW\3\2\2\2"+
		"YZ\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\\\3\2\2\2\\]\b\2\2\2]\4\3\2\2\2^_\7k\2"+
		"\2_`\7p\2\2`a\7v\2\2a\6\3\2\2\2bc\7e\2\2cd\7j\2\2de\7c\2\2ef\7t\2\2f\b"+
		"\3\2\2\2gh\7d\2\2hi\7q\2\2ij\7q\2\2jk\7n\2\2kl\7g\2\2lm\7c\2\2mn\7p\2"+
		"\2n\n\3\2\2\2op\7u\2\2pq\7v\2\2qr\7t\2\2rs\7k\2\2st\7p\2\2tu\7i\2\2u\f"+
		"\3\2\2\2vw\7\"\2\2w\16\3\2\2\2xy\7y\2\2yz\7q\2\2z{\7y\2\2{\20\3\2\2\2"+
		"|}\7u\2\2}~\7w\2\2~\177\7e\2\2\177\u0080\7j\2\2\u0080\22\3\2\2\2\u0081"+
		"\u0082\7o\2\2\u0082\u0083\7w\2\2\u0083\u0084\7e\2\2\u0084\u0085\7j\2\2"+
		"\u0085\24\3\2\2\2\u0086\u0087\7x\2\2\u0087\u0088\7g\2\2\u0088\u0089\7"+
		"t\2\2\u0089\u008a\7{\2\2\u008a\26\3\2\2\2\u008b\u008c\7c\2\2\u008c\u008d"+
		"\7u\2\2\u008d\30\3\2\2\2\u008e\u008f\7t\2\2\u008f\u0090\7k\2\2\u0090\u0091"+
		"\7n\2\2\u0091\u0092\7{\2\2\u0092\32\3\2\2\2\u0093\u0094\7d\2\2\u0094\u0095"+
		"\7w\2\2\u0095\u0096\7v\2\2\u0096\34\3\2\2\2\u0097\u0098\7d\2\2\u0098\u0099"+
		"\7w\2\2\u0099\u009a\7v\2\2\u009a\u009b\7\"\2\2\u009b\u009c\7t\2\2\u009c"+
		"\u009d\7k\2\2\u009d\u009e\7n\2\2\u009e\u009f\7{\2\2\u009f\36\3\2\2\2\u00a0"+
		"\u00a1\7u\2\2\u00a1\u00a2\7g\2\2\u00a2\u00a3\7z\2\2\u00a3 \3\2\2\2\u00a4"+
		"\u00a5\7u\2\2\u00a5\u00a6\7g\2\2\u00a6\u00a7\7z\2\2\u00a7\"\3\2\2\2\u00a8"+
		"\u00a9\7u\2\2\u00a9\u00aa\7g\2\2\u00aa\u00ab\7z\2\2\u00ab$\3\2\2\2\u00ac"+
		"\u00ad\7x\2\2\u00ad\u00ae\7q\2\2\u00ae\u00af\7k\2\2\u00af\u00b0\7f\2\2"+
		"\u00b0&\3\2\2\2\u00b1\u00b2\7o\2\2\u00b2\u00b3\7c\2\2\u00b3\u00b4\7k\2"+
		"\2\u00b4\u00b5\7p\2\2\u00b5(\3\2\2\2\u00b6\u00b7\7.\2\2\u00b7*\3\2\2\2"+
		"\u00b8\u00b9\7p\2\2\u00b9\u00ba\7w\2\2\u00ba\u00bb\7n\2\2\u00bb\u00bc"+
		"\7n\2\2\u00bc,\3\2\2\2\u00bd\u00be\7{\2\2\u00be\u00bf\7k\2\2\u00bf\u00c3"+
		"\7|\2\2\u00c0\u00c1\7p\2\2\u00c1\u00c3\7w\2\2\u00c2\u00bd\3\2\2\2\u00c2"+
		"\u00c0\3\2\2\2\u00c3.\3\2\2\2\u00c4\u00c5\7-\2\2\u00c5\60\3\2\2\2\u00c6"+
		"\u00c7\7/\2\2\u00c7\62\3\2\2\2\u00c8\u00c9\7,\2\2\u00c9\64\3\2\2\2\u00ca"+
		"\u00cb\7\61\2\2\u00cb\66\3\2\2\2\u00cc\u00cd\7\'\2\2\u00cd8\3\2\2\2\u00ce"+
		"\u00cf\7k\2\2\u00cf\u00d0\7u\2\2\u00d0:\3\2\2\2\u00d1\u00d2\7@\2\2\u00d2"+
		"<\3\2\2\2\u00d3\u00d4\7>\2\2\u00d4>\3\2\2\2\u00d5\u00d6\7@\2\2\u00d6\u00d7"+
		"\7?\2\2\u00d7@\3\2\2\2\u00d8\u00d9\7>\2\2\u00d9\u00da\7?\2\2\u00daB\3"+
		"\2\2\2\u00db\u00dc\7#\2\2\u00dc\u00dd\7?\2\2\u00ddD\3\2\2\2\u00de\u00df"+
		"\7c\2\2\u00df\u00e0\7p\2\2\u00e0\u00e1\7f\2\2\u00e1F\3\2\2\2\u00e2\u00e3"+
		"\7q\2\2\u00e3\u00e4\7t\2\2\u00e4H\3\2\2\2\u00e5\u00e6\7-\2\2\u00e6\u00e7"+
		"\7-\2\2\u00e7J\3\2\2\2\u00e8\u00e9\7/\2\2\u00e9\u00ea\7/\2\2\u00eaL\3"+
		"\2\2\2\u00eb\u00ec\7}\2\2\u00ecN\3\2\2\2\u00ed\u00ee\7\177\2\2\u00eeP"+
		"\3\2\2\2\u00ef\u00f0\7*\2\2\u00f0R\3\2\2\2\u00f1\u00f2\7+\2\2\u00f2T\3"+
		"\2\2\2\u00f3\u00f4\7&\2\2\u00f4V\3\2\2\2\5\2Z\u00c2\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}