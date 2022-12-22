package singleton;

public class Client {
    static SingletoneDemo singletoneDemo = SingletoneDemo.getInstance();

    void getName() {
        String cl1 = "Andy";
        String cl2 = "Ana";
        singletoneDemo.saveData("ana", cl2);
        singletoneDemo.saveData("andy", cl1);
    }

    void getOrders() {
        String clientOne = "americano";
        String clientTwo = "tea";
        singletoneDemo.saveData("c1", clientOne);
        singletoneDemo.saveData("c2", clientTwo);
    }
}
