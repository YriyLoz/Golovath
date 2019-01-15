package streams.streams2.SynhronizedTest;

import streams.ThreadExample;

public class BlockedExample2 {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            new Thread(new BlockedMethodCaller2(new BlockedExample2(),i)).start();

        }

    }

    public synchronized void f(int x) throws InterruptedException {
        System.out.println("+" + x);
       this.wait();
        System.out.println("-" + x);
    }
}
