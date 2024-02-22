	   
	    public static char codifica(char[] conjunto1, char[] conjunto2, char c) {
	        for (int i = 0; i < conjunto1.length; i++) {
	            if (Character.toLowerCase(c) == conjunto1[i]) {
	                if (Character.isLowerCase(c)) {
	                    return Character.toLowerCase(conjunto2[i]);
	                } else {
	                    return Character.toUpperCase(conjunto2[i]);
	                }
	            }
	        }
	        return c;
	    }
	    public static void main(String[] args) {
	        char[] conjunto1 = {'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v'};
	        char[] conjunto2 = {'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's'};
	       
	        String texto = "PaquiTo";
	        StringBuilder textoCodificado = new StringBuilder();
	       
	        for (int i = 0; i < texto.length(); i++) {
	            textoCodificado.append(codifica(conjunto1, conjunto2, texto.charAt(i)));
	        }
	       
	        System.out.println("Texto codificado: " + textoCodificado.toString());
	    }
	}
