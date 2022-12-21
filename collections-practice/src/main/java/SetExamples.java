import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExamples {

    static Set<Integer> setExample = createIntegerSet();

    public static Set<Integer> createIntegerSet() {
        Set<Integer> numbers = new HashSet<>();
        numbers.addAll(Set.of(1, 88, 456, 0, 5, 45));
        return numbers;
    }

    public static void addDuplicatedElementsToSet() {
        setExample.add(1);
        setExample.add(88);
        System.out.println(setExample);//the elements will be displayed unique
    }

    public static void addNullValues() {

        setExample.add(null);//allowed
        setExample.add(null);//second null won't be displayed(no duplication)
        System.out.println(setExample);
    }

    public static void displayElementsOfSet() {
        setExample.forEach(e -> System.out.print(e + " "));
    }

    public static void displayElementsOfSetWithIterator() {
        Iterator<Integer> iterator = setExample.iterator();
        System.out.println("\nElements of set: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next()+", ");
        }
    }

    public static Integer findElementFromSetWithStreams(Integer givenElement) {
        return setExample.stream()
                .filter(element -> element.equals(givenElement))
                .findAny()
                .orElseThrow();
    }


    public static void removeIfElementFromSet(Integer elementToBeRemoved) {
        setExample.removeIf(element -> element.equals(elementToBeRemoved));
        System.out.println(setExample);
    }

    public static void removeElementFromSet(Integer givenElement) {
            setExample.remove(givenElement);
            System.out.println(setExample);
    }

    public static void deleteAllElementsFromSet() {
        setExample.clear();//set not deleted  only its elements
        System.out.println("Empty set " + setExample);
    }

    public static void getCommonValuesOfTwoSets(){
        Set<Integer> secondSet = new HashSet<>(Set.of(25,45,88,12547,548));
        Set<Integer> commonValues = new HashSet<>(setExample);
        commonValues.retainAll(secondSet);
        System.out.println("Common values are "+commonValues);
    }

    public static void main(String[] args) {
        System.out.println(createIntegerSet());//display an unordered collection
    }
}
