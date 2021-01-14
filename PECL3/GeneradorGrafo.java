
import java.util.*;
import java.io.*;
import java.lang.*;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

//COMENTARIO: Esta clase se encarga de generar el grafo de complejidad ciclomática de una función, generando un fichero "nombrefuncion.txt" y otro "nombrefuncion.svg".

public class GeneradorGrafo 
{

    BufferedWriter writer;
    private int numNodosSalida,numAristas,complejidadCc,numLineas;
    private String fuctionID;
    private Integer contadorNodos = 1;
    private ArrayList <Integer> iniciosBucle = new ArrayList <Integer> ();
    private HashMap <Integer, Integer> controlBifurcacionesCompletas = new HashMap <Integer, Integer>();
    private HashMap <Integer, Integer> controlBucles = new HashMap <Integer, Integer>();
    private HashMap <Integer,Integer> controlBifurcacionesIncompletas = new HashMap <Integer,Integer>();
    private HashMap <Integer, String> nodosGrafo = new HashMap<Integer, String>();
    private Stack<Integer> bucles = new Stack<Integer>();
    private Stack<Integer> bifurcacionesCompletas = new Stack<Integer> ();
    private Stack<Integer> bifurcacionesIncompletas = new Stack<Integer> ();

    public GeneradorGrafo(String n) throws IOException{
        fuctionID = n;
        writer = new BufferedWriter(new FileWriter("C:\\antlr\\gramaticas\\"+fuctionID+".txt"));
        writer.write("digraph G {\n");
    }

    public void ajustarBifurcacionCompleta(Integer nodoElse){
        controlBifurcacionesCompletas.put(bifurcacionesCompletas.pop(),nodoElse);
    }

    public void ajustarBucle(Integer finBucle){
        controlBucles.put(bucles.pop(),finBucle);
    }

    public void addNodo(String tipo) throws IOException{
        if(tipo.equals("BifurcacionCompleta")){
            controlBifurcacionesCompletas.put(contadorNodos,null);
            bifurcacionesCompletas.push(contadorNodos);
        }
        else if(tipo.equals("CuerpoElse")){   
            numLineas++;
            ajustarBifurcacionCompleta(contadorNodos);
        }else if(tipo.equals("BifurcacionIncompleta")){
            controlBifurcacionesIncompletas.put(contadorNodos,null);
            bifurcacionesIncompletas.push(contadorNodos);
        }else if(tipo.equals("FinBifurcacionIncompleta")){
            numNodosSalida++;
            controlBifurcacionesIncompletas.put(bifurcacionesIncompletas.pop(),contadorNodos);
        }else if(tipo.equals("Bucle")){
            bucles.push(contadorNodos);
            controlBucles.put(contadorNodos,null);
        }else if(tipo.equals("FinBucle")){
            numNodosSalida++;
            ajustarBucle(contadorNodos);
        }else if(tipo.equals("FinBifurcacion")){
            numNodosSalida++;
        }else if(tipo.equals("CuerpoIf")){
            numLineas++;
        }
        writer.write("nodo"+contadorNodos+"[label=\"\"];\n");
        nodosGrafo.put(contadorNodos, tipo);
        contadorNodos++;
    }

    public void generarGrafo() throws IOException{
        writer.write("nodo" + 1 +"[fillcolor=white shape=Mdiamond style=filled label=\"start\"];\n" );
        writer.write("nodo"+ (contadorNodos.intValue()-1) + "[fillcolor=white shape=Msquare style=filled label=\"end\"];\n"  );
        for (Integer i: nodosGrafo.keySet()){
            String nodo = nodosGrafo.get(i);
            if(nodo.equals("BifurcacionCompleta")){
                writer.write("nodo"+i+"->nodo"+(i+1)+";\n");
                numAristas++;
                writer.write("nodo"+i+"->nodo"+controlBifurcacionesCompletas.get(i)+";\n");
                numAristas++;
            }else if(nodo.equals("BifurcacionIncompleta")){
                writer.write("nodo"+i+"->nodo"+(i+1)+";\n");
                numAristas++;
                writer.write("nodo"+i+"->nodo"+controlBifurcacionesIncompletas.get(i)+";\n");
                numAristas++;

            }else if(nodo.equals("CuerpoElse")){ 
                writer.write("nodo"+i+"->nodo"+(i+1)+";\n");
                numAristas++;
                
            }else if(nodo.equals("CuerpoIf")){
                for(Integer j: nodosGrafo.keySet()){
                    if( nodosGrafo.get(j).equals("FinBifurcacion") || nodosGrafo.get(j).equals("FinBifurcacionIncompleta")){
                        if(j>i){
                            writer.write("nodo"+i+"->nodo"+(j)+";\n");
                            numAristas++;
                            break;
                        } 
                    }
                }
            }else if(nodo.equals("FinBifurcacionIncompleta")||nodo.equals("FinBifurcacion")){
                if(!nodosGrafo.get(i+1).equals("FinBucle")){
                    writer.write("nodo"+i+"->nodo"+(i+1)+";\n");
                    numAristas++;
                }else if(nodosGrafo.get(i+1).equals("FinBucle")){
                    for(Integer k: controlBucles.keySet()){   
                        if(controlBucles.get(k).intValue() == i.intValue() + 1){
                            writer.write("nodo"+i+"->nodo"+k+";\n");
                            numAristas++;
                        }
                    }
                    
                }
            }else if(nodo.equals("InicioFuncion")){
                writer.write("nodo"+i+"->nodo"+(i+1)+";\n");
                numAristas++;
            }else if(nodo.equals("Bucle")){
                writer.write("nodo"+i+"->nodo"+(i+1)+";\n");
                numAristas++;
                if(nodosGrafo.get(i+1).equals("Bucle")){
                    writer.write("nodo"+controlBucles.get(i+1)+"->"+"nodo"+i+";\n");
                    numAristas++;
                }else if(nodosGrafo.get(i+1).equals("BifurcacionIncompleta")){
                    writer.write("nodo"+controlBifurcacionesIncompletas.get(i+1)+"->"+"nodo"+i+";\n");
                    numAristas++;
                }
                else if(!nodosGrafo.get(i+1).equals("BifurcacionCompleta")){
                    writer.write("nodo"+(i+1)+"->nodo"+i+";\n");
                    numAristas++;
                }
                writer.write("nodo"+i+"->nodo"+controlBucles.get(i)+";\n");
                numAristas++;     
            }else if(nodo.equals("FinBucle")&& !nodosGrafo.get(i+1).equals("FinBucle")){
                writer.write("nodo"+i+"->nodo"+(i+1)+";\n");
                numAristas++;
            }
        }

        complejidadCc = numAristas-(contadorNodos.intValue()-1)+2;
        writer.write("}");
        writer.close();
        Process p;
    try {
        p = Runtime.getRuntime().exec("dot -Tsvg "+fuctionID+".txt -o "+fuctionID+".svg");
        p.waitFor();
    } catch (Exception e) {
        e.printStackTrace();
    }
    }

    public int getComplejidadCiclomatica()
    {
        return complejidadCc;
    }
    
   
    
}
