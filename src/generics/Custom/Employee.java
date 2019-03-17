package generics.Custom;

import java.lang.reflect.Array;

public class Employee {
    private String name;


    @Override
    public String toString() {
        return name;
    }

    Employee(String name) {

        this.name = name;

    }
}
