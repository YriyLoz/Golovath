package collections;

import java.util.List;

import static java.util.Arrays.asList;

public class ListExample_0_for {
    public static void main(String[] args) {
        List<String> list = asList("a","b","c");

        for(int k=0;k<list.size();k++){
            System.out.println(" "+list.get(k));
        }
    }
}
