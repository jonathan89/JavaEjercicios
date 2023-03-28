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
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner conversor = new Scanner(System.in);
        System.out.println("Ingrese una temperatura en °c:");
        double gradosc;
        gradosc = conversor.nextDouble();
        double farenheit = 32+(9 * gradosc/5);
        System.out.println("La temperatura equivale Farenheit: "+farenheit);
    }
    
}
