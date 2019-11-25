public class HolaMundo {

    public static void main(String args[]) {
       
        Operaciones op = new Operaciones();
        
        System.out.println(op.sumar(2, 1));
        
    }
}


// ################################################


public class Operaciones {
    int a = 0;
    int b = 0;
    
    public int sumar(int a, int b){
        this.a = a;
        this.b = b;
        return this.a + this.b;
    }
}
