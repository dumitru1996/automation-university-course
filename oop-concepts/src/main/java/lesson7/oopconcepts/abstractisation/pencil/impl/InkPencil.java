package lesson7.oopconcepts.abstractisation.pencil.impl;

import lesson7.oopconcepts.abstractisation.pencil.Pencil;
import lesson7.oopconcepts.abstractisation.pencil.RefillPencil;
import lesson7.oopconcepts.abstractisation.pencil.Shape;

public class InkPencil extends Pencil implements RefillPencil {

    private boolean havingCap;

    public InkPencil(String inkType, String color, boolean havingCap) {
        super(inkType, color);
        this.havingCap = havingCap;
    }

    @Override
    public void refill() {
        System.out.printf("More ink is added of %s color is added%n", getColor());
    }

    @Override
    public String drawShape(Shape shape) {
        if (havingCap) {
            return "Remove the cap at first";
        }
        return String.format("%s is drown on paper in %s color", shape.getShape(), getColor());
    }

    public boolean isHavingCap() {
        return havingCap;
    }

    public void setHavingCap(boolean havingCap) {
        this.havingCap = havingCap;
    }
}
