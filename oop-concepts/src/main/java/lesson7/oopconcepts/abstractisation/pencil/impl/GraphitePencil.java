package lesson7.oopconcepts.abstractisation.pencil.impl;

import lesson7.oopconcepts.abstractisation.pencil.Pencil;
import lesson7.oopconcepts.abstractisation.pencil.RefillPencil;
import lesson7.oopconcepts.abstractisation.pencil.Shape;

public class GraphitePencil extends Pencil implements RefillPencil {

    private boolean havingRazor;

    public GraphitePencil(String inkType, String color, boolean havingRazor) {
        super(inkType, color);
        this.havingRazor = havingRazor;
    }

    @Override
    public String drawShape(Shape shape) {
        return String.format("%s is drown on a paper By Graphite pencil", shape.getShape());
    }

    @Override
    public void refill() {
        System.out.println("The Pencil is sharpened");
    }

    public boolean isHavingRazorRazor() {
        return havingRazor;
    }

    public void setHaveRazor(boolean havingRazor) {
        this.havingRazor = havingRazor;
    }
}
