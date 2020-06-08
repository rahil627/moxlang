// Generated from Mox.g4 by ANTLR 4.7.1

    package me.gmisail.parser;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MoxLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, NAME=48, STRING=49, CHAR=50, NUM=51, INT=52, FLOAT=53, 
		NEWLINE=54, WS=55, LINE_COMMENT=56, BLOCK_COMMENT=57;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
		"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "T__39", "T__40", 
		"T__41", "T__42", "T__43", "T__44", "T__45", "T__46", "NAME", "STRING", 
		"CHAR", "NUM", "INT", "FLOAT", "Digit", "ExponentPart", "HexDigit", "HexExponentPart", 
		"NEWLINE", "WS", "LINE_COMMENT", "BLOCK_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'class'", "'end'", "'module'", "'var'", "':'", "' = '", 
		"'.'", "'new'", "'delete'", "'['", "']'", "'function'", "'->'", "'size'", 
		"'extern'", "','", "'return'", "'if'", "'else if'", "'else'", "'while'", 
		"'from'", "'to'", "'for'", "'import'", "'&'", "'|'", "'~'", "'<<'", "'>>'", 
		"'+'", "'-'", "'and'", "'or'", "'*'", "'/'", "'%'", "'true'", "'false'", 
		"'=='", "'>='", "'<='", "'!='", "'<'", "'>'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"NAME", "STRING", "CHAR", "NUM", "INT", "FLOAT", "NEWLINE", "WS", "LINE_COMMENT", 
		"BLOCK_COMMENT"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public MoxLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Mox.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2;\u01ac\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3"+
		"\"\3#\3#\3$\3$\3$\3$\3%\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3)\3)\3)\3*\3"+
		"*\3*\3*\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3-\3.\3.\3.\3/\3/\3\60\3\60\3\61"+
		"\3\61\7\61\u0132\n\61\f\61\16\61\u0135\13\61\3\62\3\62\7\62\u0139\n\62"+
		"\f\62\16\62\u013c\13\62\3\62\3\62\3\63\3\63\3\63\3\63\3\64\3\64\5\64\u0146"+
		"\n\64\3\65\6\65\u0149\n\65\r\65\16\65\u014a\3\66\6\66\u014e\n\66\r\66"+
		"\16\66\u014f\3\66\3\66\7\66\u0154\n\66\f\66\16\66\u0157\13\66\3\66\5\66"+
		"\u015a\n\66\3\66\3\66\6\66\u015e\n\66\r\66\16\66\u015f\3\66\5\66\u0163"+
		"\n\66\3\66\6\66\u0166\n\66\r\66\16\66\u0167\3\66\3\66\5\66\u016c\n\66"+
		"\3\67\3\67\38\38\58\u0172\n8\38\68\u0175\n8\r8\168\u0176\39\39\3:\3:\5"+
		":\u017d\n:\3:\6:\u0180\n:\r:\16:\u0181\3;\5;\u0185\n;\3;\3;\6;\u0189\n"+
		";\r;\16;\u018a\3;\3;\3<\6<\u0190\n<\r<\16<\u0191\3<\3<\3=\3=\7=\u0198"+
		"\n=\f=\16=\u019b\13=\3=\3=\3>\3>\3>\3>\7>\u01a3\n>\f>\16>\u01a6\13>\3"+
		">\3>\3>\3>\3>\3\u01a4\2?\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63"+
		"\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62"+
		"c\63e\64g\65i\66k\67m\2o\2q\2s\2u8w9y:{;\3\2\r\5\2C\\aac|\6\2\62;C\\a"+
		"ac|\5\2\f\f\17\17$$\3\2))\3\2\62;\4\2GGgg\4\2--//\5\2\62;CHch\4\2RRrr"+
		"\5\2\13\f\16\17\"\"\4\2\f\f\17\17\2\u01bd\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2"+
		"\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2"+
		"\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M"+
		"\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2"+
		"\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2"+
		"\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{"+
		"\3\2\2\2\3}\3\2\2\2\5\177\3\2\2\2\7\u0081\3\2\2\2\t\u0087\3\2\2\2\13\u008b"+
		"\3\2\2\2\r\u0092\3\2\2\2\17\u0096\3\2\2\2\21\u0098\3\2\2\2\23\u009c\3"+
		"\2\2\2\25\u009e\3\2\2\2\27\u00a2\3\2\2\2\31\u00a9\3\2\2\2\33\u00ab\3\2"+
		"\2\2\35\u00ad\3\2\2\2\37\u00b6\3\2\2\2!\u00b9\3\2\2\2#\u00be\3\2\2\2%"+
		"\u00c5\3\2\2\2\'\u00c7\3\2\2\2)\u00ce\3\2\2\2+\u00d1\3\2\2\2-\u00d9\3"+
		"\2\2\2/\u00de\3\2\2\2\61\u00e4\3\2\2\2\63\u00e9\3\2\2\2\65\u00ec\3\2\2"+
		"\2\67\u00f0\3\2\2\29\u00f7\3\2\2\2;\u00f9\3\2\2\2=\u00fb\3\2\2\2?\u00fd"+
		"\3\2\2\2A\u0100\3\2\2\2C\u0103\3\2\2\2E\u0105\3\2\2\2G\u0107\3\2\2\2I"+
		"\u010b\3\2\2\2K\u010e\3\2\2\2M\u0110\3\2\2\2O\u0112\3\2\2\2Q\u0114\3\2"+
		"\2\2S\u0119\3\2\2\2U\u011f\3\2\2\2W\u0122\3\2\2\2Y\u0125\3\2\2\2[\u0128"+
		"\3\2\2\2]\u012b\3\2\2\2_\u012d\3\2\2\2a\u012f\3\2\2\2c\u0136\3\2\2\2e"+
		"\u013f\3\2\2\2g\u0145\3\2\2\2i\u0148\3\2\2\2k\u016b\3\2\2\2m\u016d\3\2"+
		"\2\2o\u016f\3\2\2\2q\u0178\3\2\2\2s\u017a\3\2\2\2u\u0188\3\2\2\2w\u018f"+
		"\3\2\2\2y\u0195\3\2\2\2{\u019e\3\2\2\2}~\7*\2\2~\4\3\2\2\2\177\u0080\7"+
		"+\2\2\u0080\6\3\2\2\2\u0081\u0082\7e\2\2\u0082\u0083\7n\2\2\u0083\u0084"+
		"\7c\2\2\u0084\u0085\7u\2\2\u0085\u0086\7u\2\2\u0086\b\3\2\2\2\u0087\u0088"+
		"\7g\2\2\u0088\u0089\7p\2\2\u0089\u008a\7f\2\2\u008a\n\3\2\2\2\u008b\u008c"+
		"\7o\2\2\u008c\u008d\7q\2\2\u008d\u008e\7f\2\2\u008e\u008f\7w\2\2\u008f"+
		"\u0090\7n\2\2\u0090\u0091\7g\2\2\u0091\f\3\2\2\2\u0092\u0093\7x\2\2\u0093"+
		"\u0094\7c\2\2\u0094\u0095\7t\2\2\u0095\16\3\2\2\2\u0096\u0097\7<\2\2\u0097"+
		"\20\3\2\2\2\u0098\u0099\7\"\2\2\u0099\u009a\7?\2\2\u009a\u009b\7\"\2\2"+
		"\u009b\22\3\2\2\2\u009c\u009d\7\60\2\2\u009d\24\3\2\2\2\u009e\u009f\7"+
		"p\2\2\u009f\u00a0\7g\2\2\u00a0\u00a1\7y\2\2\u00a1\26\3\2\2\2\u00a2\u00a3"+
		"\7f\2\2\u00a3\u00a4\7g\2\2\u00a4\u00a5\7n\2\2\u00a5\u00a6\7g\2\2\u00a6"+
		"\u00a7\7v\2\2\u00a7\u00a8\7g\2\2\u00a8\30\3\2\2\2\u00a9\u00aa\7]\2\2\u00aa"+
		"\32\3\2\2\2\u00ab\u00ac\7_\2\2\u00ac\34\3\2\2\2\u00ad\u00ae\7h\2\2\u00ae"+
		"\u00af\7w\2\2\u00af\u00b0\7p\2\2\u00b0\u00b1\7e\2\2\u00b1\u00b2\7v\2\2"+
		"\u00b2\u00b3\7k\2\2\u00b3\u00b4\7q\2\2\u00b4\u00b5\7p\2\2\u00b5\36\3\2"+
		"\2\2\u00b6\u00b7\7/\2\2\u00b7\u00b8\7@\2\2\u00b8 \3\2\2\2\u00b9\u00ba"+
		"\7u\2\2\u00ba\u00bb\7k\2\2\u00bb\u00bc\7|\2\2\u00bc\u00bd\7g\2\2\u00bd"+
		"\"\3\2\2\2\u00be\u00bf\7g\2\2\u00bf\u00c0\7z\2\2\u00c0\u00c1\7v\2\2\u00c1"+
		"\u00c2\7g\2\2\u00c2\u00c3\7t\2\2\u00c3\u00c4\7p\2\2\u00c4$\3\2\2\2\u00c5"+
		"\u00c6\7.\2\2\u00c6&\3\2\2\2\u00c7\u00c8\7t\2\2\u00c8\u00c9\7g\2\2\u00c9"+
		"\u00ca\7v\2\2\u00ca\u00cb\7w\2\2\u00cb\u00cc\7t\2\2\u00cc\u00cd\7p\2\2"+
		"\u00cd(\3\2\2\2\u00ce\u00cf\7k\2\2\u00cf\u00d0\7h\2\2\u00d0*\3\2\2\2\u00d1"+
		"\u00d2\7g\2\2\u00d2\u00d3\7n\2\2\u00d3\u00d4\7u\2\2\u00d4\u00d5\7g\2\2"+
		"\u00d5\u00d6\7\"\2\2\u00d6\u00d7\7k\2\2\u00d7\u00d8\7h\2\2\u00d8,\3\2"+
		"\2\2\u00d9\u00da\7g\2\2\u00da\u00db\7n\2\2\u00db\u00dc\7u\2\2\u00dc\u00dd"+
		"\7g\2\2\u00dd.\3\2\2\2\u00de\u00df\7y\2\2\u00df\u00e0\7j\2\2\u00e0\u00e1"+
		"\7k\2\2\u00e1\u00e2\7n\2\2\u00e2\u00e3\7g\2\2\u00e3\60\3\2\2\2\u00e4\u00e5"+
		"\7h\2\2\u00e5\u00e6\7t\2\2\u00e6\u00e7\7q\2\2\u00e7\u00e8\7o\2\2\u00e8"+
		"\62\3\2\2\2\u00e9\u00ea\7v\2\2\u00ea\u00eb\7q\2\2\u00eb\64\3\2\2\2\u00ec"+
		"\u00ed\7h\2\2\u00ed\u00ee\7q\2\2\u00ee\u00ef\7t\2\2\u00ef\66\3\2\2\2\u00f0"+
		"\u00f1\7k\2\2\u00f1\u00f2\7o\2\2\u00f2\u00f3\7r\2\2\u00f3\u00f4\7q\2\2"+
		"\u00f4\u00f5\7t\2\2\u00f5\u00f6\7v\2\2\u00f68\3\2\2\2\u00f7\u00f8\7(\2"+
		"\2\u00f8:\3\2\2\2\u00f9\u00fa\7~\2\2\u00fa<\3\2\2\2\u00fb\u00fc\7\u0080"+
		"\2\2\u00fc>\3\2\2\2\u00fd\u00fe\7>\2\2\u00fe\u00ff\7>\2\2\u00ff@\3\2\2"+
		"\2\u0100\u0101\7@\2\2\u0101\u0102\7@\2\2\u0102B\3\2\2\2\u0103\u0104\7"+
		"-\2\2\u0104D\3\2\2\2\u0105\u0106\7/\2\2\u0106F\3\2\2\2\u0107\u0108\7c"+
		"\2\2\u0108\u0109\7p\2\2\u0109\u010a\7f\2\2\u010aH\3\2\2\2\u010b\u010c"+
		"\7q\2\2\u010c\u010d\7t\2\2\u010dJ\3\2\2\2\u010e\u010f\7,\2\2\u010fL\3"+
		"\2\2\2\u0110\u0111\7\61\2\2\u0111N\3\2\2\2\u0112\u0113\7\'\2\2\u0113P"+
		"\3\2\2\2\u0114\u0115\7v\2\2\u0115\u0116\7t\2\2\u0116\u0117\7w\2\2\u0117"+
		"\u0118\7g\2\2\u0118R\3\2\2\2\u0119\u011a\7h\2\2\u011a\u011b\7c\2\2\u011b"+
		"\u011c\7n\2\2\u011c\u011d\7u\2\2\u011d\u011e\7g\2\2\u011eT\3\2\2\2\u011f"+
		"\u0120\7?\2\2\u0120\u0121\7?\2\2\u0121V\3\2\2\2\u0122\u0123\7@\2\2\u0123"+
		"\u0124\7?\2\2\u0124X\3\2\2\2\u0125\u0126\7>\2\2\u0126\u0127\7?\2\2\u0127"+
		"Z\3\2\2\2\u0128\u0129\7#\2\2\u0129\u012a\7?\2\2\u012a\\\3\2\2\2\u012b"+
		"\u012c\7>\2\2\u012c^\3\2\2\2\u012d\u012e\7@\2\2\u012e`\3\2\2\2\u012f\u0133"+
		"\t\2\2\2\u0130\u0132\t\3\2\2\u0131\u0130\3\2\2\2\u0132\u0135\3\2\2\2\u0133"+
		"\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134b\3\2\2\2\u0135\u0133\3\2\2\2"+
		"\u0136\u013a\7$\2\2\u0137\u0139\n\4\2\2\u0138\u0137\3\2\2\2\u0139\u013c"+
		"\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013d\3\2\2\2\u013c"+
		"\u013a\3\2\2\2\u013d\u013e\7$\2\2\u013ed\3\2\2\2\u013f\u0140\7)\2\2\u0140"+
		"\u0141\n\5\2\2\u0141\u0142\7)\2\2\u0142f\3\2\2\2\u0143\u0146\5i\65\2\u0144"+
		"\u0146\5k\66\2\u0145\u0143\3\2\2\2\u0145\u0144\3\2\2\2\u0146h\3\2\2\2"+
		"\u0147\u0149\5m\67\2\u0148\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u0148"+
		"\3\2\2\2\u014a\u014b\3\2\2\2\u014bj\3\2\2\2\u014c\u014e\5m\67\2\u014d"+
		"\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u0150\3\2"+
		"\2\2\u0150\u0151\3\2\2\2\u0151\u0155\7\60\2\2\u0152\u0154\5m\67\2\u0153"+
		"\u0152\3\2\2\2\u0154\u0157\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0156\3\2"+
		"\2\2\u0156\u0159\3\2\2\2\u0157\u0155\3\2\2\2\u0158\u015a\5o8\2\u0159\u0158"+
		"\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u016c\3\2\2\2\u015b\u015d\7\60\2\2"+
		"\u015c\u015e\5m\67\2\u015d\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u015d"+
		"\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u0162\3\2\2\2\u0161\u0163\5o8\2\u0162"+
		"\u0161\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u016c\3\2\2\2\u0164\u0166\5m"+
		"\67\2\u0165\u0164\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0165\3\2\2\2\u0167"+
		"\u0168\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u016a\5o8\2\u016a\u016c\3\2\2"+
		"\2\u016b\u014d\3\2\2\2\u016b\u015b\3\2\2\2\u016b\u0165\3\2\2\2\u016cl"+
		"\3\2\2\2\u016d\u016e\t\6\2\2\u016en\3\2\2\2\u016f\u0171\t\7\2\2\u0170"+
		"\u0172\t\b\2\2\u0171\u0170\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0174\3\2"+
		"\2\2\u0173\u0175\5m\67\2\u0174\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176"+
		"\u0174\3\2\2\2\u0176\u0177\3\2\2\2\u0177p\3\2\2\2\u0178\u0179\t\t\2\2"+
		"\u0179r\3\2\2\2\u017a\u017c\t\n\2\2\u017b\u017d\t\b\2\2\u017c\u017b\3"+
		"\2\2\2\u017c\u017d\3\2\2\2\u017d\u017f\3\2\2\2\u017e\u0180\5m\67\2\u017f"+
		"\u017e\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u017f\3\2\2\2\u0181\u0182\3\2"+
		"\2\2\u0182t\3\2\2\2\u0183\u0185\7\17\2\2\u0184\u0183\3\2\2\2\u0184\u0185"+
		"\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0189\7\f\2\2\u0187\u0189\7\17\2\2"+
		"\u0188\u0184\3\2\2\2\u0188\u0187\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u0188"+
		"\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018d\b;\2\2\u018d"+
		"v\3\2\2\2\u018e\u0190\t\13\2\2\u018f\u018e\3\2\2\2\u0190\u0191\3\2\2\2"+
		"\u0191\u018f\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0194"+
		"\b<\2\2\u0194x\3\2\2\2\u0195\u0199\7%\2\2\u0196\u0198\n\f\2\2\u0197\u0196"+
		"\3\2\2\2\u0198\u019b\3\2\2\2\u0199\u0197\3\2\2\2\u0199\u019a\3\2\2\2\u019a"+
		"\u019c\3\2\2\2\u019b\u0199\3\2\2\2\u019c\u019d\b=\2\2\u019dz\3\2\2\2\u019e"+
		"\u019f\7%\2\2\u019f\u01a0\7%\2\2\u01a0\u01a4\3\2\2\2\u01a1\u01a3\13\2"+
		"\2\2\u01a2\u01a1\3\2\2\2\u01a3\u01a6\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a4"+
		"\u01a2\3\2\2\2\u01a5\u01a7\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a7\u01a8\7%"+
		"\2\2\u01a8\u01a9\7%\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ab\b>\2\2\u01ab|"+
		"\3\2\2\2\30\2\u0133\u013a\u0145\u014a\u014f\u0155\u0159\u015f\u0162\u0167"+
		"\u016b\u0171\u0176\u017c\u0181\u0184\u0188\u018a\u0191\u0199\u01a4\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}