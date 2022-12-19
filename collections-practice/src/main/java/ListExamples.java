
import java.util.*;
import java.util.stream.Collectors;

public class ListExamples<T> {

    static List<String> mainList = instantiateStringList();

    public static List<Integer> createListOfIntegers() {
        return List.of(1, 2, 5, 48, -15, 75, 88, 1000);
    }

    public static void displaySizeOrLength() {
        List<Integer> numbers = new ArrayList<>(createListOfIntegers());//give initial capacity to our list
        Integer[] ints = numbers.toArray(new Integer[0]);
        System.out.println("Initial size of list " + numbers.size());//it has the size of the List of Integers createList()
        System.out.println("Display array length " + ints.length);
        numbers.add(4);
        numbers.add(8);
        numbers.add(456788);
        System.out.println("Size after adding some elements " + numbers.size());//will not have IndexOutOfBounds
        // ints[8]=5;//IndexOutOfBounds exception

        System.out.println("Display  array : ");
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + " ");
        }
        System.out.println();
    }

    public static List<String> instantiateStringList() {
        List<String> stringList = new ArrayList<>();//can contain multiple null elements
        stringList.add("word1");
        stringList.add("word1");
        stringList.add("c");
        stringList.add("%3242");
        stringList.add("word2");
        stringList.add("Word4");
        stringList.add(null);
        stringList.add(null);
        return stringList;
    }

    public static void createListFromAnotherOne(List<Character> charList) {
        List<Character> characters = new ArrayList<>(charList);//characters list will contain all elements from given charList
        characters.addAll(List.of('2', 'c', 'c'));
        System.out.println(characters);
    }

    public static void changeElementsOfListBasedOnIndex() {
        mainList.set(6, "hello!");//update value at index 6
        System.out.println("List with changed element " + mainList);
    }

    public static void getAnElementFromList(int index) {
        System.out.println("Element : " + mainList.get(index));
    }

    public static void deleteAnElementFromList() {
        mainList.remove(0);//remove element at selected index
        mainList.remove("word1");//remove element by its name
        System.out.println("Modified List " + mainList);
    }

    public static void filterList() {
        List<String> filteredElements = mainList
                .stream()
                .filter(e -> e.contains("2"))
                .collect(Collectors.toList());//NullPointerException because list has null elements and method contains() requires @NotNull
    }

    public static String findElementBasedOnCondition() {
        return mainList.stream()
                .filter(element -> element.contains("%"))
                .findFirst()
                .orElseThrow();//if element does not exist will throw a NullPointerException(see filterList() method)
    }

    public static void findAndRemoveMultipleElementsBasedOnCondition() {
        List<String> stringList = new ArrayList<>(List.of("word1", "word2", "char", "123", "@@"));
        List<String> filteredList = stringList
                .stream()
                .filter(e -> e.contains("word"))
                .collect(Collectors.toList());
        stringList.removeAll(filteredList);
        System.out.println(stringList);

    }

    public static void iterateThroughList() {
        Iterator<String> itr = mainList.iterator();
        while (itr.hasNext()) {
            String element = itr.next();
            System.out.print(element + " ");
        }
    }

    public static void iterateThroughListByForLoop() {
        for (String element : mainList) {
            System.out.print(element + " ");
        }
    }

    public static void iterateThroughListByForEach() {
        mainList.forEach((n) -> System.out.print(n + " "));
    }

    public static LinkedList<String> createLinkedList() {
        LinkedList<String> names = new LinkedList<>();
        names.addFirst("Ana");
        names.add("Daniel");
        names.add("Maria");
        names.add("Maria");
        names.addLast("Emanuel");
        return names;
    }

    public static String getFirstElementFromLinkedList() {
        return createLinkedList().getFirst();
    }

    public static void main(String[] args) {
        List<Character> charList = Arrays.asList('b', '5', '.');
        System.out.println(instantiateStringList());
        findAndRemoveMultipleElementsBasedOnCondition();
        createListFromAnotherOne(charList);
        changeElementsOfListBasedOnIndex();
        displaySizeOrLength();
        System.out.println("Linked list is -> " + createLinkedList());
        System.out.println(getFirstElementFromLinkedList());
        getAnElementFromList(2);
        deleteAnElementFromList();
        System.out.println(findElementBasedOnCondition());
        iterateThroughList();
        System.out.println();
        iterateThroughListByForEach();
        System.out.println();
        iterateThroughListByForLoop();
    }
}
