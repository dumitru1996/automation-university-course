package builder;

public class DrinkResult {//director class

    public static Drinks makeDrink(DrinksBuilder drinksBulder) {//specifies the order/how the product will be build
        drinksBulder.createDrink();
        drinksBulder.setWater();
        drinksBulder.setMilk();
        drinksBulder.setSugar();
        drinksBulder.setTopping();
        drinksBulder.setName();
        return drinksBulder.getDrink();//returns the drink
    }
}
