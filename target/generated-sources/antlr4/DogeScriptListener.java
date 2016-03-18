// Generated from DogeScript.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DogeScriptParser}.
 */
public interface DogeScriptListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DogeScriptParser#topPrior}.
	 * @param ctx the parse tree
	 */
	void enterTopPrior(@NotNull DogeScriptParser.TopPriorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DogeScriptParser#topPrior}.
	 * @param ctx the parse tree
	 */
	void exitTopPrior(@NotNull DogeScriptParser.TopPriorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DogeScriptParser#lowPrior}.
	 * @param ctx the parse tree
	 */
	void enterLowPrior(@NotNull DogeScriptParser.LowPriorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DogeScriptParser#lowPrior}.
	 * @param ctx the parse tree
	 */
	void exitLowPrior(@NotNull DogeScriptParser.LowPriorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DogeScriptParser#highPrior}.
	 * @param ctx the parse tree
	 */
	void enterHighPrior(@NotNull DogeScriptParser.HighPriorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DogeScriptParser#highPrior}.
	 * @param ctx the parse tree
	 */
	void exitHighPrior(@NotNull DogeScriptParser.HighPriorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DogeScriptParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(@NotNull DogeScriptParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link DogeScriptParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(@NotNull DogeScriptParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link DogeScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull DogeScriptParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DogeScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull DogeScriptParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DogeScriptParser#signInt}.
	 * @param ctx the parse tree
	 */
	void enterSignInt(@NotNull DogeScriptParser.SignIntContext ctx);
	/**
	 * Exit a parse tree produced by {@link DogeScriptParser#signInt}.
	 * @param ctx the parse tree
	 */
	void exitSignInt(@NotNull DogeScriptParser.SignIntContext ctx);
}