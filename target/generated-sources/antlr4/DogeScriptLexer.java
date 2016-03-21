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
		WS=1, CommentBlock=2, IntDataType=3, CharDataType=4, BoolDataType=5, StringDataType=6, 
		Terminator=7, VarDecStarter=8, FuncStarter=9, ConstantStarter=10, AssOp=11, 
		IfKeyword=12, ElseKeyword=13, ElseIfKeyword=14, EventLoopKeyword=15, CountLoopKeyword=16, 
		RepeatUntilLoopKeyword=17, VoidKeyword=18, MainKeyword=19, Comma=20, NullKeyword=21, 
		BoolLit=22, AddOp=23, SubOp=24, MulOp=25, DivOp=26, ModOp=27, EquaOp=28, 
		GreaterThanOp=29, LessThanOp=30, GreaterThanEqualTo=31, LessThanEqualTo=32, 
		NotEqualToOp=33, AndOp=34, OrOp=35, IncrementOp=36, DecrementOp=37, OpenBrace=38, 
		CloseBrace=39, OpenParenthesis=40, CloseParenthesis=41, IntLit=42, FloatLit=43, 
		StringLit=44, CharLit=45, Array=46, VarIdentifier=47, EndOfFile=48;
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
		"'('", "')'", "'*'", "'+'", "','", "'-'", "'.'", "'/'", "'0'"
	};
	public static final String[] ruleNames = {
		"WS", "CommentBlock", "IntDataType", "CharDataType", "BoolDataType", "StringDataType", 
		"Terminator", "VarDecStarter", "FuncStarter", "ConstantStarter", "AssOp", 
		"IfKeyword", "ElseKeyword", "ElseIfKeyword", "EventLoopKeyword", "CountLoopKeyword", 
		"RepeatUntilLoopKeyword", "VoidKeyword", "MainKeyword", "Comma", "NullKeyword", 
		"BoolLit", "AddOp", "SubOp", "MulOp", "DivOp", "ModOp", "EquaOp", "GreaterThanOp", 
		"LessThanOp", "GreaterThanEqualTo", "LessThanEqualTo", "NotEqualToOp", 
		"AndOp", "OrOp", "IncrementOp", "DecrementOp", "OpenBrace", "CloseBrace", 
		"OpenParenthesis", "CloseParenthesis", "IntLit", "FloatLit", "StringLit", 
		"CharLit", "Array", "VarIdentifier", "EndOfFile"
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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 6: Terminator_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void Terminator_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: System.out.println("in terminator"); break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\62\u0154\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\6\2e\n\2\r\2\16\2f\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3u\n\3\f\3\16\3x\13\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3"+
		"\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\5\27\u00f6\n\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34"+
		"\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3"+
		"#\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\6+\u0128"+
		"\n+\r+\16+\u0129\3,\6,\u012d\n,\r,\16,\u012e\3,\3,\6,\u0133\n,\r,\16,"+
		"\u0134\3-\3-\7-\u0139\n-\f-\16-\u013c\13-\3-\3-\3.\3.\3.\3.\3/\3/\6/\u0146"+
		"\n/\r/\16/\u0147\3/\3/\3\60\3\60\7\60\u014e\n\60\f\60\16\60\u0151\13\60"+
		"\3\61\3\61\2\2\62\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62\3\2\b"+
		"\6\2\13\f\17\17\"\"~~\6\2\"\"\62;C\\c|\3\2\62;\5\2))\60\60^^\5\2\62;C"+
		"\\c|\4\2C\\c|\u015c\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2"+
		"\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2"+
		"\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2"+
		"\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q"+
		"\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2"+
		"\2\2\2_\3\2\2\2\2a\3\2\2\2\3d\3\2\2\2\5j\3\2\2\2\7\u0084\3\2\2\2\t\u0088"+
		"\3\2\2\2\13\u008d\3\2\2\2\r\u0095\3\2\2\2\17\u009c\3\2\2\2\21\u00a1\3"+
		"\2\2\2\23\u00a6\3\2\2\2\25\u00ab\3\2\2\2\27\u00b0\3\2\2\2\31\u00b3\3\2"+
		"\2\2\33\u00b8\3\2\2\2\35\u00bc\3\2\2\2\37\u00c5\3\2\2\2!\u00c8\3\2\2\2"+
		"#\u00cd\3\2\2\2%\u00d2\3\2\2\2\'\u00d7\3\2\2\2)\u00e7\3\2\2\2+\u00e9\3"+
		"\2\2\2-\u00f5\3\2\2\2/\u00f7\3\2\2\2\61\u00f9\3\2\2\2\63\u00fb\3\2\2\2"+
		"\65\u00fd\3\2\2\2\67\u00ff\3\2\2\29\u0101\3\2\2\2;\u0104\3\2\2\2=\u0106"+
		"\3\2\2\2?\u0108\3\2\2\2A\u010b\3\2\2\2C\u010e\3\2\2\2E\u0111\3\2\2\2G"+
		"\u0115\3\2\2\2I\u0118\3\2\2\2K\u011b\3\2\2\2M\u011e\3\2\2\2O\u0120\3\2"+
		"\2\2Q\u0122\3\2\2\2S\u0124\3\2\2\2U\u0127\3\2\2\2W\u012c\3\2\2\2Y\u0136"+
		"\3\2\2\2[\u013f\3\2\2\2]\u0143\3\2\2\2_\u014b\3\2\2\2a\u0152\3\2\2\2c"+
		"e\t\2\2\2dc\3\2\2\2ef\3\2\2\2fd\3\2\2\2fg\3\2\2\2gh\3\2\2\2hi\b\2\2\2"+
		"i\4\3\2\2\2jk\7x\2\2kl\7g\2\2lm\7t\2\2mn\7{\2\2no\7\"\2\2op\7e\2\2pq\7"+
		"o\2\2qr\7v\2\2rv\3\2\2\2su\t\3\2\2ts\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2"+
		"\2\2wy\3\2\2\2xv\3\2\2\2yz\7x\2\2z{\7g\2\2{|\7t\2\2|}\7{\2\2}~\7\"\2\2"+
		"~\177\7e\2\2\177\u0080\7o\2\2\u0080\u0081\7v\2\2\u0081\u0082\3\2\2\2\u0082"+
		"\u0083\b\3\2\2\u0083\6\3\2\2\2\u0084\u0085\7k\2\2\u0085\u0086\7p\2\2\u0086"+
		"\u0087\7v\2\2\u0087\b\3\2\2\2\u0088\u0089\7e\2\2\u0089\u008a\7j\2\2\u008a"+
		"\u008b\7c\2\2\u008b\u008c\7t\2\2\u008c\n\3\2\2\2\u008d\u008e\7d\2\2\u008e"+
		"\u008f\7q\2\2\u008f\u0090\7q\2\2\u0090\u0091\7n\2\2\u0091\u0092\7g\2\2"+
		"\u0092\u0093\7c\2\2\u0093\u0094\7p\2\2\u0094\f\3\2\2\2\u0095\u0096\7u"+
		"\2\2\u0096\u0097\7v\2\2\u0097\u0098\7t\2\2\u0098\u0099\7k\2\2\u0099\u009a"+
		"\7p\2\2\u009a\u009b\7i\2\2\u009b\16\3\2\2\2\u009c\u009d\b\b\3\2\u009d"+
		"\u009e\7y\2\2\u009e\u009f\7q\2\2\u009f\u00a0\7y\2\2\u00a0\20\3\2\2\2\u00a1"+
		"\u00a2\7u\2\2\u00a2\u00a3\7w\2\2\u00a3\u00a4\7e\2\2\u00a4\u00a5\7j\2\2"+
		"\u00a5\22\3\2\2\2\u00a6\u00a7\7o\2\2\u00a7\u00a8\7w\2\2\u00a8\u00a9\7"+
		"e\2\2\u00a9\u00aa\7j\2\2\u00aa\24\3\2\2\2\u00ab\u00ac\7x\2\2\u00ac\u00ad"+
		"\7g\2\2\u00ad\u00ae\7t\2\2\u00ae\u00af\7{\2\2\u00af\26\3\2\2\2\u00b0\u00b1"+
		"\7c\2\2\u00b1\u00b2\7u\2\2\u00b2\30\3\2\2\2\u00b3\u00b4\7t\2\2\u00b4\u00b5"+
		"\7k\2\2\u00b5\u00b6\7n\2\2\u00b6\u00b7\7{\2\2\u00b7\32\3\2\2\2\u00b8\u00b9"+
		"\7d\2\2\u00b9\u00ba\7w\2\2\u00ba\u00bb\7v\2\2\u00bb\34\3\2\2\2\u00bc\u00bd"+
		"\7d\2\2\u00bd\u00be\7w\2\2\u00be\u00bf\7v\2\2\u00bf\u00c0\7\"\2\2\u00c0"+
		"\u00c1\7t\2\2\u00c1\u00c2\7k\2\2\u00c2\u00c3\7n\2\2\u00c3\u00c4\7{\2\2"+
		"\u00c4\36\3\2\2\2\u00c5\u00c6\7u\2\2\u00c6\u00c7\7q\2\2\u00c7 \3\2\2\2"+
		"\u00c8\u00c9\7o\2\2\u00c9\u00ca\7c\2\2\u00ca\u00cb\7p\2\2\u00cb\u00cc"+
		"\7{\2\2\u00cc\"\3\2\2\2\u00cd\u00ce\7p\2\2\u00ce\u00cf\7k\2\2\u00cf\u00d0"+
		"\7e\2\2\u00d0\u00d1\7g\2\2\u00d1$\3\2\2\2\u00d2\u00d3\7x\2\2\u00d3\u00d4"+
		"\7q\2\2\u00d4\u00d5\7k\2\2\u00d5\u00d6\7f\2\2\u00d6&\3\2\2\2\u00d7\u00d8"+
		"\7f\2\2\u00d8\u00d9\7q\2\2\u00d9\u00da\7i\2\2\u00da\u00db\7g\2\2\u00db"+
		"\u00dc\7K\2\2\u00dc\u00dd\7p\2\2\u00dd\u00de\7v\2\2\u00de\u00df\7g\2\2"+
		"\u00df\u00e0\7p\2\2\u00e0\u00e1\7u\2\2\u00e1\u00e2\7k\2\2\u00e2\u00e3"+
		"\7h\2\2\u00e3\u00e4\7k\2\2\u00e4\u00e5\7g\2\2\u00e5\u00e6\7u\2\2\u00e6"+
		"(\3\2\2\2\u00e7\u00e8\7.\2\2\u00e8*\3\2\2\2\u00e9\u00ea\7p\2\2\u00ea\u00eb"+
		"\7w\2\2\u00eb\u00ec\7n\2\2\u00ec\u00ed\7n\2\2\u00ed,\3\2\2\2\u00ee\u00ef"+
		"\7{\2\2\u00ef\u00f0\7k\2\2\u00f0\u00f6\7|\2\2\u00f1\u00f2\7p\2\2\u00f2"+
		"\u00f3\7c\2\2\u00f3\u00f4\7y\2\2\u00f4\u00f6\7r\2\2\u00f5\u00ee\3\2\2"+
		"\2\u00f5\u00f1\3\2\2\2\u00f6.\3\2\2\2\u00f7\u00f8\7-\2\2\u00f8\60\3\2"+
		"\2\2\u00f9\u00fa\7/\2\2\u00fa\62\3\2\2\2\u00fb\u00fc\7,\2\2\u00fc\64\3"+
		"\2\2\2\u00fd\u00fe\7\61\2\2\u00fe\66\3\2\2\2\u00ff\u0100\7\'\2\2\u0100"+
		"8\3\2\2\2\u0101\u0102\7k\2\2\u0102\u0103\7u\2\2\u0103:\3\2\2\2\u0104\u0105"+
		"\7@\2\2\u0105<\3\2\2\2\u0106\u0107\7>\2\2\u0107>\3\2\2\2\u0108\u0109\7"+
		"@\2\2\u0109\u010a\7?\2\2\u010a@\3\2\2\2\u010b\u010c\7>\2\2\u010c\u010d"+
		"\7?\2\2\u010dB\3\2\2\2\u010e\u010f\7#\2\2\u010f\u0110\7?\2\2\u0110D\3"+
		"\2\2\2\u0111\u0112\7c\2\2\u0112\u0113\7p\2\2\u0113\u0114\7f\2\2\u0114"+
		"F\3\2\2\2\u0115\u0116\7q\2\2\u0116\u0117\7t\2\2\u0117H\3\2\2\2\u0118\u0119"+
		"\7-\2\2\u0119\u011a\7-\2\2\u011aJ\3\2\2\2\u011b\u011c\7/\2\2\u011c\u011d"+
		"\7/\2\2\u011dL\3\2\2\2\u011e\u011f\7}\2\2\u011fN\3\2\2\2\u0120\u0121\7"+
		"\177\2\2\u0121P\3\2\2\2\u0122\u0123\7*\2\2\u0123R\3\2\2\2\u0124\u0125"+
		"\7+\2\2\u0125T\3\2\2\2\u0126\u0128\t\4\2\2\u0127\u0126\3\2\2\2\u0128\u0129"+
		"\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012aV\3\2\2\2\u012b"+
		"\u012d\t\4\2\2\u012c\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012c\3\2"+
		"\2\2\u012e\u012f\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0132\t\5\2\2\u0131"+
		"\u0133\t\4\2\2\u0132\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0132\3\2"+
		"\2\2\u0134\u0135\3\2\2\2\u0135X\3\2\2\2\u0136\u013a\7$\2\2\u0137\u0139"+
		"\t\6\2\2\u0138\u0137\3\2\2\2\u0139\u013c\3\2\2\2\u013a\u0138\3\2\2\2\u013a"+
		"\u013b\3\2\2\2\u013b\u013d\3\2\2\2\u013c\u013a\3\2\2\2\u013d\u013e\7$"+
		"\2\2\u013eZ\3\2\2\2\u013f\u0140\7)\2\2\u0140\u0141\t\6\2\2\u0141\u0142"+
		"\7)\2\2\u0142\\\3\2\2\2\u0143\u0145\7]\2\2\u0144\u0146\t\4\2\2\u0145\u0144"+
		"\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148"+
		"\u0149\3\2\2\2\u0149\u014a\7_\2\2\u014a^\3\2\2\2\u014b\u014f\t\7\2\2\u014c"+
		"\u014e\t\6\2\2\u014d\u014c\3\2\2\2\u014e\u0151\3\2\2\2\u014f\u014d\3\2"+
		"\2\2\u014f\u0150\3\2\2\2\u0150`\3\2\2\2\u0151\u014f\3\2\2\2\u0152\u0153"+
		"\7&\2\2\u0153b\3\2\2\2\f\2fv\u00f5\u0129\u012e\u0134\u013a\u0147\u014f"+
		"\4\b\2\2\3\b\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}