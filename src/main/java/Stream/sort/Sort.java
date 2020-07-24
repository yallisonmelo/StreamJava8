package Stream.sort;

import Service.LoadPeople;
import entity.Person;

import java.util.Comparator;
import java.util.List;

public class Sort {

    public void execute(){
        List<Person> people = new LoadPeople().returnListPeople();
        people.sort(Comparator.comparing(x-> x.getName()));
    }
}
