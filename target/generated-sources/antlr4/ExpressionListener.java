// Generated from Expression.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExpressionParser}.
 */
public interface ExpressionListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#topPrior}.
	 * @param ctx the parse tree
	 */
	void enterTopPrior(@NotNull ExpressionParser.TopPriorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#topPrior}.
	 * @param ctx the parse tree
	 */
	void exitTopPrior(@NotNull ExpressionParser.TopPriorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#lowPrior}.
	 * @param ctx the parse tree
	 */
	void enterLowPrior(@NotNull ExpressionParser.LowPriorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#lowPrior}.
	 * @param ctx the parse tree
	 */
	void exitLowPrior(@NotNull ExpressionParser.LowPriorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#highPrior}.
	 * @param ctx the parse tree
	 */
	void enterHighPrior(@NotNull ExpressionParser.HighPriorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#highPrior}.
	 * @param ctx the parse tree
	 */
	void exitHighPrior(@NotNull ExpressionParser.HighPriorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(@NotNull ExpressionParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(@NotNull ExpressionParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull ExpressionParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull ExpressionParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#signInt}.
	 * @param ctx the parse tree
	 */
	void enterSignInt(@NotNull ExpressionParser.SignIntContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#signInt}.
	 * @param ctx the parse tree
	 */
	void exitSignInt(@NotNull ExpressionParser.SignIntContext ctx);
}