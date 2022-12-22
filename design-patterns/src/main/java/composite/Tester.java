package composite;

public class Tester implements IEmployee {//leaf or usual class
    private int id;
    private String position;
    private String name;

    public Tester(int id, String position, String name) {
        this.id = id;
        this.position = position;
        this.name = name;
    }

    @Override
    public void showDetails() {
        System.out.println("Tester " + id + "with position " + position + " who has name " + name);
    }
}
