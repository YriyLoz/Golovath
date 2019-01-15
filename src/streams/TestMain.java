package streams;

public class TestMain {
    public static void main(String[] args) throws InterruptedException {
        Runnable printer = new PrintRunnable("B", 300);
        Runnable printer2 = new PrintRunnable(" A", 290);
        Thread thread = new Thread(printer);
        Thread thread2 = new Thread(printer2);
        thread.start();
        thread2.start();



        for (int i=0;i<10;i++){
            Thread.sleep(110);
            System.out.println("V");
        }
        System.out.println("Finish");


    }
}
