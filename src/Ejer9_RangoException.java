/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *Esta es la clase principal donde creamos el objeto ALumno y probamso todos los métodos.
 * @author kumar
 */
public class Ejer9_RangoException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {       
        try {
            Scanner sc = new Scanner(System.in);
            Scanner sci = new Scanner(System.in);
            Scanner scd = new Scanner(System.in);
            Alumno alumno = new Alumno();          
            alumno.setNombre("Kumar");
            System.out.println(alumno.getNombre());
            alumno.pedirNota();
            System.out.println("Modificar la nota");
            System.out.println("introduce la posición y la nota para poner en esa posición");
            int pos = sci.nextInt();
            double not = scd.nextDouble();
            alumno.modificarNota(pos, not);
            alumno.imprimirCalificaciones();
            
            System.out.println(alumno.toString());
            
        } catch (RangoException | IndexOutOfBoundsException ex) {
            if(ex instanceof RangoException){
                System.out.println("Fuera de rando");
            }
            if(ex instanceof IndexOutOfBoundsException){
                System.out.println("fuera de posicion");
            }
            //Logger.getLogger(Ejer9_RangoException.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
