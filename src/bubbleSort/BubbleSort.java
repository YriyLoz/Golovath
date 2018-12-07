package bubbleSort;

import java.util.Arrays;

public class BubbleSort {

    public static void sort(int[] arr) {

        for (int barrier = arr.length - 1; barrier >= 0; barrier--) {

            for (int index = 0; index < barrier; index++) {

                if (arr[index] < arr[index + 1]) {

                    int tmp = arr[index];

                    arr[index] = arr[index + 1];

                    arr[index + 1] = tmp;

                }

            }

        }

    }

}



