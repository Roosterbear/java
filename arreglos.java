public class Persona {
    public static void  main(String args[]){
         //Crear un arreglo metodo 1
         String cadenas[];
         cadenas = new String[3];
         
         //Crear un arreglo metodo 2
         Integer[] numeros;
         numeros = new Integer[5];
         
         //Crear un arreglo metodo 3
         Empleado[] empleados = new Empleado[2];
         
         empleados[0] = new Empleado();
         empleados[1] = new Empleado();
         
         //Causaria un error la siguiente linea
         //empleados[2] = new Empleado();
         
         //Crear un arreglo metodo 4
         Double[] precios = {10.00
                 ,20.00
                 ,30.00
         };
    } 
 }
 
 class Empleado{
     
 }