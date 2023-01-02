
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class MapExamples {

    static Map<String, Object> mapOfObjects = createMap();

    public static Map<String, Object> createMap() {
        Map<String, Object> mapOfObjects = new HashMap<>();
        mapOfObjects.put("firstKey", 12);
        mapOfObjects.put("secondKey", "value");
        mapOfObjects.put("thirdKey", 'C');
        mapOfObjects.put("forthKey", 0.48);
        mapOfObjects.put("fifthKey", true);
        return mapOfObjects;
    }

    public static void createNewMapFromExistingOne() {
        Map<String, Object> newMap = new HashMap<>();
        newMap.putAll(mapOfObjects);
        newMap.put("sixthKey", "value2");
        newMap.put("justKey", "value2");//can contain duplicate values assigned to different keys
        newMap.put(null, "value3");//allows only one null key
        newMap.put("seventhKey", null);
        newMap.put("heightKey", null);//allows multiple null values
        System.out.println(newMap);
    }

    public static void replaceValue() {
        mapOfObjects.replace("firstKey", "twelfth");
        System.out.println("Display modified map " + mapOfObjects);
    }

    public static void replaceOnCondition(Object value){
        if(mapOfObjects.containsValue(value)){
            System.out.println(mapOfObjects
                    .entrySet()
                    .stream()
                    .filter(element -> element.getValue().equals(value))
                    .findFirst()
                    .get().getKey());
        }else{
            throw new NoSuchElementException();
        }
    }

    public static void getElementByKeyFromMap() {
        Object element = mapOfObjects.get("fifthKey");
        System.out.println("Element: " + element);
    }

    public static void addNewEntryToMAp() {
        mapOfObjects.putIfAbsent("firstKey", 1000);//no change as the key is already present
        mapOfObjects.putIfAbsent("sixthKey", 1000);//new entry added
        System.out.println(mapOfObjects);
    }

    public static Object findEntryByValue(Object condition) {
        return mapOfObjects.entrySet()
                .stream()
                .filter(entry -> entry.getValue().equals(condition))//condition on value
                .findFirst()
                .orElseThrow();
    }

    public static void displayValuesOfMAp() {
        mapOfObjects.values().forEach(System.out::println);
    }

    public static List<String> getSortedListOfKeys() {
        return mapOfObjects.keySet().stream().sorted().collect(Collectors.toList());
    }

    public static void displayMapUsingForLoop() {
        for (Map.Entry<String, Object> entry : mapOfObjects.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        displayValuesOfMAp();
        displayMapUsingForLoop();
    }
}
