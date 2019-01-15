package streams.streams2;

public class WaitNotifySynchronizedTest2 {
    public static void main(String[] args) throws InterruptedException {
        f();

    }

    public static synchronized void f() {
        Class clazz = WaitNotifySynchronizedTest2.class;
        clazz.notify();

    }
}
