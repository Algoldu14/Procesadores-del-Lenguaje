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
        gPL3Lexer lexer = new gPL3Lexer(input);
        CommonTokenStream tokens = new CommonTokenStream (lexer);
        gPL3Parser parser = new gPL3Parser (tokens);
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
        ConvertidorHTML miHTML = new ConvertidorHTML(miTabla.getFunciones(),ficheroHTML);

        for(String i : miTabla.getFunciones().keySet()){        
            miHTML.escribirHTML(i);
        }
        miHTML.acabarHTML();
    }
}