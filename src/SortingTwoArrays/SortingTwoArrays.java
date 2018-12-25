package SortingTwoArrays;

public class SortingTwoArrays {
    public static int[] merge(int[] a, int[] b) {
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
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
        return result;
    }
}

