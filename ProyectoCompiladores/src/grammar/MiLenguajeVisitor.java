// Generated from MiLenguaje.g4 by ANTLR 4.9.2
package grammar;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MiLenguajeParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MiLenguajeVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(MiLenguajeParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#declaraciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaraciones(MiLenguajeParser.DeclaracionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(MiLenguajeParser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#control_flujo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControl_flujo(MiLenguajeParser.Control_flujoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(MiLenguajeParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#while_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stmt(MiLenguajeParser.While_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#for_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_stmt(MiLenguajeParser.For_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#impresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImpresion(MiLenguajeParser.ImpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion(MiLenguajeParser.ExpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#operador_aditivo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperador_aditivo(MiLenguajeParser.Operador_aditivoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#operador_multiplicativo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperador_multiplicativo(MiLenguajeParser.Operador_multiplicativoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#operador_relacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperador_relacional(MiLenguajeParser.Operador_relacionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#numero}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumero(MiLenguajeParser.NumeroContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#digito}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDigito(MiLenguajeParser.DigitoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#identificador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentificador(MiLenguajeParser.IdentificadorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#letra}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetra(MiLenguajeParser.LetraContext ctx);
}