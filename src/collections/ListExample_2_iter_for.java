package collections;

import java.util.Iterator;
import java.util.List;

import static java.util.Arrays.asList;

public class ListExample_2_iter_for {
    public static void main(String[] args) {
        List<String> list = asList("a", "b", "c");

        for (Iterator<String> iter = list.iterator(); iter.hasNext(); ) {
            System.out.println(" " + iter.next());
        }
    }
}
