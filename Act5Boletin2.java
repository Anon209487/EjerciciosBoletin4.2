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
public class Act5Boletin2 {
   

    public static void main(String[] args) {
   {
        Scanner scanner = new Scanner(System.in);
        int[] puntuaciones = new int[8];

   
        for (int i = 0; i < puntuaciones.length; i++) {
            System.out.print("Introduce la puntuación " + (i + 1) + ": ");
            puntuaciones[i] = scanner.nextInt();
        }


        Arrays.sort(puntuaciones);
        int[] puntuacionesDescendentes = new int[puntuaciones.length];
        for (int i = 0; i < puntuaciones.length; i++) {
            puntuacionesDescendentes[i] = puntuaciones[puntuaciones.length - 1 - i];
        }
        System.out.println("Ranking");
        for (int i = 0; i < puntuacionesDescendentes.length; i++) {
            System.out.println((i + 1) + ". " + puntuacionesDescendentes[i]);
        }
    }
}


}


