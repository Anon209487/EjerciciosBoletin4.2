/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.actividadesprogramacion;
import java.util.Scanner;
/**
 *
 * @author fiero
 */
public class Act2Boletin1 {
        public static void main(String[] args) {
        double[] numeros = new double[5];

        Scanner scanner = new Scanner(System.in);
        
      
        for(int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce el número  " + (i+1) + ": ");
            numeros[i] = scanner.nextDouble();
        }
        
        
        System.out.println("Los numeros  son");
        for(int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
}

