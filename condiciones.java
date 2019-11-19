public class HolaMundo {

    public static void main(String args[]) {
        
        boolean a = true;
        int b = 2;
        if (a){
            System.out.println("'a' es verdadera");
        }else{
            System.out.println("'a' es falsa");
        }
        
        switch (b){
            case 1:
                System.out.println("b vale 1");
                break;
            case 2:
                System.out.println("b vale 2");
                break;
            default:
                System.out.println("b no es 1 ni 2");
        }
        
    }
}
