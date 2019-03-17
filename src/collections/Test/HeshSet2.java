package collections.Test;

import java.util.HashSet;
import java.util.Set;

public class HeshSet2 {
    public static void main(String[] args) {
        Set<Node> ser = new HashSet<>();

        ser.add(new Node(1, "GGG"));
        System.out.println(ser.toString());
        ser.add(new Node(1, "GGG"));
        ser.add(new Node(1, "GGG"));
        ser.add(new Node(2, "GGf"));
        ser.add(new Node(3, "GGf"));
        ser.add(new Node(4, "fGG"));
        for (Node gg : ser) {
            System.out.println(gg);
        }

    }
}
