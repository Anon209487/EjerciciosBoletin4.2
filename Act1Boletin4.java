/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.actividadesprogramacion;

import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author fiero
 */
public class Act1Boletin4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bienvenido al juego '¿Dónde está la mosca?'");
        
  
        int[] panel = new int[10];
        

        Random random = new Random();
        int posicionMosca = random.nextInt(10);
        
        
        boolean finJuego = false;
        while (!finJuego) {
            System.out.println("Casillas disponibles: ");
            for (int i = 0; i < panel.length; i++) {
                System.out.print(i + " ");
            }
            
            System.out.println("Elige una casill");
            int casilla = scanner.nextInt();
            
            if (casilla == posicionMosca) {
                System.out.println("¡Ganaste!");
                finJuego = true;
            } else if (casilla - 1 == posicionMosca || casilla + 1 == posicionMosca) {
          
                System.out.println("se mueve a otra casilla");
                posicionMosca = random.nextInt(10);
            } else {
             
                System.out.println("sigue intentándolo");
            }
        }
        
        System.out.println("Fin del juego.");
        scanner.close();
    }
}

    


    

