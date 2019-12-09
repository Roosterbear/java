public class HolaMundo {

    public static void main(String args[]) {
        Persona p = new Persona();
       p.setIfe("Esta es mi IFE");
        System.out.println(p.getIfe());
        
    }
}

class Persona{
    private String _ife;

    public String getIfe() {
        return _ife;
    }

    public void setIfe(String _ife) {
        this._ife = _ife;
    }
    
}