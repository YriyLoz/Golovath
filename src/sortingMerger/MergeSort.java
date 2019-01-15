package sortingMerger;
import java.util.Arrays;
public class MergeSort {
    public static int[] sort(int[] array, int from, int len) {
        if (len == 0) {
            return new int[0];
        } else if (len == 1) {
            return new int[]{array[from]};
        } else if (len == 2) {
            if (array[from] < array[from + 1]) {
                return new int[]{array[from], array[from + 1]};
            } else {
                return new int[]{array[from + 1], array[from]};
            }
        } else {
            int[] left = sort(array, from, len / 2);
            int[] right = sort(array, from + (len / 2), len - (len / 2));
            return merge(left, right);
        }
    }
    private static int[] merge(int[] a, int[] b) {
            int[] result = new int[a.length + b.length];
            int aIndex = 0;
            int bIndex = 0;
            while (aIndex + bIndex != result.length) {
                if (aIndex < a.length && bIndex < b.length) {
                    if (a[aIndex] < b[bIndex]) {
                        result[aIndex + bIndex] = a[aIndex++];
                    } else if (a[aIndex] > b[bIndex]) {
                        result[aIndex + bIndex] = b[bIndex++];
                    } else if (a[aIndex] == b[bIndex]) {
                        result[aIndex + bIndex] = b[bIndex++];
                        result[aIndex + bIndex] = a[aIndex++];
                    }
                } else if (aIndex >= a.length) {
                    result[aIndex + bIndex] = b[bIndex++];
                } else if (bIndex >= b.length) {
                    result[aIndex + bIndex] = a[aIndex++];
                }

            }


        System.out.print(Arrays.toString(a) + " + " + Arrays.toString(b));
        System.out.println(" -> " + Arrays.toString(result));
        return result;
    }
}