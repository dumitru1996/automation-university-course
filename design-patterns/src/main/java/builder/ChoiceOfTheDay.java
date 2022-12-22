package builder;

public class ChoiceOfTheDay {

    public static void main(String[] args) {
        Tea tea = new Tea();
        Coffee coffee = new Coffee();
        Drinks greenTea = DrinkResult.makeDrink(tea);//builds a product
        System.out.println("Tea " + greenTea);
        Drinks americano = DrinkResult.makeDrink(coffee);
        System.out.println("Americano " + americano);

        //make a product using constructor to make the difference
        Cacao cacao = new Cacao(2, 0, 150, 1, null, "cacao");//can be really massive
        System.out.println(cacao);
        //make another cacao
        cacao.setCacao(3);
        cacao.setSugar(0);
        cacao.setMilk(300);
        cacao.setName("cacao");//to construct many products consumes multiple code lines and implementation it's not hidden
        System.out.println("Cacao for my friend: "+cacao);
    }
}
