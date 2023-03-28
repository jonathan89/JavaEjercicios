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
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner conversor = new Scanner (System.in);
        System.out.println("Ingrese una frase: ");
        String frase;
        frase=conversor.nextLine();
        System.out.println("En mayúscula: "+ frase.toUpperCase());
        System.out.println("En Minúscula: "+ frase.toLowerCase());
    }
    
}
