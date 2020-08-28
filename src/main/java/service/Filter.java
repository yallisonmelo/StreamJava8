package Service;

import entity.Person;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class Filter {
    LoadPeople loadPeople = new LoadPeople();
    public void filterListReturnOnlyNameByEmailIsGmail() {
        LoadPeople loadPeople = new LoadPeople();
        Predicate<Person> filterEmail = x -> x.getEmail().contains("gmail");
        Predicate<Person> filterNome = x -> x.getName().contains("Silveira");
        Consumer<Person> consumerexternal = x -> {
            if (x.getName().equalsIgnoreCase("guilherme")) {
                System.out.println(x);
            }
        };

        loadPeople.returnListPeople().stream().filter(filterEmail).forEach(consumerexternal);
    }


    public void validaBoasPraticas( Predicate<Person> filter,  Consumer<Person>consumer){
        loadPeople.returnListPeople().stream().filter(filter).forEach(consumer);
    }


}
