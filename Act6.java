 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("introduce una caedena"); 
         String cadena = scanner.nextLine();
          String otraCadena = "fin";
         boolean equals;
         equals=cadena.equals(otraCadena);
           while (equals==false) {       
               System.out.print(cadena);
                   cadena = scanner.nextLine();
                           
                         equals=cadena.equals(otraCadena);
           }

    }
}
