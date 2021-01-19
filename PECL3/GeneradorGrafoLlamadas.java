package PECL3;

import java.util.*;
import java.io.*;

public class GeneradorGrafoLlamadas {
    BufferedWriter writer;
    private ArrayList<String> nodos = new ArrayList<String>();
    private HashMap<String, Funcion> funciones;

    public GeneradorGrafoLlamadas(HashMap<String, Funcion> f) throws IOException {
        this.funciones = f;
        writer = new BufferedWriter(new FileWriter("C:\\antlr\\gramaticas\\llamadas.txt"));// cambiar
        writer.write("digraph G {\n");
    }

    public void addNodos() throws IOException {
        for (String i : funciones.keySet()) {
            if (estaEnNodos(i) == false) {
                writer.write("nodo" + i + "[label=\"" + i + "\"];\n");
                nodos.add(i);
            }
            ArrayList<String> llamadas = funciones.get(i).getFuncionesLlamadas();
            for (int j = 0; j < llamadas.size(); j++) {
                if (estaEnNodos(llamadas.get(j)) == false) {
                    writer.write("nodo" + llamadas.get(j) + "[label=\"" + llamadas.get(j) + "\"];\n");
                    nodos.add(llamadas.get(j));
                }
            }
        }
    }

    public void generarGrafo() throws IOException {
        for (String i : funciones.keySet()) {
            ArrayList<String> llamadas = funciones.get(i).getFuncionesLlamadas();
            for (int j = 0; j < llamadas.size(); j++) {
                writer.write("nodo" + i + "->" + "nodo" + llamadas.get(j) + ";\n");
            }
        }
        writer.write("}");
        writer.close();
        Process p;
        try {
            p = Runtime.getRuntime().exec("dot -Tsvg llamadas.txt -o llamadas.svg");
            p.waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean estaEnNodos(String nodo) {
        for (int i = 0; i < nodos.size(); i++) {
            if (nodo.equals(nodos.get(i))) {
                return true;
            }
        }
        return false;
    }

}
