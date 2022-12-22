package facade.ingredients;

import facade.RecipeService;

public class Adds implements RecipeService {

    @Override
    public void add(Double quantity) {
        boolean addBanana = true;
        System.out.println("Add banana " + addBanana + " " + quantity);
    }

    public void addSyrup(boolean addSyrup) {
        if (addSyrup) {
            String syrup = "agave";
            System.out.println("Add "+ syrup +" syrup");
        }else{
            System.out.println("No need for syrup");
        }
    }

    public void addBakingPowder(int bakingPowder) {
        System.out.println("Add baking powder " + bakingPowder + " gr");
    }

    @Override
    public void mix() {
        System.out.println("Mix smashed banana and syrup");
    }
}
