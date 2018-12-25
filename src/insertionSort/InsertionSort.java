package insertionSort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {10, 4, 7, 8, 9, 4, 4, 7, 8};
        System.out.println(Arrays.toString(arr));
        for (int k = 1; k < arr.length; k++) {

            int newElement = arr[k];

            int location = k - 1;

            while (location >= 0 && arr[location] > newElement) {
                arr[location + 1] = arr[location];
                location--;

            }
            arr[location + 1] = newElement;
        }
        System.out.println(Arrays.toString(arr));
    }
}
