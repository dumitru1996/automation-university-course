package builder;

public class Tea extends DrinksBuilder {

    @Override
    public void setWater() {//implementation of the construction step
        System.out.println("Step1:boil water");
        getDrink().water = 100;
    }

    @Override
    public void setMilk() {
        System.out.println("Step2:Put milk if needed");
        getDrink().milk = 0;
    }

    @Override
    public void setSugar() {
        System.out.println("Step3 Set quantitaty of sugar");
        getDrink().sugar = 2;
    }

    @Override
    public void setTopping() {
    }

    @Override
    public void setName() {
        System.out.println("Step5 Congrats you have a tea");
        getDrink().name = "green tea";
    }
}
