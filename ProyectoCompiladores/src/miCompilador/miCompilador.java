package miCompilador;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.atn.ATNConfigSet;

import java.util.BitSet;
import grammar.MiLenguajeLexer;
import grammar.MiLenguajeParser;

public class miCompilador {
    public static void main(String[] args) {
        try {
            // 1. Cargar el archivo de entrada
            CharStream input = CharStreams.fromFileName("src/miCompilador/pruebas.txt");

            // 2. Crear el Lexer y el TokenStream
            MiLenguajeLexer lexer = new MiLenguajeLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            // 3. Crear el Parser con el TokenStream
            MiLenguajeParser parser = new MiLenguajeParser(tokens);

            // Configurar un error listener para errores de sintaxis
            parser.removeErrorListeners();
            parser.addErrorListener(new ANTLRErrorListener() {
                @Override
                public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
                    System.err.println("Error de sintaxis en la línea " + line + ", posición " + charPositionInLine + ": " + msg);
                }

                @Override
                public void reportAmbiguity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, boolean exact, BitSet ambigAlts, ATNConfigSet configs) {}

                @Override
                public void reportAttemptingFullContext(Parser recognizer, DFA dfa, int startIndex, int stopIndex, BitSet conflictingAlts, ATNConfigSet configs) {}

                @Override
                public void reportContextSensitivity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, int prediction, ATNConfigSet configs) {}
            });

            // 5. Iniciar el análisis sintáctico desde la regla de inicio
            ParseTree tree = parser.programa();  // Cambié "declaraciones" a "programa" como punto de entrada principal

            // 6. Imprimir el árbol de sintaxis
            System.out.println("Árbol de sintaxis:");
            System.out.println(tree.toStringTree(parser));

            // Si todo es correcto, el análisis será exitoso y no se mostrará ningún error.
            System.out.println("Análisis sintáctico exitoso.");

        } catch (Exception e) {
            // Captura errores generales
            System.err.println("Error al analizar el archivo: " + e.getMessage());
            e.printStackTrace(); // Imprimir el stack trace para más detalles del error
        }
    }
}
