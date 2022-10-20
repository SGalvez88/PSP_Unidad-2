public class Ejemplo3Thread extends Thread {

    @Override
    public void run() {
        super.run();
        System.out.println("Hola empieza el hilo");
        System.out.println("Adios acaba el hilo");
    }
    
}
