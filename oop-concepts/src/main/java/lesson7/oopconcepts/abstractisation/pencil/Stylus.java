package lesson7.oopconcepts.abstractisation.pencil;

public class Stylus extends Pencil {

    private String drawingType;

    public Stylus(String inkType, String color, String drowingType) {
        super(inkType, color);
        this.drawingType = drowingType;
    }

    @Override
    public String drawShape(Shape shape) {
        return String.format("%s is drown by stylus, using %s drawing type", shape.getShape(), drawingType);
    }

    public String getDrawingType() {
        return drawingType;
    }

    public void setDrawingType(String drawingType) {
        this.drawingType = drawingType;
    }
}
