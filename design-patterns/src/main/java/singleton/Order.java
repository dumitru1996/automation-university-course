package singleton;

public class Order {
    static SingletoneDemo singletoneDemo = SingletoneDemo.getInstance();

    public static void main(String[] args) {
        Client client = new Client();
        client.getOrders();
        client.getName();
        System.out.println("Clinet1 ordered " + singletoneDemo.getValue("c1"));
        System.out.println("Clinet2 ordered " + singletoneDemo.getValue("c2"));
        System.out.println("Client's name is " + singletoneDemo.getValue("ana"));
    }
}
