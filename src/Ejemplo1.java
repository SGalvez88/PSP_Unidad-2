public class Ejemplo1 {
    public static void main(String[] args) {
        Thread hilo;

        System.out.println("Hola soy un proceso");


        hilo = new Thread(new Ejemplo1Runable());
        hilo.start();
        System.out.println("Adios, era un proceso");

    }
}
