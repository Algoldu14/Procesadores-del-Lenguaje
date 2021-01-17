package PECL3;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.*;

public class ListenerBasico extends gPL2ParserBaseListener {

    private Stack<String> s = new Stack<String>();
    private String arbol = "";

    private String llamadafuncion = "";
    private TablaDeSimbolos miTabla = new TablaDeSimbolos();
    private Funcion funcionActual;
    private String parametrosFuncion="";
    private String retornoFuncion = "";
    private ArrayList <Bucle> controlBucles = new ArrayList<Bucle> ();
    private ArrayList <Bifurcacion> controlBifurcaciones = new ArrayList<Bifurcacion>();
    private Bucle bucleActual;
    private Bifurcacion bifurcacionActual;
    private String nombreFuncion = "";

    @Override 
    public void enterEveryRule(ParserRuleContext ctx) { 
        s.push(gPL2Parser.ruleNames[ctx.getRuleIndex()]);
        for (int i=0; i<s.size();i++)
        {
            this.arbol=arbol+"->"+s.get(i);
        }
        arbol=arbol+"\n";
    }

    @Override
    public void enterSi(gPL2Parser.SiContext ctx) {
        this.bifurcacionActual = new Bifurcacion();
        this.controlBifurcaciones.add(this.bifurcacionActual);
    }

    @Override
    public void enterFuncion(gPL2Parser.FuncionContext ctx) {
        this.funcionActual = new Funcion();
    }    

    @Override
    public void enterOperacion(gPL2Parser.OperacionContext ctx) {
        this.funcionActual.addLineaCodigoEfectiva(1);
    }

    @Override
    public void enterCabezafuncion(gPL2Parser.CabezafuncionContext ctx)
    {
        this.nombreFuncion = "Necesito un nombre de la funcion";
    }

   @Override
    public void enterMientras(gPL2Parser.MientrasContext ctx) {
        this.bucleActual = new Bucle();
        this.controlBucles.add(this.bucleActual);
    }

    @Override
    public void enterPara(gPL2Parser.ParaContext ctx){
        this.bucleActual = new Bucle();
        this.controlBucles.add(this.bucleActual);
    }

    @Override
    public void enterRepetir(gPL2Parser.RepetirContext ctx){
        this.bucleActual = new Bucle();
        this.controlBucles.add(this.bucleActual);
    }
    
    @Override
    public void exitMientras(gPL2Parser.MientrasContext ctx) {
        if(this.controlBucles.size() > 1 ){
            this.controlBucles.get(this.controlBucles.size() - 2).addBucle(this.controlBucles.get(this.controlBucles.size() - 1));
            this.controlBucles.remove(this.controlBucles.size()-1);
            this.bucleActual = this.controlBucles.get(this.controlBucles.size()-1);
        }else{
            this.funcionActual.addBucle(this.controlBucles.get(this.controlBucles.size() - 1));   
            this.controlBucles.remove(this.controlBucles.size()-1); 
            this.bucleActual = null;
        }
    }

    @Override
    public void exitPara(gPL2Parser.ParaContext ctx) {
        if(this.controlBucles.size() > 1 ){
            this.controlBucles.get(this.controlBucles.size() - 2).addBucle(this.controlBucles.get(this.controlBucles.size() - 1));
            this.controlBucles.remove(this.controlBucles.size()-1);
            this.bucleActual = this.controlBucles.get(this.controlBucles.size()-1);
        }else{
            this.funcionActual.addBucle(this.controlBucles.get(this.controlBucles.size() - 1));   
            this.controlBucles.remove(this.controlBucles.size()-1); 
            this.bucleActual = null;
        }
    }

    @Override
    public void exitRepetir(gPL2Parser.RepetirContext ctx) {
        if(this.controlBucles.size() > 1 ){
            this.controlBucles.get(this.controlBucles.size() - 2).addBucle(this.controlBucles.get(this.controlBucles.size() - 1));
            this.controlBucles.remove(this.controlBucles.size()-1);
            this.bucleActual = this.controlBucles.get(this.controlBucles.size()-1);
        }else{
            this.funcionActual.addBucle(this.controlBucles.get(this.controlBucles.size() - 1));   
            this.controlBucles.remove(this.controlBucles.size()-1); 
            this.bucleActual = null;
        }
    }

    @Override
    public void exitSi(gPL2Parser.SiContext ctx){

        if(this.controlBifurcaciones.size() > 1 ){//Si está dentro de otro if
            this.controlBifurcaciones.get(this.controlBifurcaciones.size() - 2).addBifurcacion(this.controlBifurcaciones.get(this.controlBifurcaciones.size() - 1));
            this.controlBifurcaciones.get(this.controlBifurcaciones.size() -2).actualizarContadorNodos();
            this.controlBifurcaciones.remove(this.controlBifurcaciones.size()-1);
            this.bifurcacionActual = this.controlBifurcaciones.get(this.controlBifurcaciones.size()-1);
        }else if(this.controlBucles.size() > 0){//si está dentro de un bucle
            this.controlBucles.get(this.controlBucles.size()-1).addBifurcacion(this.controlBifurcaciones.get(this.controlBifurcaciones.size() - 1));
            this.controlBifurcaciones.remove(this.controlBifurcaciones.size()-1); 
            this.bifurcacionActual = null;
        }else{//si está a pelo
            this.funcionActual.addBifurcacion(this.controlBifurcaciones.get(this.controlBifurcaciones.size() - 1));     
            this.controlBifurcaciones.remove(this.controlBifurcaciones.size()-1); 
            this.bifurcacionActual = null;
        }
    }

    @Override
    public void exitIdentificador(gPL2Parser.IDContext ctx)
    {
        this.nombreFuncion = "";
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        s.push(gPL2Lexer.VOCABULARY.getSymbolicName(node.getSymbol().getType()) + ":" + node.getText());
    }

    public String getArbol() {
        return this.arbol;
    }
}