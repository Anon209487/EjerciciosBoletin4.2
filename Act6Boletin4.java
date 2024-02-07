/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividadesprogramacion;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author fiero
 */
public class Act6Boletin4 {
 
    public static void main(String[] args) {


 
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] baraja = new int[52];
        for (int i = 0; i < 52; i++) {
            baraja[i] = i;
        }
        
        int saldo = 500;
        boolean jugar = true;
        
        while (jugar && saldo > 0) {
            System.out.println("Tu saldo actual es " + saldo);
            System.out.print("¿Cuánto vas apostar? ");
            int apuesta = scanner.nextInt();
            
            if (apuesta <= saldo && apuesta > 0) {
      
                for (int i = 0; i < baraja.length; i++) {
                    int j = random.nextInt(baraja.length);
                    int temp = baraja[i];
                    baraja[i] = baraja[j];
                    baraja[j] = temp;
                }
                
                int indicejugador = 0;
                int indiceordenador = 0;
                int[] cartasjugador = new int[10]; 
                int[] cartasordenador = new int[10]; 
                
        
                cartasjugador[indicejugador++] = extraercarta(baraja);
                cartasjugador[indicejugador++] = extraercarta(baraja);
                cartasordenador[indiceordenador++] = extraercarta(baraja);
                cartasordenador[indiceordenador++] = extraercarta(baraja);
                
         
                System.out.println("Tus cartas son: " + Arrays.toString(cartasjugador));
                System.out.println("sus carta  es: " + cartasordenador[0]);
          
                boolean masCartas = true;
                while (masCartas) {
                    System.out.print("¿Quieres ir a más (S/N)? ");
                    String respuesta = scanner.next();
                    
                    if (respuesta.equalsIgnoreCase("S")) {
                        cartasjugador[indicejugador++] = extraercarta(baraja);
                        System.out.println("Tus cartas son " + Arrays.toString(cartasjugador));
                    } else {
                        masCartas = false;
                    }
                    
     
                    int totalJugador = calculartotal(cartasjugador, indicejugador);
                    if (totalJugador > 21) {
                        System.out.println("has perdido");
                        saldo -= apuesta;
                        break;
                    }
                }
                
                while (calculartotal(cartasordenador, indiceordenador) < 17) {
                    cartasordenador[indiceordenador++] = extraercarta(baraja);
                }
                
      
                System.out.println("Las cartasson " + Arrays.toString(cartasordenador));
                
  
                int totalJugador = calculartotal(cartasjugador, indicejugador);
                int totalOrdenador = calculartotal(cartasordenador, indiceordenador);
                
                if (totalOrdenador > 21) {
                    System.out.println("se ha pasado de 21 Has ganado.");
                    saldo += apuesta;
                } else if (totalJugador > totalOrdenador) {
                    System.out.println("Has ganado");
                    saldo += apuesta;
                } else if (totalJugador < totalOrdenador) {
                    System.out.println("Has perdido");
                    saldo -= apuesta;
                } else {
                    System.out.println("Ha sido un empate");
                }
                
                System.out.print("¿Quieres volver a jugar (S/N)? ");
                String respuesta = scanner.next();
                if (respuesta.equalsIgnoreCase("N")) {
                    jugar = false;
                }
            } else {
                System.out.println("La apuesta debe ser menor o igual que tu saldo  y mayor que 0");
            }
        }
        
        System.out.println(" Tu saldo final es " + saldo);
    }
    
    public static int extraercarta(int[] baraja) {
        for (int i = 0; i < baraja.length; i++) {
            if (baraja[i] != -1) {
                int carta = baraja[i];
                baraja[i] = -1;
                return carta;
            }
        }
        return -1;
    }
    
    public static int calculartotal(int[] cartas, int numcartas) {
        int total = 0;
        int numfiguras = 0;
        
        for (int i = 0; i < numcartas; i++) {
            int carta = cartas[i] % 13 + 1;
            
            if (carta <= 10) {
                total += carta;
            } else {
                total += 10;
                numfiguras++;
            }
        }
        
        while (numfiguras > 0 && total + 10 <= 21) {
            total += 10;
            numfiguras--;
        }
        
        return total;
    }
}


    

