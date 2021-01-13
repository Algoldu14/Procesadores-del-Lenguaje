// Generated from /Users/luis/Desktop/Universidad/ProcesadoresDeLenguaje/SegundaMatricula/Gramaticas/PECL2/gGramaticaLexer.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class gGramaticaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMENTARIOABRIR=1, COMENTARIOLINEA=2, ALGORITMO=3, FINALGORITMO=4, FUNCION=5, 
		FINFUNCION=6, DEFINIR=7, COMO=8, LEER=9, ESCRIBIR=10, SI=11, ENTONCES=12, 
		SINO=13, FINSI=14, PARA=15, HASTA=16, HACER=17, FINPARA=18, MIENTRAS=19, 
		FINMIENTRAS=20, REPETIR=21, HASTAQUE=22, SEGUN=23, DEOTROMODO=24, FINSEGUN=25, 
		TIPOS=26, DIMENSION=27, ASIGNACION=28, MAS=29, MENOS=30, IGUAL=31, MAYOR=32, 
		MENOR=33, COMA=34, DOSPUNTOS=35, PI=36, PD=37, CI=38, CD=39, DIGITO=40, 
		ID=41, PUNTOCOMA=42, TERMINAL=43, ESC=44, CADENA=45, WS=46, COMENTARIOCERRAR=47, 
		TEXTOCOMENTARIOML=48, FINAL_COMENTARIO_UL=49, TEXTOCOMENTARIOUL=50;
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
			"COMENTARIOABRIR", "COMENTARIOLINEA", "ALGORITMO", "FINALGORITMO", "FUNCION", 
			"FINFUNCION", "DEFINIR", "COMO", "LEER", "ESCRIBIR", "SI", "ENTONCES", 
			"SINO", "FINSI", "PARA", "HASTA", "HACER", "FINPARA", "MIENTRAS", "FINMIENTRAS", 
			"REPETIR", "HASTAQUE", "SEGUN", "DEOTROMODO", "FINSEGUN", "TIPOS", "DIMENSION", 
			"ASIGNACION", "MAS", "MENOS", "IGUAL", "MAYOR", "MENOR", "COMA", "DOSPUNTOS", 
			"PI", "PD", "CI", "CD", "DIGITO", "ID", "PUNTOCOMA", "TERMINAL", "ESC", 
			"CADENA", "WS", "COMENTARIOCERRAR", "TEXTOCOMENTARIOML", "FINAL_COMENTARIO_UL", 
			"TEXTOCOMENTARIOUL"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'/**'", "'//'", "'Algoritmo'", "'FinAlgoritmo'", "'Funcion'", 
			"'FinFuncion'", "'Definir'", "'Como'", "'Leer'", "'Escribir'", "'Si'", 
			"'Entonces'", "'SiNo'", "'FinSi'", "'Para'", "'Hasta'", "'Hacer'", "'FinPara'", 
			"'Mientras'", "'FinMientras'", "'Repetir'", "'Hasta Que'", "'Segun'", 
			"'De Otro Modo'", "'FinSegun'", null, "'Dimension'", "'<-'", "'+'", "'-'", 
			"'='", "'<'", "'>'", "','", "':'", "'('", "')'", "'['", "']'", null, 
			null, "';'", null, null, null, null, "'**/'", null, "'\r\n'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMENTARIOABRIR", "COMENTARIOLINEA", "ALGORITMO", "FINALGORITMO", 
			"FUNCION", "FINFUNCION", "DEFINIR", "COMO", "LEER", "ESCRIBIR", "SI", 
			"ENTONCES", "SINO", "FINSI", "PARA", "HASTA", "HACER", "FINPARA", "MIENTRAS", 
			"FINMIENTRAS", "REPETIR", "HASTAQUE", "SEGUN", "DEOTROMODO", "FINSEGUN", 
			"TIPOS", "DIMENSION", "ASIGNACION", "MAS", "MENOS", "IGUAL", "MAYOR", 
			"MENOR", "COMA", "DOSPUNTOS", "PI", "PD", "CI", "CD", "DIGITO", "ID", 
			"PUNTOCOMA", "TERMINAL", "ESC", "CADENA", "WS", "COMENTARIOCERRAR", "TEXTOCOMENTARIOML", 
			"FINAL_COMENTARIO_UL", "TEXTOCOMENTARIOUL"
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


	public gGramaticaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "gGramaticaLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\64\u01ae\b\1\b\1"+
		"\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4"+
		"\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t"+
		"\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t"+
		"\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t"+
		"\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4"+
		"*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63"+
		"\t\63\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0145\n\33\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\37\3\37"+
		"\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\6)\u016b"+
		"\n)\r)\16)\u016c\3*\3*\6*\u0171\n*\r*\16*\u0172\3+\3+\3,\6,\u0178\n,\r"+
		",\16,\u0179\3-\3-\3-\3.\3.\3.\7.\u0182\n.\f.\16.\u0185\13.\3.\3.\3.\3"+
		".\7.\u018b\n.\f.\16.\u018e\13.\3.\5.\u0191\n.\3/\6/\u0194\n/\r/\16/\u0195"+
		"\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\61\6\61\u01a1\n\61\r\61\16\61\u01a2"+
		"\3\62\3\62\3\62\3\62\3\62\3\63\6\63\u01ab\n\63\r\63\16\63\u01ac\6\u0183"+
		"\u018c\u01a2\u01ac\2\64\5\3\7\4\t\5\13\6\r\7\17\b\21\t\23\n\25\13\27\f"+
		"\31\r\33\16\35\17\37\20!\21#\22%\23\'\24)\25+\26-\27/\30\61\31\63\32\65"+
		"\33\67\349\35;\36=\37? A!C\"E#G$I%K&M\'O(Q)S*U+W,Y-[.]/_\60a\61c\62e\63"+
		"g\64\5\2\3\4\b\3\2\62;\4\2C\\c|\7\2//\62;C\\aac|\4\2\f\f\17\17\b\2$$^"+
		"^ddppttvv\6\2\13\f\17\17\"\"\uffff\uffff\2\u01b9\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2"+
		"\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2"+
		"\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2["+
		"\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\3a\3\2\2\2\3c\3\2\2\2\4e\3\2\2\2\4g\3\2"+
		"\2\2\5i\3\2\2\2\7o\3\2\2\2\tt\3\2\2\2\13~\3\2\2\2\r\u008b\3\2\2\2\17\u0093"+
		"\3\2\2\2\21\u009e\3\2\2\2\23\u00a6\3\2\2\2\25\u00ab\3\2\2\2\27\u00b0\3"+
		"\2\2\2\31\u00b9\3\2\2\2\33\u00bc\3\2\2\2\35\u00c5\3\2\2\2\37\u00ca\3\2"+
		"\2\2!\u00d0\3\2\2\2#\u00d5\3\2\2\2%\u00db\3\2\2\2\'\u00e1\3\2\2\2)\u00e9"+
		"\3\2\2\2+\u00f2\3\2\2\2-\u00fe\3\2\2\2/\u0106\3\2\2\2\61\u0110\3\2\2\2"+
		"\63\u0116\3\2\2\2\65\u0123\3\2\2\2\67\u0144\3\2\2\29\u0146\3\2\2\2;\u0150"+
		"\3\2\2\2=\u0153\3\2\2\2?\u0155\3\2\2\2A\u0157\3\2\2\2C\u0159\3\2\2\2E"+
		"\u015b\3\2\2\2G\u015d\3\2\2\2I\u015f\3\2\2\2K\u0161\3\2\2\2M\u0163\3\2"+
		"\2\2O\u0165\3\2\2\2Q\u0167\3\2\2\2S\u016a\3\2\2\2U\u016e\3\2\2\2W\u0174"+
		"\3\2\2\2Y\u0177\3\2\2\2[\u017b\3\2\2\2]\u0190\3\2\2\2_\u0193\3\2\2\2a"+
		"\u0199\3\2\2\2c\u01a0\3\2\2\2e\u01a4\3\2\2\2g\u01aa\3\2\2\2ij\7\61\2\2"+
		"jk\7,\2\2kl\7,\2\2lm\3\2\2\2mn\b\2\2\2n\6\3\2\2\2op\7\61\2\2pq\7\61\2"+
		"\2qr\3\2\2\2rs\b\3\3\2s\b\3\2\2\2tu\7C\2\2uv\7n\2\2vw\7i\2\2wx\7q\2\2"+
		"xy\7t\2\2yz\7k\2\2z{\7v\2\2{|\7o\2\2|}\7q\2\2}\n\3\2\2\2~\177\7H\2\2\177"+
		"\u0080\7k\2\2\u0080\u0081\7p\2\2\u0081\u0082\7C\2\2\u0082\u0083\7n\2\2"+
		"\u0083\u0084\7i\2\2\u0084\u0085\7q\2\2\u0085\u0086\7t\2\2\u0086\u0087"+
		"\7k\2\2\u0087\u0088\7v\2\2\u0088\u0089\7o\2\2\u0089\u008a\7q\2\2\u008a"+
		"\f\3\2\2\2\u008b\u008c\7H\2\2\u008c\u008d\7w\2\2\u008d\u008e\7p\2\2\u008e"+
		"\u008f\7e\2\2\u008f\u0090\7k\2\2\u0090\u0091\7q\2\2\u0091\u0092\7p\2\2"+
		"\u0092\16\3\2\2\2\u0093\u0094\7H\2\2\u0094\u0095\7k\2\2\u0095\u0096\7"+
		"p\2\2\u0096\u0097\7H\2\2\u0097\u0098\7w\2\2\u0098\u0099\7p\2\2\u0099\u009a"+
		"\7e\2\2\u009a\u009b\7k\2\2\u009b\u009c\7q\2\2\u009c\u009d\7p\2\2\u009d"+
		"\20\3\2\2\2\u009e\u009f\7F\2\2\u009f\u00a0\7g\2\2\u00a0\u00a1\7h\2\2\u00a1"+
		"\u00a2\7k\2\2\u00a2\u00a3\7p\2\2\u00a3\u00a4\7k\2\2\u00a4\u00a5\7t\2\2"+
		"\u00a5\22\3\2\2\2\u00a6\u00a7\7E\2\2\u00a7\u00a8\7q\2\2\u00a8\u00a9\7"+
		"o\2\2\u00a9\u00aa\7q\2\2\u00aa\24\3\2\2\2\u00ab\u00ac\7N\2\2\u00ac\u00ad"+
		"\7g\2\2\u00ad\u00ae\7g\2\2\u00ae\u00af\7t\2\2\u00af\26\3\2\2\2\u00b0\u00b1"+
		"\7G\2\2\u00b1\u00b2\7u\2\2\u00b2\u00b3\7e\2\2\u00b3\u00b4\7t\2\2\u00b4"+
		"\u00b5\7k\2\2\u00b5\u00b6\7d\2\2\u00b6\u00b7\7k\2\2\u00b7\u00b8\7t\2\2"+
		"\u00b8\30\3\2\2\2\u00b9\u00ba\7U\2\2\u00ba\u00bb\7k\2\2\u00bb\32\3\2\2"+
		"\2\u00bc\u00bd\7G\2\2\u00bd\u00be\7p\2\2\u00be\u00bf\7v\2\2\u00bf\u00c0"+
		"\7q\2\2\u00c0\u00c1\7p\2\2\u00c1\u00c2\7e\2\2\u00c2\u00c3\7g\2\2\u00c3"+
		"\u00c4\7u\2\2\u00c4\34\3\2\2\2\u00c5\u00c6\7U\2\2\u00c6\u00c7\7k\2\2\u00c7"+
		"\u00c8\7P\2\2\u00c8\u00c9\7q\2\2\u00c9\36\3\2\2\2\u00ca\u00cb\7H\2\2\u00cb"+
		"\u00cc\7k\2\2\u00cc\u00cd\7p\2\2\u00cd\u00ce\7U\2\2\u00ce\u00cf\7k\2\2"+
		"\u00cf \3\2\2\2\u00d0\u00d1\7R\2\2\u00d1\u00d2\7c\2\2\u00d2\u00d3\7t\2"+
		"\2\u00d3\u00d4\7c\2\2\u00d4\"\3\2\2\2\u00d5\u00d6\7J\2\2\u00d6\u00d7\7"+
		"c\2\2\u00d7\u00d8\7u\2\2\u00d8\u00d9\7v\2\2\u00d9\u00da\7c\2\2\u00da$"+
		"\3\2\2\2\u00db\u00dc\7J\2\2\u00dc\u00dd\7c\2\2\u00dd\u00de\7e\2\2\u00de"+
		"\u00df\7g\2\2\u00df\u00e0\7t\2\2\u00e0&\3\2\2\2\u00e1\u00e2\7H\2\2\u00e2"+
		"\u00e3\7k\2\2\u00e3\u00e4\7p\2\2\u00e4\u00e5\7R\2\2\u00e5\u00e6\7c\2\2"+
		"\u00e6\u00e7\7t\2\2\u00e7\u00e8\7c\2\2\u00e8(\3\2\2\2\u00e9\u00ea\7O\2"+
		"\2\u00ea\u00eb\7k\2\2\u00eb\u00ec\7g\2\2\u00ec\u00ed\7p\2\2\u00ed\u00ee"+
		"\7v\2\2\u00ee\u00ef\7t\2\2\u00ef\u00f0\7c\2\2\u00f0\u00f1\7u\2\2\u00f1"+
		"*\3\2\2\2\u00f2\u00f3\7H\2\2\u00f3\u00f4\7k\2\2\u00f4\u00f5\7p\2\2\u00f5"+
		"\u00f6\7O\2\2\u00f6\u00f7\7k\2\2\u00f7\u00f8\7g\2\2\u00f8\u00f9\7p\2\2"+
		"\u00f9\u00fa\7v\2\2\u00fa\u00fb\7t\2\2\u00fb\u00fc\7c\2\2\u00fc\u00fd"+
		"\7u\2\2\u00fd,\3\2\2\2\u00fe\u00ff\7T\2\2\u00ff\u0100\7g\2\2\u0100\u0101"+
		"\7r\2\2\u0101\u0102\7g\2\2\u0102\u0103\7v\2\2\u0103\u0104\7k\2\2\u0104"+
		"\u0105\7t\2\2\u0105.\3\2\2\2\u0106\u0107\7J\2\2\u0107\u0108\7c\2\2\u0108"+
		"\u0109\7u\2\2\u0109\u010a\7v\2\2\u010a\u010b\7c\2\2\u010b\u010c\7\"\2"+
		"\2\u010c\u010d\7S\2\2\u010d\u010e\7w\2\2\u010e\u010f\7g\2\2\u010f\60\3"+
		"\2\2\2\u0110\u0111\7U\2\2\u0111\u0112\7g\2\2\u0112\u0113\7i\2\2\u0113"+
		"\u0114\7w\2\2\u0114\u0115\7p\2\2\u0115\62\3\2\2\2\u0116\u0117\7F\2\2\u0117"+
		"\u0118\7g\2\2\u0118\u0119\7\"\2\2\u0119\u011a\7Q\2\2\u011a\u011b\7v\2"+
		"\2\u011b\u011c\7t\2\2\u011c\u011d\7q\2\2\u011d\u011e\7\"\2\2\u011e\u011f"+
		"\7O\2\2\u011f\u0120\7q\2\2\u0120\u0121\7f\2\2\u0121\u0122\7q\2\2\u0122"+
		"\64\3\2\2\2\u0123\u0124\7H\2\2\u0124\u0125\7k\2\2\u0125\u0126\7p\2\2\u0126"+
		"\u0127\7U\2\2\u0127\u0128\7g\2\2\u0128\u0129\7i\2\2\u0129\u012a\7w\2\2"+
		"\u012a\u012b\7p\2\2\u012b\66\3\2\2\2\u012c\u012d\7E\2\2\u012d\u012e\7"+
		"c\2\2\u012e\u012f\7t\2\2\u012f\u0130\7c\2\2\u0130\u0131\7e\2\2\u0131\u0132"+
		"\7v\2\2\u0132\u0133\7g\2\2\u0133\u0145\7t\2\2\u0134\u0135\7G\2\2\u0135"+
		"\u0136\7p\2\2\u0136\u0137\7v\2\2\u0137\u0138\7g\2\2\u0138\u0139\7t\2\2"+
		"\u0139\u0145\7q\2\2\u013a\u013b\7T\2\2\u013b\u013c\7g\2\2\u013c\u013d"+
		"\7c\2\2\u013d\u0145\7n\2\2\u013e\u013f\7N\2\2\u013f\u0140\7q\2\2\u0140"+
		"\u0141\7i\2\2\u0141\u0142\7k\2\2\u0142\u0143\7e\2\2\u0143\u0145\7q\2\2"+
		"\u0144\u012c\3\2\2\2\u0144\u0134\3\2\2\2\u0144\u013a\3\2\2\2\u0144\u013e"+
		"\3\2\2\2\u01458\3\2\2\2\u0146\u0147\7F\2\2\u0147\u0148\7k\2\2\u0148\u0149"+
		"\7o\2\2\u0149\u014a\7g\2\2\u014a\u014b\7p\2\2\u014b\u014c\7u\2\2\u014c"+
		"\u014d\7k\2\2\u014d\u014e\7q\2\2\u014e\u014f\7p\2\2\u014f:\3\2\2\2\u0150"+
		"\u0151\7>\2\2\u0151\u0152\7/\2\2\u0152<\3\2\2\2\u0153\u0154\7-\2\2\u0154"+
		">\3\2\2\2\u0155\u0156\7/\2\2\u0156@\3\2\2\2\u0157\u0158\7?\2\2\u0158B"+
		"\3\2\2\2\u0159\u015a\7>\2\2\u015aD\3\2\2\2\u015b\u015c\7@\2\2\u015cF\3"+
		"\2\2\2\u015d\u015e\7.\2\2\u015eH\3\2\2\2\u015f\u0160\7<\2\2\u0160J\3\2"+
		"\2\2\u0161\u0162\7*\2\2\u0162L\3\2\2\2\u0163\u0164\7+\2\2\u0164N\3\2\2"+
		"\2\u0165\u0166\7]\2\2\u0166P\3\2\2\2\u0167\u0168\7_\2\2\u0168R\3\2\2\2"+
		"\u0169\u016b\t\2\2\2\u016a\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016a"+
		"\3\2\2\2\u016c\u016d\3\2\2\2\u016dT\3\2\2\2\u016e\u0170\t\3\2\2\u016f"+
		"\u0171\t\4\2\2\u0170\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0170\3\2"+
		"\2\2\u0172\u0173\3\2\2\2\u0173V\3\2\2\2\u0174\u0175\7=\2\2\u0175X\3\2"+
		"\2\2\u0176\u0178\t\5\2\2\u0177\u0176\3\2\2\2\u0178\u0179\3\2\2\2\u0179"+
		"\u0177\3\2\2\2\u0179\u017a\3\2\2\2\u017aZ\3\2\2\2\u017b\u017c\7^\2\2\u017c"+
		"\u017d\t\6\2\2\u017d\\\3\2\2\2\u017e\u0183\7)\2\2\u017f\u0182\5[-\2\u0180"+
		"\u0182\13\2\2\2\u0181\u017f\3\2\2\2\u0181\u0180\3\2\2\2\u0182\u0185\3"+
		"\2\2\2\u0183\u0184\3\2\2\2\u0183\u0181\3\2\2\2\u0184\u0186\3\2\2\2\u0185"+
		"\u0183\3\2\2\2\u0186\u0191\7)\2\2\u0187\u018c\7$\2\2\u0188\u018b\5[-\2"+
		"\u0189\u018b\13\2\2\2\u018a\u0188\3\2\2\2\u018a\u0189\3\2\2\2\u018b\u018e"+
		"\3\2\2\2\u018c\u018d\3\2\2\2\u018c\u018a\3\2\2\2\u018d\u018f\3\2\2\2\u018e"+
		"\u018c\3\2\2\2\u018f\u0191\7$\2\2\u0190\u017e\3\2\2\2\u0190\u0187\3\2"+
		"\2\2\u0191^\3\2\2\2\u0192\u0194\t\7\2\2\u0193\u0192\3\2\2\2\u0194\u0195"+
		"\3\2\2\2\u0195\u0193\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0197\3\2\2\2\u0197"+
		"\u0198\b/\4\2\u0198`\3\2\2\2\u0199\u019a\7,\2\2\u019a\u019b\7,\2\2\u019b"+
		"\u019c\7\61\2\2\u019c\u019d\3\2\2\2\u019d\u019e\b\60\5\2\u019eb\3\2\2"+
		"\2\u019f\u01a1\13\2\2\2\u01a0\u019f\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2"+
		"\u01a3\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a3d\3\2\2\2\u01a4\u01a5\7\17\2\2"+
		"\u01a5\u01a6\7\f\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01a8\b\62\5\2\u01a8f\3"+
		"\2\2\2\u01a9\u01ab\13\2\2\2\u01aa\u01a9\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac"+
		"\u01ad\3\2\2\2\u01ac\u01aa\3\2\2\2\u01adh\3\2\2\2\21\2\3\4\u0144\u016c"+
		"\u0172\u0179\u0181\u0183\u018a\u018c\u0190\u0195\u01a2\u01ac\6\7\3\2\7"+
		"\4\2\b\2\2\6\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}