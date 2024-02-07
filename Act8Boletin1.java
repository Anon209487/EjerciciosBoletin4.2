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
public class Act8Boletin1 {
   

  public static void main(String[] args) {
    int[] array = new int[100];

    for (int i = 0; i < array.length; i++) {
      array[i] = (int) (1 + Math.random() * 10);
    }

    int N = 0; 

    int[] posiciones = buscarPosiciones(array, N);
    if (posiciones.length == 0) {
      System.out.println(" valor " + N + " no aparece ");
    } else {
      System.out.println(" valor " + N + " aparece en: " + Arrays.toString(posiciones));
    }
  }

  public static int[] buscarPosiciones(int[] array, int N) {
    int contador = 0;
    for (int i = 0; i < array.length; i++) {
      if (array[i] == N) {
        contador++;
      }
    }

    int[] posiciones = new int[contador];
    int indice = 0;
    for (int i = 0; i < array.length; i++) {
      if (array[i] == N) {
        posiciones[indice] = i;
        indice++;
      }
    }

    return posiciones;
  }}



