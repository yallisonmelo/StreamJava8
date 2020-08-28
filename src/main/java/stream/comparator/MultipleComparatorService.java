package Stream.Comparator;

import Service.LoadPeople;
import entity.Person;

import java.util.Comparator;
import java.util.List;

public class MultipleComparatorService {


    //Using two or many Comparators
    public void execute(){

        LoadPeople loadPeople = new LoadPeople();
        List<Person> people = loadPeople.returnListPeople();

        Comparator<Person> comparatorPerson  = Comparator.comparingInt(Person::getId)
                .thenComparing(Person::getName);
        people.sort(comparatorPerson);

    }
}
