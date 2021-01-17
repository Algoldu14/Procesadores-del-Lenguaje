package PECL3;

//fichero ejecutable
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.*;

public class main {
    public static void main(String[] args) throws Exception {

        String inputFile = null;
        if (args.length > 0)
            inputFile = args[0];

        InputStream is = System.in;
        if (inputFile != null) {
            is = new FileInputStream(inputFile);
        }

        CharStream input = CharStreams.fromStream(is);
        gPL2Lexer lexer = new gPL2Lexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        gPL2Parser parser = new gPL2Parser(tokens);
        parser.setBuildParseTree(true);
        ParseTree tree = parser.prog();

        // Configuramos el listener
        ListenerBasico TB = new ListenerBasico();
        ParseTreeWalker walker = new ParseTreeWalker();

        // Recorremos el arbol
        walker.walk(TB, tree);

        // Imprimimos el arbol
        String ruta = "./resultado.txt";
        File archivo = new File(ruta);
        BufferedWriter bw;
        
        if(archivo.exists()){   
            bw = new BufferedWriter(new FileWriter(archivo));
            bw.write(TB.getArbol());
        } else{
            bw = new BufferedWriter(new FileWriter(archivo));
            bw.write(TB.getArbol());
        }
        bw.close();
        }

    }
