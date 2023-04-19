/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2;

/**
 *
 * @author diego
 */
public class Guia2Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int suma, rest, post, neg ;
       boolean  may,men;
        int num1 = 10;
        int num2 = 45;
        
        suma= num1 + num2 ;
        rest = num1 - num2;
        post = +rest;
        neg= -suma;
        may= num1 > num2;
        men = num1 < num2;
        
        System.out.println(suma);
        System.out.println(rest);
        System.out.println(post);
        System.out.println(neg);
        System.out.println(may);
        System.out.println(men);
    }
    
}
