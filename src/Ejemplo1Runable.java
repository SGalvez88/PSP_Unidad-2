public class Ejemplo1Runable implements Runnable {
    /*solo metodo run*/


    @Override
    public void run(){
        System.out.println("Hola soy un hilo");
        System.out.println("adios eras un hilo");
    }
}
