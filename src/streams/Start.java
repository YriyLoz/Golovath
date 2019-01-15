package streams;

public class Start implements Runnable {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                PrintRunnable printer = new PrintRunnable("A    .", 100);
                PrintRunnable printer2 = new PrintRunnable(".    B", 99);
                Thread thread = new Thread(printer);
                Thread thread2 = new Thread(printer2);
                thread.start();
                thread2.start();
                thread.join();
                thread2.join();

                System.out.println("-------");
                PrintRunnable printer3 = new PrintRunnable("   C", 99);
                Thread thread3 = new Thread(printer3);
                thread3.start();
                thread3.join();
                System.out.println("-------");
            }
        } catch (InterruptedException e) {
        }
    }
}