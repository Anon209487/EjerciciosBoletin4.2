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
public class Act3Boletin1 {


    public static void main(String[] args) {
        int[] numeros = new int[10];
        Scanner sc = new Scanner(System.in);

        System.out.println("mete 10 números:");

        // Leer los números por teclado
        for (int i = 0; i < 10; i++) {
            numeros[i] = sc.nextInt();
        }

        System.out.println("orden inverso:");
        
        // Mostrar los números en orden inverso
        for (int i = 9; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
    }
}



