package collections.lesson2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestListContains2 {
    public static void main(String[] args) {


        long t0, t1;

        List<String> list = new LinkedList<>();
        for (int k = 0; k < 10000; k++) {
            list.add("" + k);
        }
        t0 = System.currentTimeMillis();
        List(list);
        t1 = System.currentTimeMillis();
        System.out.println(t1 - t0);
        list = new ArrayList<>();
        for (int k = 0; k < 10000; k++) {
            list.add("" + k);
        }
        t0 = System.currentTimeMillis();
        List(list);
        t1 = System.currentTimeMillis();
        System.out.println(t1 - t0);

    }

    public static void List(List<String> list) {
        for (int k = 0; k < 100000; k++) {
            list.add("a");
        }
    }
}