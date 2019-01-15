package streams;

public class Lab {
    public static void main(String[] args) throws InterruptedException {
        Start start = new Start();
        Thread thread = new Thread(start);
        thread.start();
    }
}
