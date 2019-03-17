package generics.Custom;

import java.lang.reflect.Array;

public class ExampleIterable_1 {
    public static void main(String[] args) {
        Company company = new Company();
        Employee[] employee = {new Employee("Mike"),
                new Employee("Jon"),
                new Employee("Mikel")};
        company.setEmployee(employee);


        for (Employee emp : company) {
            System.out.println(emp);
        }
    }
}
