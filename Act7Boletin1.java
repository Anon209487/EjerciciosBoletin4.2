/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividadesprogramacion;
  import java.util.Scanner;

/**
 *
 * @author fiero
 */
public class Act7Boletin1 {

    public static void main(String[] args) {
   
        int numMeses = 12;

        double[] temperaturas = new double[numMeses];

  
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numMeses; i++) {
            System.out.print("Introduce la temperatura   " + (i+1) + ": ");
            temperaturas[i] = scanner.nextDouble();
        }


        for (int i = 0; i < numMeses; i++) {
            System.out.print("Mes " + (i+1) + ": ");
            for (int j = 0; j < temperaturas[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


