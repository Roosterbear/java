import java.util.Scanner;

public class HolaMundo {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Proporciona el alto: ");
        double alto = Double.parseDouble(scan.nextLine());
        System.out.print("Proporciona el ancho: ");
        double ancho = Double.parseDouble(scan.nextLine());
        
        System.out.println("El Area es: "+(alto*ancho));
        System.out.println("El Perimetro es: "+((alto+ancho)/2));
    }
}
