package collections.Test;

import java.util.HashMap;
import java.util.Map;

public class HeshMap1 {
    public static void main(String[] args) {
        Map<Integer, Object> map = new HashMap<>(1048576);
        for (int k = 0; k < 1048576; k++) {
            map.put(k, new Node(k, "Vasia"));
        }
        for (int k = 1; k < 10; k++) {
            long f1, f2;
            f1 = System.nanoTime();
            map.put(-k, new Node(k, "Vasia"));
            f2 = System.nanoTime();
            System.out.println(f2 - f1);

        }
        System.out.println(map.get(1) + " " + map.get(-1));
        System.out.println(map.get(1).equals(map.get(-1)));
        map.put(-2,new Node(3,"gg"));
        System.out.println(map.get(2).equals(map.get(-2)));



    }
}
