package streams.streams2.SynhronizedTest;

public class BlockedExample {
    public static void main(String[] args) {
        BlockedExample ref = new BlockedExample();
        for (int i = 0; i < 5; i++) {
            BlockedMethodCaller FF = new BlockedMethodCaller(ref, i);
            Thread thread = new Thread(FF);
            thread.start();

        }

    }

    public synchronized void f(int x) throws InterruptedException {
        System.out.println("+" + x);
        Thread.sleep(1000);
        System.out.println("-" + x);
    }
}
