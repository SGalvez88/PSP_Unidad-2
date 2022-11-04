public class NumerosAleatoriosRunable implements Runnable {
    public int numero;

    @Override
    public void run() {
        numero = (int) (Math.random() * 10 + 1);
    }

    public int getNumero() {
        return numero;
    }
    
}
