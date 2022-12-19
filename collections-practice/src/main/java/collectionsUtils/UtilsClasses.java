package collectionsUtils;

import java.util.*;
import java.util.stream.Collectors;

public class UtilsClasses {
    private static final Person john = new Person("John", "Travolta", 59, 4578960);
    private static final Person helena = new Person("Helena", "Karter", 29, 4678510);
    private static final Person johnny = new Person("Johnny", "Smith", 5, 4664760);
    private static final List<Person> listOfPersons = Arrays.asList(john, helena, johnny);

    public static void findElementsInCommon() {
        List<Integer> listOfIntegers = new ArrayList<>(Arrays.asList(122, 44, 478, 88));
        List<Integer> listOfNumbers = new ArrayList<>(Arrays.asList(122, 44, 478, 88));
        Collections.sort(listOfIntegers);
        Collections.sort(listOfNumbers);

        System.out.println(Collections.disjoint(listOfIntegers, listOfNumbers));//returns true/false if they have elements in common
    }

    public static void reverseOrder() {
        List<String> namesOfMales = new ArrayList<>(List.of("Andy", "Patric", "Jess", "Steve"));
        Collections.reverse(namesOfMales);//reverse order of list
        System.out.println(namesOfMales);
    }

    public static Person getMaxAgeOfThePeron() {
        return listOfPersons.stream()
                .max(Comparator.comparing(Person::getAge))//use ax method from stream
                .orElseThrow();
    }

    public static void getMinId() {//use min from Collections api
        List<Integer> ids = new ArrayList<>();
        for (Person person : listOfPersons) {
            ids.add(person.getId());
        }
        System.out.println(Collections.min(ids));
    }

    public static void sortPersonsByFirstName() {
        List<Person> sortedList = listOfPersons.stream()
                .sorted(Comparator.comparing(Person::getFirstName))//use Comparator interface with reference method
                .collect(Collectors.toList());
        sortedList.forEach(System.out::println);
    }

    public static void sortPersonsByLastName() {
        List<Person> sortedList = listOfPersons.stream()
                .sorted()
                .collect(Collectors.toList());
        sortedList.forEach(System.out::println);
    }

    public static void comparePersonFromList() {
        List<Person> sortedListByAge = listOfPersons
                        .stream()
                        .sorted((pers1,pers2)->pers1.compareTo(pers2))//compareTo() method from Person class
                        .collect(Collectors.toList());
        sortedListByAge.forEach(System.out::println);
    }

    public static void main(String[] args) {
        findElementsInCommon();
    }
}
