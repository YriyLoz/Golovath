package streams.interrupted;



public class IterruptedExample {
    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                Thread myThread = Thread.currentThread();
                while (true) {
                    System.out.println(myThread.isInterrupted());
                    for (long k = 0; k < 1000000000l; k++) ;
                }
            }
        });

        thread.start();
        Thread.sleep(1000);
        thread.interrupt();


    }
}
