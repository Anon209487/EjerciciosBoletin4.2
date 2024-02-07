/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividadesprogramacion;
  import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author fiero
 */
public class Act3Boletin2 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] primeros = new int[10];
        int[] ultimos = new int[10];

        System.out.println("Introduce  20 valores");


        for (int i = 0; i < 20; i++) {
            int valor = scanner.nextInt();
            if (i < 10) {
                primeros[i] = valor;
            } else {
                ultimos[i - 10] = valor;
            }
        }


        if (Arrays.equals(primeros, ultimos)) {
            System.out.println("Los dos arrays son iguales");
        } else {
            System.out.println("Los dos arrays no son iguales");
        }
    }
}

    

