package generics.Custom1;

public class Start {
    public static void main(String[] args) {
        Home home = new Home();
        Person[] persons = {new Person("Jon"),
                new Person("Ric"),
                new Person("Karl")};
        home.setPersons(persons);

        for (Person one :home){
            System.out.println(one);
        }

    }
}
