package Test.dinamicArray;

import java.util.Arrays;

import static java.lang.System.arraycopy;

public class DynamicArray {
    int[] data = {};

    void add(int elem) {
        add(data.length, elem);
    }

    void remove() {
        remove(data.length - 1);
    }

    void add(int index, int elam) {
        int[] tmp = new int[data.length + 1];
        arraycopy(data, 0, tmp, 0, index);
        arraycopy(data, index, tmp, index + 1, data.length - index);
        tmp[index] = elam;
        this.data = tmp;


    }

    void remove(int index) {
        int[] tmp = new int[data.length - 1];
        arraycopy(data, 0, tmp, 0, index);
        arraycopy(data, index + 1, tmp, index, data.length - index - 1);
        this.data = tmp;
    }

    public static void main(String[] args) {
        DynamicArray dynArray = new DynamicArray();
        System.out.println(Arrays.toString(dynArray.data));
        dynArray.add(33);
        dynArray.add(33);
        dynArray.add(0, 44);
        dynArray.add(33);
        dynArray.data[1] = 22;
        dynArray.remove();

        System.out.println(Arrays.toString(dynArray.data));


    }
}
