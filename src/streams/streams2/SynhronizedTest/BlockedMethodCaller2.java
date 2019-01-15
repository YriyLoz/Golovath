package streams.streams2.SynhronizedTest;

public class BlockedMethodCaller2 implements Runnable {
    private final BlockedExample2 ref;
    private final int k;

    BlockedMethodCaller2(BlockedExample2 ref, int k) {
        this.ref = ref;
        this.k = k;
    }

    @Override
    public void run() {
        try {
            ref.f(k);
        } catch (InterruptedException e) {

        }

    }
}
