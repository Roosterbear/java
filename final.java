public class Persona {
    public static void  main(String args[]){
        EjemploFinal ef = new EjemploFinal();
        Nieto nieto = new Nieto();
        System.out.println("Imprimiendo EJEMPLO FINAL");
        System.out.println(ef.imprimir());
        System.out.println(ef.imprimir2());
        System.out.println("Imprimiendo NIETO");
        System.out.println(nieto.imprimir());
        System.out.println(nieto.imprimir2());
    } 
 }
 
 final class Ultimo{
     Boolean imprime(){
         /*
         // No podemos cambiarle el valor a un atributo final
         EjemploFinal.noMeCambies = true;
         
         */
         
         return EjemploFinal.noMeCambies;
     }   
 }
 
 class EjemploFinal{
     public static final Boolean noMeCambies = false;
     
     final String imprimir(){
         return "No me puedes sobreescribir";
     }
     
     String imprimir2(){
         return "Haz de mi lo que quieras!";
     }
 }
 
 class Nieto extends EjemploFinal{
     /*
     // No podemos sobreescribir un metodo final
     String imprimir(){
         
     }
     */
     
     String imprimir2(){
         return "He sido cambiado";
     }
 }
 /*
 // Esta clase marcaria error porque no podemos heredar de una clase final
 class Hijo extends Ultimo{
     
 }
 */
 