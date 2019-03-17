package collections.lesson2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestListContains {
    public static void main(String[] args) {
        long t0,t1;
        List<String> list0 = new ArrayList<>();
        for(int k = 0;k<1000;k++){
            list0.add(""+k);
        }
        t0 = System.currentTimeMillis();
        testListContains(list0);
        t1 = System.currentTimeMillis();

        System.out.println(t1 - t0);
        List<String> list1 = new LinkedList<>();
        for(int k = 0;k<1000;k++){
            list1.add(""+k);
        }
        t0 = System.currentTimeMillis();
        testListContains(list1);
        t1 = System.currentTimeMillis();
        System.out.println(t1 - t0);
        List i  =new LinkedList();
    }

    public static void testListContains(List<String> list) {
        for (int k = 0; k < 10_000_00; k++) {
            list.contains("XYZ");
        }
    }
}
