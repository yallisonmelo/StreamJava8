package FunctionalInterface;

import entity.Person;

import java.util.Arrays;
import java.util.List;

public class ValidatorService {

    ///Implements Functional Interface
    public void execute() {
        Validator<String> validatorZipCode = valor -> valor.matches("[0-9]{5}-[0-9]{3}");
        if (validatorZipCode.validate("55730-000")) {
            System.out.println("Validate");
        } else {
            System.out.println("Not Validate");
        }
    }

    public void execute02() {
        Validator<String> validatorCPF = valor -> valor.matches("[0-9]{3}.[0-9]{3}.[0-9]{3}-[0-9]{2}");
        if (validatorCPF.validate("000.111.234.99")) {
            System.out.println("Validate");
        } else {
            System.out.println("Not Validate");
        }
    }

    public void executeConsumer(){
        Person person1 = new Person(1, "Yallison", "yallisonmelo@gmail.com");
        Person person2 = new Person(2, "Felipe", "yallisonfelipe@gmail.com");
        List<Person> people = Arrays.asList(person1, person2);

        ConsumerExample<Person> showMessage = u-> System.out.println("Before print Name:");
        ConsumerExample<Person> printName = u-> System.out.println(u.getName());

        people.forEach(showMessage.andThen(printName));

    }
}
