package factory;

public class Train implements Transport{

    @Override
    public void startEngine() {
        System.out.println(TransportType.TRAIN+" Start on reelways ");
    }
}
