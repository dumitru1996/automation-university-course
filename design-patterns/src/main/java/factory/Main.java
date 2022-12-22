package factory;

import static factory.TransportType.CAR;
import static factory.TransportType.TRAIN;

public class Main {
    public static void main(String[] args) {
        TransportFactory transportFactory = new TransportFactory();
        //1 declare train type of Transport
        //2 instantiate train object through create method of transportFactory
        //3 choose right type of object to instantiate
        Transport train =  transportFactory.createTransport(TRAIN);
        Transport car = transportFactory.createTransport(CAR);
        train.startEngine();//call the methods of object to perform
        car.startEngine();
    }
}
