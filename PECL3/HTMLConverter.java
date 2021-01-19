package PECL3;
import java.io.*;
import java.util.*;
public class HTMLConverter {
    private BufferedWriter writer;
    private HashMap<String,Funcion> funciones = new HashMap<String,Funcion>();

    public HTMLConverter(HashMap <String,Funcion> f,String fichero) throws IOException
    {
        this.funciones = f;
        writer = new BufferedWriter (new FileWriter ("C:\\antlr\\gramaticas\\"+fichero+".html"));
        writer.write("<!doctype html>");
        writer.newLine();
        writer.write("<html>");
        writer.newLine();
        writer.write("<head>");
        writer.newLine();
        writer.write("<title>Pdl - Práctica 3</title>");
        writer.newLine();
        writer.write("</head>");
        writer.newLine();
        writer.write("<body>");
        writer.newLine();
        writer.write("<body style=\"background-color:powderblue;\">");
        writer.newLine();
        writer.write("<h1>Práctica 3</h1>");
        writer.newLine();
        writer.write("<p>Esta práctica ha sido desarrollada por: </p>");
        writer.newLine();
        writer.write("<ul><li>Alvaro Golbano Duran</li><li>Laura Ramos Martinez</li><li>Jose Rafael Flores Quintero</li></ul>");
        writer.newLine();
    }     

    public void escribirHTML(String nombre) throws IOException
    {  
        Funcion funcion  = funciones.get(nombre);
        writer.write("<hr><h2><strong>FUNCIÓN "+nombre.toUpperCase()+"("+funcion.getParametros().toUpperCase()+"):"+funcion.getRetorno().toUpperCase()+"</strong></h2>");
        writer.newLine();
        writer.write("<ul><li>Complejidad ciclomática V(G): <strong>"+funcion.getComplejidadCiclomatica()+"</strong> </li>");
        writer.newLine();
        writer.write("<li>Valor función: <strong>"+funcion.getValor()+"</strong></li>");
        writer.newLine();
        writer.write("<li>Resumen: </li>");
        writer.newLine();
        writer.write("<ul><li>Variables declaradas: <strong>"+funcion.getVariablesDeclaradas()+"</strong></li>");
        writer.newLine();
        writer.write("<li>Número de parámetros esperados: <strong>"+ funcion.getNumeroParametros()+"</strong></li>");
        writer.newLine();
        writer.write("<li>Número de llamadas a función: <strong>"+funcion.getNumeroFuncionesLlamadas()+"</strong></li></ul>");
        writer.newLine();
        writer.write("<li>Número de lineas de código efectivas: <strong>"+funcion.getLineasCodigo()+"</strong></li></ul>");
        writer.newLine();
        writer.write("<ul><li>Gráfico de complejidad ciclomática:<p><img src=\""+nombre+".svg\" width=\"50%\"></p></li></ul></hr>");
        writer.newLine();
    }

    public void endHTML() throws IOException
    {
        writer.write("<hr><h2><strong>RESUMEN COMPLETO </strong></h2>");
        writer.newLine();
        writer.write("<ul><li>Complejidad ciclomática completa del fichero: <strong>"+getComplejidadTotalPrograma()+"</strong></li>");
        writer.newLine();
        writer.write("<li>Resumen de Valor de función: <strong>"+getValorTotalesPrograma()+"</strong></li>");
        writer.newLine();
        writer.write("<li>Diagrama de llamadas a funciones:<p><img src=\"llamadas.svg\" width=\"100%\"></p></li></hr>");
        writer.newLine();
        writer.write("<li>Diagrama de complejidad ciclomatica completo del fichero:<p><img src=\"ciclomaticaTotal.svg\" width=\"50%\"></p></li></ul></hr>");
        writer.newLine();
        writer.write("</body>\n</html>");
        writer.close();
    }

    public int getValorTotalesPrograma()
    {
        int Valor=0;
        for(Funcion i: funciones.values())
        {
            Valor+= i.getValor();
        }
        return Valor;
    }

    public int getComplejidadTotalPrograma()
    {
        int Valor=0;
        for(Funcion i: funciones.values())
        {
            Valor+= i.getComplejidadCiclomatica();
        }
        return Valor;
    }
}