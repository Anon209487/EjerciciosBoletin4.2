{
   public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    System.out.println("Ingresa una palabra");
	    String palabra1 = input.next();
	    char[] cadena1 = palabra1.toCharArray();
	    System.out.println("Ingresa una palabra");
	    String palabra2 = input.next();
	    char[] cadena2 = palabra2.toCharArray();
	     Arrays.sort(cadena2);
	     Arrays.sort(cadena1);
	     System.out.println("son un anagrama?");
	     System.out.println(Arrays.equals(cadena2, cadena1));
	    }
   
     }


