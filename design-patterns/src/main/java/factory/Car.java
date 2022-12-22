package factory;




public class Car implements Transport {

    @Override
    public void startEngine() {
        System.out.println(TransportType.CAR+" Runs on the road");
    }
}
