package Consumer;

import entity.Person;

import java.util.function.Consumer;

public class ViewPerson implements Consumer<Person> {
    @Override
    public void accept(Person person) {
        System.out.println(person.getName());
    }

}
