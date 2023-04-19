/*
 *   Escribir un programa que pida dos numeros enteros por teclado y calcule  
la suma de los dos. El programa debera despues mostrar el resultado de la suma
 */
package guia2;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1, num2, suma;
        System.out.println("Ingrese un numero ");
        num1 = leer.nextInt();
        System.out.println("Ingrese otro numero ");
        num2 = leer.nextInt();    
        suma = num1 + num2 ;
        System.out.println("La suma entre " + num1 + " y " + num2 + " es: " + suma);
    }
    
}
