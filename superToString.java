public class Perro {

    public String nombre;

    public Perro() {
        this.nombre = "Firulais";
    }
    
    public String toString(){
        return "Soy el perro "+this.nombre;
    }
}


class Rottweiler extends Perro{
    @Override
    public String toString(){
        return super.toString()+" y soy un Rotweiler";
    }
}

/* 
public static void main(String args[]) {
    Rottweiler r = new Rottweiler();
    System.out.println(r);
}
*/