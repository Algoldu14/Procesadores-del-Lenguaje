package PECL3;
import java.util.*;

public class TablaDeSimbolos {
    private HashMap<String, Funcion> funciones = new HashMap<String, Funcion>();

    public void addFuncion( String nombre, Funcion f){
        this.funciones.put(nombre, f);
    }

    public HashMap<String, Funcion> getFunciones (){
        return this.funciones;
    }

}
