package lesson7.oopconcepts.employee;

public class Client extends Person {
    private int id;
    private String address;

    public Client(String name, int age, String gender, int id, String address) {
        super(name, age, gender);
        this.id = id;
        this.address = address;
    }

    public static void orderProduct(Client client, int productId) {
        System.out.printf("Product with id %s is ordered by client %s\n",
                productId, client.getName());
    }

    public static void orderProduct(Client client, int productId, int discount) {
        System.out.printf("Product with id %s is ordered by client %s with discount %d%%\n",
                productId, client.getName(), discount);
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", address='" + address + '\'' +
                "} " + super.toString();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
