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
public class Act5Boletin4 {
   

    public static void main(String[] args) {
        int[] panel = new int[20]; int minas = 6;

    for (int i = 0; i < minas; i++) {
        int posicion = (int) (Math.random() * panel.length);
        if (panel[posicion] != -1) {
            panel[posicion] = -1; 
        } else {
            i--;
        }
    }
    

    for (int i = 0; i < panel.length; i++) {
        if (panel[i] != -1) {
            int contadorminas = 0;
            if (i > 0 && panel[i - 1] == -1) {
                contadorminas++;
            }
            if (i < panel.length - 1 && panel[i + 1] == -1) {
                contadorminas++;
            }
            panel[i] = contadorminas;
        }
    }
    

    System.out.println("panel oculto " + Arrays.toString(panel));
    

    int[] paneldescubierto = new int[panel.length];
    boolean juegoTerminado = false;
    while (!juegoTerminado) {
   
        System.out.println("panel descubierto: " + Arrays.toString(paneldescubierto));
        
 
        System.out.println("Introduce un número de posición 0-19 ");
        int posicion = Integer.parseInt(System.console().readLine());
        
  
        if (panel[posicion] == -1) {
            juegoTerminado = true;
            System.out.println("has perdido" + posicion);
        } else {
     
            paneldescubierto[posicion] = panel[posicion];

            boolean todasDescubiertas = true;
            for (int i = 0; i < paneldescubierto.length; i++) {
                if (paneldescubierto[i] == 0) {
                    todasDescubiertas = false;
                    break;
                }
            }
            if (todasDescubiertas) {
                juegoTerminado = true;
                System.out.println("has ganado");
            }
        }
    }
}

}




