public class programaABC {

    public static void main(String[] args) {

        Thread hilo = new Thread(new programaABCRubable());
        hilo.start();
        do {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
               
                e.printStackTrace();
            }
        } while (hilo.isAlive());
        System.out.println("Hilo terminado");
    }
    
}
