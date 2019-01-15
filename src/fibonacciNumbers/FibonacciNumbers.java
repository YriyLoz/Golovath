package fibonacciNumbers;

public class FibonacciNumbers {
    public static void main(String[] args) {
        Fibonacci(5);
    }

    public static int Fibonacci(int x) {

        System.out.print(" " + x);

        if (x == 0) {

            return 0;

        } else if (x == 1) {

            return 1;

        } else {

            return Fibonacci(x - 2) +   Fibonacci(x - 1);

        }


    }
}
