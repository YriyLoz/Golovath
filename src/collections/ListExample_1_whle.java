package collections;

import java.util.Iterator;
import java.util.List;

import static java.util.Arrays.asList;

public class ListExample_1_whle {
    public static void main(String[] args) {


        List<String> list = asList("a", "b", "c");


        Iterator<String> Iter = list.iterator();
        while (Iter.hasNext()) {
            System.out.println(Iter.next());


        }
    }
}