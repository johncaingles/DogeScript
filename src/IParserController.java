import org.antlr.v4.runtime.tree.gui.TreeViewer;

public interface IParserController {
	public void setView(IParserView view);
	public String readInputFile(String filepath);
	public String getOutput();
	public void reinitializeLists();
	public TreeViewer getParseTree();
}
