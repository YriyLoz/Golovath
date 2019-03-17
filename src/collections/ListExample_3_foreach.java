package collections;

import java.util.List;

import static java.util.Arrays.asList;

public class ListExample_3_foreach {
    public static void main(String[] args) {
        List<String> list = asList("a", "b", "c");

        for (String elem : list) {
            System.out.println(elem);
        }
    }
}
