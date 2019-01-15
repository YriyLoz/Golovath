package streams.streams2.SynhronizedTest;

public class BlockedMethodCaller implements Runnable {
    private final BlockedExample ref;
    private final int k;

    BlockedMethodCaller(BlockedExample ref, int k) {
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
