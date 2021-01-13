package PECL3;

import java.io.IOException;
import java.util.*;

public class Bifurcacion {
    private int valorVariables, valorBifurcaciones, valorLlamadas, valorOperacionesSimples, 
                valorParametros, valorTotal;
    private Integer contadorElse, contadorNodos;
    ArrayList<String> funciones = new ArrayList<String>();
    private HashMap <Integer, Bifurcacion> bifurcaciones = new HashMap<Integer,Bifurcacion> () ;

    public Bifurcacion(){
        //do nothing
    }

    public int getValorBifurcacion(){
        return valorTotal * valorTotal;
    }

    public void sacarValorBifurcaciones(){
        valorBifurcaciones = 0;
        for(Bifurcacion i: bifurcaciones.values())
        {
            valorBifurcaciones += i.getValorBifurcacion();
        }
        actualizarValoresT();
    }
    
    public void actualizarContadorNodos(){
        contadorNodos++;
    }

    public void addValorLlamadaFuncion(int p){
        valorLlamadas += p;
        actualizarValoresT();
    }

    public void setContadorElse(){
        contadorElse = contadorNodos;
    }

    public void addValorOperacionesSimples(int p){
        valorOperacionesSimples += p;
        actualizarValoresT();
    }

    public void addBifurcacion(Bifurcacion b){
        bifurcaciones.put(contadorNodos, b);
        actualizarContadorNodos();
        sacarValorBifurcaciones();
    }

    public void addValorParametrosLlamadaFuncion(int p){
        valorParametros += p;
        actualizarValoresT();
    }

    public void addValorDeclaracionVariable(int p){
        valorVariables +=p;
        actualizarValoresT();
    }

    public void actualizarValoresT(){
        valorTotal = valorVariables + valorLlamadas + valorParametros +
                                 valorBifurcaciones + valorOperacionesSimples;
    }

    public boolean esCompleta(){
        return (contadorElse.intValue() == 0);
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

    public Integer getContadorNodos()
    {
        return contadorNodos;
    }

    public void getNodosBifurcacion(GeneradorGrafo grafo) throws IOException{
        Integer contador = 1;
        if(esCompleta()){
            if(contadorNodos.intValue() == 1){   
                grafo.addNodo("CuerpoIf");
                grafo.addNodo("CuerpoElse");
            }else{
                while(contador < contadorNodos){
                    if(bifurcaciones.containsKey(contador)){
                        if(bifurcaciones.get(contador).esCompleta()){
                            grafo.addNodo("BifurcacionCompleta");
                            bifurcaciones.get(contador).getNodosBifurcacion(grafo);
                        }else{
                            grafo.addNodo("BifurcacionIncompleta");
                            bifurcaciones.get(contador).getNodosBifurcacion(grafo);
                        }                   
                    }
                    contador++;
                }
                grafo.addNodo("CuerpoElse");
            }
            grafo.addNodo("FinBifurcacion"); 
        }else {
            if(contadorNodos.intValue() == 1) {   
                grafo.addNodo("CuerpoIf");
            }else {
                while(contador < contadorNodos){
                    if(bifurcaciones.containsKey(contador)){
                        if(bifurcaciones.get(contador).esCompleta()){
                            grafo.addNodo("BifurcacionCompleta");
                            bifurcaciones.get(contador).getNodosBifurcacion(grafo);
                        }else{
                            grafo.addNodo("BifurcacionIncompleta");
                            bifurcaciones.get(contador).getNodosBifurcacion(grafo);
                        }                   
                    }
                    contador++;
                }
            }
            grafo.addNodo("FinBifurcacionIncompleta"); 
        }  
             
    }
}
