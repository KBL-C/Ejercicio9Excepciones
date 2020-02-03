
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
    
    /**
     * método que sirve para modificar una nota. para ello le indicamso una posicón y una nota para que ponga esa nueva nota en la posición indicada.
     * en caso de que la nota no sea válida como en el caso anterior se lanzara la misma excepción que antes.
     * @param posicion la posición que le indicamos para modificar su valor
     * @param nnota la nueva nota modificada
     * @throws RangoException excepción en caso de que la nota este fuera del rango
     * @throws IndexOutOfBoundsException  excepción en caso de que la posición de array list o sea válida es decir, 
     * en caso de que le indiquemos una posición que no esté en el arrayList.
     * Hacemos lo mismo que en el caso anterior, utilizamos un try catch para recoger los errores
     * En este caso se lanzan dos excepsiones, uno para la nota y otro para el array.
     */
    public void modificarNota(int posicion, double nnota) throws RangoException, IndexOutOfBoundsException{
        try{
            for (int i = 0; i < notas.size(); i++) {
                if(nnota < 0 || nnota > 10){
                    throw new RangoException("Error, nota no válida");//excepción de erro no ta no válida
                }

                if (posicion != notas.get(i)){
                     throw new IndexOutOfBoundsException("Posición not válida"); //excepción de la posición del array no válido
                }

                notas.set(posicion, nnota);//en caso de que no suceda ningun error, se establece la nueva nota en la posición indicada.

            }
        }catch(RangoException | IndexOutOfBoundsException ex){
            /**
             * Qui utilizamos "instance of" ya que tenemos dos excepciones, para que según la excepción mostremos un mensaje distinto.
             */
            if(ex instanceof RangoException){
                System.out.println(ex.getMessage());
            }
            if(ex instanceof IndexOutOfBoundsException){
                System.out.println(ex.getMessage());
            }
            
        }
    }

    
}
