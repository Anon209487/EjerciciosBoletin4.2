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
public class Act3Boletin4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la longitud del río: ");
        int longitudRio = scanner.nextInt();
        int[] rio = new int[longitudRio];


        for (int i = 0; i < rio.length; i++) {
            rio[i] = 0;
        }

        System.out.print("Ingrese la posición donde lanzar la piedra");
        int posicion = scanner.nextInt();

        System.out.print("Ingrese la intensidad de la piedra");
        int intensidad = scanner.nextInt();


        rio[posicion] = intensidad;

        boolean ruido = true;

        while (ruido) {
      
            for (int i = 0; i < rio.length; i++) {
                System.out.print(rio[i] + " ");
            }
            System.out.println();


            for (int i = 0; i < rio.length; i++) {
                if (rio[i] > 0) {
                    rio[i]--;
                }
            }

     
            ruido = false;
            for (int i = 0; i < rio.length; i++) {
                if (rio[i] > 0) {
                    ruido = true;
                    break;
                }
            }

        }

        System.out.println("El río ha vuelto a estar en calma.");
    }
}


