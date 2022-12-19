// Generated from java-escape by ANTLR 4.11.1

    package antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarParser#rvalue}.
	 * @param ctx the parse tree
	 */
	void enterRvalue(GrammarParser.RvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#rvalue}.
	 * @param ctx the parse tree
	 */
	void exitRvalue(GrammarParser.RvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#dec}.
	 * @param ctx the parse tree
	 */
	void enterDec(GrammarParser.DecContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#dec}.
	 * @param ctx the parse tree
	 */
	void exitDec(GrammarParser.DecContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#arithFac}.
	 * @param ctx the parse tree
	 */
	void enterArithFac(GrammarParser.ArithFacContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#arithFac}.
	 * @param ctx the parse tree
	 */
	void exitArithFac(GrammarParser.ArithFacContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#arithExp}.
	 * @param ctx the parse tree
	 */
	void enterArithExp(GrammarParser.ArithExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#arithExp}.
	 * @param ctx the parse tree
	 */
	void exitArithExp(GrammarParser.ArithExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#arithTerm}.
	 * @param ctx the parse tree
	 */
	void enterArithTerm(GrammarParser.ArithTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#arithTerm}.
	 * @param ctx the parse tree
	 */
	void exitArithTerm(GrammarParser.ArithTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#expoExp}.
	 * @param ctx the parse tree
	 */
	void enterExpoExp(GrammarParser.ExpoExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#expoExp}.
	 * @param ctx the parse tree
	 */
	void exitExpoExp(GrammarParser.ExpoExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#relExp}.
	 * @param ctx the parse tree
	 */
	void enterRelExp(GrammarParser.RelExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#relExp}.
	 * @param ctx the parse tree
	 */
	void exitRelExp(GrammarParser.RelExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#relTerm}.
	 * @param ctx the parse tree
	 */
	void enterRelTerm(GrammarParser.RelTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#relTerm}.
	 * @param ctx the parse tree
	 */
	void exitRelTerm(GrammarParser.RelTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#conditInit}.
	 * @param ctx the parse tree
	 */
	void enterConditInit(GrammarParser.ConditInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#conditInit}.
	 * @param ctx the parse tree
	 */
	void exitConditInit(GrammarParser.ConditInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#conditMid}.
	 * @param ctx the parse tree
	 */
	void enterConditMid(GrammarParser.ConditMidContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#conditMid}.
	 * @param ctx the parse tree
	 */
	void exitConditMid(GrammarParser.ConditMidContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#conditEnd}.
	 * @param ctx the parse tree
	 */
	void enterConditEnd(GrammarParser.ConditEndContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#conditEnd}.
	 * @param ctx the parse tree
	 */
	void exitConditEnd(GrammarParser.ConditEndContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void enterForLoop(GrammarParser.ForLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void exitForLoop(GrammarParser.ForLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(GrammarParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(GrammarParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Statements}
	 * labeled alternative in {@link GrammarParser#stmts}.
	 * @param ctx the parse tree
	 */
	void enterStatements(GrammarParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Statements}
	 * labeled alternative in {@link GrammarParser#stmts}.
	 * @param ctx the parse tree
	 */
	void exitStatements(GrammarParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(GrammarParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(GrammarParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#iter}.
	 * @param ctx the parse tree
	 */
	void enterIter(GrammarParser.IterContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#iter}.
	 * @param ctx the parse tree
	 */
	void exitIter(GrammarParser.IterContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(GrammarParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(GrammarParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#tuple}.
	 * @param ctx the parse tree
	 */
	void enterTuple(GrammarParser.TupleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#tuple}.
	 * @param ctx the parse tree
	 */
	void exitTuple(GrammarParser.TupleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(GrammarParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(GrammarParser.FunctionCallContext ctx);
}