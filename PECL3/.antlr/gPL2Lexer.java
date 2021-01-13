// Generated from /Users/luis/Desktop/Universidad/ProcesadoresDeLenguaje/SegundaMatricula/PL3/PECL3/gPL2Lexer.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class gPL2Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMENTARIOABRIR=1, COMENTARIOLINEA=2, PALGORITMO=3, PFINALGORITMO=4, PFUNCION=5, 
		PFINFUNCION=6, PDEFINIR=7, PCOMO=8, PLEER=9, PESCRIBIR=10, PSI=11, PENTONCES=12, 
		PSINO=13, PFINSI=14, PPARA=15, PHASTA=16, PHACER=17, PFINPARA=18, PMIENTRAS=19, 
		PFINMIENTRAS=20, PREPETIR=21, PHASTAQUE=22, PSEGUN=23, PDEOTROMODO=24, 
		PFINSEGUN=25, PTIPOS=26, PDIMENSION=27, ASIGNACION=28, MAS=29, MENOS=30, 
		IGUAL=31, MAYOR=32, MENOR=33, COMA=34, DOSPUNTOS=35, PI=36, PD=37, CI=38, 
		CD=39, Y=40, DIGITO=41, ID=42, PUNTOCOMA=43, TERMINAL=44, ESC=45, CADENA=46, 
		WS=47, COMENTARIOCERRAR=48, TEXTOCOMENTARIOML=49, FINAL_COMENTARIO_UL=50, 
		TEXTOCOMENTARIOUL=51;
	public static final int
		COMENTARIO_MULTILINEA_MODE=1, COMENTARIO_LINEA_MODE=2;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "COMENTARIO_MULTILINEA_MODE", "COMENTARIO_LINEA_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"COMENTARIOABRIR", "COMENTARIOLINEA", "PALGORITMO", "PFINALGORITMO", 
			"PFUNCION", "PFINFUNCION", "PDEFINIR", "PCOMO", "PLEER", "PESCRIBIR", 
			"PSI", "PENTONCES", "PSINO", "PFINSI", "PPARA", "PHASTA", "PHACER", "PFINPARA", 
			"PMIENTRAS", "PFINMIENTRAS", "PREPETIR", "PHASTAQUE", "PSEGUN", "PDEOTROMODO", 
			"PFINSEGUN", "PTIPOS", "PDIMENSION", "ASIGNACION", "MAS", "MENOS", "IGUAL", 
			"MAYOR", "MENOR", "COMA", "DOSPUNTOS", "PI", "PD", "CI", "CD", "Y", "DIGITO", 
			"ID", "PUNTOCOMA", "TERMINAL", "ESC", "CADENA", "WS", "COMENTARIOCERRAR", 
			"TEXTOCOMENTARIOML", "FINAL_COMENTARIO_UL", "TEXTOCOMENTARIOUL"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'/**'", "'//'", "'Algoritmo'", "'FinAlgoritmo'", "'Funcion'", 
			null, null, "'Como'", "'Leer'", "'Escribir'", "'Si'", "'Entonces'", "'SiNo'", 
			null, "'Para'", "'Hasta'", "'Hacer'", "'FinPara'", "'Mientras'", null, 
			"'Repetir'", "'Hasta Que'", "'Segun'", "'De Otro Modo'", "'FinSegun'", 
			null, null, "'<-'", "'+'", "'-'", "'='", "'<'", "'>'", "','", "':'", 
			"'('", "')'", "'['", "']'", "'&'", null, null, "';'", null, null, null, 
			null, "'**/'", null, "'\r\n'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMENTARIOABRIR", "COMENTARIOLINEA", "PALGORITMO", "PFINALGORITMO", 
			"PFUNCION", "PFINFUNCION", "PDEFINIR", "PCOMO", "PLEER", "PESCRIBIR", 
			"PSI", "PENTONCES", "PSINO", "PFINSI", "PPARA", "PHASTA", "PHACER", "PFINPARA", 
			"PMIENTRAS", "PFINMIENTRAS", "PREPETIR", "PHASTAQUE", "PSEGUN", "PDEOTROMODO", 
			"PFINSEGUN", "PTIPOS", "PDIMENSION", "ASIGNACION", "MAS", "MENOS", "IGUAL", 
			"MAYOR", "MENOR", "COMA", "DOSPUNTOS", "PI", "PD", "CI", "CD", "Y", "DIGITO", 
			"ID", "PUNTOCOMA", "TERMINAL", "ESC", "CADENA", "WS", "COMENTARIOCERRAR", 
			"TEXTOCOMENTARIOML", "FINAL_COMENTARIO_UL", "TEXTOCOMENTARIOUL"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public gPL2Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "gPL2Lexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\65\u01fb\b\1\b\1"+
		"\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4"+
		"\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t"+
		"\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t"+
		"\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t"+
		"\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4"+
		"*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63"+
		"\t\63\4\64\t\64\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00ab\n"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00c9\n\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00fa"+
		"\n\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\5\25\u0135\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\5\33\u017d\n\33\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u019a\n\34\3\35\3\35\3\35\3\36"+
		"\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3"+
		"(\3(\3)\3)\3*\6*\u01b8\n*\r*\16*\u01b9\3+\3+\6+\u01be\n+\r+\16+\u01bf"+
		"\3,\3,\3-\6-\u01c5\n-\r-\16-\u01c6\3.\3.\3.\3/\3/\3/\7/\u01cf\n/\f/\16"+
		"/\u01d2\13/\3/\3/\3/\3/\7/\u01d8\n/\f/\16/\u01db\13/\3/\5/\u01de\n/\3"+
		"\60\6\60\u01e1\n\60\r\60\16\60\u01e2\3\60\3\60\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\62\6\62\u01ee\n\62\r\62\16\62\u01ef\3\63\3\63\3\63\3\63\3\63\3"+
		"\64\6\64\u01f8\n\64\r\64\16\64\u01f9\6\u01d0\u01d9\u01ef\u01f9\2\65\5"+
		"\3\7\4\t\5\13\6\r\7\17\b\21\t\23\n\25\13\27\f\31\r\33\16\35\17\37\20!"+
		"\21#\22%\23\'\24)\25+\26-\27/\30\61\31\63\32\65\33\67\349\35;\36=\37?"+
		" A!C\"E#G$I%K&M\'O(Q)S*U+W,Y-[.]/_\60a\61c\62e\63g\64i\65\5\2\3\4\b\3"+
		"\2\62;\4\2C\\c|\7\2//\62;C\\aac|\4\2\f\f\17\17\b\2$$^^ddppttvv\6\2\13"+
		"\f\17\17\"\"\uffff\uffff\2\u020e\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2"+
		"\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2"+
		"\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2"+
		"\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q"+
		"\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2"+
		"\2\2\2_\3\2\2\2\2a\3\2\2\2\3c\3\2\2\2\3e\3\2\2\2\4g\3\2\2\2\4i\3\2\2\2"+
		"\5k\3\2\2\2\7q\3\2\2\2\tv\3\2\2\2\13\u0080\3\2\2\2\r\u008d\3\2\2\2\17"+
		"\u00aa\3\2\2\2\21\u00c8\3\2\2\2\23\u00ca\3\2\2\2\25\u00cf\3\2\2\2\27\u00d4"+
		"\3\2\2\2\31\u00dd\3\2\2\2\33\u00e0\3\2\2\2\35\u00e9\3\2\2\2\37\u00f9\3"+
		"\2\2\2!\u00fb\3\2\2\2#\u0100\3\2\2\2%\u0106\3\2\2\2\'\u010c\3\2\2\2)\u0114"+
		"\3\2\2\2+\u0134\3\2\2\2-\u0136\3\2\2\2/\u013e\3\2\2\2\61\u0148\3\2\2\2"+
		"\63\u014e\3\2\2\2\65\u015b\3\2\2\2\67\u017c\3\2\2\29\u0199\3\2\2\2;\u019b"+
		"\3\2\2\2=\u019e\3\2\2\2?\u01a0\3\2\2\2A\u01a2\3\2\2\2C\u01a4\3\2\2\2E"+
		"\u01a6\3\2\2\2G\u01a8\3\2\2\2I\u01aa\3\2\2\2K\u01ac\3\2\2\2M\u01ae\3\2"+
		"\2\2O\u01b0\3\2\2\2Q\u01b2\3\2\2\2S\u01b4\3\2\2\2U\u01b7\3\2\2\2W\u01bb"+
		"\3\2\2\2Y\u01c1\3\2\2\2[\u01c4\3\2\2\2]\u01c8\3\2\2\2_\u01dd\3\2\2\2a"+
		"\u01e0\3\2\2\2c\u01e6\3\2\2\2e\u01ed\3\2\2\2g\u01f1\3\2\2\2i\u01f7\3\2"+
		"\2\2kl\7\61\2\2lm\7,\2\2mn\7,\2\2no\3\2\2\2op\b\2\2\2p\6\3\2\2\2qr\7\61"+
		"\2\2rs\7\61\2\2st\3\2\2\2tu\b\3\3\2u\b\3\2\2\2vw\7C\2\2wx\7n\2\2xy\7i"+
		"\2\2yz\7q\2\2z{\7t\2\2{|\7k\2\2|}\7v\2\2}~\7o\2\2~\177\7q\2\2\177\n\3"+
		"\2\2\2\u0080\u0081\7H\2\2\u0081\u0082\7k\2\2\u0082\u0083\7p\2\2\u0083"+
		"\u0084\7C\2\2\u0084\u0085\7n\2\2\u0085\u0086\7i\2\2\u0086\u0087\7q\2\2"+
		"\u0087\u0088\7t\2\2\u0088\u0089\7k\2\2\u0089\u008a\7v\2\2\u008a\u008b"+
		"\7o\2\2\u008b\u008c\7q\2\2\u008c\f\3\2\2\2\u008d\u008e\7H\2\2\u008e\u008f"+
		"\7w\2\2\u008f\u0090\7p\2\2\u0090\u0091\7e\2\2\u0091\u0092\7k\2\2\u0092"+
		"\u0093\7q\2\2\u0093\u0094\7p\2\2\u0094\16\3\2\2\2\u0095\u0096\7H\2\2\u0096"+
		"\u0097\7k\2\2\u0097\u0098\7p\2\2\u0098\u0099\7H\2\2\u0099\u009a\7w\2\2"+
		"\u009a\u009b\7p\2\2\u009b\u009c\7e\2\2\u009c\u009d\7k\2\2\u009d\u009e"+
		"\7q\2\2\u009e\u00ab\7p\2\2\u009f\u00a0\7H\2\2\u00a0\u00a1\7k\2\2\u00a1"+
		"\u00a2\7p\2\2\u00a2\u00a3\7\"\2\2\u00a3\u00a4\7H\2\2\u00a4\u00a5\7w\2"+
		"\2\u00a5\u00a6\7p\2\2\u00a6\u00a7\7e\2\2\u00a7\u00a8\7k\2\2\u00a8\u00a9"+
		"\7q\2\2\u00a9\u00ab\7p\2\2\u00aa\u0095\3\2\2\2\u00aa\u009f\3\2\2\2\u00ab"+
		"\20\3\2\2\2\u00ac\u00ad\7F\2\2\u00ad\u00ae\7g\2\2\u00ae\u00af\7h\2\2\u00af"+
		"\u00b0\7k\2\2\u00b0\u00b1\7p\2\2\u00b1\u00b2\7k\2\2\u00b2\u00c9\7t\2\2"+
		"\u00b3\u00b4\7F\2\2\u00b4\u00b5\7g\2\2\u00b5\u00b6\7H\2\2\u00b6\u00b7"+
		"\7k\2\2\u00b7\u00b8\7P\2\2\u00b8\u00b9\7K\2\2\u00b9\u00c9\7t\2\2\u00ba"+
		"\u00bb\7F\2\2\u00bb\u00bc\7g\2\2\u00bc\u00bd\7h\2\2\u00bd\u00be\7k\2\2"+
		"\u00be\u00bf\7p\2\2\u00bf\u00c0\7k\2\2\u00c0\u00c9\7T\2\2\u00c1\u00c2"+
		"\7f\2\2\u00c2\u00c3\7g\2\2\u00c3\u00c4\7h\2\2\u00c4\u00c5\7k\2\2\u00c5"+
		"\u00c6\7p\2\2\u00c6\u00c7\7k\2\2\u00c7\u00c9\7t\2\2\u00c8\u00ac\3\2\2"+
		"\2\u00c8\u00b3\3\2\2\2\u00c8\u00ba\3\2\2\2\u00c8\u00c1\3\2\2\2\u00c9\22"+
		"\3\2\2\2\u00ca\u00cb\7E\2\2\u00cb\u00cc\7q\2\2\u00cc\u00cd\7o\2\2\u00cd"+
		"\u00ce\7q\2\2\u00ce\24\3\2\2\2\u00cf\u00d0\7N\2\2\u00d0\u00d1\7g\2\2\u00d1"+
		"\u00d2\7g\2\2\u00d2\u00d3\7t\2\2\u00d3\26\3\2\2\2\u00d4\u00d5\7G\2\2\u00d5"+
		"\u00d6\7u\2\2\u00d6\u00d7\7e\2\2\u00d7\u00d8\7t\2\2\u00d8\u00d9\7k\2\2"+
		"\u00d9\u00da\7d\2\2\u00da\u00db\7k\2\2\u00db\u00dc\7t\2\2\u00dc\30\3\2"+
		"\2\2\u00dd\u00de\7U\2\2\u00de\u00df\7k\2\2\u00df\32\3\2\2\2\u00e0\u00e1"+
		"\7G\2\2\u00e1\u00e2\7p\2\2\u00e2\u00e3\7v\2\2\u00e3\u00e4\7q\2\2\u00e4"+
		"\u00e5\7p\2\2\u00e5\u00e6\7e\2\2\u00e6\u00e7\7g\2\2\u00e7\u00e8\7u\2\2"+
		"\u00e8\34\3\2\2\2\u00e9\u00ea\7U\2\2\u00ea\u00eb\7k\2\2\u00eb\u00ec\7"+
		"P\2\2\u00ec\u00ed\7q\2\2\u00ed\36\3\2\2\2\u00ee\u00ef\7H\2\2\u00ef\u00f0"+
		"\7k\2\2\u00f0\u00f1\7p\2\2\u00f1\u00f2\7U\2\2\u00f2\u00fa\7k\2\2\u00f3"+
		"\u00f4\7H\2\2\u00f4\u00f5\7k\2\2\u00f5\u00f6\7p\2\2\u00f6\u00f7\7\"\2"+
		"\2\u00f7\u00f8\7U\2\2\u00f8\u00fa\7k\2\2\u00f9\u00ee\3\2\2\2\u00f9\u00f3"+
		"\3\2\2\2\u00fa \3\2\2\2\u00fb\u00fc\7R\2\2\u00fc\u00fd\7c\2\2\u00fd\u00fe"+
		"\7t\2\2\u00fe\u00ff\7c\2\2\u00ff\"\3\2\2\2\u0100\u0101\7J\2\2\u0101\u0102"+
		"\7c\2\2\u0102\u0103\7u\2\2\u0103\u0104\7v\2\2\u0104\u0105\7c\2\2\u0105"+
		"$\3\2\2\2\u0106\u0107\7J\2\2\u0107\u0108\7c\2\2\u0108\u0109\7e\2\2\u0109"+
		"\u010a\7g\2\2\u010a\u010b\7t\2\2\u010b&\3\2\2\2\u010c\u010d\7H\2\2\u010d"+
		"\u010e\7k\2\2\u010e\u010f\7p\2\2\u010f\u0110\7R\2\2\u0110\u0111\7c\2\2"+
		"\u0111\u0112\7t\2\2\u0112\u0113\7c\2\2\u0113(\3\2\2\2\u0114\u0115\7O\2"+
		"\2\u0115\u0116\7k\2\2\u0116\u0117\7g\2\2\u0117\u0118\7p\2\2\u0118\u0119"+
		"\7v\2\2\u0119\u011a\7t\2\2\u011a\u011b\7c\2\2\u011b\u011c\7u\2\2\u011c"+
		"*\3\2\2\2\u011d\u011e\7H\2\2\u011e\u011f\7k\2\2\u011f\u0120\7p\2\2\u0120"+
		"\u0121\7O\2\2\u0121\u0122\7k\2\2\u0122\u0123\7g\2\2\u0123\u0124\7p\2\2"+
		"\u0124\u0125\7v\2\2\u0125\u0126\7t\2\2\u0126\u0127\7c\2\2\u0127\u0135"+
		"\7u\2\2\u0128\u0129\7H\2\2\u0129\u012a\7k\2\2\u012a\u012b\7p\2\2\u012b"+
		"\u012c\7\"\2\2\u012c\u012d\7O\2\2\u012d\u012e\7k\2\2\u012e\u012f\7g\2"+
		"\2\u012f\u0130\7p\2\2\u0130\u0131\7v\2\2\u0131\u0132\7t\2\2\u0132\u0133"+
		"\7c\2\2\u0133\u0135\7u\2\2\u0134\u011d\3\2\2\2\u0134\u0128\3\2\2\2\u0135"+
		",\3\2\2\2\u0136\u0137\7T\2\2\u0137\u0138\7g\2\2\u0138\u0139\7r\2\2\u0139"+
		"\u013a\7g\2\2\u013a\u013b\7v\2\2\u013b\u013c\7k\2\2\u013c\u013d\7t\2\2"+
		"\u013d.\3\2\2\2\u013e\u013f\7J\2\2\u013f\u0140\7c\2\2\u0140\u0141\7u\2"+
		"\2\u0141\u0142\7v\2\2\u0142\u0143\7c\2\2\u0143\u0144\7\"\2\2\u0144\u0145"+
		"\7S\2\2\u0145\u0146\7w\2\2\u0146\u0147\7g\2\2\u0147\60\3\2\2\2\u0148\u0149"+
		"\7U\2\2\u0149\u014a\7g\2\2\u014a\u014b\7i\2\2\u014b\u014c\7w\2\2\u014c"+
		"\u014d\7p\2\2\u014d\62\3\2\2\2\u014e\u014f\7F\2\2\u014f\u0150\7g\2\2\u0150"+
		"\u0151\7\"\2\2\u0151\u0152\7Q\2\2\u0152\u0153\7v\2\2\u0153\u0154\7t\2"+
		"\2\u0154\u0155\7q\2\2\u0155\u0156\7\"\2\2\u0156\u0157\7O\2\2\u0157\u0158"+
		"\7q\2\2\u0158\u0159\7f\2\2\u0159\u015a\7q\2\2\u015a\64\3\2\2\2\u015b\u015c"+
		"\7H\2\2\u015c\u015d\7k\2\2\u015d\u015e\7p\2\2\u015e\u015f\7U\2\2\u015f"+
		"\u0160\7g\2\2\u0160\u0161\7i\2\2\u0161\u0162\7w\2\2\u0162\u0163\7p\2\2"+
		"\u0163\66\3\2\2\2\u0164\u0165\7E\2\2\u0165\u0166\7c\2\2\u0166\u0167\7"+
		"t\2\2\u0167\u0168\7c\2\2\u0168\u0169\7e\2\2\u0169\u016a\7v\2\2\u016a\u016b"+
		"\7g\2\2\u016b\u017d\7t\2\2\u016c\u016d\7G\2\2\u016d\u016e\7p\2\2\u016e"+
		"\u016f\7v\2\2\u016f\u0170\7g\2\2\u0170\u0171\7t\2\2\u0171\u017d\7q\2\2"+
		"\u0172\u0173\7T\2\2\u0173\u0174\7g\2\2\u0174\u0175\7c\2\2\u0175\u017d"+
		"\7n\2\2\u0176\u0177\7N\2\2\u0177\u0178\7q\2\2\u0178\u0179\7i\2\2\u0179"+
		"\u017a\7k\2\2\u017a\u017b\7e\2\2\u017b\u017d\7q\2\2\u017c\u0164\3\2\2"+
		"\2\u017c\u016c\3\2\2\2\u017c\u0172\3\2\2\2\u017c\u0176\3\2\2\2\u017d8"+
		"\3\2\2\2\u017e\u017f\7F\2\2\u017f\u0180\7k\2\2\u0180\u0181\7o\2\2\u0181"+
		"\u0182\7g\2\2\u0182\u0183\7p\2\2\u0183\u0184\7u\2\2\u0184\u0185\7k\2\2"+
		"\u0185\u0186\7q\2\2\u0186\u019a\7p\2\2\u0187\u0188\7F\2\2\u0188\u0189"+
		"\7k\2\2\u0189\u018a\7O\2\2\u018a\u018b\7g\2\2\u018b\u018c\7P\2\2\u018c"+
		"\u018d\7u\2\2\u018d\u018e\7K\2\2\u018e\u018f\7Q\2\2\u018f\u019a\7p\2\2"+
		"\u0190\u0191\7f\2\2\u0191\u0192\7k\2\2\u0192\u0193\7o\2\2\u0193\u0194"+
		"\7g\2\2\u0194\u0195\7p\2\2\u0195\u0196\7u\2\2\u0196\u0197\7k\2\2\u0197"+
		"\u0198\7q\2\2\u0198\u019a\7p\2\2\u0199\u017e\3\2\2\2\u0199\u0187\3\2\2"+
		"\2\u0199\u0190\3\2\2\2\u019a:\3\2\2\2\u019b\u019c\7>\2\2\u019c\u019d\7"+
		"/\2\2\u019d<\3\2\2\2\u019e\u019f\7-\2\2\u019f>\3\2\2\2\u01a0\u01a1\7/"+
		"\2\2\u01a1@\3\2\2\2\u01a2\u01a3\7?\2\2\u01a3B\3\2\2\2\u01a4\u01a5\7>\2"+
		"\2\u01a5D\3\2\2\2\u01a6\u01a7\7@\2\2\u01a7F\3\2\2\2\u01a8\u01a9\7.\2\2"+
		"\u01a9H\3\2\2\2\u01aa\u01ab\7<\2\2\u01abJ\3\2\2\2\u01ac\u01ad\7*\2\2\u01ad"+
		"L\3\2\2\2\u01ae\u01af\7+\2\2\u01afN\3\2\2\2\u01b0\u01b1\7]\2\2\u01b1P"+
		"\3\2\2\2\u01b2\u01b3\7_\2\2\u01b3R\3\2\2\2\u01b4\u01b5\7(\2\2\u01b5T\3"+
		"\2\2\2\u01b6\u01b8\t\2\2\2\u01b7\u01b6\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9"+
		"\u01b7\3\2\2\2\u01b9\u01ba\3\2\2\2\u01baV\3\2\2\2\u01bb\u01bd\t\3\2\2"+
		"\u01bc\u01be\t\4\2\2\u01bd\u01bc\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01bd"+
		"\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0X\3\2\2\2\u01c1\u01c2\7=\2\2\u01c2Z"+
		"\3\2\2\2\u01c3\u01c5\t\5\2\2\u01c4\u01c3\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6"+
		"\u01c4\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\\\3\2\2\2\u01c8\u01c9\7^\2\2"+
		"\u01c9\u01ca\t\6\2\2\u01ca^\3\2\2\2\u01cb\u01d0\7)\2\2\u01cc\u01cf\5]"+
		".\2\u01cd\u01cf\13\2\2\2\u01ce\u01cc\3\2\2\2\u01ce\u01cd\3\2\2\2\u01cf"+
		"\u01d2\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d1\u01d3\3\2"+
		"\2\2\u01d2\u01d0\3\2\2\2\u01d3\u01de\7)\2\2\u01d4\u01d9\7$\2\2\u01d5\u01d8"+
		"\5].\2\u01d6\u01d8\13\2\2\2\u01d7\u01d5\3\2\2\2\u01d7\u01d6\3\2\2\2\u01d8"+
		"\u01db\3\2\2\2\u01d9\u01da\3\2\2\2\u01d9\u01d7\3\2\2\2\u01da\u01dc\3\2"+
		"\2\2\u01db\u01d9\3\2\2\2\u01dc\u01de\7$\2\2\u01dd\u01cb\3\2\2\2\u01dd"+
		"\u01d4\3\2\2\2\u01de`\3\2\2\2\u01df\u01e1\t\7\2\2\u01e0\u01df\3\2\2\2"+
		"\u01e1\u01e2\3\2\2\2\u01e2\u01e0\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01e4"+
		"\3\2\2\2\u01e4\u01e5\b\60\4\2\u01e5b\3\2\2\2\u01e6\u01e7\7,\2\2\u01e7"+
		"\u01e8\7,\2\2\u01e8\u01e9\7\61\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01eb\b\61"+
		"\5\2\u01ebd\3\2\2\2\u01ec\u01ee\13\2\2\2\u01ed\u01ec\3\2\2\2\u01ee\u01ef"+
		"\3\2\2\2\u01ef\u01f0\3\2\2\2\u01ef\u01ed\3\2\2\2\u01f0f\3\2\2\2\u01f1"+
		"\u01f2\7\17\2\2\u01f2\u01f3\7\f\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f5\b"+
		"\63\5\2\u01f5h\3\2\2\2\u01f6\u01f8\13\2\2\2\u01f7\u01f6\3\2\2\2\u01f8"+
		"\u01f9\3\2\2\2\u01f9\u01fa\3\2\2\2\u01f9\u01f7\3\2\2\2\u01faj\3\2\2\2"+
		"\26\2\3\4\u00aa\u00c8\u00f9\u0134\u017c\u0199\u01b9\u01bf\u01c6\u01ce"+
		"\u01d0\u01d7\u01d9\u01dd\u01e2\u01ef\u01f9\6\7\3\2\7\4\2\b\2\2\6\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}