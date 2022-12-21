package factory;

public class Ship implements Transport {

    @Override
    public void startEngine() {
        System.out.println(TransportType.SHIP+" Start on water ");
    }
}
