// Generated from DogeScript.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DogeScriptParser}.
 */
public interface DogeScriptListener extends ParseTreeListener {
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
}