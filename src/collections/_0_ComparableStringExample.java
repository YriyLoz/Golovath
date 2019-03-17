package collections;

import java.util.SortedMap;
import java.util.SortedSet;

import java.util.TreeSet;

public class _0_ComparableStringExample {
    public static void main(String[] args) {
        SortedSet<String> set0 = new TreeSet<>();
        set0.add("c");
        set0.add("a");
        set0.add("q");
        set0.add("y");
        set0.add("f");
        System.out.println(set0);
        SortedSet<Integer> set1 = new TreeSet<>();
        set1.add(1);
        set1.add(6);
        set1.add(4);
        System.out.println(set1);
    }
}
