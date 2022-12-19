package lesson7.oopconcepts.inheritance;

public class Animal {

    private String name;
    private String breed;
    private boolean domestic;

    public Animal(String name, String breed, boolean domestic) {
        this.name = name;
        this.breed = breed;
        this.domestic = domestic;
    }

    public void eat(){
        System.out.printf("%s is eating\n",name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public boolean isDomestic() {
        return domestic;
    }

    public void setDomestic(boolean domestic) {
        this.domestic = domestic;
    }
}
