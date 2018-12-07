package recursion;

public class Recursion {
    public static void main(String[] args) {
        f(1);
        System.out.println();
        ff(1);
        System.out.println();
        Fibonacci(5);
    }


    public static void f(int x) {
        System.out.print(x);
        if (x < 15) {
            f(2 * x);
        }
    }


    public static void ff(int x) {
        if (x < 15) {
            ff(2 * x);
        }
        System.out.print(x);
    }

    public static int Fibonacci(int x) {

        System.out.print(" " + x);

        if (x == 0) {

            return 0;

        } else if (x == 1) {

            return 1;

        } else {

            return Fibonacci(x - 2) + Fibonacci(x - 1);

        }


    }
}
