package factory;

public class TransportFactory {//creator class

    public Transport createTransport(TransportType transportType) {//method to choose with object to instantiate(factory method)
        switch (transportType) {
            case CAR:
                return new Car();
            case PLANE:
                return new Plane();
            case SHIP:
                return new Ship();
            case TRAIN:
                return new Train();
            default:
                throw new RuntimeException("Unsupported transport type " + transportType);
        }
    }
}
