
import java.util.ArrayList;
import java.util.Scanner;

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
    
    /**
     * método void que pide una nota y lo almacena en el arrayList.
     * @throws RangoException es la excepción que salta en caso de que la nota que introducamos no esta válida, 
     * es decir que sea menor que 0 ó mayor que 10.
     * para detectar el error utilizamso el try{}catch, el tray si detecta el error lo envia la catch donde lo redirigimos con la excepción y mostramos un mensaje
     * indicando el tipo de error(excepción).
     */
    public void pedirNota() throws RangoException {
        Scanner scd = new Scanner(System.in);
        double nota;
        try{
            Alumno alumno = new Alumno();
            for (int j = 0; j < numAsignaturas; j++) {
                System.out.println("Introduce la nota del alumno");
                nota = scd.nextDouble();              
                if (nota <0 || nota > 10){
                    throw new RangoException("Error, nota no válida");//aquí le estamos indicando que lance la excepción en caso de error
                }
                
                notas.add(nota);//añade la nota al array list
                
            }
            
        
        }catch(RangoException ex){
                System.out.println(ex.getMessage()); //este es el catch que recoge el error 
        }
        
    }

    
}
