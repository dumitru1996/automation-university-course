package lesson7.oopconcepts.abstractisation.pencil;

import lesson7.oopconcepts.abstractisation.pencil.impl.GraphitePencil;
import lesson7.oopconcepts.abstractisation.pencil.impl.InkPencil;

public class Main {

    public static void main(String[] args) {
        GraphitePencil graphitePencil = new GraphitePencil("graphite", "black", true);
        InkPencil inkPencil = new InkPencil("oil ink", "blue", true);
        Stylus stylus = new Stylus("digital", "Black", "Dashed Line");
        Shape circle = new Shape("Circle");

        System.out.println(graphitePencil.drawShape(circle));
        graphitePencil.refill();

        System.out.println(inkPencil.drawShape(circle));
        inkPencil.setHavingCap(false);
        System.out.println(inkPencil.drawShape(circle));
        inkPencil.refill();

        System.out.println(stylus.drawShape(circle));

    }
}
