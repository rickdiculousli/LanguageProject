import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

public class CrappyC {

	public static void main(String[] args) throws Exception {
		String inputFile = null;
		
		if(args.length > 0) inputFile = args[0];
		InputStream is = (inputFile != null)
									? new FileInputStream(inputFile)
									: System.in;
		
		ANTLRInputStream input = new ANTLRInputStream(is);
		crappyCLexer lexer = new crappyCLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		for(Token t : tokens.getTokens()) {
			System.out.println(t.getText());
		}
		crappyCParser parser = new crappyCParser(tokens);
		ParseTree tree = parser.program(); // parse
		
		System.out.println("\nParse tree (Lisp format):");
		System.out.println(tree.toStringTree(parser));
	}

}
