package builder;

public class Coffee extends DrinksBuilder {


    @Override
    public void setWater() {
        System.out.println("Step1:boil water");
        getDrink().water = 50;
    }

    @Override
    public void setMilk() {
        System.out.println("Step2:Put milk if needed");
        getDrink().milk = 50;
    }

    @Override
    public void setSugar() {
        System.out.println("Step3 Set quantity of sugar");
        getDrink().sugar = 2;
    }

    @Override
    public void setTopping() {
        System.out.println("Step4:How without topping of course");
        getDrink().topping = "caramel";
    }

    @Override
    public void setName() {
        System.out.println("Step5 Congrats you have a coffee");
        getDrink().name = "americano";
    }
}
