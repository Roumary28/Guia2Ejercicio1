/*
 * Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre en pantalla
 */
package guia2;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Practica2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String nombre = leer.next();
        System.out.println("Su nombre es: " + nombre);
    }
    
}
