
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Esta es la clase alumno que representa un objeto de tipo alumno
 * @author kumar
 */
public class Alumno {
    /**
     * Aquí declaramos las variables
     */
    final static int numAsignaturas = 5;
    private String nombre;
    ArrayList<Double> notas = new ArrayList();
    
    /**
     * Constructor por defecto donde donde inicializamos el atributo nombre a vacío.
     */

    public Alumno() {
        nombre = "";
    }
    /**
     * Contructor por parámetros donde, el nombre lo igualamos a una nueva variable, nuevo nombre
     * @param nombre el nombre del alumno
     */
    public Alumno(String nombre) {
        this.nombre = nombre;
    }
    
    //getters
    /**
     * método obtener nombre
     * @return nombre del alumno
     */
    public String getNombre() {
        return nombre;
    }
    //Setters
    /**
     * método para modificar el nombre del alumno
     * @param nombre es el nuevo nombre del alumno
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
}
