

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;

public class TxtFileParserController {
	
	private TxtFileParserView view;
	private ArrayList<String> listOfInputs;
	private ArrayList<String> listOfOutputs;
	
	public TxtFileParserController(TxtFileParserView view) {
		this.view = view;
		
		listOfInputs = new ArrayList<>();
		listOfOutputs = new ArrayList<>();
	}

	public String readInputFile(String filepath) {
        	String outputString="";
        	
        	// The name of the file to open.
	        String fileName = filepath;

	        // This will reference one line at a time
	        String line = null;

	        try {
	            // FileReader reads text files in the default encoding.
	            FileReader fileReader = 
	                new FileReader(fileName);

	            // Always wrap FileReader in BufferedReader.
	            BufferedReader bufferedReader = 
	                new BufferedReader(fileReader);

	            while((line = bufferedReader.readLine()) != null) {
	            	//line = line.replaceAll(" ", "");
	            	listOfInputs.add(line);
	            }   
	            for(String linya : listOfInputs){
	            	outputString+=linya+"\n";
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
	        
	        return outputString;
	}

	public String getResultFromListOfInputs() {
		String outputString="";
		String outputPerLine="";
		for(String input : listOfInputs)
		{
			outputPerLine="";
			
			try{
				CharStream in = new ANTLRInputStream(input+"$");
				
				ExpressionLexer lexer = new ExpressionLexer(in);
				lexer.removeErrorListeners();
				lexer.addErrorListener(ErrorListener.INSTANCE);
				
				CommonTokenStream tokens = new CommonTokenStream(lexer);
				
				ExpressionParser parser = new ExpressionParser(tokens);
				parser.removeErrorListeners();
				parser.addErrorListener(ErrorListener.INSTANCE);
				
				outputPerLine = String.valueOf(parser.start().res);
					
			}catch(Exception e){
				if(e.getLocalizedMessage().contains("token recognition"))
                {
                        System.out.println("lexical error: " + e.getLocalizedMessage());
                        outputPerLine = "lexical error: " + e.getLocalizedMessage();
                }
                else if(e.getLocalizedMessage().contains("no viable alternative"))
                {
                        System.out.println("parser error: " + e.getLocalizedMessage());
                        outputPerLine = "parser error: " + e.getLocalizedMessage();
                }
                else if(e.getLocalizedMessage().contains("input string"))
                {
                    System.out.println("number too big: " + e.getLocalizedMessage());
                    outputPerLine = "number too big: " + e.getLocalizedMessage();
                }
                else if(e.getLocalizedMessage().contains("by zero"))
                {
                    System.out.println("mathematical error: " + e.getLocalizedMessage());
                    outputPerLine = "mathematical error";
                }
                else{
                    System.out.println(e.getLocalizedMessage());
                    outputPerLine = e.getLocalizedMessage();
                }
			}
			
//			System.out.println("TEST: " + outputPerLine + ":END OF TEST");
			listOfOutputs.add(outputPerLine);
			
		}
		for(int i = 0; i < listOfOutputs.size(); i++)
		{
			if(listOfOutputs.get(i).equals("Infinity"))
				outputString+="mathematical error"+"\n";
			else
			outputString+=listOfOutputs.get(i)+"\n";
		}
				
		return outputString;
	}

	public void clearListOfInputs() {
		listOfInputs = new ArrayList<String>();
	}

	public void reinitializeLists() {
		listOfInputs = new ArrayList<String>();
		listOfOutputs = new ArrayList<String>();
	}

}
