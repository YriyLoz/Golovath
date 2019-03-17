package generics.Custom1;

public class Person {
    private String name;

    @Override
    public String toString() {
        return name;
    }

    Person(String name) {
        this.name = name;
    }
}
