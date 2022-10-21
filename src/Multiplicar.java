public class Multiplicar {
    
    public static void main(String[] args) {
        
        int numero = 10;
        //int iterador = 1;

        Thread thread1 = new MultiplicarThread(numero,1);
        thread1.start();
  
        Thread thread2 = new MultiplicarThread(numero,2);
        thread2.start();
       
        Thread thread3 = new MultiplicarThread(numero,3);
        thread3.start();
     
        Thread thread4 = new MultiplicarThread(numero,4);
        thread4.start();
       
        Thread thread5 = new MultiplicarThread(numero,5);
        thread5.start();
        
        Thread thread6 = new MultiplicarThread(numero,6);
        thread6.start();
       
        Thread thread7 = new MultiplicarThread(numero,7);
        thread7.start();
       
        Thread thread8 = new MultiplicarThread(numero,8);
        thread8.start();
      
        Thread thread9 = new MultiplicarThread(numero,9);
        thread9.start();
       
        Thread thread10 = new MultiplicarThread(numero,10);
        thread10.start();
        
       
            
        // for (int i = 1; i < numero; i++) {
        //     Thread thread = new MultiplicarThread(numero,i);
        //     thread.start();
        // }
    }
}
