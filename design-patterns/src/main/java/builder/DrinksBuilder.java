package builder;

public abstract class DrinksBuilder {
   private Drinks drinks;

    public void createDrink() {
        drinks = new Drinks();
    }

    public Drinks getDrink() {//instantiation of object drinks
        return drinks;
    }

    public abstract void setWater();//steps common for all builders types

    public abstract void setMilk();

    public abstract void setSugar();

    public abstract void setTopping();

    public abstract void setName();
}

