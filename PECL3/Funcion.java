package PECL3;

import java.util.*;
import java.io.IOException;

public class Funcion {
    private String id, parametros, retorno;
    private int complejidadCc = 0, valorParametros = 0, valorBifurcaciones = 0, lineasUtil = 0, valorVariable = 0,
            valorBucle = 0, valorLlamada = 0, valorOperacionesSimples = 0, valorParametrosLlamadas = 0, valorTotal = 0;
    private ArrayList<String> parametrosFuncion = new ArrayList<String>();
    private Integer contadorNodos=0;
    GeneradorGrafo grafo;
    private ArrayList<String> funciones = new ArrayList<String>();
    private Stack<String> controlLlamadasFuncion = new Stack<String>();
    private HashMap<Integer, Bifurcacion> bifurcaciones = new HashMap<Integer, Bifurcacion>();
    private HashMap<Integer, Bucle> bucles = new HashMap<Integer, Bucle>();

    public Funcion() {
        // do nothing
    }

    public void addNombreLlamada(String nombre) {
        funciones.add(nombre);
    }

    public ArrayList<String> getFuncionesLlamadas() {
        return funciones;
    }

    public void appendParametro(String p) {
        parametrosFuncion.add(p);
        parametros = "";
        for (int i = 0; i < parametrosFuncion.size(); i++) {
            if (i == parametrosFuncion.size() - 1) {
                parametros += parametrosFuncion.get(i);
            } else {
                parametros += parametrosFuncion.get(i) + ",";
            }
        }
    }

    public String getParametros() {
        return parametros;
    }

    public void appendReturn(String r) {
        retorno += r;
    }

    public String getRetorno() {
        return retorno;
    }

    public int getValor() {
        return valorTotal;
    }

    public void addalorOperacionesSimples(int p) {
        valorOperacionesSimples += p;
        actualizarValorTotales();
    }

    public void sacarValorBifurcaciones() {
        valorBifurcaciones = 0;
        for (Bifurcacion i : bifurcaciones.values()) {
            valorBifurcaciones += i.getValorBifurcacion();
        }
        actualizarValorTotales();
    }

    public void addBifurcacion(Bifurcacion b) {
        bifurcaciones.put(contadorNodos, b);
        actualizarContadorNodos();
        sacarValorBifurcaciones();
    }

    public void actualizarContadorNodos() {
        this.contadorNodos++;
    }

    public void addValorLlamadaFuncion(int p) {
        valorLlamada += p;
        actualizarContadorNodos();
        actualizarValorTotales();
    }

    public void addValorParametrosLlamadaFuncion(int p) {
        valorParametrosLlamadas += p;
        actualizarValorTotales();
    }

    public void addValorParametro(int p) {
        valorParametros += p;
        actualizarValorTotales();
    }

    public void addValorDeclaracionVariable(int p) {
        valorVariable += p;
        actualizarValorTotales();
    }

    public void actualizarValorTotales() {
        valorTotal = valorParametros + valorVariable + valorLlamada + valorParametrosLlamadas + valorBucle
                + valorBifurcaciones + valorOperacionesSimples;
    }

    public int getComplejidadCiclomatica() {
        return complejidadCc;
    }

    public void setNombre(String n) {
        id = n;
    }

    public void addLineaCodigoEfectiva(int l) {
        lineasUtil += l;
    }

    public void sacarValorBucles() {
        valorBucle = 0;
        for (Bucle i : bucles.values()) {
            valorBucle += i.getValorBucle();
        }
        actualizarValorTotales();
    }

    public void addBucle(Bucle b) {
        bucles.put(contadorNodos, b);
        actualizarContadorNodos();
        sacarValorBucles();
    }

    public String getNombre() {
        return id;
    }

    public int getNumeroFuncionesLlamadas() {
        return valorLlamada / 2;
    }

    public int getVariablesDeclaradas() {
        return valorVariable;
    }

    public int getNumeroParametros() {
        return valorParametros;
    }

    public void generarGrafoFuncion(String nombre) throws IOException {
        grafo = new GeneradorGrafo(nombre);
        getNodosFuncion();
        grafo.generarGrafo();
        complejidadCc = grafo.getComplejidadCiclomatica();
    }

    public void getNodosFuncion() throws IOException {
        Integer contador = 1;
        grafo.addNodo("InicioFuncion");
        while (contador < contadorNodos) {
            if (bucles.containsKey(contador)) {
                grafo.addNodo("Bucle");
                bucles.get(contador).getNodosBucle(grafo);
            } else if (bifurcaciones.containsKey(contador)) {
                if (bifurcaciones.get(contador).esCompleta()) {
                    grafo.addNodo("BifurcacionCompleta");
                    bifurcaciones.get(contador).getNodosBifurcacion(grafo);
                } else {
                    grafo.addNodo("BifurcacionIncompleta");
                    bifurcaciones.get(contador).getNodosBifurcacion(grafo);
                }

            }
            contador = contador.intValue() + 1;
        }
        grafo.addNodo("FinFuncion");
    }

    public Integer getContadorNodos() {
        return contadorNodos;
    }

    public HashMap<Integer, Bucle> getBucles() {
        return bucles;
    }

    public HashMap<Integer, Bifurcacion> getBifurcaciones() {
        return bifurcaciones;
    }

    public int getLineasCodigo() {
        return lineasUtil;
    }
}
