package StrimAPI;

import java.util.ArrayList;
import java.util.Collections;

public class Program {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        Collections.addAll(arr, "ff", "hh3", "bf");
        arr.stream().filter(s -> s.length() == 3).forEach(s-> System.out.println(s));
    }
}
