package PECL3;

import java.io.*;
import java.util.*;

public class ConvertidorHTML {

    private BufferedWriter writer;
    private HashMap<String, Funcion> funciones = new HashMap<String, Funcion>();

    public ConvertidorHTML(HashMap<String, Funcion> f, String fichero) throws IOException {
        this.funciones = f;
        writer = new BufferedWriter(new FileWriter(".\\" + fichero + ".html"));
        writer.write("<!doctype html>");
        writer.newLine();

        writer.write("<html>");
        writer.newLine();

        writer.write("<head>");
        writer.newLine();

        writer.write("<title>Procesadores del Lenguaje - Práctica 3</title>");
        writer.newLine();

        writer.write("</head>");
        writer.newLine();

        writer.write("<body>");
        writer.newLine();

        writer.write("<body style=\"background-color:powderblue;\">");
        writer.newLine();

        writer.write("<h1>Practica 3</h1>");
        writer.newLine();

        writer.write("<p>Practica hecha por: </p>");
        writer.newLine();

        writer.write("<ul><li>Alvaro Golbano Duran</li><li>Laura Ramos Martinez</li><li>Jose Rafael Flores Quintero</li></ul>");
        writer.newLine();
    }

    public int getValorTotalP() {
        int valor = 0;
        for (Funcion f : funciones.values()) {
            valor += f.getValor();
        }
        return valor;
    }

    public int getComplejidadTotalP() {
        int valor = 0;
        for (Funcion f : funciones.values()) {
            valor += f.getComplejidadCiclomatica();
        }
        return valor;
    }

    public void escribirHTML(String nombreFunc) throws IOException {
        Funcion f = funciones.get(nombreFunc);
        writer.write("<hr><h2><strong>FUNCIÓN " + nombreFunc.toUpperCase() + "(" + f.getParametros().toUpperCase()
                + "):" + f.getRetorno().toUpperCase() + "</strong></h2>");
        writer.newLine();

        writer.write("<li>Valor de función: <strong>" + f.getValor() + "</strong></li>");
        writer.newLine();

        writer.write(
                "<ul><li>Complejidad ciclomática V(G): <strong>" + f.getComplejidadCiclomatica() + "</strong> </li>");
        writer.newLine();

        writer.write("<li>Resumen de la funcion: </li>");
        writer.newLine();

        writer.write("<li>Número de parámetros esperados en el programa: <strong>" + f.getNumeroParametros()
                + "</strong></li>");
        writer.newLine();

        writer.write("<ul><li>Variables declaradas en el programa: <strong>" 
        + f.getVariablesDeclaradas()+ "</strong></li>");
        writer.newLine();

        writer.write("<li>Número de lineas de código efectivas en el programa: <strong>" 
        + f.getLineasCodigo() + "</strong></li></ul>");
        writer.newLine();

        writer.write("<li>Número de llamadas a función en el programa: <strong>" + 
        f.getNumeroFuncionesLlamadas() + "</strong></li></ul>");
        writer.newLine();

        writer.write("<ul><li>Gráfico de complejidad ciclomática:<p><img src=\""
        + nombreFunc + ".svg\" width=\"50%\"></p></li></ul></hr>");
        writer.newLine();
    }

    public void acabarHTML() throws IOException {
        writer.write("<hr><h2><strong>RESUMEN COMPLETO DEL PROGRAMA</strong></h2>");
        writer.newLine();

        writer.write("<li>Resumen de Valor de función: <strong>" + getValorTotalP() + "</strong></li>");
        writer.newLine();

        writer.write("<ul><li>Complejidad ciclomática completa del fichero: <strong>" + getComplejidadTotalP()
                + "</strong></li>");
        writer.newLine();

        writer.write("<li>Diagrama de llamadas a funciones:<p><img src=\"llamadas.svg\" width=\"100%\"></p></li></hr>");
        writer.newLine();

        writer.write("<li>Diagrama de complejidad ciclomatica completo del fichero:<p><img src=\"ciclomaticaTotal.svg\" width=\"50%\"></p></li></ul></hr>");
        writer.newLine();

        writer.write("</body>\n</html>");
        writer.close();
    }

}