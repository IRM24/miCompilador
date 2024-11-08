// Generated from MiLenguaje.g4 by ANTLR 4.9.2
package grammar;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MiLenguajeParser}.
 */
public interface MiLenguajeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(MiLenguajeParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(MiLenguajeParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#declaraciones}.
	 * @param ctx the parse tree
	 */
	void enterDeclaraciones(MiLenguajeParser.DeclaracionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#declaraciones}.
	 * @param ctx the parse tree
	 */
	void exitDeclaraciones(MiLenguajeParser.DeclaracionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion(MiLenguajeParser.DeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion(MiLenguajeParser.DeclaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#control_flujo}.
	 * @param ctx the parse tree
	 */
	void enterControl_flujo(MiLenguajeParser.Control_flujoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#control_flujo}.
	 * @param ctx the parse tree
	 */
	void exitControl_flujo(MiLenguajeParser.Control_flujoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(MiLenguajeParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(MiLenguajeParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stmt(MiLenguajeParser.While_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stmt(MiLenguajeParser.While_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFor_stmt(MiLenguajeParser.For_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFor_stmt(MiLenguajeParser.For_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#impresion}.
	 * @param ctx the parse tree
	 */
	void enterImpresion(MiLenguajeParser.ImpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#impresion}.
	 * @param ctx the parse tree
	 */
	void exitImpresion(MiLenguajeParser.ImpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(MiLenguajeParser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(MiLenguajeParser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#operador_aditivo}.
	 * @param ctx the parse tree
	 */
	void enterOperador_aditivo(MiLenguajeParser.Operador_aditivoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#operador_aditivo}.
	 * @param ctx the parse tree
	 */
	void exitOperador_aditivo(MiLenguajeParser.Operador_aditivoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#operador_multiplicativo}.
	 * @param ctx the parse tree
	 */
	void enterOperador_multiplicativo(MiLenguajeParser.Operador_multiplicativoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#operador_multiplicativo}.
	 * @param ctx the parse tree
	 */
	void exitOperador_multiplicativo(MiLenguajeParser.Operador_multiplicativoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#operador_relacional}.
	 * @param ctx the parse tree
	 */
	void enterOperador_relacional(MiLenguajeParser.Operador_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#operador_relacional}.
	 * @param ctx the parse tree
	 */
	void exitOperador_relacional(MiLenguajeParser.Operador_relacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#numero}.
	 * @param ctx the parse tree
	 */
	void enterNumero(MiLenguajeParser.NumeroContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#numero}.
	 * @param ctx the parse tree
	 */
	void exitNumero(MiLenguajeParser.NumeroContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#digito}.
	 * @param ctx the parse tree
	 */
	void enterDigito(MiLenguajeParser.DigitoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#digito}.
	 * @param ctx the parse tree
	 */
	void exitDigito(MiLenguajeParser.DigitoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#identificador}.
	 * @param ctx the parse tree
	 */
	void enterIdentificador(MiLenguajeParser.IdentificadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#identificador}.
	 * @param ctx the parse tree
	 */
	void exitIdentificador(MiLenguajeParser.IdentificadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#letra}.
	 * @param ctx the parse tree
	 */
	void enterLetra(MiLenguajeParser.LetraContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#letra}.
	 * @param ctx the parse tree
	 */
	void exitLetra(MiLenguajeParser.LetraContext ctx);
}