		Scanner frase = new Scanner(System.in);
		System.out.println("intrdocuce cadena");
		String string =frase.nextLine();
		String[]fraseordenada = string.split(" ");
		System.out.println("palabra clave");
		String string2 =frase.nextLine();
		int contador =0;
		for (int i = 0; i < fraseordenada.length; i++) {
			if (fraseordenada[i].equals(string2)) {
				contador++;
			}	
		}
		System.out.println(contador);
}
}
