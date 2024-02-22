
	    public static void main(String[] args) {
	        String frase = "Dábale arroz a la zorra el abad";
	        System.out.println(isPalindrome(frase));
	    }
	    public static boolean isPalindrome(String frase) {
	        frase = frase.replaceAll("\\s", "").toLowerCase();
	        int left = 0;
	        int right = frase.length() - 1;
	        while (left < right) {
	            if (frase.charAt(left) != frase.charAt(right)) {
	                return false;
	            }
	            left++;
	            right--;
	        }
	        return true;
	    }
	
}

