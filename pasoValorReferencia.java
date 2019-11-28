public class HolaMundo {
    static int i = 5;
    public static void main(String args[]) {
       Perro perro = new Perro();
        cambiaPerro(perro);
        System.out.println("i = " + i);
        cambiarVariable(i);
        System.out.println("i = " + i);
    }
    
    public static void cambiaPerro(Perro p){
        p.decirNombre();
    
    }

    private static void cambiarVariable(int i) {
        i = 3;
    }
}


public class Perro {

    String nombre = "Firulais";
    
    public void decirNombre(){
        System.out.println("this.nombre = " + this.nombre);
    }
}
