package PECL3;

import java.io.IOException;
import java.util.*;

public class Bucle {
    private int valorVariables,valorBucles,valorBifurcaciones, valorLlamadas, valorOperacionesSimples, 
                valorParametros, valorTotal;
    private Integer contadorNodos;
    ArrayList<String> funciones = new ArrayList<String>();
    private HashMap <Integer, Bifurcacion> bifurcaciones = new HashMap <Integer, Bifurcacion>  () ;
    private HashMap <Integer, Bucle> bucles = new HashMap <Integer, Bucle>() ;


    public Bucle(){
        //do nothing
    }

    public int getPuntosBucle (){
        return valorTotal * valorTotal;
    }
    
    public void sacarPuntosBifurcaciones(){
        valorBifurcaciones = 0;
        for(Bifurcacion i: bifurcaciones.values())
        {
            valorBifurcaciones += i.getPuntosBifurcacion();
        }
        actualizarPuntosTotales();
    }

    public void sacarPuntosBucles(){
        valorBucles = 0;
        for(Bucle i: bucles.values())
        {
            valorBucles += i.getPuntosBucle();
        }
        actualizarPuntosTotales();
    }

    public void actualizarContadorNodos(){
        contadorNodos ++;
    }

    public void addPuntosLlamadaFuncion(int p){
        valorLlamadas += p;
        actualizarContadorNodos();
        actualizarPuntosTotales();
    }

    public void addPuntosOperacionesSimples(int p){
        valorOperacionesSimples += p;
        actualizarPuntosTotales();
    }

    public void addBifurcacion(Bifurcacion b){
        this.bifurcaciones.put(contadorNodos,b);
        actualizarContadorNodos();
        sacarPuntosBifurcaciones();
    }

    public void addPuntosParametrosLlamadaFuncion(int p){
        valorParametros += p;
        this.actualizarPuntosTotales();
    }

    public void addPuntosDeclaracionVariable(int p){
        valorVariables +=p;
        actualizarPuntosTotales();
    }

    public void actualizarPuntosTotales(){
        valorTotal = valorVariables + valorLlamadas + valorParametros +
                                 valorBifurcaciones + valorOperacionesSimples;
    }

    public void addNombreLlamada(String nombre){
        funciones.add(nombre);
    }

    public ArrayList<String> getFuncionesLlamadas(){
        return funciones;
    }

    public HashMap<Integer,Bifurcacion> getBifurcaciones()
    {
        return bifurcaciones;
    }

    public void addBucle(Bucle b){
        bucles.put(contadorNodos,b);
        actualizarContadorNodos();
        sacarPuntosBucles();
    }

    public Integer getContadorNodos(){
        return this.contadorNodos;
    }

    public HashMap<Integer,Bucle> getBucles(){
        return this.bucles;
    }

    public void getNodosBucle(GeneradorGrafo grafo) throws IOException
    {
        Integer contador = 1;
        if((contadorNodos.intValue() - funciones.size()) == 1) 
        {
            grafo.addNodo("CuerpoBucle");
        }else{
            while(contador < contadorNodos)
            {
                if(bifurcaciones.containsKey(contador))
                {
                    if(bifurcaciones.get(contador).esCompleta())
                    {
                        grafo.addNodo("BifurcacionCompleta");
                        bifurcaciones.get(contador).getNodosBifurcacion(grafo);
                    }else{
                        grafo.addNodo("BifurcacionIncompleta");
                        bifurcaciones.get(contador).getNodosBifurcacion(grafo);
                    }
                }else if(bucles.containsKey(contador))
                {
                    grafo.addNodo("Bucle");
                    bucles.get(contador).getNodosBucle(grafo);
                }
                contador++;
            }
        }
        grafo.addNodo("FinBucle");
    }
    
}
