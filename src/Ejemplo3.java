public class Ejemplo3 {

    public static void main(String[] args) {
        System.out.println("Hola soy el proceso padre");
        Thread hilo = new Ejemplo3Thread();// se puede hacer asi porque ejemplo3 extiende de hilo        hilo.start();
        hilo.start();
        System.out.println("Fin del proceso padre");
    }
    
}
