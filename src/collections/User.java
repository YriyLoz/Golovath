package collections;

import java.util.ArrayList;
import java.util.Comparator;

public class User implements Comparable<User> {
    private int age;
    private String name;

    User(int age, String name) {
        this.age = age;
        this.name = name;
    }


    @Override
    public String toString() {
        return " " + age + " " + name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }



  /*  @Override
    public int compareTo(User that) {
        return this.age - that.age ;
    }*/

    @Override
    public int compareTo(User that) {
        return this.name.compareTo(that.name);
    }
}
