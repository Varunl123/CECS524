/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basforccal;
import java.io.IOException;

import org.antlr.runtime.ANTLRFileStream;

import org.antlr.runtime.CommonTokenStream;

import org.antlr.runtime.RecognitionException;
/**
 *
 * @author lvaro
 */
public class BasForCCal {
    public static void main(String args[])throws IOException,RecognitionException{
     BasForCCalLexer lexer = new BasForCCalLexer(new ANTLRFileStream(args[0]));

        CommonTokenStream tokens = new CommonTokenStream(lexer);

          BasForCCalParser parser = new BasForCCalParser(tokens);

           parser.program();
    }
}
