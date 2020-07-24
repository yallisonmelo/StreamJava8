package Consumer;

import entity.Person;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ViewPersonService {

    public void execute() {
        Person person1 = new Person(1, "Yallison", "yallisonmelo@gmail.com");
        Person person2 = new Person(2, "Felipe", "yallisonfelipe@gmail.com");
        List<Person> people = Arrays.asList(person1, person2);
        Consumer<Person> view = (Person u) -> System.out.println(u.getName());
        people.forEach(view);//Consumer
        people.forEach(u -> System.out.println(u.getName()));//Lambda Expression
    }


}
