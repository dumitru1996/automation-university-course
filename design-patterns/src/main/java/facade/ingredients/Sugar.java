package facade.ingredients;

import facade.RecipeService;

public class Sugar implements RecipeService {

    @Override
    public void add(Double quantity) {
        System.out.println("Add "+quantity+" ts of sugar");
    }

    @Override
    public void mix() {
        System.out.println("Mix sugar with eggs");
    }
}
