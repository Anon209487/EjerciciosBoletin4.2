/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.actividadesprogramacion;
 import java.util.Random;

/**
 *
 * @author fiero
 */
public class Act1Boletin1 {

    public static void main(String[] args) {
         
        int[] numeros = new int[10];
        Random rand = new Random();
        
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rand.nextInt(100) + 1;
        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    
}

    }

