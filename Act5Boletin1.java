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
public class Act5Boletin1 {
   

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        double[] numeros = new double[10];
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese un número  ");
            numeros[i] = scanner.nextDouble();
        }
        

        double suma = 0;
        for (int i = 0; i < 10; i++) {
            suma += numeros[i];
        }
        
 
        double maximo = numeros[0];
        double minimo = numeros[0];
        for (int i = 1; i < 10; i++) {
            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }
            if (numeros[i] < minimo) {
                minimo = numeros[i];
            }
        }
        
        System.out.println("La suma  es " + suma);
        System.out.println("El número máximo es " + maximo);
        System.out.println("El número mínimo es " + minimo);
    }

}


