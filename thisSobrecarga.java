public class Perro {

    public String nombre;

    public Perro() {
        this.nombre = "Jaime";
        
    }
    
    public Perro(String nombre){
        this();
        this.nombre+= " "+nombre;
    }
    
    public String toString(){
        return "Soy el perro "+this.nombre;
    }
}


/* 
public class HolaMundo {
    
    public static void main(String args[]) {
        Perro p = new Perro("Andres");
        System.out.println(p);

    }

}
*/