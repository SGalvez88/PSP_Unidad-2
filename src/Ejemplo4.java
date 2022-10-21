public class Ejemplo4 {
    public static void main(String[] args) {
        Thread hilo = new Ejemplo4Thread();//podemos instanciarlo tambien como Ejemplo4 ejemplo4 = new...
        hilo.start();
        
        //System.exit(0);
        System.out.println("hola");
        // hilo.start();   
    }
}
