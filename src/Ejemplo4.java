public class Ejemplo4 {
    public static void main(String[] args) {
        Thread hilo = new Ejemplo4Thread();
        hilo.start();
        System.exit(0);
    }
}
