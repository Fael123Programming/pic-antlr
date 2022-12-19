// Generated from java-escape by ANTLR 4.11.1

    package antlr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GrammarParser#rvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRvalue(GrammarParser.RvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDec(GrammarParser.DecContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#arithFac}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithFac(GrammarParser.ArithFacContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#arithExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithExp(GrammarParser.ArithExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#arithTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithTerm(GrammarParser.ArithTermContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#expoExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpoExp(GrammarParser.ExpoExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#relExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelExp(GrammarParser.RelExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#relTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelTerm(GrammarParser.RelTermContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#conditInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditInit(GrammarParser.ConditInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#conditMid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditMid(GrammarParser.ConditMidContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#conditEnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditEnd(GrammarParser.ConditEndContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#forLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLoop(GrammarParser.ForLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(GrammarParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Statements}
	 * labeled alternative in {@link GrammarParser#stmts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(GrammarParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(GrammarParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#iter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIter(GrammarParser.IterContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(GrammarParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#tuple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuple(GrammarParser.TupleContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(GrammarParser.FunctionCallContext ctx);
}