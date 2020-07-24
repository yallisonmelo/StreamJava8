package Stream.RemoveIf;

import entity.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RemoveIf {

    Predicate<Person> filterEmail = x -> x.getEmail().contains("gmail");

    //For use Remove If, the list not imutable
    public void executeRemoveIf() {
        Person person1 = new Person(1, "Yallison", "yallisonmelo@gmail.com");
        Person person2 = new Person(2, "Felipe", "yallisonfelipe@gmail.com");
        Person person3 = new Person(3, "Angela", "angela@hotmail.com");
        Person person4 = new Person(4, "Ester", "ester@outlook.com");
        List<Person> people = new ArrayList<>();
        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);

        people.removeIf(filterEmail);
        people.forEach(x -> System.out.println(x.getName()));

    }
}
