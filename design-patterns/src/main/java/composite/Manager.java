package composite;

public class Manager implements IEmployee {

    private int id;
    private String position;
    private String name;

    public Manager(int id, String position, String name) {
        this.id = id;
        this.position = position;
        this.name = name;
    }

    @Override
    public void showDetails() {
        System.out.println("Manager " + id + "with position " + position + " who has name " + name);
    }
}
