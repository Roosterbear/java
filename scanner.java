public class HolaMundo {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Proporciona el titulo del libro: ");
        var titulo = scanner.nextLine();
        System.out.print("Proporciona el autor del libro: ");
        var autor = scanner.nextLine();
        System.out.println("El libro " + titulo + " fue escrito por " + autor);        
    }
}



