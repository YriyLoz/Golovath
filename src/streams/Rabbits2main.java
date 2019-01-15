package streams;

public class Rabbits2main {
    public static void main(String[] args)throws InterruptedException {
        new Thread(new Rabbits2("1", 100)).start();

    }
}
