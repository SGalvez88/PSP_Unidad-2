public class MultiplicarThread extends Thread {
    int numero;
    int iterador;
    
    public MultiplicarThread(int numeroUsuario, int iteradorFor) {
        this.numero = numeroUsuario;
        this.iterador = iteradorFor;
    }

    @Override
    public void run() {
        super.run();
        System.out.println(numero+" X "+iterador+" = "+(numero * iterador));
    }
    
}
