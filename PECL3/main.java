package PECL3;

//fichero ejecutable
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.*;
class Main{
    public static void main(String[] args) throws Exception {
        String inputFile = null, ficheroHTML = null, funcionPrincipal= null;
        if (args.length>0){
            inputFile= args[0];
            ficheroHTML = args[2];
            funcionPrincipal = args[1];
        } 

        InputStream is = System.in;
        if (inputFile!=null){
            is = new FileInputStream(inputFile);
        }

        CharStream input = CharStreams.fromStream(is);
        gPL2Lexer lexer = new gPL2Lexer (input);
        CommonTokenStream tokens = new CommonTokenStream (lexer);
        gPL2Parser parser = new gPL2Parser (tokens);
        parser.setBuildParseTree(true);
        ParseTree tree = parser.prog();

        //Configuramos el listener
        Listener mL = new Listener();
        ParseTreeWalker walker = new ParseTreeWalker();

        //Recorremos el arbol
        walker.walk(mL, tree);
        TablaDeSimbolos miTabla = mL.getTablaDeSimbolos();

        for(String i : miTabla.getFunciones().keySet()){
            miTabla.getFunciones().get(i).generarGrafoFuncion(i);
        }

        GeneradorGrafoLlamadas llamadas = new GeneradorGrafoLlamadas(miTabla.getFunciones());
        llamadas.addNodos();
        llamadas.generarGrafo();

        GrafoCiclomaticaTotal ciclomaticaTotal = new GrafoCiclomaticaTotal(miTabla.getFunciones(), funcionPrincipal);
        HTMLConverter miHTML = new HTMLConverter(miTabla.getFunciones(),ficheroHTML);

        for(String i : miTabla.getFunciones().keySet()){        
            miHTML.escribirHTML(i);
        }
        miHTML.endHTML();
    }
}