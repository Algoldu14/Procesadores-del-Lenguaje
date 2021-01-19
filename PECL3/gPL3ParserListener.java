package PECL3;
// Generated from gPL3Parser.g4 by ANTLR 4.9
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gPL3Parser}.
 */
public interface gPL3ParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gPL3Parser#identificador}.
	 * @param ctx the parse tree
	 */
	void enterIdentificador(gPL3Parser.IdentificadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link gPL3Parser#identificador}.
	 * @param ctx the parse tree
	 */
	void exitIdentificador(gPL3Parser.IdentificadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link gPL3Parser#pfinfuncion}.
	 * @param ctx the parse tree
	 */
	void enterPfinfuncion(gPL3Parser.PfinfuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gPL3Parser#pfinfuncion}.
	 * @param ctx the parse tree
	 */
	void exitPfinfuncion(gPL3Parser.PfinfuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gPL3Parser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(gPL3Parser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link gPL3Parser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(gPL3Parser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link gPL3Parser#definicion}.
	 * @param ctx the parse tree
	 */
	void enterDefinicion(gPL3Parser.DefinicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gPL3Parser#definicion}.
	 * @param ctx the parse tree
	 */
	void exitDefinicion(gPL3Parser.DefinicionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gPL3Parser#algoritmo}.
	 * @param ctx the parse tree
	 */
	void enterAlgoritmo(gPL3Parser.AlgoritmoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gPL3Parser#algoritmo}.
	 * @param ctx the parse tree
	 */
	void exitAlgoritmo(gPL3Parser.AlgoritmoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gPL3Parser#si}.
	 * @param ctx the parse tree
	 */
	void enterSi(gPL3Parser.SiContext ctx);
	/**
	 * Exit a parse tree produced by {@link gPL3Parser#si}.
	 * @param ctx the parse tree
	 */
	void exitSi(gPL3Parser.SiContext ctx);
	/**
	 * Enter a parse tree produced by {@link gPL3Parser#para}.
	 * @param ctx the parse tree
	 */
	void enterPara(gPL3Parser.ParaContext ctx);
	/**
	 * Exit a parse tree produced by {@link gPL3Parser#para}.
	 * @param ctx the parse tree
	 */
	void exitPara(gPL3Parser.ParaContext ctx);
	/**
	 * Enter a parse tree produced by {@link gPL3Parser#mientras}.
	 * @param ctx the parse tree
	 */
	void enterMientras(gPL3Parser.MientrasContext ctx);
	/**
	 * Exit a parse tree produced by {@link gPL3Parser#mientras}.
	 * @param ctx the parse tree
	 */
	void exitMientras(gPL3Parser.MientrasContext ctx);
	/**
	 * Enter a parse tree produced by {@link gPL3Parser#repetir}.
	 * @param ctx the parse tree
	 */
	void enterRepetir(gPL3Parser.RepetirContext ctx);
	/**
	 * Exit a parse tree produced by {@link gPL3Parser#repetir}.
	 * @param ctx the parse tree
	 */
	void exitRepetir(gPL3Parser.RepetirContext ctx);
	/**
	 * Enter a parse tree produced by {@link gPL3Parser#segun}.
	 * @param ctx the parse tree
	 */
	void enterSegun(gPL3Parser.SegunContext ctx);
	/**
	 * Exit a parse tree produced by {@link gPL3Parser#segun}.
	 * @param ctx the parse tree
	 */
	void exitSegun(gPL3Parser.SegunContext ctx);
	/**
	 * Enter a parse tree produced by {@link gPL3Parser#funcion}.
	 * @param ctx the parse tree
	 */
	void enterFuncion(gPL3Parser.FuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gPL3Parser#funcion}.
	 * @param ctx the parse tree
	 */
	void exitFuncion(gPL3Parser.FuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gPL3Parser#argumentos}.
	 * @param ctx the parse tree
	 */
	void enterArgumentos(gPL3Parser.ArgumentosContext ctx);
	/**
	 * Exit a parse tree produced by {@link gPL3Parser#argumentos}.
	 * @param ctx the parse tree
	 */
	void exitArgumentos(gPL3Parser.ArgumentosContext ctx);
	/**
	 * Enter a parse tree produced by {@link gPL3Parser#dimension}.
	 * @param ctx the parse tree
	 */
	void enterDimension(gPL3Parser.DimensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gPL3Parser#dimension}.
	 * @param ctx the parse tree
	 */
	void exitDimension(gPL3Parser.DimensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gPL3Parser#bloque}.
	 * @param ctx the parse tree
	 */
	void enterBloque(gPL3Parser.BloqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link gPL3Parser#bloque}.
	 * @param ctx the parse tree
	 */
	void exitBloque(gPL3Parser.BloqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link gPL3Parser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(gPL3Parser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gPL3Parser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(gPL3Parser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gPL3Parser#llamadaFuncion}.
	 * @param ctx the parse tree
	 */
	void enterLlamadaFuncion(gPL3Parser.LlamadaFuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gPL3Parser#llamadaFuncion}.
	 * @param ctx the parse tree
	 */
	void exitLlamadaFuncion(gPL3Parser.LlamadaFuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gPL3Parser#operacion}.
	 * @param ctx the parse tree
	 */
	void enterOperacion(gPL3Parser.OperacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gPL3Parser#operacion}.
	 * @param ctx the parse tree
	 */
	void exitOperacion(gPL3Parser.OperacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gPL3Parser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(gPL3Parser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link gPL3Parser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(gPL3Parser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link gPL3Parser#textos}.
	 * @param ctx the parse tree
	 */
	void enterTextos(gPL3Parser.TextosContext ctx);
	/**
	 * Exit a parse tree produced by {@link gPL3Parser#textos}.
	 * @param ctx the parse tree
	 */
	void exitTextos(gPL3Parser.TextosContext ctx);
	/**
	 * Enter a parse tree produced by {@link gPL3Parser#linea}.
	 * @param ctx the parse tree
	 */
	void enterLinea(gPL3Parser.LineaContext ctx);
	/**
	 * Exit a parse tree produced by {@link gPL3Parser#linea}.
	 * @param ctx the parse tree
	 */
	void exitLinea(gPL3Parser.LineaContext ctx);
	/**
	 * Enter a parse tree produced by {@link gPL3Parser#cabezafuncion}.
	 * @param ctx the parse tree
	 */
	void enterCabezafuncion(gPL3Parser.CabezafuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gPL3Parser#cabezafuncion}.
	 * @param ctx the parse tree
	 */
	void exitCabezafuncion(gPL3Parser.CabezafuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gPL3Parser#cuerpofuncion}.
	 * @param ctx the parse tree
	 */
	void enterCuerpofuncion(gPL3Parser.CuerpofuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gPL3Parser#cuerpofuncion}.
	 * @param ctx the parse tree
	 */
	void exitCuerpofuncion(gPL3Parser.CuerpofuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gPL3Parser#comentario}.
	 * @param ctx the parse tree
	 */
	void enterComentario(gPL3Parser.ComentarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link gPL3Parser#comentario}.
	 * @param ctx the parse tree
	 */
	void exitComentario(gPL3Parser.ComentarioContext ctx);
}