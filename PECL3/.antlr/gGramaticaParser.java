// Generated from /Users/luis/Desktop/Universidad/ProcesadoresDeLenguaje/SegundaMatricula/Gramaticas/PECL2/gGramaticaParser.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class gGramaticaParser extends Parser {
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
		RULE_prog = 0, RULE_definicion = 1, RULE_algoritmo = 2, RULE_si = 3, RULE_para = 4, 
		RULE_mientras = 5, RULE_repetir = 6, RULE_segun = 7, RULE_funcion = 8, 
		RULE_argumentos = 9, RULE_dimension = 10, RULE_bloq = 11, RULE_expr = 12, 
		RULE_linea = 13, RULE_op = 14, RULE_textos = 15, RULE_cabezafuncion = 16, 
		RULE_cuerpofuncion = 17, RULE_comentario = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "definicion", "algoritmo", "si", "para", "mientras", "repetir", 
			"segun", "funcion", "argumentos", "dimension", "bloq", "expr", "linea", 
			"op", "textos", "cabezafuncion", "cuerpofuncion", "comentario"
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

	@Override
	public String getGrammarFileName() { return "gGramaticaParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public gGramaticaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public List<TerminalNode> TERMINAL() { return getTokens(gGramaticaParser.TERMINAL); }
		public TerminalNode TERMINAL(int i) {
			return getToken(gGramaticaParser.TERMINAL, i);
		}
		public List<AlgoritmoContext> algoritmo() {
			return getRuleContexts(AlgoritmoContext.class);
		}
		public AlgoritmoContext algoritmo(int i) {
			return getRuleContext(AlgoritmoContext.class,i);
		}
		public List<FuncionContext> funcion() {
			return getRuleContexts(FuncionContext.class);
		}
		public FuncionContext funcion(int i) {
			return getRuleContext(FuncionContext.class,i);
		}
		public List<ComentarioContext> comentario() {
			return getRuleContexts(ComentarioContext.class);
		}
		public ComentarioContext comentario(int i) {
			return getRuleContext(ComentarioContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMENTARIOABRIR) | (1L << COMENTARIOLINEA) | (1L << ALGORITMO) | (1L << FUNCION))) != 0)) {
				{
				{
				setState(41);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ALGORITMO:
					{
					setState(38);
					algoritmo();
					}
					break;
				case FUNCION:
					{
					setState(39);
					funcion();
					}
					break;
				case COMENTARIOABRIR:
				case COMENTARIOLINEA:
					{
					setState(40);
					comentario();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(43);
				match(TERMINAL);
				}
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class DefinicionContext extends ParserRuleContext {
		public TerminalNode DEFINIR() { return getToken(gGramaticaParser.DEFINIR, 0); }
		public TerminalNode ID() { return getToken(gGramaticaParser.ID, 0); }
		public TerminalNode COMO() { return getToken(gGramaticaParser.COMO, 0); }
		public TerminalNode TIPOS() { return getToken(gGramaticaParser.TIPOS, 0); }
		public TerminalNode PUNTOCOMA() { return getToken(gGramaticaParser.PUNTOCOMA, 0); }
		public DefinicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definicion; }
	}

	public final DefinicionContext definicion() throws RecognitionException {
		DefinicionContext _localctx = new DefinicionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_definicion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(DEFINIR);
			setState(51);
			match(ID);
			setState(52);
			match(COMO);
			setState(53);
			match(TIPOS);
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PUNTOCOMA) {
				{
				setState(54);
				match(PUNTOCOMA);
				}
			}

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

	public static class AlgoritmoContext extends ParserRuleContext {
		public TerminalNode ALGORITMO() { return getToken(gGramaticaParser.ALGORITMO, 0); }
		public TerminalNode ID() { return getToken(gGramaticaParser.ID, 0); }
		public TerminalNode FINALGORITMO() { return getToken(gGramaticaParser.FINALGORITMO, 0); }
		public TerminalNode TERMINAL() { return getToken(gGramaticaParser.TERMINAL, 0); }
		public List<LineaContext> linea() {
			return getRuleContexts(LineaContext.class);
		}
		public LineaContext linea(int i) {
			return getRuleContext(LineaContext.class,i);
		}
		public List<BloqContext> bloq() {
			return getRuleContexts(BloqContext.class);
		}
		public BloqContext bloq(int i) {
			return getRuleContext(BloqContext.class,i);
		}
		public AlgoritmoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_algoritmo; }
	}

	public final AlgoritmoContext algoritmo() throws RecognitionException {
		AlgoritmoContext _localctx = new AlgoritmoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_algoritmo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(ALGORITMO);
			setState(58);
			match(ID);
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TERMINAL) {
				{
				setState(59);
				match(TERMINAL);
				}
			}

			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMENTARIOABRIR) | (1L << COMENTARIOLINEA) | (1L << DEFINIR) | (1L << LEER) | (1L << ESCRIBIR) | (1L << SI) | (1L << PARA) | (1L << MIENTRAS) | (1L << REPETIR) | (1L << SEGUN) | (1L << DIMENSION) | (1L << DIGITO) | (1L << ID) | (1L << CADENA))) != 0)) {
				{
				setState(64);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case COMENTARIOABRIR:
				case COMENTARIOLINEA:
				case LEER:
				case ESCRIBIR:
				case DIGITO:
				case ID:
				case CADENA:
					{
					setState(62);
					linea();
					}
					break;
				case DEFINIR:
				case SI:
				case PARA:
				case MIENTRAS:
				case REPETIR:
				case SEGUN:
				case DIMENSION:
					{
					setState(63);
					bloq();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(69);
			match(FINALGORITMO);
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

	public static class SiContext extends ParserRuleContext {
		public TerminalNode SI() { return getToken(gGramaticaParser.SI, 0); }
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public TerminalNode ENTONCES() { return getToken(gGramaticaParser.ENTONCES, 0); }
		public TerminalNode FINSI() { return getToken(gGramaticaParser.FINSI, 0); }
		public TerminalNode TERMINAL() { return getToken(gGramaticaParser.TERMINAL, 0); }
		public List<LineaContext> linea() {
			return getRuleContexts(LineaContext.class);
		}
		public LineaContext linea(int i) {
			return getRuleContext(LineaContext.class,i);
		}
		public TerminalNode SINO() { return getToken(gGramaticaParser.SINO, 0); }
		public SiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_si; }
	}

	public final SiContext si() throws RecognitionException {
		SiContext _localctx = new SiContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_si);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(SI);
			setState(72);
			op();
			setState(73);
			match(ENTONCES);
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMENTARIOABRIR) | (1L << COMENTARIOLINEA) | (1L << LEER) | (1L << ESCRIBIR) | (1L << DIGITO) | (1L << ID) | (1L << CADENA))) != 0)) {
				{
				{
				setState(74);
				linea();
				}
				}
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SINO) {
				{
				setState(80);
				match(SINO);
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMENTARIOABRIR) | (1L << COMENTARIOLINEA) | (1L << LEER) | (1L << ESCRIBIR) | (1L << DIGITO) | (1L << ID) | (1L << CADENA))) != 0)) {
					{
					{
					setState(81);
					linea();
					}
					}
					setState(86);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(89);
			match(FINSI);
			setState(90);
			match(TERMINAL);
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

	public static class ParaContext extends ParserRuleContext {
		public TerminalNode PARA() { return getToken(gGramaticaParser.PARA, 0); }
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public TerminalNode HASTA() { return getToken(gGramaticaParser.HASTA, 0); }
		public TerminalNode DIGITO() { return getToken(gGramaticaParser.DIGITO, 0); }
		public TerminalNode HACER() { return getToken(gGramaticaParser.HACER, 0); }
		public TerminalNode FINPARA() { return getToken(gGramaticaParser.FINPARA, 0); }
		public TerminalNode TERMINAL() { return getToken(gGramaticaParser.TERMINAL, 0); }
		public List<LineaContext> linea() {
			return getRuleContexts(LineaContext.class);
		}
		public LineaContext linea(int i) {
			return getRuleContext(LineaContext.class,i);
		}
		public ParaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_para; }
	}

	public final ParaContext para() throws RecognitionException {
		ParaContext _localctx = new ParaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_para);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(PARA);
			setState(93);
			op();
			setState(94);
			match(HASTA);
			setState(95);
			match(DIGITO);
			setState(96);
			match(HACER);
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMENTARIOABRIR) | (1L << COMENTARIOLINEA) | (1L << LEER) | (1L << ESCRIBIR) | (1L << DIGITO) | (1L << ID) | (1L << CADENA))) != 0)) {
				{
				{
				setState(97);
				linea();
				}
				}
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(103);
			match(FINPARA);
			setState(104);
			match(TERMINAL);
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

	public static class MientrasContext extends ParserRuleContext {
		public TerminalNode MIENTRAS() { return getToken(gGramaticaParser.MIENTRAS, 0); }
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public TerminalNode HACER() { return getToken(gGramaticaParser.HACER, 0); }
		public TerminalNode FINMIENTRAS() { return getToken(gGramaticaParser.FINMIENTRAS, 0); }
		public TerminalNode TERMINAL() { return getToken(gGramaticaParser.TERMINAL, 0); }
		public List<LineaContext> linea() {
			return getRuleContexts(LineaContext.class);
		}
		public LineaContext linea(int i) {
			return getRuleContext(LineaContext.class,i);
		}
		public MientrasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mientras; }
	}

	public final MientrasContext mientras() throws RecognitionException {
		MientrasContext _localctx = new MientrasContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_mientras);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(MIENTRAS);
			setState(107);
			op();
			setState(108);
			match(HACER);
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMENTARIOABRIR) | (1L << COMENTARIOLINEA) | (1L << LEER) | (1L << ESCRIBIR) | (1L << DIGITO) | (1L << ID) | (1L << CADENA))) != 0)) {
				{
				{
				setState(109);
				linea();
				}
				}
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(115);
			match(FINMIENTRAS);
			setState(116);
			match(TERMINAL);
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

	public static class RepetirContext extends ParserRuleContext {
		public TerminalNode REPETIR() { return getToken(gGramaticaParser.REPETIR, 0); }
		public TerminalNode HASTAQUE() { return getToken(gGramaticaParser.HASTAQUE, 0); }
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public TerminalNode TERMINAL() { return getToken(gGramaticaParser.TERMINAL, 0); }
		public List<LineaContext> linea() {
			return getRuleContexts(LineaContext.class);
		}
		public LineaContext linea(int i) {
			return getRuleContext(LineaContext.class,i);
		}
		public RepetirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repetir; }
	}

	public final RepetirContext repetir() throws RecognitionException {
		RepetirContext _localctx = new RepetirContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_repetir);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(REPETIR);
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMENTARIOABRIR) | (1L << COMENTARIOLINEA) | (1L << LEER) | (1L << ESCRIBIR) | (1L << DIGITO) | (1L << ID) | (1L << CADENA))) != 0)) {
				{
				{
				setState(119);
				linea();
				}
				}
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(125);
			match(HASTAQUE);
			setState(126);
			op();
			setState(127);
			match(TERMINAL);
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

	public static class SegunContext extends ParserRuleContext {
		public TerminalNode SEGUN() { return getToken(gGramaticaParser.SEGUN, 0); }
		public TerminalNode ID() { return getToken(gGramaticaParser.ID, 0); }
		public TerminalNode HACER() { return getToken(gGramaticaParser.HACER, 0); }
		public TerminalNode FINSEGUN() { return getToken(gGramaticaParser.FINSEGUN, 0); }
		public List<TerminalNode> TERMINAL() { return getTokens(gGramaticaParser.TERMINAL); }
		public TerminalNode TERMINAL(int i) {
			return getToken(gGramaticaParser.TERMINAL, i);
		}
		public List<TerminalNode> DOSPUNTOS() { return getTokens(gGramaticaParser.DOSPUNTOS); }
		public TerminalNode DOSPUNTOS(int i) {
			return getToken(gGramaticaParser.DOSPUNTOS, i);
		}
		public TerminalNode DEOTROMODO() { return getToken(gGramaticaParser.DEOTROMODO, 0); }
		public List<TerminalNode> CADENA() { return getTokens(gGramaticaParser.CADENA); }
		public TerminalNode CADENA(int i) {
			return getToken(gGramaticaParser.CADENA, i);
		}
		public List<TerminalNode> DIGITO() { return getTokens(gGramaticaParser.DIGITO); }
		public TerminalNode DIGITO(int i) {
			return getToken(gGramaticaParser.DIGITO, i);
		}
		public List<LineaContext> linea() {
			return getRuleContexts(LineaContext.class);
		}
		public LineaContext linea(int i) {
			return getRuleContext(LineaContext.class,i);
		}
		public SegunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_segun; }
	}

	public final SegunContext segun() throws RecognitionException {
		SegunContext _localctx = new SegunContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_segun);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(SEGUN);
			setState(130);
			match(ID);
			setState(131);
			match(HACER);
			setState(141); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(132);
				_la = _input.LA(1);
				if ( !(_la==DIGITO || _la==CADENA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(133);
				match(DOSPUNTOS);
				setState(134);
				match(TERMINAL);
				setState(138);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(135);
						linea();
						}
						} 
					}
					setState(140);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				}
				}
				setState(143); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGITO || _la==CADENA );
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEOTROMODO) {
				{
				setState(145);
				match(DEOTROMODO);
				setState(146);
				match(DOSPUNTOS);
				setState(147);
				match(TERMINAL);
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMENTARIOABRIR) | (1L << COMENTARIOLINEA) | (1L << LEER) | (1L << ESCRIBIR) | (1L << DIGITO) | (1L << ID) | (1L << CADENA))) != 0)) {
					{
					{
					setState(148);
					linea();
					}
					}
					setState(153);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(156);
			match(FINSEGUN);
			setState(157);
			match(TERMINAL);
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

	public static class FuncionContext extends ParserRuleContext {
		public CabezafuncionContext cabezafuncion() {
			return getRuleContext(CabezafuncionContext.class,0);
		}
		public CuerpofuncionContext cuerpofuncion() {
			return getRuleContext(CuerpofuncionContext.class,0);
		}
		public TerminalNode FINFUNCION() { return getToken(gGramaticaParser.FINFUNCION, 0); }
		public FuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcion; }
	}

	public final FuncionContext funcion() throws RecognitionException {
		FuncionContext _localctx = new FuncionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_funcion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			cabezafuncion();
			setState(160);
			cuerpofuncion();
			setState(161);
			match(FINFUNCION);
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

	public static class ArgumentosContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(gGramaticaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(gGramaticaParser.ID, i);
		}
		public List<TerminalNode> COMA() { return getTokens(gGramaticaParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(gGramaticaParser.COMA, i);
		}
		public ArgumentosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentos; }
	}

	public final ArgumentosContext argumentos() throws RecognitionException {
		ArgumentosContext _localctx = new ArgumentosContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_argumentos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(ID);
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(164);
				match(COMA);
				setState(165);
				match(ID);
				}
				}
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class DimensionContext extends ParserRuleContext {
		public TerminalNode DIMENSION() { return getToken(gGramaticaParser.DIMENSION, 0); }
		public TerminalNode ID() { return getToken(gGramaticaParser.ID, 0); }
		public TerminalNode CI() { return getToken(gGramaticaParser.CI, 0); }
		public TerminalNode DIGITO() { return getToken(gGramaticaParser.DIGITO, 0); }
		public TerminalNode CD() { return getToken(gGramaticaParser.CD, 0); }
		public DimensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimension; }
	}

	public final DimensionContext dimension() throws RecognitionException {
		DimensionContext _localctx = new DimensionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_dimension);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(DIMENSION);
			setState(172);
			match(ID);
			setState(173);
			match(CI);
			setState(174);
			match(DIGITO);
			setState(175);
			match(CD);
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

	public static class BloqContext extends ParserRuleContext {
		public DefinicionContext definicion() {
			return getRuleContext(DefinicionContext.class,0);
		}
		public SiContext si() {
			return getRuleContext(SiContext.class,0);
		}
		public ParaContext para() {
			return getRuleContext(ParaContext.class,0);
		}
		public MientrasContext mientras() {
			return getRuleContext(MientrasContext.class,0);
		}
		public RepetirContext repetir() {
			return getRuleContext(RepetirContext.class,0);
		}
		public SegunContext segun() {
			return getRuleContext(SegunContext.class,0);
		}
		public DimensionContext dimension() {
			return getRuleContext(DimensionContext.class,0);
		}
		public BloqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloq; }
	}

	public final BloqContext bloq() throws RecognitionException {
		BloqContext _localctx = new BloqContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_bloq);
		try {
			setState(184);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEFINIR:
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
				definicion();
				}
				break;
			case SI:
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				si();
				}
				break;
			case PARA:
				enterOuterAlt(_localctx, 3);
				{
				setState(179);
				para();
				}
				break;
			case MIENTRAS:
				enterOuterAlt(_localctx, 4);
				{
				setState(180);
				mientras();
				}
				break;
			case REPETIR:
				enterOuterAlt(_localctx, 5);
				{
				setState(181);
				repetir();
				}
				break;
			case SEGUN:
				enterOuterAlt(_localctx, 6);
				{
				setState(182);
				segun();
				}
				break;
			case DIMENSION:
				enterOuterAlt(_localctx, 7);
				{
				setState(183);
				dimension();
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

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode ESCRIBIR() { return getToken(gGramaticaParser.ESCRIBIR, 0); }
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public ComentarioContext comentario() {
			return getRuleContext(ComentarioContext.class,0);
		}
		public TerminalNode LEER() { return getToken(gGramaticaParser.LEER, 0); }
		public TerminalNode ID() { return getToken(gGramaticaParser.ID, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expr);
		try {
			setState(198);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ESCRIBIR:
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				match(ESCRIBIR);
				setState(187);
				op();
				setState(189);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(188);
					comentario();
					}
					break;
				}
				}
				break;
			case LEER:
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
				match(LEER);
				setState(192);
				match(ID);
				setState(194);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(193);
					comentario();
					}
					break;
				}
				}
				break;
			case COMENTARIOABRIR:
			case COMENTARIOLINEA:
				enterOuterAlt(_localctx, 3);
				{
				setState(196);
				comentario();
				}
				break;
			case DIGITO:
			case ID:
			case CADENA:
				enterOuterAlt(_localctx, 4);
				{
				setState(197);
				op();
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

	public static class LineaContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PUNTOCOMA() { return getToken(gGramaticaParser.PUNTOCOMA, 0); }
		public LineaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linea; }
	}

	public final LineaContext linea() throws RecognitionException {
		LineaContext _localctx = new LineaContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_linea);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			expr();
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PUNTOCOMA) {
				{
				setState(201);
				match(PUNTOCOMA);
				}
			}

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

	public static class OpContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(gGramaticaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(gGramaticaParser.ID, i);
		}
		public TerminalNode ASIGNACION() { return getToken(gGramaticaParser.ASIGNACION, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> DIGITO() { return getTokens(gGramaticaParser.DIGITO); }
		public TerminalNode DIGITO(int i) {
			return getToken(gGramaticaParser.DIGITO, i);
		}
		public List<TerminalNode> MAS() { return getTokens(gGramaticaParser.MAS); }
		public TerminalNode MAS(int i) {
			return getToken(gGramaticaParser.MAS, i);
		}
		public List<TerminalNode> MENOS() { return getTokens(gGramaticaParser.MENOS); }
		public TerminalNode MENOS(int i) {
			return getToken(gGramaticaParser.MENOS, i);
		}
		public List<TerminalNode> CADENA() { return getTokens(gGramaticaParser.CADENA); }
		public TerminalNode CADENA(int i) {
			return getToken(gGramaticaParser.CADENA, i);
		}
		public List<TerminalNode> COMA() { return getTokens(gGramaticaParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(gGramaticaParser.COMA, i);
		}
		public TerminalNode IGUAL() { return getToken(gGramaticaParser.IGUAL, 0); }
		public TerminalNode MAYOR() { return getToken(gGramaticaParser.MAYOR, 0); }
		public TerminalNode MENOR() { return getToken(gGramaticaParser.MENOR, 0); }
		public TerminalNode PI() { return getToken(gGramaticaParser.PI, 0); }
		public TerminalNode PD() { return getToken(gGramaticaParser.PD, 0); }
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_op);
		int _la;
		try {
			setState(236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				match(ID);
				setState(205);
				match(ASIGNACION);
				setState(206);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(208);
				_la = _input.LA(1);
				if ( !(_la==DIGITO || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MAS || _la==MENOS) {
					{
					{
					setState(209);
					_la = _input.LA(1);
					if ( !(_la==MAS || _la==MENOS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(210);
					_la = _input.LA(1);
					if ( !(_la==DIGITO || _la==ID) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(215);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(216);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==CADENA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MAS || _la==COMA) {
					{
					{
					setState(217);
					_la = _input.LA(1);
					if ( !(_la==MAS || _la==COMA) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(218);
					_la = _input.LA(1);
					if ( !(_la==ID || _la==CADENA) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(223);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(224);
				match(ID);
				setState(225);
				match(IGUAL);
				setState(226);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==CADENA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(227);
				match(ID);
				setState(228);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IGUAL) | (1L << MAYOR) | (1L << MENOR))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(229);
				match(DIGITO);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(230);
				match(ID);
				setState(231);
				match(PI);
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(232);
					match(ID);
					}
				}

				setState(235);
				match(PD);
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

	public static class TextosContext extends ParserRuleContext {
		public List<TerminalNode> TEXTOCOMENTARIOML() { return getTokens(gGramaticaParser.TEXTOCOMENTARIOML); }
		public TerminalNode TEXTOCOMENTARIOML(int i) {
			return getToken(gGramaticaParser.TEXTOCOMENTARIOML, i);
		}
		public List<TerminalNode> TEXTOCOMENTARIOUL() { return getTokens(gGramaticaParser.TEXTOCOMENTARIOUL); }
		public TerminalNode TEXTOCOMENTARIOUL(int i) {
			return getToken(gGramaticaParser.TEXTOCOMENTARIOUL, i);
		}
		public TextosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textos; }
	}

	public final TextosContext textos() throws RecognitionException {
		TextosContext _localctx = new TextosContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_textos);
		try {
			int _alt;
			setState(248);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXTOCOMENTARIOML:
				enterOuterAlt(_localctx, 1);
				{
				setState(239); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(238);
						match(TEXTOCOMENTARIOML);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(241); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case TEXTOCOMENTARIOUL:
				enterOuterAlt(_localctx, 2);
				{
				setState(244); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(243);
						match(TEXTOCOMENTARIOUL);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(246); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class CabezafuncionContext extends ParserRuleContext {
		public TerminalNode FUNCION() { return getToken(gGramaticaParser.FUNCION, 0); }
		public List<TerminalNode> ID() { return getTokens(gGramaticaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(gGramaticaParser.ID, i);
		}
		public TerminalNode ASIGNACION() { return getToken(gGramaticaParser.ASIGNACION, 0); }
		public TerminalNode PI() { return getToken(gGramaticaParser.PI, 0); }
		public TerminalNode PD() { return getToken(gGramaticaParser.PD, 0); }
		public TerminalNode TERMINAL() { return getToken(gGramaticaParser.TERMINAL, 0); }
		public ArgumentosContext argumentos() {
			return getRuleContext(ArgumentosContext.class,0);
		}
		public CabezafuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cabezafuncion; }
	}

	public final CabezafuncionContext cabezafuncion() throws RecognitionException {
		CabezafuncionContext _localctx = new CabezafuncionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_cabezafuncion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(FUNCION);
			setState(251);
			match(ID);
			setState(252);
			match(ASIGNACION);
			setState(253);
			match(ID);
			setState(254);
			match(PI);
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(255);
				argumentos();
				}
			}

			setState(258);
			match(PD);
			setState(259);
			match(TERMINAL);
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

	public static class CuerpofuncionContext extends ParserRuleContext {
		public List<LineaContext> linea() {
			return getRuleContexts(LineaContext.class);
		}
		public LineaContext linea(int i) {
			return getRuleContext(LineaContext.class,i);
		}
		public List<TerminalNode> TERMINAL() { return getTokens(gGramaticaParser.TERMINAL); }
		public TerminalNode TERMINAL(int i) {
			return getToken(gGramaticaParser.TERMINAL, i);
		}
		public CuerpofuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cuerpofuncion; }
	}

	public final CuerpofuncionContext cuerpofuncion() throws RecognitionException {
		CuerpofuncionContext _localctx = new CuerpofuncionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_cuerpofuncion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMENTARIOABRIR) | (1L << COMENTARIOLINEA) | (1L << LEER) | (1L << ESCRIBIR) | (1L << DIGITO) | (1L << ID) | (1L << TERMINAL) | (1L << CADENA))) != 0)) {
				{
				setState(263);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case COMENTARIOABRIR:
				case COMENTARIOLINEA:
				case LEER:
				case ESCRIBIR:
				case DIGITO:
				case ID:
				case CADENA:
					{
					setState(261);
					linea();
					}
					break;
				case TERMINAL:
					{
					setState(262);
					match(TERMINAL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class ComentarioContext extends ParserRuleContext {
		public TerminalNode COMENTARIOABRIR() { return getToken(gGramaticaParser.COMENTARIOABRIR, 0); }
		public TerminalNode COMENTARIOCERRAR() { return getToken(gGramaticaParser.COMENTARIOCERRAR, 0); }
		public List<TextosContext> textos() {
			return getRuleContexts(TextosContext.class);
		}
		public TextosContext textos(int i) {
			return getRuleContext(TextosContext.class,i);
		}
		public List<TerminalNode> TERMINAL() { return getTokens(gGramaticaParser.TERMINAL); }
		public TerminalNode TERMINAL(int i) {
			return getToken(gGramaticaParser.TERMINAL, i);
		}
		public TerminalNode COMENTARIOLINEA() { return getToken(gGramaticaParser.COMENTARIOLINEA, 0); }
		public TerminalNode FINAL_COMENTARIO_UL() { return getToken(gGramaticaParser.FINAL_COMENTARIO_UL, 0); }
		public ComentarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comentario; }
	}

	public final ComentarioContext comentario() throws RecognitionException {
		ComentarioContext _localctx = new ComentarioContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_comentario);
		int _la;
		try {
			setState(285);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMENTARIOABRIR:
				enterOuterAlt(_localctx, 1);
				{
				setState(268);
				match(COMENTARIOABRIR);
				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TERMINAL) | (1L << TEXTOCOMENTARIOML) | (1L << TEXTOCOMENTARIOUL))) != 0)) {
					{
					setState(271);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case TEXTOCOMENTARIOML:
					case TEXTOCOMENTARIOUL:
						{
						setState(269);
						textos();
						}
						break;
					case TERMINAL:
						{
						setState(270);
						match(TERMINAL);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(275);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(276);
				match(COMENTARIOCERRAR);
				}
				break;
			case COMENTARIOLINEA:
				enterOuterAlt(_localctx, 2);
				{
				setState(277);
				match(COMENTARIOLINEA);
				setState(281);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TEXTOCOMENTARIOML || _la==TEXTOCOMENTARIOUL) {
					{
					{
					setState(278);
					textos();
					}
					}
					setState(283);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(284);
				match(FINAL_COMENTARIO_UL);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\64\u0122\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\5\2,\n\2\3\2\3\2\7\2\60\n\2\f\2\16\2"+
		"\63\13\2\3\3\3\3\3\3\3\3\3\3\5\3:\n\3\3\4\3\4\3\4\5\4?\n\4\3\4\3\4\7\4"+
		"C\n\4\f\4\16\4F\13\4\3\4\3\4\3\5\3\5\3\5\3\5\7\5N\n\5\f\5\16\5Q\13\5\3"+
		"\5\3\5\7\5U\n\5\f\5\16\5X\13\5\5\5Z\n\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\7\6e\n\6\f\6\16\6h\13\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\7\7q\n\7\f"+
		"\7\16\7t\13\7\3\7\3\7\3\7\3\b\3\b\7\b{\n\b\f\b\16\b~\13\b\3\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u008b\n\t\f\t\16\t\u008e\13\t\6\t"+
		"\u0090\n\t\r\t\16\t\u0091\3\t\3\t\3\t\3\t\7\t\u0098\n\t\f\t\16\t\u009b"+
		"\13\t\5\t\u009d\n\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\7\13\u00a9"+
		"\n\13\f\13\16\13\u00ac\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\5\r\u00bb\n\r\3\16\3\16\3\16\5\16\u00c0\n\16\3\16\3\16\3\16"+
		"\5\16\u00c5\n\16\3\16\3\16\5\16\u00c9\n\16\3\17\3\17\5\17\u00cd\n\17\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u00d6\n\20\f\20\16\20\u00d9\13"+
		"\20\3\20\3\20\3\20\7\20\u00de\n\20\f\20\16\20\u00e1\13\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00ec\n\20\3\20\5\20\u00ef\n\20"+
		"\3\21\6\21\u00f2\n\21\r\21\16\21\u00f3\3\21\6\21\u00f7\n\21\r\21\16\21"+
		"\u00f8\5\21\u00fb\n\21\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0103\n\22\3"+
		"\22\3\22\3\22\3\23\3\23\7\23\u010a\n\23\f\23\16\23\u010d\13\23\3\24\3"+
		"\24\3\24\7\24\u0112\n\24\f\24\16\24\u0115\13\24\3\24\3\24\3\24\7\24\u011a"+
		"\n\24\f\24\16\24\u011d\13\24\3\24\5\24\u0120\n\24\3\24\2\2\25\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&\2\b\4\2**//\3\2*+\3\2\37 \4\2++/"+
		"/\4\2\37\37$$\3\2!#\2\u013f\2\61\3\2\2\2\4\64\3\2\2\2\6;\3\2\2\2\bI\3"+
		"\2\2\2\n^\3\2\2\2\fl\3\2\2\2\16x\3\2\2\2\20\u0083\3\2\2\2\22\u00a1\3\2"+
		"\2\2\24\u00a5\3\2\2\2\26\u00ad\3\2\2\2\30\u00ba\3\2\2\2\32\u00c8\3\2\2"+
		"\2\34\u00ca\3\2\2\2\36\u00ee\3\2\2\2 \u00fa\3\2\2\2\"\u00fc\3\2\2\2$\u010b"+
		"\3\2\2\2&\u011f\3\2\2\2(,\5\6\4\2),\5\22\n\2*,\5&\24\2+(\3\2\2\2+)\3\2"+
		"\2\2+*\3\2\2\2,-\3\2\2\2-.\7-\2\2.\60\3\2\2\2/+\3\2\2\2\60\63\3\2\2\2"+
		"\61/\3\2\2\2\61\62\3\2\2\2\62\3\3\2\2\2\63\61\3\2\2\2\64\65\7\t\2\2\65"+
		"\66\7+\2\2\66\67\7\n\2\2\679\7\34\2\28:\7,\2\298\3\2\2\29:\3\2\2\2:\5"+
		"\3\2\2\2;<\7\5\2\2<>\7+\2\2=?\7-\2\2>=\3\2\2\2>?\3\2\2\2?D\3\2\2\2@C\5"+
		"\34\17\2AC\5\30\r\2B@\3\2\2\2BA\3\2\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2\2\2"+
		"EG\3\2\2\2FD\3\2\2\2GH\7\6\2\2H\7\3\2\2\2IJ\7\r\2\2JK\5\36\20\2KO\7\16"+
		"\2\2LN\5\34\17\2ML\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2PY\3\2\2\2QO\3"+
		"\2\2\2RV\7\17\2\2SU\5\34\17\2TS\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2"+
		"WZ\3\2\2\2XV\3\2\2\2YR\3\2\2\2YZ\3\2\2\2Z[\3\2\2\2[\\\7\20\2\2\\]\7-\2"+
		"\2]\t\3\2\2\2^_\7\21\2\2_`\5\36\20\2`a\7\22\2\2ab\7*\2\2bf\7\23\2\2ce"+
		"\5\34\17\2dc\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2gi\3\2\2\2hf\3\2\2\2"+
		"ij\7\24\2\2jk\7-\2\2k\13\3\2\2\2lm\7\25\2\2mn\5\36\20\2nr\7\23\2\2oq\5"+
		"\34\17\2po\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2su\3\2\2\2tr\3\2\2\2u"+
		"v\7\26\2\2vw\7-\2\2w\r\3\2\2\2x|\7\27\2\2y{\5\34\17\2zy\3\2\2\2{~\3\2"+
		"\2\2|z\3\2\2\2|}\3\2\2\2}\177\3\2\2\2~|\3\2\2\2\177\u0080\7\30\2\2\u0080"+
		"\u0081\5\36\20\2\u0081\u0082\7-\2\2\u0082\17\3\2\2\2\u0083\u0084\7\31"+
		"\2\2\u0084\u0085\7+\2\2\u0085\u008f\7\23\2\2\u0086\u0087\t\2\2\2\u0087"+
		"\u0088\7%\2\2\u0088\u008c\7-\2\2\u0089\u008b\5\34\17\2\u008a\u0089\3\2"+
		"\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d"+
		"\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0086\3\2\2\2\u0090\u0091\3\2"+
		"\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u009c\3\2\2\2\u0093"+
		"\u0094\7\32\2\2\u0094\u0095\7%\2\2\u0095\u0099\7-\2\2\u0096\u0098\5\34"+
		"\17\2\u0097\u0096\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099"+
		"\u009a\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u0093\3\2"+
		"\2\2\u009c\u009d\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\7\33\2\2\u009f"+
		"\u00a0\7-\2\2\u00a0\21\3\2\2\2\u00a1\u00a2\5\"\22\2\u00a2\u00a3\5$\23"+
		"\2\u00a3\u00a4\7\b\2\2\u00a4\23\3\2\2\2\u00a5\u00aa\7+\2\2\u00a6\u00a7"+
		"\7$\2\2\u00a7\u00a9\7+\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa"+
		"\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\25\3\2\2\2\u00ac\u00aa\3\2\2"+
		"\2\u00ad\u00ae\7\35\2\2\u00ae\u00af\7+\2\2\u00af\u00b0\7(\2\2\u00b0\u00b1"+
		"\7*\2\2\u00b1\u00b2\7)\2\2\u00b2\27\3\2\2\2\u00b3\u00bb\5\4\3\2\u00b4"+
		"\u00bb\5\b\5\2\u00b5\u00bb\5\n\6\2\u00b6\u00bb\5\f\7\2\u00b7\u00bb\5\16"+
		"\b\2\u00b8\u00bb\5\20\t\2\u00b9\u00bb\5\26\f\2\u00ba\u00b3\3\2\2\2\u00ba"+
		"\u00b4\3\2\2\2\u00ba\u00b5\3\2\2\2\u00ba\u00b6\3\2\2\2\u00ba\u00b7\3\2"+
		"\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00b9\3\2\2\2\u00bb\31\3\2\2\2\u00bc\u00bd"+
		"\7\f\2\2\u00bd\u00bf\5\36\20\2\u00be\u00c0\5&\24\2\u00bf\u00be\3\2\2\2"+
		"\u00bf\u00c0\3\2\2\2\u00c0\u00c9\3\2\2\2\u00c1\u00c2\7\13\2\2\u00c2\u00c4"+
		"\7+\2\2\u00c3\u00c5\5&\24\2\u00c4\u00c3\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5"+
		"\u00c9\3\2\2\2\u00c6\u00c9\5&\24\2\u00c7\u00c9\5\36\20\2\u00c8\u00bc\3"+
		"\2\2\2\u00c8\u00c1\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c7\3\2\2\2\u00c9"+
		"\33\3\2\2\2\u00ca\u00cc\5\32\16\2\u00cb\u00cd\7,\2\2\u00cc\u00cb\3\2\2"+
		"\2\u00cc\u00cd\3\2\2\2\u00cd\35\3\2\2\2\u00ce\u00cf\7+\2\2\u00cf\u00d0"+
		"\7\36\2\2\u00d0\u00ef\5\32\16\2\u00d1\u00ef\7+\2\2\u00d2\u00d7\t\3\2\2"+
		"\u00d3\u00d4\t\4\2\2\u00d4\u00d6\t\3\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00d9"+
		"\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00ef\3\2\2\2\u00d9"+
		"\u00d7\3\2\2\2\u00da\u00df\t\5\2\2\u00db\u00dc\t\6\2\2\u00dc\u00de\t\5"+
		"\2\2\u00dd\u00db\3\2\2\2\u00de\u00e1\3\2\2\2\u00df\u00dd\3\2\2\2\u00df"+
		"\u00e0\3\2\2\2\u00e0\u00ef\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2\u00e3\7+"+
		"\2\2\u00e3\u00e4\7!\2\2\u00e4\u00ef\t\5\2\2\u00e5\u00e6\7+\2\2\u00e6\u00e7"+
		"\t\7\2\2\u00e7\u00ef\7*\2\2\u00e8\u00e9\7+\2\2\u00e9\u00eb\7&\2\2\u00ea"+
		"\u00ec\7+\2\2\u00eb\u00ea\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\3\2"+
		"\2\2\u00ed\u00ef\7\'\2\2\u00ee\u00ce\3\2\2\2\u00ee\u00d1\3\2\2\2\u00ee"+
		"\u00d2\3\2\2\2\u00ee\u00da\3\2\2\2\u00ee\u00e2\3\2\2\2\u00ee\u00e5\3\2"+
		"\2\2\u00ee\u00e8\3\2\2\2\u00ef\37\3\2\2\2\u00f0\u00f2\7\62\2\2\u00f1\u00f0"+
		"\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4"+
		"\u00fb\3\2\2\2\u00f5\u00f7\7\64\2\2\u00f6\u00f5\3\2\2\2\u00f7\u00f8\3"+
		"\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fb\3\2\2\2\u00fa"+
		"\u00f1\3\2\2\2\u00fa\u00f6\3\2\2\2\u00fb!\3\2\2\2\u00fc\u00fd\7\7\2\2"+
		"\u00fd\u00fe\7+\2\2\u00fe\u00ff\7\36\2\2\u00ff\u0100\7+\2\2\u0100\u0102"+
		"\7&\2\2\u0101\u0103\5\24\13\2\u0102\u0101\3\2\2\2\u0102\u0103\3\2\2\2"+
		"\u0103\u0104\3\2\2\2\u0104\u0105\7\'\2\2\u0105\u0106\7-\2\2\u0106#\3\2"+
		"\2\2\u0107\u010a\5\34\17\2\u0108\u010a\7-\2\2\u0109\u0107\3\2\2\2\u0109"+
		"\u0108\3\2\2\2\u010a\u010d\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2"+
		"\2\2\u010c%\3\2\2\2\u010d\u010b\3\2\2\2\u010e\u0113\7\3\2\2\u010f\u0112"+
		"\5 \21\2\u0110\u0112\7-\2\2\u0111\u010f\3\2\2\2\u0111\u0110\3\2\2\2\u0112"+
		"\u0115\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0116\3\2"+
		"\2\2\u0115\u0113\3\2\2\2\u0116\u0120\7\61\2\2\u0117\u011b\7\4\2\2\u0118"+
		"\u011a\5 \21\2\u0119\u0118\3\2\2\2\u011a\u011d\3\2\2\2\u011b\u0119\3\2"+
		"\2\2\u011b\u011c\3\2\2\2\u011c\u011e\3\2\2\2\u011d\u011b\3\2\2\2\u011e"+
		"\u0120\7\63\2\2\u011f\u010e\3\2\2\2\u011f\u0117\3\2\2\2\u0120\'\3\2\2"+
		"\2&+\619>BDOVYfr|\u008c\u0091\u0099\u009c\u00aa\u00ba\u00bf\u00c4\u00c8"+
		"\u00cc\u00d7\u00df\u00eb\u00ee\u00f3\u00f8\u00fa\u0102\u0109\u010b\u0111"+
		"\u0113\u011b\u011f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}