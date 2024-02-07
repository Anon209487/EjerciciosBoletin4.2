/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividadesprogramacion;

import java.util.Random;
import java.util.Arrays;
/**
 *
 * @author fiero
 */
public class Act7Boletin2 {
    


    public static void main(String[] args) {
        int[] apuesta = apuesta();
        int[] combinacionGanadora = ganador();
        
        Arrays.sort(combinacionGanadora);
        
        System.out.println("Apuesta: " + Arrays.toString(apuesta));
        System.out.println("Combinación ganadora: " + Arrays.toString(combinacionGanadora));
        
        int aciertos = aciertos(apuesta, combinacionGanadora);
        System.out.println("Número de aciertos: " + aciertos);
    }
    
    public static int[] apuesta() {
        int[] apuesta = new int[6];
        Random random = new Random();
        
        for (int i = 0; i < 6; i++) {
            apuesta[i] = random.nextInt(49) + 1;
        }
        
        return apuesta;
    }
    

    public static int[] ganador() {
        int[] combinacion = new int[6];
        Random random = new Random();
        
        for (int i = 0; i < 6; i++) {
            combinacion[i] = random.nextInt(49) + 1;
        }
        
        return combinacion;
    }
    

    public static int aciertos(int[] apuesta, int[] combinacionganadora) {
        int aciertos = 0;
        
        for (int i = 0; i < apuesta.length; i++) {
            if (Arrays.binarySearch(combinacionganadora, apuesta[i]) >= 0) {
                aciertos++;
            }
        }
        
        return aciertos;
    }
}




