package clases;

import java.util.Random;
/**
 * Hecho por Neos Rafael Ruiz Sanchez 
 * juego basado en numeros aleatorios donde un jugador debe buccar un tesoro callendo en una casilla especifica 
 */
public class Tesoro {
	public static final int TAM_TABLERO = 5;

	static int xTesoro;

	static int yTesoro;

	int xJugador = 1;

	int yJugador = 1;
/**
 * Genera una posición aleatoria para el tesoro dentro del tablero.
 */
static void generaPosicionTesoro() {
    Random rand = new Random();
    xTesoro = rand.nextInt(1, TAM_TABLERO + 1);
    yTesoro = rand.nextInt(1, TAM_TABLERO + 1);
}

/**
 * Pinta el tablero con la posición del jugador y el tesoro.
 */
void pintaTablero() {
    // Imprimimos la primera línea de números
    for (int i = 1; i <= TAM_TABLERO; i++) {
        System.out.print("\t" + i);
    }
    
    // Salto de línea para comenzar con los números de la izquierda
    System.out.println();
    
    // Bucle para imprimir las líneas
    for (int i = 1; i <= TAM_TABLERO; i++) {
        // Imprimimos el número de línea
        System.out.print(i);
        // Si la línea coincide con la posición X del jugador
        if (xJugador == i) {
            // Imprimimos tantos tabuladores como posición Y del jugador
            for (int j = 1; j <= yJugador; j++) {
                System.out.print("\t");
            }
            // Imprimimos la ficha del jugador
            System.out.print("J");
        }
        // Salto de línea para pasar a la siguiente línea
        System.out.println();
    }
}

/**
 * Mueve al jugador en la dirección especificada.
 * @param movimiento la dirección en la que se mueve el jugador (arriba, abajo, izquierda o derecha).
 * @return un valor que indica si el movimiento fue válido (-1 si está fuera del tablero o -2 si el movimiento no es reconocido)
 */
int mueveJugador(String movimiento) {
    int res = 0;
    String movMinuscula = movimiento.toLowerCase();
    
    switch (movMinuscula) {
        case "arriba":
            if (xJugador - 1 < 1) {
                res = -1;
            } else {
                xJugador--;
            }
            break;
        case "abajo":
            if (xJugador + 1 > TAM_TABLERO) {
                res = -1;
            } else {
                xJugador++;
            }
            break;
        case "izquierda":
            if (yJugador - 1 < 1) {
                res = -1;
            } else {
                yJugador--;
            }
            break;
        case "derecha":
            if (yJugador + 1 > TAM_TABLERO) {
                res = -1;
            } else {
                yJugador++;
            }
            break;
        default:
            res = -2;
            break;
    }        
    
    return res;
}

/**
 * Verifica si el jugador ha encontrado el tesoro.
 * @return true si el jugador ha encontrado el tesoro, false en caso contrario.
 */
boolean buscaTesoro(){
    boolean res = false;
    if(xTesoro == xJugador && yTesoro == yJugador) {
        res = true;
    }
    return res;
}
}