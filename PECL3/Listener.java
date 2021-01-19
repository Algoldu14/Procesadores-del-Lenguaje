package PECL3;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.*;


public class Listener extends gPL3ParserBaseListener {

    private Stack<String> s = new Stack<String>();
    private String arbol = "";

    private String llamadafuncion = "";
    private TablaDeSimbolos tablaSimbolos = new TablaDeSimbolos();
    private Funcion currentFunction;
    private String parametrosFuncion = "";
    private String retornoFuncion = "";
    private ArrayList<Bucle> loopControl = new ArrayList<Bucle>();
    private ArrayList<Bifurcacion> bifurcationControl = new ArrayList<Bifurcacion>();
    private Bucle currentLoop;
    private Bifurcacion currentBifurcation;
    private String functionName = "";

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        s.push(gPL3Parser.ruleNames[ctx.getRuleIndex()]);
        for (int i = 0; i < s.size(); i++) {
            this.arbol = arbol + "->" + s.get(i);
        }
        arbol = arbol + "\n";
    }

    @Override
    public void enterSi(gPL3Parser.SiContext ctx) {
        this.currentBifurcation = new Bifurcacion();
        this.bifurcationControl.add(this.currentBifurcation);
    }

    @Override
    public void enterFuncion(gPL3Parser.FuncionContext ctx) {
        this.currentFunction = new Funcion();
        this.currentFunction.appendReturn("");
    }

    @Override
    public void exitFuncion(gPL3Parser.FuncionContext ctx) {
        this.tablaSimbolos.addFuncion(currentFunction.getNombre(), currentFunction);
        loopControl.clear();
        bifurcationControl.clear();
    }

    @Override
    public void enterAlgoritmo(gPL3Parser.AlgoritmoContext ctx) {
        this.currentFunction = new Funcion();
        this.currentFunction.appendParametro("");
        this.currentFunction.appendReturn("");
        this.functionName = "Necesito un nombre de la funcion";
    }

    @Override
    public void exitAlgoritmo(gPL3Parser.AlgoritmoContext ctx) {
        this.tablaSimbolos.addFuncion(currentFunction.getNombre(), currentFunction);
        loopControl.clear();
        bifurcationControl.clear();
    }

    @Override
    public void enterOperacion(gPL3Parser.OperacionContext ctx) {
        this.currentFunction.addLineaCodigoEfectiva(1);
    }

    @Override
    public void enterCabezafuncion(gPL3Parser.CabezafuncionContext ctx) {
        this.functionName = "Necesito un nombre de la funcion";
    }

    @Override
    public void enterMientras(gPL3Parser.MientrasContext ctx) {
        this.currentLoop = new Bucle();
        this.loopControl.add(this.currentLoop);
    }

    @Override
    public void enterPara(gPL3Parser.ParaContext ctx) {
        this.currentLoop = new Bucle();
        this.loopControl.add(this.currentLoop);
    }

    @Override
    public void enterRepetir(gPL3Parser.RepetirContext ctx) {
        this.currentLoop = new Bucle();
        this.loopControl.add(this.currentLoop);
    }

    @Override
    public void exitMientras(gPL3Parser.MientrasContext ctx) {
        if (this.loopControl.size() > 1) {
            this.loopControl.get(this.loopControl.size() - 2)
                    .addBucle(this.loopControl.get(this.loopControl.size() - 1));
            this.loopControl.remove(this.loopControl.size() - 1);
            this.currentLoop = this.loopControl.get(this.loopControl.size() - 1);
        } else {
            this.currentFunction.addBucle(this.loopControl.get(this.loopControl.size() - 1));
            this.loopControl.remove(this.loopControl.size() - 1);
            this.currentLoop = null;
        }
    }

    @Override
    public void exitPara(gPL3Parser.ParaContext ctx) {
        if (this.loopControl.size() > 1) {
            this.loopControl.get(this.loopControl.size() - 2)
                    .addBucle(this.loopControl.get(this.loopControl.size() - 1));
            this.loopControl.remove(this.loopControl.size() - 1);
            this.currentLoop = this.loopControl.get(this.loopControl.size() - 1);
        } else {
            this.currentFunction.addBucle(this.loopControl.get(this.loopControl.size() - 1));
            this.loopControl.remove(this.loopControl.size() - 1);
            this.currentLoop = null;
        }
    }

    @Override
    public void exitRepetir(gPL3Parser.RepetirContext ctx) {
        if (this.loopControl.size() > 1) {
            this.loopControl.get(this.loopControl.size() - 2)
                    .addBucle(this.loopControl.get(this.loopControl.size() - 1));
            this.loopControl.remove(this.loopControl.size() - 1);
            this.currentLoop = this.loopControl.get(this.loopControl.size() - 1);
        } else {
            this.currentFunction.addBucle(this.loopControl.get(this.loopControl.size() - 1));
            this.loopControl.remove(this.loopControl.size() - 1);
            this.currentLoop = null;
        }
    }

    @Override
    public void exitSi(gPL3Parser.SiContext ctx) {

        if (this.bifurcationControl.size() > 1) {// Si está dentro de otro if
            this.bifurcationControl.get(this.bifurcationControl.size() - 2)
                    .addBifurcacion(this.bifurcationControl.get(this.bifurcationControl.size() - 1));
            this.bifurcationControl.get(this.bifurcationControl.size() - 2).actualizarContadorNodos();
            this.bifurcationControl.remove(this.bifurcationControl.size() - 1);
            this.currentBifurcation = this.bifurcationControl.get(this.bifurcationControl.size() - 1);
        } else if (this.loopControl.size() > 0) {// si está dentro de un bucle
            this.loopControl.get(this.loopControl.size() - 1)
                    .addBifurcacion(this.bifurcationControl.get(this.bifurcationControl.size() - 1));
            this.bifurcationControl.remove(this.bifurcationControl.size() - 1);
            this.currentBifurcation = null;
        } else {// si está a pelo
            this.currentFunction.addBifurcacion(this.bifurcationControl.get(this.bifurcationControl.size() - 1));
            this.bifurcationControl.remove(this.bifurcationControl.size() - 1);
            this.currentBifurcation = null;
        }
    }

    @Override
    public void enterIdentificador(gPL3Parser.IdentificadorContext ctx) {
        if (this.functionName.equals("Necesito un nombre de la funcion")) {
            this.currentFunction.setNombre(ctx.ID().getText());
            this.functionName = "";
        } else if (this.parametrosFuncion.equals("Necesito un parámetro de funcion")) {
            this.currentFunction.appendParametro(ctx.ID().getText());
        } else if (this.llamadafuncion.equals("Necesito un nombre de llamada")) {
            if (this.bifurcationControl.size() > 1) {
                this.bifurcationControl.get(this.bifurcationControl.size() - 1)
                        .addNombreLlamada(ctx.ID().getText());
            } else if (this.loopControl.size() > 0) {
                this.loopControl.get(this.loopControl.size() - 1).addNombreLlamada(ctx.ID().getText());
            } else {
                this.currentFunction.addNombreLlamada(ctx.ID().getText());
            }
            this.llamadafuncion = "";
        }
    }

    @Override
    public void exitIdentificador(gPL3Parser.IdentificadorContext ctx) {
        this.functionName = "";
    }

    @Override
    public void enterArgumentos(gPL3Parser.ArgumentosContext ctx) {
        this.currentFunction.addValorParametro(2 * ctx.identificador().size());
        this.parametrosFuncion = "Necesito un parámetro de funcion";
    }

    @Override
    public void exitArgumentos(gPL3Parser.ArgumentosContext ctx) {
        this.parametrosFuncion = "";
    }

    @Override
    public void enterPfinfuncion(gPL3Parser.PfinfuncionContext ctx) {
        this.retornoFuncion = "Necesito un retorno de funcion";
    }

    @Override
    public void enterDefinicion(gPL3Parser.DefinicionContext ctx) {
        if (this.loopControl.size() > 0) {
            if (this.bifurcationControl.size() > 0) {
                this.bifurcationControl.get(this.bifurcationControl.size() - 1)
                        .addValorDeclaracionVariable(1 * ctx.identificador().size());
            } else {
                this.loopControl.get(this.loopControl.size() - 1)
                        .addValorDeclaracionVariable(1 * ctx.identificador().size());
            }
        } else {
            if (this.bifurcationControl.size() > 0) {
                this.bifurcationControl.get(bifurcationControl.size() - 1)
                        .addValorDeclaracionVariable(1 * ctx.identificador().size());
            } else {
                int aux =ctx.identificador().size();
                this.currentFunction.addValorDeclaracionVariable(1 * aux);
            }
        }
        this.currentFunction.addLineaCodigoEfectiva(ctx.identificador().size());
    }

    @Override
    public void enterLlamadaFuncion(gPL3Parser.LlamadaFuncionContext ctx) {
        this.llamadafuncion = "Necesito un nombre de llamada";
        if (this.bifurcationControl.size() > 0) {
            this.bifurcationControl.get(this.bifurcationControl.size() - 1).addValorLlamadaFuncion(2);
        } else if (this.loopControl.size() > 0) {
            this.loopControl.get(this.loopControl.size() - 1).addValorLlamadaFuncion(2);
        } else {
            this.currentFunction.addValorLlamadaFuncion(2);
        }
        this.currentFunction.addLineaCodigoEfectiva(1);
        if(ctx.argumentos()==null){
            this.currentFunction.addValorParametrosLlamadaFuncion(0);
        }else{
            this.currentFunction.addValorParametrosLlamadaFuncion(ctx.argumentos().identificador().size());
        }
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        if (this.retornoFuncion.equals("Necesito un retorno de funcion")) {
            this.currentFunction.appendReturn(node.getText());
            this.retornoFuncion = "";
        }
    }

    public TablaDeSimbolos getTablaDeSimbolos() {
        return this.tablaSimbolos;
    }

    public String getArbol() {
        return this.arbol;
    }
}