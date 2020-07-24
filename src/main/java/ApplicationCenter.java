import Service.LoadPeople;
import Stream.Comparator.ComparatorService;
import entity.Person;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ApplicationCenter {
    public static void main(String[] args) {
        LoadPeople loadPeople = new LoadPeople();
        List<Person>people = loadPeople.returnListPeople();

        Map<Boolean,List<Person>> lista =
                people.stream()
                        .collect(Collectors.partitioningBy((Person emp) -> emp.getEmail().contains("gmail")));

        ComparatorService comparatorService = new ComparatorService();
        comparatorService.execute();

//        Predicate<Person>myFilterEmailIsOnlyGmail = x-> x.getEmail().contains("gmail");
//        Consumer<Person> myPrinterOnlyName = x -> System.out.println(x.getName());
//
//        String[] myArray = { "this", "is", "a", "sentence" };
//        String result = Arrays.stream(myArray)
//                .reduce("", (a,b) -> a + b);
//
//        System.out.println(result);

    }






}
