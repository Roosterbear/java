public class HolaMundo {
    
    public static void main(String args[]) {
        Gremlin g1  = new Gremlin();
        System.out.println(g1);
        Gremlin g2  = new Gremlin();
        System.out.println(g2);
        Gremlin g3  = new Gremlin();
        System.out.println(g3);
       
    }
}

/* Para cambiarle el nombre a la clase */
/*  boton derecho -> Refactor -> rename*/
class Gremlin{
    private static int contador;
    Gremlin(){
       Gremlin.contador++; 
    }

    @Override
    public String toString() {
        return "Creando el Gremlin No. "+Gremlin.contador;
    }
}