package strategy;

public class DriveStrategy implements IRouteStrategy {//apply a concrete strategy

    @Override
    public String buildRoute(String pointA, String pointB) {
        return "Drive from " + pointA + " to " + pointB;
    }

}
