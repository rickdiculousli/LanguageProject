import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.PrintWriter;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

public class CrappyC {

	public static void main(String[] args) throws Exception {
		String inputFile = null;
		
		if(args.length > 0) inputFile = args[0];
		InputStream is = (inputFile != null)
									? new FileInputStream(inputFile)
									: System.in;
		
		CharStream input = CharStreams.fromStream(is);
		crappyCLexer lexer = new crappyCLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		crappyCParser parser = new crappyCParser(tokens);
		ParseTree tree = parser.program();
		
		Pass1Visitor pass1 = new Pass1Visitor();
		pass1.visit(tree);
		
		PrintWriter jFile = pass1.getAssemblyFile();
		
		Pass2Visitor pass2 = new Pass2Visitor(jFile);
		pass2.visit(tree);
	}

}
