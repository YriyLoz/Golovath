package collections.Test;

import java.util.HashSet;
import java.util.Set;

public class HeshSet1 {
    public static void main(String[] args) {
        Set<Integer> ser = new HashSet<>();
        for (int k = 0; k < 10; k++) {
            ser.add(k);

        }
        System.out.println(ser.toString());
        ser.add(4);
        System.out.println(ser.toString());
        ser.remove(4);
        System.out.println(ser.contains(4));
        ser.clear();

        for (int k = 0; k < 100; k++) {
            System.out.println(ser.contains(k));
        }

    }
}
