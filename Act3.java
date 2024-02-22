       public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduce una caedena"); 
         String cadena = scanner.nextLine();
 int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == ' ') {
                contador++;
            }
        }

        System.out.println("El número de espacios en el string es " + contador);
    }
}
