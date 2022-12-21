package facade;

import facade.ingredients.*;

public class AmericanPancakeFacade {
    private static Eggs eggs = new Eggs();
    private static Sugar sugar = new Sugar();
    private static Adds adds = new Adds();
    private static Milk milk = new Milk();
    private static Flour flour = new Flour();

    public static void bakePancakes(){//
        eggs.add(2.0);
        eggs.mix();
        sugar.add(3.0);
        sugar.mix();
        adds.add(0.5);
        adds.addSyrup(true);
        flour.add(1.0);
        flour.mix();
        milk.add(150.0);
        milk.mix();
        System.out.println("Congrats you made american pancakes!!");
    }
}
