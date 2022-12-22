package facade;

import facade.ingredients.Eggs;
import facade.ingredients.Flour;
import facade.ingredients.Milk;
import facade.ingredients.Sugar;

public class MoldavianPancakeFacade {
    private static Eggs eggs = new Eggs();
    private static Sugar sugar = new Sugar();
    private static Milk milk = new Milk();
    private static Flour flour = new Flour();

    public static void bakeMoldavianPancakes(){
        eggs.add(5.0);
        eggs.mix();
        sugar.add(6.0);
        sugar.mix();
        flour.add(2.5);
        flour.mix();
        milk.add(750.0);
        milk.mix();
        System.out.println("Congrats you made moldavian pancakes!!");
    }
}
