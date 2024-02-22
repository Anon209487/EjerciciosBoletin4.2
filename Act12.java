 {
   public static void main(String[] args) {
   	  Scanner sc = new Scanner(System.in);
       System.out.println("frase");
       String frase = sc.nextLsine();
      
       String[] palabras = frase.split(" ");
       String palabraMasLarga = "";
      
       for(String palabra : palabras) {
           if(palabra.length() > palabraMasLarga.length()) {
               palabraMasLarga = palabra;
           }
       }
      
       System.out.println("La palabra más larga es: " + palabraMasLarga);
       System.out.println("Número de caracteres " + palabraMasLarga.length());
      
       sc.close();
	    }
    
     }



