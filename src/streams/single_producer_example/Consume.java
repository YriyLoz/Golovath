package streams.single_producer_example;


public class Consume implements Runnable {
    private final SimpleElementBuffer buffer;

    public Consume(SimpleElementBuffer buffer) {
        this.buffer = buffer;
    }


    @Override
    public void run() {
        while (true) {
            try {
                int elem = buffer.get();
                System.out.println(elem + " consumed");
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName());
                return;
            }

        }
    }
}
