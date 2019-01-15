package streams;

public class ThreadExample {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            Thread.sleep(250);
            System.out.println("A");
            f();

        }
    }

    public static void f() throws InterruptedException {
        Thread.sleep(260);
        System.out.println(" B");

    }
}
