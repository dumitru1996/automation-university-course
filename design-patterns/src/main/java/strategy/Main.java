package strategy;

public class Main {

    public static void main(String[] args) {
        Navigator navigator = new Navigator();

        String pointA = "Roses street";
        String pointB = "Happiness street";

        WalkStrategy routeStrategy = new WalkStrategy();
        DriveStrategy driveStrategy = new DriveStrategy();
        //1 choose the strategy
        //2 apply required conditions(our case choose the route)
        navigator.setRouteStrategy(routeStrategy);
        //3 get result of applied strategy
        System.out.println(navigator.createRoute(pointA, pointB));
    }

}
