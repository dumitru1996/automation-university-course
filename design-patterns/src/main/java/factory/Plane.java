package factory;

import static factory.TransportType.PLANE;

public class Plane implements Transport {

    @Override
    public void startEngine() {
        System.out.println(PLANE+" Starts in the air ");
    }
}
