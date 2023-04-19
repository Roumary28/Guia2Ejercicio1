/*
 *Escribir un programa que pida una frase y la muestre toda en mayusculas y despues en minusculas
 */
package guia2;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Practica3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase= leer.nextLine();
        String frase1= frase.toLowerCase();
        System.out.println(frase1);
        frase1= frase.toUpperCase();
        System.out.println(frase1);
            
        
               
    }
    
}
