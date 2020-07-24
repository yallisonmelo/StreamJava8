package Stream.Comparator;

import Service.LoadPeople;
import entity.Person;

import java.util.Comparator;
import java.util.List;
import java.util.function.ToIntFunction;

public class ComparatorService {

//Order List
    public void execute() {
        LoadPeople loadPeople = new LoadPeople();
        List<Person> people = loadPeople.returnListPeople();

        people.sort(Comparator.comparing(Person::getEmail));
        people.forEach(x -> System.out.println(x.getEmail()));
    }


    public void executeTwo(){
        ToIntFunction<Person> run = u ->u.getId();

    }
}
