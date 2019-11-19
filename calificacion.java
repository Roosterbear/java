import java.util.Scanner;

public class HolaMundo {

    public static void main(String args[]) {
       int calificacion = -1;        
       Scanner scan = new Scanner(System.in);
       while (calificacion < 0 || calificacion >10){
            System.out.println("Dame calificacion (entre 0 y 10): ");
            calificacion = Integer.parseInt(scan.nextLine());
       }
     
       // podemos usar case 10: case 9:
       if (calificacion >=9){
           System.out.println("A");
       }else if (calificacion == 8){
           System.out.println("B");
       }else if (calificacion == 7){
           System.out.println("C");
       }else if (calificacion == 6){
           System.out.println("D");
       }else{
           System.out.println("F");
       }             
    }
}
