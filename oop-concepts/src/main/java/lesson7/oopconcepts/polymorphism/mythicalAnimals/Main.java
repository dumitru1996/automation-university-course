package lesson7.oopconcepts.polymorphism.mythicalAnimals;

public class Main {

    public static void main(String[] args) {
        MythicalAnimal smaug = new Dragon();
        smaug.details();

        MythicalAnimal unicorn = new Unicorn();
        unicorn.details();

        MythicalAnimal unknownAnimal = new MythicalAnimal();
        unknownAnimal.details();
    }
}
