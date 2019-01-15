package streams.single_producer_example;

public class Produser implements Runnable {
    private int startValue;
    private final int period;
    private final SimpleElementBuffer buffer;

    public Produser(int startValue, int period, SimpleElementBuffer buffer) {
        this.buffer = buffer;
        this.period = period;
        this.startValue = startValue;
    }

    @Override
    public void run() {
        while(true){
            try{
                System.out.println(startValue+" produced");
                buffer.put(startValue++);
                Thread.sleep(period);
            }catch (InterruptedException e){
                System.out.println(Thread.currentThread().getName());
                return;
            }
        }
    }
}
