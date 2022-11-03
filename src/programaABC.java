public class programaABC {

    public static void main(String[] args) {

        Thread hilo = new Thread(new programaABCRubable());
        hilo.start();
        
    }
    
}
