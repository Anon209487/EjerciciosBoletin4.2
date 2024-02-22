
    {
   	  Scanner sc = new Scanner(System.in);
       System.out.println("TITULO ");
       String tirulo = sc.nextLine();
       System.out.println("CONTENIDO");
       String conteido = sc.nextLine();
       System.out.println("head");
       String cadena = "Mi texto con\nun salto de línea";
       String head = sc.nextLine();
       String etiquetatitulo  = ("<H1>");
       String etiquetatitulocierre = ("</H1>");
       String etiquetatexto  = ("<p>");
       String etiquetatextocierre = ("</p>");
       String etiquetahtml  = ("<html>");
       String etiquetahtmlcierre = ("</html>");
       String etiquetahead  = ("<head>");
       String etiquetaheadcierre = ("</head>");
       String etiquetabody  = ("<body>");
       String etiquetabodycierre = ("</body>");
       String html =etiquetahtml + " " + etiquetahead + " " + conteido + " " +etiquetaheadcierre + " " + etiquetabody + " " +etiquetatitulo + " " + tirulo + " " + etiquetatitulocierre + " " + etiquetatexto + " " + conteido + " " + etiquetatextocierre  + " " + etiquetabodycierre  + " " +etiquetahtmlcierre;
       System.out.println(html);
     }}

    

