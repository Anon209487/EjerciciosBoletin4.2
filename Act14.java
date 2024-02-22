
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Ingrese una frase: ");
       String frase = scanner.nextLine();
      
       frase = frase.toLowerCase();
      
 
      HashMap<Character, Integer> map = new HashMap<>();
      
       for (int i = 0; i < frase.length(); i++) {
           char letra = frase.charAt(i);
           if (Character.isLetter(letra)) {
               if (map.containsKey(letra)) {
                   map.put(letra, map.get(letra) + 1);
               } else {
                   map.put(letra, 1);
               }
           }
       }
      
     System.out.println("Resultado:");
       for (char letra : map.keySet()) {
           System.out.println(letra + ": " + map.get(letra) + " veces");
       }
   }
}





