package lesson7.oopconcepts.inheritance;

public class Main {

    public static void petAnimal(Animal animal){
        if(animal.isDomestic()){
            System.out.println("Pet the animal");
        } else {
            System.out.println("Don't touch it");
        }
    }

    public static void main(String[] args) {
        Cat bengalCat = new Cat("Bell","Bengal",true,"spotted",true);
        bengalCat.purr();
        bengalCat.eat();

        Dog shepherdDog = new Dog("Rex", "Shepherd",true, true);
        shepherdDog.wagTheTail();
        shepherdDog.eat();

        petAnimal(bengalCat);
        petAnimal(shepherdDog);

        Animal panther = new Animal("Bagheera", null,false);

        petAnimal(panther);
    }
}
