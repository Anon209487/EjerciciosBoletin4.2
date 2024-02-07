/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.actividadesprogramacion;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author fiero
 */
public class Act1Boletin2 {

    public static void main(String[] args) {
         


        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor de N ");
        int N = scanner.nextInt();
        System.out.print("Ingrese el valor de M ");
        int M = scanner.nextInt();


        int[] array = new int[N];
        Arrays.fill(array, M);


        System.out.println("El array  es " + Arrays.toString(array));
    }
}


    

