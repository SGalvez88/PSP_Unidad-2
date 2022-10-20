public class Ejemplo1 {
    public static void main(String[] args) {
        Thread hilo;

        System.out.println("Hola soy un proceso");


        hilo = new Thread(new Ejemplo1Runable());//instancia objeto de la clase thread con una interfaz que le paso
        hilo.start();
        System.out.println("Adios, era un proceso");

    }
}
