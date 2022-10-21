public class Fibonacci {

    public static void main(String[] args) {
        Thread thread = new FibonacciThread(8);

        thread.start();
    }
}
