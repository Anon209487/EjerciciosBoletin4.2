package Ejercicios;

import java.util.Arrays;

public class Act1 {
	static public int x = 4;

	public static void main(String[] args) {
		Act1.arrayDeUnaPalabra(null, null, 0, 0, 0);
		System.out.println();
		System.out.print(Act1.x);
	}

	static void arrayDeUnaPalabra(String frase, String arrayFrase[], int longitudFrase, int longitudArray,
			int indiceSalto) {
		var salto = x;
		frase = "AAAAAAAAAAAAAAAAAAAAAAAAAa";
		longitudFrase = frase.length();
		longitudArray = (longitudFrase / 4) + 1;
		arrayFrase = new String[longitudArray];

		for (int i = 0; i < longitudArray; i++) {
			arrayFrase[i] = frase.substring(indiceSalto, salto);
			indiceSalto = indiceSalto + 4;
			salto = salto + 4;
			if (salto > frase.length()) {
				salto = frase.length();
			}
		}

		System.out.print(Arrays.toString(arrayFrase) + " La longitud de la frase es: " + longitudFrase
				+ ", La longitud del array es: " + longitudArray);
	}
}
