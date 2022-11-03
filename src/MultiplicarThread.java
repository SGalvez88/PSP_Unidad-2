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
        for (int i = 0; i < 10; i++) {
            System.out.println(numero *i+"X"+i);
        }
     
    }
    
}
