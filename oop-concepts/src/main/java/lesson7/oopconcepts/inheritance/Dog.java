package lesson7.oopconcepts.inheritance;

public class Dog extends Animal{
    public static final String BARK = "bark!";
    private boolean haveBone;

    public Dog(String name, String breed, boolean domestic, boolean haveBone) {
        super(name, breed, domestic);
        this.haveBone = haveBone;
    }

    public void wagTheTail(){
        if (haveBone){
            System.out.printf("'%s is happy and wagging the tail'\n", getName());
        } else {
            System.out.printf("%s, %s, %s\n",BARK,BARK,BARK);
        }
    }

    public boolean isHaveBone() {
        return haveBone;
    }

    public void setHaveBone(boolean haveBone) {
        this.haveBone = haveBone;
    }
}
