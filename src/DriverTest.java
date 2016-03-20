import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;

public class DriverTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				try{
					//ANTLRInputStream input = new ANTLRInputStream( System.in);
					String expr = "much int func(int x) {"
							+ " such int y wow "
							+ " } "
							+ " much char func2 (int x, char y) {"
							+ "   rily (x != y)"
							+ "		x as y wow }"
							+ " much void main () { such int x as 3.5 wow "
							+ " such char x as \"xcv\" wow "
							+ " x as 2+3 wow "
							+ " such int x,y,y, z, trt wow "
							+ " y as (2+-3) wow "
							+ " rily (x > y and (3+ggg > x or c != y)) "
							+ "    x as null wow "
							+ " but rily (x != y) {"
							+ " such int yo as 0 wow "
							+ " x as  20 wow "
							+ " } "
							+ " but f1(x,y,zzz) wow "
							+ " rily (x != 2*(3+1))"
							+ "	  x as 20 wow"
							+ " rily (yew < 2)"
							+ "   yew as null wow "
							+ "so (yiz) {"
							+ "such int x as 0 wow"
							+ " x as 0.0 wow"
							+ "}"
							+ "so(nawp)"
							+ "x as 0 wow"
							+ " many( such int x as 0 wow nawp wow x++) {"
							+ "such int x as 0 wow"
							+ "}"
							+ "nice {"
							+ "such int x as 0 wow"
							+ "} so(yiz) wow"
							+ "}"
							+ " much char func2 (int x, char y) {"
							+ "   rily (x != y)"
							+ "		x as y wow }$"
							;
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
