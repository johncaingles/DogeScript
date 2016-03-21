import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.Trees;
import org.antlr.v4.runtime.tree.gui.TreeViewer;

public class SourceCodeParserController implements IParserController {
	
	private IParserView view;
	private MainFrame mainFrame;
	private String sourceCode;
	private String output;
	
	private TreeViewer parseTreeViewer;
	
	public SourceCodeParserController(MainFrame mainFrame) {
		this.mainFrame = mainFrame;
		sourceCode = "";
	}

	@Override
	public void setView(IParserView view) {
		this.view = view;
	}

	@Override
	public String readInputFile(String filepath) {
		sourceCode="";
    	
    	// The name of the file to open.
        String fileName = filepath;

        // This will reference one line at a time
        String line = "";

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = 
                new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);

            line = bufferedReader.readLine();
            if(line!=null)
            	sourceCode += line;
            while( (line = bufferedReader.readLine()) != null) {
            	//line = line.replaceAll(" ", "");
            	sourceCode += "\n" + line;
            }
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");
        }
        
        return sourceCode;
	}

	@Override
	public String getOutput() {
		
			output="";
			
			System.out.println(sourceCode);
			
			try{
				CharStream in = new ANTLRInputStream(sourceCode);
				
				DogeScriptLexer lexer = new DogeScriptLexer(in);
				lexer.removeErrorListeners();
				lexer.addErrorListener(ErrorListener.INSTANCE);
				
				CommonTokenStream tokens = new CommonTokenStream(lexer);
				
				DogeScriptParser parser = new DogeScriptParser(tokens);
				parser.removeErrorListeners();
				parser.addErrorListener(ErrorListener.INSTANCE);
				
				ParseTree tree = parser.start();
		        System.out.println(tree.toStringTree(parser));
				
		      //show AST in GUI
		        parseTreeViewer = new TreeViewer(Arrays.asList(
		                parser.getRuleNames()),tree);
		        
		        parser.reset();
				
				output = String.valueOf(parser.start());
					
			}catch(Exception e){
				if(e.getLocalizedMessage().contains("token recognition"))
                {
                        System.out.println("lexical error: " + e.getLocalizedMessage());
                        output = "lexical error: " + e.getLocalizedMessage();
                }
                else if(e.getLocalizedMessage().contains("no viable alternative"))
                {
                        System.out.println("parser error: " + e.getLocalizedMessage());
                        output = "parser error: " + e.getLocalizedMessage();
                }
                else if(e.getLocalizedMessage().contains("input string"))
                {
                    System.out.println("number too big: " + e.getLocalizedMessage());
                    output = "number too big: " + e.getLocalizedMessage();
                }
                else if(e.getLocalizedMessage().contains("by zero"))
                {
                    System.out.println("mathematical error: " + e.getLocalizedMessage());
                    output = "mathematical error";
                }
                else{
                    System.out.println(e.getLocalizedMessage());
                    output = e.getLocalizedMessage();
                }
			}

			
			return output;				
	}
	

	@Override
	public void reinitializeLists() {
		// TODO Auto-generated method stub
		sourceCode = "";
		output = "";
		
	}

	@Override
	public TreeViewer getParseTree() {
		return parseTreeViewer;
	}

}
