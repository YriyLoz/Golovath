package collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class ThreeSet {
    public static void main(String[] args) {
        SortedSet<String> SortS = new TreeSet<>();
        SortS.add("c");
        SortS.add("a");
        SortS.add("b");
        System.out.println(SortS);
    }
}
