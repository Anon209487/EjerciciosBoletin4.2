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
public class Act6Boletin2 {
 
    public static void main(String[] args) {

        int[] array = new int[1000];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un valor N:");
        int n = scanner.nextInt();

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                count++;
            }
        }

        if (count > 0) {
            System.out.println("El valor " + n );
            System.out.println("Se encontró " + count );
        } else {
            System.out.println( n + " no existe en el array.");
        }
    }
}


