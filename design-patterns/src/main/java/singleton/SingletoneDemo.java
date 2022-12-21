package singleton;


import java.util.HashMap;
import java.util.Map;

public class SingletoneDemo {

    private static final SingletoneDemo singletoneDemo = new SingletoneDemo();//private static instance
    private Map<String, String> data;

    private SingletoneDemo() {//private constructor
        data = new HashMap<>();
    }

    public static SingletoneDemo getInstance() {//method that returns the singleton instance
        return singletoneDemo;
    }

    public void saveData(String key, String value) {
        data.put(key, value);
    }

    public String getValue(String key) {
        return data.get(key);
    }
}
