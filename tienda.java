Scanner scan = new Scanner(System.in);
        
System.out.print("Proporciona el nombre del Libro: ");
String nombre = scan.nextLine();

System.out.print("Ahora proporciona un numero de ID: ");
int id = Integer.parseInt(scan.nextLine());

System.out.print("Precio: ");
double precio = Double.parseDouble(scan.nextLine());

System.out.print("Proporciona el simbolo de moneda: ");
char simbolo = (scan.nextLine()).charAt(0);

System.out.print("¿El envio es gratis?: ");
boolean envioGratis = Boolean.parseBoolean(scan.nextLine());

System.out.println(nombre+" "+id);
System.out.println("Precio: "+simbolo+" "+precio);
System.out.println("Envio Gratis: "+envioGratis);