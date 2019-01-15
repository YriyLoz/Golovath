package streams;

public class Rabbits2 implements Runnable {
    private String print;
    private int time;
    static int i = 2;

    Rabbits2(String print, int time) {
        this.print = print;
        this.time = time;
    }

    @Override
    public void run() {
        for (; ; i++) {
            try {

                String spaces = spaces(i);
                Runnable printer = new Rabbits2(spaces + i, time + 1000);
                Thread thread = new Thread(printer);
                thread.start();
                thread.sleep(time);
                System.out.println(print);
            } catch (InterruptedException e) {

            }

        }
    }

    private static String spaces(int count) {
        String result = "";
        for (int i = 0; i < count; i++) {
            result += " ";
        }
        return result;
    }
}
