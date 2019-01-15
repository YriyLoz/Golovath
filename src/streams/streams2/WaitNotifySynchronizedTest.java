package streams.streams2;

public class WaitNotifySynchronizedTest {
    public static void main(String[] args) throws InterruptedException {
        new WaitNotifySynchronizedTest().f();
    }
    public synchronized void f(){
        this.notify();
    }
}
