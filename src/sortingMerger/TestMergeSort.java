package sortingMerger;

import java.util.Arrays;
class TestMergeSort {
    public static void main(String[] args) {
        int[][] data = {
                {9, 7, 0, 3, 5, 2, 6, 1, 4, 8},
                {0, 3, 5, 2, 1, 4},
                {0, 3, 5, 2, 1},
                {0, 3, 5, 2},
                {0, 3, 5},
                {0, 3},
                {0},
                {},
        };
        for (int[] origin : data) {
            System.out.println("origin: " + Arrays.toString(origin));
            int[] sorted = MergeSort.sort(origin, 0, origin.length);
            System.out.println("sorted: " + Arrays.toString(sorted));
            System.out.println();
        }
    }
}