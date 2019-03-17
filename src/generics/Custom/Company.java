package generics.Custom;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Company implements Iterable<Employee> {
    private Employee[] employee = new Employee[0];



    public void setEmployee(Employee[] employee) {
        this.employee = employee;
    }

    @Override
    public Iterator<Employee> iterator() {
        return new ArrayIterator <>(employee);
    }



}
