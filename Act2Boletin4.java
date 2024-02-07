/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividadesprogramacion;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
/**
 *
 * @author fiero
 */
public class Act2Boletin4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        System.out.print("Ingrese la cantidad de casillas (debe ser un numero par) ");
        int n = input.nextInt();
        if (n % 2 != 0) {
            System.out.println("La cantidad de casillas debe ser un numero par");
            return;
        }
        

        Integer[] panel = new Integer[n];
        for (int i = 0; i < n/2; i++) {
            panel[i] = i+1;
            panel[i+n/2] = i+1;
        }
        

        Collections.shuffle(Arrays.asList(panel));
        

        boolean[] panelAux = new boolean[n];
        Arrays.fill(panelAux, false);
        

        int parejasEncontradas = 0;
        while (parejasEncontradas < n/2) {

            System.out.println("Panel actual");
            for (int i = 0; i < n; i++) {
                if (panelAux[i]) {
                    System.out.print(panel[i] + " ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
            

            System.out.print("Ingrese la posicion de la primera carta ");
            int carta1 = input.nextInt() - 1;
            if (carta1 < 0 || carta1 >= n) {
                System.out.println("Posición inválida");
                continue;
            }
            
            System.out.print("Ingrese la posición de la segunda carta: ");
            int carta2 = input.nextInt() - 1;
            if (carta2 < 0 || carta2 >= n || carta2 == carta1) {
                System.out.println("Posición inválida.");
                continue;
            }
            
            if (panel[carta1] == panel[carta2]) {
                panelAux[carta1] = true;
                panelAux[carta2] = true;
                parejasEncontradas++;
                System.out.println("Coincidencia " + panel[carta1]);
            } else {
                System.out.println("Las cartas no coinciden");
            }
            
            System.out.println();
        }
        
        System.out.println("has encontrado todas las parejas");
    }
}



    

