import java.util.Scanner;


public class HolaMundo {

    public static void main(String args[]) {
        
        Scanner scan =  new Scanner(System.in);
        System.out.print("Proporciona el numero #1: ");
        int numero1 = Integer.parseInt(scan.nextLine());
        System.out.print("Proporciona el numero #2: ");
        int numero2 = Integer.parseInt(scan.nextLine());
        if(numero1>numero2){
            System.out.println("El PRIMER numero es mayor que el segundo");
        }else if(numero1<numero2){
            System.out.println("El SEGUNDO numero es mayor que el primero");            
        }else{
            System.out.println("Creo que ambos numeros son iguales");
        }
        
    }
}