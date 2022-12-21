package facade.ingredients;

import facade.RecipeService;

public class Milk implements RecipeService {
    @Override
    public void add(Double quantity) {
        System.out.println("Add "+quantity+" ml of milk");
    }

    @Override
    public void mix() {
        System.out.println("Mix ingredients with milk");
    }
}
