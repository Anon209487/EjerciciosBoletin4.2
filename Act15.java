 
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("ingresa una palabra o frase:");
        String palabraOriginal = input.nextLine();

        char[] caracteres = palabraOriginal.toCharArray();
        for (int i = 0; i < caracteres.length; i++) {
            int randomIndex = (int)(Math.random() * caracteres.length);
            char temp = caracteres[i];
            caracteres[i] = caracteres[randomIndex];
            caracteres[randomIndex] = temp;
        }

        String anagrama = new String(caracteres);
        System.out.println("Anagrama generado al azar:");
        System.out.println(anagrama);

        System.out.println(" ¿cuál es la palabra original?");
        String palabraAdivinada = input.nextLine();

        if (palabraAdivinada.equalsIgnoreCase(palabraOriginal)) {
            System.out.println("Has acertado ");
        } else {
            System.out.println("Incorrecto" + palabraOriginal);
        }
    }
}
