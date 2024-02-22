
    public static void main(String[] args) {
    	  Scanner sc = new Scanner(System.in);
        System.out.println("TITULO ");
        String frase = sc.nextLine();
        String fraseminuscula=frase.toLowerCase();
        String[] palabras = fraseminuscula.split(" ");
        for(String palabra : palabras) {
        	char[] letra = palabra.toCharArray();
        	letra [0] = Character.toLowerCase(letra[0]);
        	   palabra = String.valueOf(letra);
            }
 
        System.out.println(palabras);
        }
  
      }

