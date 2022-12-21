package strategy;

public class WalkStrategy implements IRouteStrategy {

    @Override
    public String buildRoute(String pointA, String pointB) {
        return "Walk from " + pointA + " to " + pointB;
    }

}
