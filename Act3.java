public class Main {
	public static void main(String[] args) {
		Scanner frase = new Scanner(System.in);
		System.out.println("intrdocuce cadena");
		String string =frase.nextLine();
		String[]fraseordenada = string.split(" ");
		Arrays.sort(fraseordenada);
		System.out.println(Arrays.toString(fraseordenada));
}
}



    

