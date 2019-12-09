public class HolaMundo {
    public static void main(String args[]) {
        Persona p = new Persona();
        Persona p2 = p;
        p = null;
        System.out.println(p2.nombre);
        p2 = null;
     }
 }
 
 
 class Persona{
     String nombre = "Juan";
     
     
 }
 