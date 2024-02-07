/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividadesprogramacion;
import java.util.Arrays;
/**
 *
 * @author fiero
 */
public class Act4Boletin2 {
     public static void main(String[] args) {

        int[] array = new int[30];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }

        Arrays.sort(array);

        for (int num : array) {
            System.out.print(num + " ");
        }

        System.out.println();
    }
}

