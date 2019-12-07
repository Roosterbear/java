public class HolaMundo {
    public static void main(String args[]){
        Cerveza c = new Cerveza("Heineken"); 
    }
}


class Cerveza{
    String marca;
    
    Cerveza(String marca){
        this.marca = marca;
        Tomar t = new Tomar();
        t.tomar(this);
    }
}

// Solo una clase puede ser public !
class Tomar{
    String estado = "Estoy tomando cerveza";
    
    public void tomar(Cerveza c){
        System.out.println("Esto: "+this.estado);
        System.out.println("Objeto: "+c.marca);
        
    }
}
