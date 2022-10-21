public class FibonacciThread extends Thread {
    
    int numeroFinal;
    int suma;
    int numero1;
    int numero2;

    public FibonacciThread(int numeroFinal) {
        this.numeroFinal = numeroFinal;
        this.suma = 0;
        this.numero1 = 1;
        this.numero2 = 0;
    }

    @Override
    public void run() {
        super.run();
         
        for (int i = 1; i < numeroFinal; i++) {
           
            System.out.print(suma+" ");
                        
            suma = numero1 + numero2;
            numero1 = numero2;
            numero2 = suma;
                   
        }

    }

}
