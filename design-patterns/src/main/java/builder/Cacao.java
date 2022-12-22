package builder;

public class Cacao  {
    int cacao;//copy Drinks fields
    int water;
    int milk;
    int sugar;
    String topping;
    String name;
    public Cacao(int cacao,
                 int water,
                 int milk,
                 int sugar,
                 String topping,
                 String name) {
        this.name=name;
        this.topping=topping;
        this.sugar=sugar;
        this.milk=milk;
        this.water=water;
        this.cacao = cacao;
    }

    @Override
    public String toString() {
        return "Cacao{" +
                "cacao=" + cacao +
                ", water=" + water +
                ", milk=" + milk +
                ", sugar=" + sugar +
                ", topping='" + topping + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public void setWater(int water) {
        this.water = water;
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }

    public void setSugar(int sugar) {
        this.sugar = sugar;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCacao(int cacao) {
        this.cacao = cacao;
    }
}
