/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer9_rangoexception;

import java.util.Scanner;

/**
 *Esta es la clase principal donde creamos el objeto ALumno y probamso todos los métodos.
 * @author kumar
 */
public class Ejer9_RangoException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
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
    }
    
}
