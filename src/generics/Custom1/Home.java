package generics.Custom1;

import java.util.Iterator;

public class Home implements Iterable<Person> {
    private Person[] persons;

    public void setPersons(Person[] persons) {
        this.persons = persons;
    }

    @Override
   public Iterator<Person> iterator() {
        return new ArrayMetod<>(persons);

    }
}
