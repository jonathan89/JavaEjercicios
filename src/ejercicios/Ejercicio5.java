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
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        int num;
        System.out.println("Ingrese un número: ");
        num=numero.nextInt();
        System.out.println("El doble del número es: "+ num*2);
        System.out.println("El triple del número es: " + num*3);
        System.out.println("La raíz cuadrada del numero es: "+ Math.sqrt(num));
        
    }
    
}
