/*
 *Dada una cantidad de grados centigrados se debe mostrar su equivalente en grados Faranheit .
La formula correspondiente es F=32 + (9 * C / 5 )
 */
package guia2;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Practica4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese cuantos grados desea convertir:");
        int grados = leer.nextInt();
        float conver=  32 + ( 9 * grados / 5);
        System.out.println(grados + " equivalen a : " + conver + "F");
    }
    
}
