package collections.Test;

public class Node {
    private int age;
    private String name;

    Node(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
   public int hashCode() {
        return 31*age+((name ==null)?0:name.hashCode());
    }

    @Override
    public String toString() {
        return "" + age + " " + name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Node obj1 = (Node) obj;
        if (this.age != obj1.age) return false;
        if (this.name != obj1.name) return false;
        return true;
    }

}
