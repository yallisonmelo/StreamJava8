package Service;

import entity.Person;
import enums.Sex;

import java.util.ArrayList;
import java.util.List;

public class LoadPeople {

    public List<Person> returnListPeople() {
        Person felipe = new Person(1, "Felipe", "felipe@gmail.com", "strett horizon", true, Sex.MALE);
        Person angela = new Person(2, "Angela", "felipe@gmail.com", "strett sugar", true, Sex.FEMALE);
        Person ester = new Person(3, "Ester", "ester@hotmail.com", "strett Curve", true, Sex.FEMALE);
        Person silveira = new Person(4, "Sr.Silveira", "silveira@hotmail.com", "strett Master", false, Sex.OTHER);
        List<Person> people = new ArrayList<>();
        people.add(felipe);
        people.add(angela);
        people.add(ester);
        people.add(silveira);
        return people;
    }

}
