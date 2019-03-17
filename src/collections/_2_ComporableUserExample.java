package collections;

import java.util.*;

public class _2_ComporableUserExample {
    public static void main(String[] args) {
        SortedSet<User> set = new TreeSet<>(new UserComparator());
        set.add(new User(1, "B"));
        set.add(new User(1, "C"));
        set.add(new User(3, "D"));
        set.add(new User(4, "D"));
        set.add(new User(5, "A"));
        System.out.println(set);
    }
}
