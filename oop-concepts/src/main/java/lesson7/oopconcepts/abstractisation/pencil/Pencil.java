package lesson7.oopconcepts.abstractisation.pencil;

public abstract class Pencil {

    private String inkType;
    private String color;

    public Pencil(String inkType, String color) {
        this.inkType = inkType;
        this.color = color;
    }

    public abstract String drawShape(Shape shape);

    public String getInkType() {
        return inkType;
    }

    public void setInkType(String inkType) {
        this.inkType = inkType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
