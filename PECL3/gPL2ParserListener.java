// Generated from gPL2Parser.g4 by ANTLR 4.9
package PECL3;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gPL2Parser}.
 */
public interface gPL2ParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gPL2Parser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(gPL2Parser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link gPL2Parser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(gPL2Parser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link gPL2Parser#definicion}.
	 * @param ctx the parse tree
	 */
	void enterDefinicion(gPL2Parser.DefinicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gPL2Parser#definicion}.
	 * @param ctx the parse tree
	 */
	void exitDefinicion(gPL2Parser.DefinicionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gPL2Parser#algoritmo}.
	 * @param ctx the parse tree
	 */
	void enterAlgoritmo(gPL2Parser.AlgoritmoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gPL2Parser#algoritmo}.
	 * @param ctx the parse tree
	 */
	void exitAlgoritmo(gPL2Parser.AlgoritmoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gPL2Parser#si}.
	 * @param ctx the parse tree
	 */
	void enterSi(gPL2Parser.SiContext ctx);
	/**
	 * Exit a parse tree produced by {@link gPL2Parser#si}.
	 * @param ctx the parse tree
	 */
	void exitSi(gPL2Parser.SiContext ctx);
	/**
	 * Enter a parse tree produced by {@link gPL2Parser#para}.
	 * @param ctx the parse tree
	 */
	void enterPara(gPL2Parser.ParaContext ctx);
	/**
	 * Exit a parse tree produced by {@link gPL2Parser#para}.
	 * @param ctx the parse tree
	 */
	void exitPara(gPL2Parser.ParaContext ctx);
	/**
	 * Enter a parse tree produced by {@link gPL2Parser#mientras}.
	 * @param ctx the parse tree
	 */
	void enterMientras(gPL2Parser.MientrasContext ctx);
	/**
	 * Exit a parse tree produced by {@link gPL2Parser#mientras}.
	 * @param ctx the parse tree
	 */
	void exitMientras(gPL2Parser.MientrasContext ctx);
	/**
	 * Enter a parse tree produced by {@link gPL2Parser#repetir}.
	 * @param ctx the parse tree
	 */
	void enterRepetir(gPL2Parser.RepetirContext ctx);
	/**
	 * Exit a parse tree produced by {@link gPL2Parser#repetir}.
	 * @param ctx the parse tree
	 */
	void exitRepetir(gPL2Parser.RepetirContext ctx);
	/**
	 * Enter a parse tree produced by {@link gPL2Parser#segun}.
	 * @param ctx the parse tree
	 */
	void enterSegun(gPL2Parser.SegunContext ctx);
	/**
	 * Exit a parse tree produced by {@link gPL2Parser#segun}.
	 * @param ctx the parse tree
	 */
	void exitSegun(gPL2Parser.SegunContext ctx);
	/**
	 * Enter a parse tree produced by {@link gPL2Parser#funcion}.
	 * @param ctx the parse tree
	 */
	void enterFuncion(gPL2Parser.FuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gPL2Parser#funcion}.
	 * @param ctx the parse tree
	 */
	void exitFuncion(gPL2Parser.FuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gPL2Parser#argumentos}.
	 * @param ctx the parse tree
	 */
	void enterArgumentos(gPL2Parser.ArgumentosContext ctx);
	/**
	 * Exit a parse tree produced by {@link gPL2Parser#argumentos}.
	 * @param ctx the parse tree
	 */
	void exitArgumentos(gPL2Parser.ArgumentosContext ctx);
	/**
	 * Enter a parse tree produced by {@link gPL2Parser#dimension}.
	 * @param ctx the parse tree
	 */
	void enterDimension(gPL2Parser.DimensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gPL2Parser#dimension}.
	 * @param ctx the parse tree
	 */
	void exitDimension(gPL2Parser.DimensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gPL2Parser#bloque}.
	 * @param ctx the parse tree
	 */
	void enterBloque(gPL2Parser.BloqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link gPL2Parser#bloque}.
	 * @param ctx the parse tree
	 */
	void exitBloque(gPL2Parser.BloqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link gPL2Parser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(gPL2Parser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gPL2Parser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(gPL2Parser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gPL2Parser#operacion}.
	 * @param ctx the parse tree
	 */
	void enterOperacion(gPL2Parser.OperacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gPL2Parser#operacion}.
	 * @param ctx the parse tree
	 */
	void exitOperacion(gPL2Parser.OperacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gPL2Parser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(gPL2Parser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link gPL2Parser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(gPL2Parser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link gPL2Parser#textos}.
	 * @param ctx the parse tree
	 */
	void enterTextos(gPL2Parser.TextosContext ctx);
	/**
	 * Exit a parse tree produced by {@link gPL2Parser#textos}.
	 * @param ctx the parse tree
	 */
	void exitTextos(gPL2Parser.TextosContext ctx);
	/**
	 * Enter a parse tree produced by {@link gPL2Parser#linea}.
	 * @param ctx the parse tree
	 */
	void enterLinea(gPL2Parser.LineaContext ctx);
	/**
	 * Exit a parse tree produced by {@link gPL2Parser#linea}.
	 * @param ctx the parse tree
	 */
	void exitLinea(gPL2Parser.LineaContext ctx);
	/**
	 * Enter a parse tree produced by {@link gPL2Parser#cabezafuncion}.
	 * @param ctx the parse tree
	 */
	void enterCabezafuncion(gPL2Parser.CabezafuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gPL2Parser#cabezafuncion}.
	 * @param ctx the parse tree
	 */
	void exitCabezafuncion(gPL2Parser.CabezafuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gPL2Parser#cuerpofuncion}.
	 * @param ctx the parse tree
	 */
	void enterCuerpofuncion(gPL2Parser.CuerpofuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gPL2Parser#cuerpofuncion}.
	 * @param ctx the parse tree
	 */
	void exitCuerpofuncion(gPL2Parser.CuerpofuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gPL2Parser#comentario}.
	 * @param ctx the parse tree
	 */
	void enterComentario(gPL2Parser.ComentarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link gPL2Parser#comentario}.
	 * @param ctx the parse tree
	 */
	void exitComentario(gPL2Parser.ComentarioContext ctx);
}