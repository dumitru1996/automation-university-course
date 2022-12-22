package composite;

public class Developer implements IEmployee {
    private int id;
    private String position;
    private String name;

    public Developer(int id, String position, String name) {
        this.id = id;
        this.position = position;
        this.name = name;
    }

    @Override
    public void showDetails() {
        System.out.println("Developer " + id + "with position " + position + " who has name " + name);
    }
}
