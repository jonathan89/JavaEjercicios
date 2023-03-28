/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author Yesica Rocio Gill
 */
public class Ejercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner var = new Scanner(System.in);
        System.out.println("Ingrese un número:");
        int num1;
        num1 = var.nextInt();
        System.out.println("Ingrese un segundo número");
        int num2;
        num2 = var.nextInt();
        System.out.println("La suma de ambos números es igual a:"+(num1+num2));
       
    }
    
}
