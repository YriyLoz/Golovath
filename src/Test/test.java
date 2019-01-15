package Test;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("i = " + i);

        }

        System.out.println();

        for (int k = 10; k >= 0; k -= 2) {
            System.out.println("k = " + k);
        }

        System.out.println();

        for (int g = 9; g >= 0; g--) {
            System.out.println("g = " + g);
        }
       /* for (int k = 0; k < 10; k++) {
            System.out.println("k = " + k);
            k-=2;
        }*/

        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
                System.out.print("(" + i + "," + j + ")");

            }
            System.out.println();
        }
        int[] arr = {0, 10, 20, 30, 40, 50};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }
        int a, b, t;
        a = 1;
        b = 2;
        System.out.println(a + " " + b);
        t = a;
        a = b;
        b = t;
        System.out.println(a + " " + b);


        int[] arr2 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int h = 0; h < 10; h++) {
            for (int k = 0; k < arr2.length - 1; k++) {
                int tmp = arr2[k];
                arr2[k] = arr2[k + 1];
                arr2[k + 1] = tmp;
            }
            System.out.println(Arrays.toString(arr2));
        }
        System.out.println();

        int[] arrr = {6, 3, 6, 1, 8, 6, 3, 4, 1};
        for (int k = 1; k < arrr.length; k++) {
            int nev = arrr[k];
            int index = k - 1;
            while (index >= 0 && arrr[index] > nev) {
                arrr[index + 1] = arrr[index];
                index--;

            }
            arrr[index + 1] = nev;
        }
        System.out.println(Arrays.toString(arrr));

        for (int k = 0; k < arr.length / 2; k++) {
            int tmp = arr[k];
            arr[k] = arr[arr.length - k - 1];
            arr[arr.length - k - 1] = tmp;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println();
        System.out.println();
        f(5);
    }

    public static int f(int x) {
        int result;
        if (x == 0) {
            result = 0;
        } else if (x == 1) {
            result = 1;
        } else if (x % 2 == 0) {
            result = f(x - 2) + f(x - 1);
        } else {
            result = f(x - 1) + f(x - 2);
        }
        System.out.println(" " + x);
        return result;
    }

}
