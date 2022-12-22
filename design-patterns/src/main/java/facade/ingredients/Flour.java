package facade.ingredients;

import facade.RecipeService;
import facade.ingredients.Adds;

public class Flour implements RecipeService {
    private Adds adds = new Adds();
    @Override
    public void add(Double quantity) {
        adds.addBakingPowder(10);
        System.out.println("Add flour "+quantity+" cup of flour");
    }

    @Override
    public void mix() {
        System.out.println("Mix flour with baking powder");
    }
}
