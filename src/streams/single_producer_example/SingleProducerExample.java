package streams.single_producer_example;

public class  SingleProducerExample {
    public static void main(String[] args) {
        SimpleElementBuffer buffer = new SimpleElementBuffer();
        new Thread(new Produser(1, 1000, buffer)).start();
        new Thread(new Consume(buffer)).start();
    }
}
