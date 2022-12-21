package facade.ingredients;

import facade.RecipeService;

public class Eggs implements RecipeService {
    @Override
    public void add(Double quantity) {
        System.out.println("Add "+quantity+" eggs");
    }

    @Override
    public void mix() {
        System.out.println("Mix eggs");
    }
}
