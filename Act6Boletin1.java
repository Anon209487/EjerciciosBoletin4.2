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
public class Act6Boletin1 {
 
    public static void main(String[] args) {
        int[] numeros = new int[8];
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < 8; i++) {
            System.out.print("Introduce el número " + (i+1) + ": ");
            numeros[i] = sc.nextInt();
        }
        
        for (int i = 0; i < 8; i++) {
            System.out.print(numeros[i]);
            if (numeros[i] % 2 == 0) {
                System.out.println(" par");
            } else {
                System.out.println(" impar");
            }
        }
    }
}

