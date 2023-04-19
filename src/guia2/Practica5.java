/*
 * Escribir un programa que lea un numero entero por teclado y muestre por pantalla el doble, el triple y la raiz cuadrada del mismo.
 */
package guia2;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Practica5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero ");
        int num = leer.nextInt();
        int dobl = num * 2;
        int tri = num*3;
        int raiz = Math.sqrt(num);
                                                            
    }
    
}
