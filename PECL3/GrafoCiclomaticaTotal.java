package PECL3;

import java.util.*;
import java.io.*;

public class GrafoCiclomaticaTotal {
    BufferedWriter writer;
    private int numAristas = 0;
    private int complejidadCiclomatica = 0;
    private Integer contadorNodos = 1;
    private HashMap<Integer, Integer> controlBifurcacionesCompletas = new HashMap<Integer, Integer>();
    private HashMap<Integer, Integer> controlBucles = new HashMap<Integer, Integer>();
    private Stack<Integer> bucles = new Stack<Integer>();
    private Stack<Integer> bifurCompletas = new Stack<Integer>();
    private Stack<Integer> bifurIncompletas = new Stack<Integer>();
    private HashMap<Integer, Integer> controlBifurcacionesIncompletas = new HashMap<Integer, Integer>();
    private HashMap<Integer, String> nodosGrafo = new HashMap<Integer, String>();
    private HashMap<String, Funcion> controlFunciones;

    public GrafoCiclomaticaTotal(HashMap<String, Funcion> f, String funcionPrincipal) throws IOException {
        writer = new BufferedWriter(new FileWriter("C:\\antlr\\gramaticas\\ciclomaticaTotal.txt"));
        writer.write("digraph G {\n");
        this.controlFunciones = f;
        getNodosFuncion(f.get(funcionPrincipal));
        generarGrafo();
    }

    public void ajustarBifurComp(Integer nodoElse) {
        controlBifurcacionesCompletas.put(bifurCompletas.pop(), nodoElse);
    }

    public void ajustarBucl(Integer finBucle) {
        controlBucles.put(bucles.pop(), finBucle);
    }

    public void addNodo(String tipo) throws IOException {
        if (tipo.equals("BifurcacionCompleta")) {
            controlBifurcacionesCompletas.put(contadorNodos, null);
            bifurCompletas.push(contadorNodos);
        } else if (tipo.equals("CuerpoElse")) {
            ajustarBifurComp(contadorNodos);
        } else if (tipo.equals("BifurcacionIncompleta")) {
            controlBifurcacionesIncompletas.put(contadorNodos, null);
            bifurIncompletas.push(contadorNodos);
        } else if (tipo.equals("FinBifurcacionIncompleta")) {
            controlBifurcacionesIncompletas.put(bifurIncompletas.pop(), contadorNodos);
        } else if (tipo.equals("Bucle")) {
            bucles.push(contadorNodos);
            controlBucles.put(contadorNodos, null);
        } else if (tipo.equals("FinBucle")) {
            ajustarBucl(contadorNodos);
        }
        writer.write("nodo" + contadorNodos + "[label=\"\"];\n");
        nodosGrafo.put(contadorNodos, tipo);
        contadorNodos++;
    }


    public void getNodosFuncion(Funcion f) throws IOException {
        Integer contador = 1;
        int contadorFuncionesLlamadas = 0;
        addNodo("InicioFuncion");
        while (contador < f.getContadorNodos()) {
            if (f.getBucles().containsKey(contador)) {
                addNodo("Bucle");
                getNodosBucle(f.getBucles().get(contador));
            } else if (f.getBifurcaciones().containsKey(contador)) {
                if (f.getBifurcaciones().get(contador).esCompleta()) {
                    addNodo("BifurcacionCompleta");
                    getNodosBifurcacion(f.getBifurcaciones().get(contador));
                } else {
                    addNodo("BifurcacionIncompleta");
                    getNodosBifurcacion(f.getBifurcaciones().get(contador));
                }
            } else {
                String funcionLlamada = f.getFuncionesLlamadas().get(contadorFuncionesLlamadas);
                if (controlFunciones.containsKey(funcionLlamada)) {
                    addNodo("Llamada");
                    contadorFuncionesLlamadas++;
                    getNodosFuncion(controlFunciones.get(funcionLlamada));
                }
            }
            contador = contador.intValue() + 1;
        }
        addNodo("FinFuncion");
    }

