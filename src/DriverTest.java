import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;

public class DriverTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				try{
					//ANTLRInputStream input = new ANTLRInputStream( System.in);
					String expr = "much void main () { such int xam wow }$";
					//expr = expr.toString().replaceAll(" ", "");
					//System.out.println(expr);
					CharStream in = new ANTLRInputStream(expr);
					
					DogeScriptLexer lexer = new DogeScriptLexer(in);
					
					//lexer.removeErrorListeners();
					//lexer.addErrorListener(ErrorListener.INSTANCE);
			
					CommonTokenStream tokens = new CommonTokenStream(lexer);
					DogeScriptParser parser = new DogeScriptParser(tokens);
					//parser.removeErrorListeners();
					//parser.addErrorListener(ErrorListener.INSTANCE);
					//ExpParser.parse_return r = parser.eval	();
					
					System.out.println(parser.start()); // print the value
					
				}catch(Exception e){
					//e.printStackTrace();
					if(e.getLocalizedMessage().contains("token recognition"))
							System.out.print("lexical error: " + e.getLocalizedMessage());
					else if(e.getLocalizedMessage().contains("no viable alternative"))
							System.out.print("parser error: " + e.getLocalizedMessage());
					//else if(e.getLocalizedMessage().contains("input string"))
						//System.out.print("number too big: " + e.getLocalizedMessage());
					else System.out.print(e.getLocalizedMessage());
				}
				
	}

}
