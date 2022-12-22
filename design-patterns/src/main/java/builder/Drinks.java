package builder;

public class Drinks {
    int water;//common features of builders(coffee,tea..)
    int milk;
    int sugar;
    String topping;
    String name;

    @Override
    public String toString() {
        return "Drinks{" +
                "water=" + water +
                ", milk=" + milk +
                ", sugar=" + sugar +
                ", topping='" + topping + '\'' +
                ", name='" + name + '\'' +
                '}';
    }


}
