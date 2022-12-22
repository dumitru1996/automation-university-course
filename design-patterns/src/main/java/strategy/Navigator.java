package strategy;

public class Navigator {//context class

    private IRouteStrategy routeStrategy;

    public void setRouteStrategy(IRouteStrategy routeStrategy) {
        this.routeStrategy = routeStrategy;
    }

    public String createRoute(String pointA, String pointB) {//uses strategy interface to communicate with another implementation of this interface
        System.out.printf("\nRoute strategy: %s \n", routeStrategy.getClass().getSimpleName());
        return routeStrategy.buildRoute(pointA, pointB);
    }
}