    public void generarGrafo() throws IOException {
        writer.write("nodo" + 1 + "[fillcolor=white shape=Mdiamond style=filled label=\"start\"];\n");
        writer.write("nodo" + (contadorNodos.intValue() - 1)
                + "[fillcolor=white shape=Msquare style=filled label=\"end\"];\n");
        for (Integer i : nodosGrafo.keySet()) {
            String nodo = nodosGrafo.get(i);
            if (nodo.equals("BifurcacionCompleta")) {
                writer.write("nodo" + i + "->nodo" + (i + 1) + ";\n");
                numAristas++;
                writer.write("nodo" + i + "->nodo" + controlBifurcacionesCompletas.get(i) + ";\n");
                numAristas++;
            } else if (nodo.equals("BifurcacionIncompleta")) {
                writer.write("nodo" + i + "->nodo" + (i + 1) + ";\n");
                numAristas++;
                writer.write("nodo" + i + "->nodo" + controlBifurcacionesIncompletas.get(i) + ";\n");
                numAristas++;
            } else if (nodo.equals("CuerpoElse")) {
                writer.write("nodo" + i + "->nodo" + (i + 1) + ";\n");
                numAristas++;
            } else if (nodo.equals("CuerpoIf")) {
                for (Integer j : nodosGrafo.keySet()) {
                    if (nodosGrafo.get(j).equals("FinBifurcacion")
                            || nodosGrafo.get(j).equals("FinBifurcacionIncompleta")) {
                        if (j > i) {
                            writer.write("nodo" + i + "->nodo" + (j) + ";\n");
                            numAristas++;
                            break;
                        }
                    }
                }
            } else if (nodo.equals("FinBifurcacionIncompleta") || nodo.equals("FinBifurcacion")) {
                if (nodosGrafo.get(i + 1).equals("CuerpoElse")) {
                    writer.write("nodo" + i + "->nodo" + (i + 2) + ";\n");
                    numAristas++;
                } else if (nodosGrafo.get(i + 1).equals("FinBucle")) {
                    for (Integer k : controlBucles.keySet()) {
                        if (controlBucles.get(k).intValue() == i.intValue() + 1) {
                            writer.write("nodo" + i + "->nodo" + k + ";\n");
                            numAristas++;
                        }
                    }
                } else {
                    writer.write("nodo" + i + "->nodo" + (i + 1) + ";\n");
                    numAristas++;
                }
            } else if (nodo.equals("InicioFuncion")) {
                writer.write("nodo" + i + "->nodo" + (i + 1) + ";\n");
                numAristas++;
            } else if (nodo.equals("Bucle")) {
                writer.write("nodo" + i + "->nodo" + (i + 1) + ";\n");
                numAristas++;
                if (nodosGrafo.get(i + 1).equals("Bucle")) {
                    writer.write("nodo" + controlBucles.get(i + 1) + "->" + "nodo" + i + ";\n");
                    numAristas++;
                } else if (nodosGrafo.get(i + 1).equals("CuerpoBucle")) {
                    writer.write("nodo" + (i + 1) + "->nodo" + i + ";\n");
                    numAristas++;
                } else if (nodosGrafo.get(i + 1).equals("Llamada")) {
                    writer.write("nodo" + (controlBucles.get(i) - 1) + "->" + "nodo" + i + ";\n");
                    numAristas++;
                } else if (nodosGrafo.get(i + 1).equals("BifurcacionIncompleta")) {
                    writer.write("nodo" + controlBifurcacionesIncompletas.get(i + 1) + "->" + "nodo" + i + ";\n");
                    numAristas++;
                } else if (!nodosGrafo.get(i + 1).equals("BifurcacionCompleta")) {
                    writer.write("nodo" + (i + 1) + "->nodo" + i + ";\n");
                    numAristas++;
                }
                writer.write("nodo" + i + "->nodo" + controlBucles.get(i) + ";\n");
                numAristas++;
            } else if (nodo.equals("FinBucle") && !nodosGrafo.get(i + 1).equals("FinBucle")) {
                writer.write("nodo" + i + "->nodo" + (i + 1) + ";\n");
                numAristas++;
            } else if (nodo.equals("Llamada")) {
                writer.write("nodo" + i + "->nodo" + (i + 1) + ";\n");
                numAristas++;
            } else if (i == contadorNodos.intValue() - 2) {
                writer.write("nodo" + i + "->nodo" + (i + 1) + ";\n");
                numAristas++;
            } else if (nodo.equals(("FinFuncion")) && i != contadorNodos.intValue() - 1
                    && !nodosGrafo.get(i + 1).equals("FinBucle")) {
                writer.write("nodo" + i + "->nodo" + (i + 1) + ";\n");
                numAristas++;
            }
        }

        this.complejidadCiclomatica = this.numAristas - (this.contadorNodos - 1) + 2;
        writer.write("}");
        writer.close();

        Process p;
        try {
            p = Runtime.getRuntime().exec("dot -Tsvg ciclomaticaTotal.txt -o ciclomaticaTotal.svg");
            p.waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public boolean algunaFuncionDefinida(Bucle b) {
        for (int i = 0; i < b.getFuncionesLlamadas().size(); i++) {
            if (controlFunciones.containsKey(b.getFuncionesLlamadas().get(i))) {
                return true;
            }
        }
        return false;

    }

    public void getNodosBifurcacion(Bifurcacion b) throws IOException {
        Integer contador = 1;
        int contadorFuncionesLlamadas = 0;
        if (b.esCompleta()) {
            if (b.getContadorNodos().intValue() == 1) {
                addNodo("CuerpoIf");
                addNodo("CuerpoElse");
            } else {
                while (contador < b.getContadorNodos().intValue()) {
                    if (b.getBifurcaciones().containsKey(contador)) {
                        if (b.getBifurcaciones().get(contador).esCompleta()) {
                            addNodo("BifurcacionCompleta");
                            getNodosBifurcacion(b.getBifurcaciones().get(contador));
                        } else {
                            addNodo("BifurcacionIncompleta");
                            getNodosBifurcacion(b.getBifurcaciones().get(contador));
                        }
                    } else {
                        String funcionLlamada = b.getFuncionesLlamadas().get(contadorFuncionesLlamadas);
                        if (controlFunciones.containsKey(funcionLlamada)) {
                            addNodo("Llamada");
                            getNodosFuncion(controlFunciones.get(funcionLlamada));
                            contadorFuncionesLlamadas++;
                        }
                    }
                    contador++;
                }
                addNodo("CuerpoElse");
            }
            addNodo("FinBifurcacion");
        } else {
            if (b.getContadorNodos().intValue() == 1) {
                addNodo("CuerpoIf");
            } else {
                while (contador < contadorNodos) {
                    if (b.getBifurcaciones().containsKey(contador)) {
                        if (b.getBifurcaciones().get(contador).esCompleta()) {
                            addNodo("BifurcacionCompleta");
                            getNodosBifurcacion(b.getBifurcaciones().get(contador));
                        } else {
                            addNodo("BifurcacionIncompleta");
                            getNodosBifurcacion(b.getBifurcaciones().get(contador));
                        }
                    } else {
                        String funcionLlamada = b.getFuncionesLlamadas().get(contadorFuncionesLlamadas);
                        if (controlFunciones.containsKey(funcionLlamada)) {
                            addNodo("Llamada");
                            getNodosFuncion(controlFunciones.get(funcionLlamada));
                            contadorFuncionesLlamadas++;
                        }
                    }
                    contador++;
                }
            }
            addNodo("FinBifurcacionIncompleta");
        }
    }

    public void getNodosBucle(Bucle b) throws IOException {
        Integer contador = 1;
        int contadorFuncionesLlamadas = 0;

        if ((b.getContadorNodos() - b.funciones.size() == 1) && (algunaFuncionDefinida(b) == false)) {
            addNodo("CuerpoBucle");
        }
        while (contador < b.getContadorNodos().intValue()) {
            if (b.getBifurcaciones().containsKey(contador)) {
                if (b.getBifurcaciones().get(contador).esCompleta()) {
                    addNodo("BifurcacionCompleta");
                    getNodosBifurcacion(b.getBifurcaciones().get(contador));
                } else {
                    addNodo("BifurcacionIncompleta");
                    getNodosBifurcacion(b.getBifurcaciones().get(contador));
                }
            } else if (b.getBucles().containsKey(contador)) {
                addNodo("Bucle");
                getNodosBucle(b.getBucles().get(contador));
            } else {
                String funcionLlamada = b.getFuncionesLlamadas().get(contadorFuncionesLlamadas);
                if (controlFunciones.containsKey(funcionLlamada)) {
                    addNodo("Llamada");
                    getNodosFuncion(controlFunciones.get(funcionLlamada));
                    contadorFuncionesLlamadas++;
                }
            }
            contador++;
        }
        addNodo("FinBucle");
    }


    public Integer getContadorNodos() {
        return this.contadorNodos;
    }
}
