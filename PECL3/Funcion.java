package PECL3;

import java.util.*;
import java.io.IOException;

public class Funcion{

    private String id,parametros,retorno;
    private int complejidadCc,valorParametros,valorBifurcaciones,lineasUtil,valorVariable,valorBucle,valorLlamada,
                valorOperacionesSimples,valorParametrosLlamadas,valorTotal;
    private ArrayList<String> parametrosFuncion = new ArrayList<String>();
    private Integer contadorNodos;
    GeneradorGrafo grafo;
    private ArrayList<String> funciones = new ArrayList<String>();
    private Stack<String> controlLlamadasFuncion = new Stack<String>();
    private HashMap <Integer,Bifurcacion> bifurcaciones = new HashMap <Integer,Bifurcacion>() ;
    private HashMap <Integer, Bucle> bucles = new HashMap <Integer, Bucle> ();

    public Funcion(){       
        //do nothing
    }

    public void addNombreLlamada(String nombre){
        funciones.add(nombre);
    }

    public ArrayList<String> getFuncionesLlamadas(){
        return this.funciones;
    }

    public void appendParametro(String p){
        this.parametrosFuncion.add(p);
        this.parametros ="";
        for(int i =0;i<parametrosFuncion.size();i++)
        {
            if(i == parametrosFuncion.size()-1)
            {
                parametros+=parametrosFuncion.get(i);
            }else{
                parametros += parametrosFuncion.get(i)+",";
            }
        }
    }

    public String getParametros(){
        return this.parametros;
    }

    public void appendReturn(String r){
        this.retorno += r;
    }

    public String getRetorno(){
        return  this.retorno;
    }

    public int getPuntos (){
        return this.valorTotal;
    }

    public void addPuntosOperacionesSimples(int p){
        this.valorOperacionesSimples += p;
        this.actualizarPuntosTotales();
    }

    public void sacarPuntosBifurcaciones(){
        this.valorBifurcaciones = 0;
        for(Bifurcacion i: this.bifurcaciones.values())
        {
            this.valorBifurcaciones += i.getPuntosBifurcacion();
        }
        this.actualizarPuntosTotales();
    }

    public void addBifurcacion(Bifurcacion b){
        this.bifurcaciones.put(this.contadorNodos,b);
        this.actualizarContadorNodos();
        sacarPuntosBifurcaciones();
    }

    public void actualizarContadorNodos(){
        this.contadorNodos = this.contadorNodos.intValue() + 1;
    }

    public void addPuntosLlamadaFuncion(int p){
        this.valorLlamada += p;
        actualizarContadorNodos();
        this.actualizarPuntosTotales();
    }

    public void addPuntosParametrosLlamadaFuncion(int p){
        this.valorParametrosLlamadas += p;
        this.actualizarPuntosTotales();
    }

    public void addPuntosParametro(int p){
        this.valorParametros += p;
        actualizarPuntosTotales();
    }

    public void addPuntosDeclaracionVariable(int p){
        this.valorVariable +=p;
        actualizarPuntosTotales();
    }

    public void actualizarPuntosTotales(){
        this.valorTotal = this.valorParametros + this.valorVariable +    
                                this.valorLlamada + this.valorParametrosLlamadas + this.valorBucle 
                                + this.valorBifurcaciones + this.valorOperacionesSimples;
    }

    public int getComplejidadCiclomatica(){
        return this.complejidadCc;
    }

    public void setNombre (String n){
        this.id = n;
    }

    public void addLineaCodigoEfectiva(int l){
        this.lineasUtil+=l;
    }
    
    public void sacarPuntosBucles(){
        this.valorBucle = 0;
        for(Bucle i: this.bucles.values())
        {
            this.valorBucle += i.getPuntosBucle();
        }
        actualizarPuntosTotales();
    }

    public void addBucle( Bucle b){
        this.bucles.put(this.contadorNodos,b);
        actualizarContadorNodos();
        sacarPuntosBucles();
    }

    public String getNombre (){
        return this.id;
    }

    public int getNumeroFuncionesLlamadas(){
        return this.valorLlamada/2;
    }

    public int getVariablesDeclaradas(){
        return this.valorVariable;
    }

    public int getNumeroParametros(){
        return this.valorParametros;
    }

    public void generarGrafoFuncion(String nombre)throws IOException{
        this.grafo = new GeneradorGrafo(nombre);
        getNodosFuncion();
        grafo.generarGrafo();
        this.complejidadCc=grafo.getComplejidadCiclomatica();
    }

    public void getNodosFuncion() throws IOException{  
        Integer contador = 1;
        this.grafo.addNodo("InicioFuncion");
        while (contador < contadorNodos)
        {
            if(bucles.containsKey(contador))
            {
                this.grafo.addNodo("Bucle");
                this.bucles.get(contador).getNodosBucle(this.grafo);
            }else if(bifurcaciones.containsKey(contador))
            {
                if(this.bifurcaciones.get(contador).esCompleta())
                {
                    this.grafo.addNodo("BifurcacionCompleta");
                    this.bifurcaciones.get(contador).getNodosBifurcacion(grafo);
                }else{
                    this.grafo.addNodo("BifurcacionIncompleta");
                    this.bifurcaciones.get(contador).getNodosBifurcacion(grafo);
                }
                
            }
            contador = contador.intValue() + 1;
        }
        this.grafo.addNodo("FinFuncion");
    }

    public Integer getContadorNodos()
    {
        return this.contadorNodos;
    }

    public HashMap<Integer,Bucle> getBucles()
    {
        return this.bucles;
    }

    public HashMap<Integer,Bifurcacion> getBifurcaciones()
    {
        return this.bifurcaciones;
    }

    public int getLineasCodigo()
    {
        return this.lineasUtil;
    }
}
