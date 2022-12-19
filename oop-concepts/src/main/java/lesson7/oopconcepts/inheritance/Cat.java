package lesson7.oopconcepts.inheritance;

public class Cat extends Animal{

    private String furType;
    private boolean happy;

    public Cat(String name, String breed, boolean domestic, String furType, boolean happy) {
        super(name, breed, domestic);
        this.furType = furType;
        this.happy = happy;
    }

    public void purr(){
        if(happy){
            System.out.println("purrrr-purrr");
        } else {
            System.out.println("no!");
        }
    }

    public boolean isHappy() {
        return happy;
    }

    public void setHappy(boolean happy) {
        this.happy = happy;
    }

    public String getFurType() {
        return furType;
    }

    public void setFurType(String furType) {
        this.furType = furType;
    }
}
