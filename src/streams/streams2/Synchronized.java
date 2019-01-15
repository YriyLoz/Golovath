package streams.streams2;

public class Synchronized {
    public static void main(String[] args) throws InterruptedException {
        Object ref0 = new Object();
        Object ref1 = new Object();
        synchronized (ref1) {
            ref1.wait();
            synchronized (ref0) {
                ref0.wait();
            }
        }
    }
}
