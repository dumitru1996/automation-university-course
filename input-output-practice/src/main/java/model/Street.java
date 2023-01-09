package model;

import java.io.Serializable;

public class Street implements Serializable {

    final City city;
    final String streetName;
    final int numberOfBuildings;

    public Street(String city, String streetName, int numberOfBuildings) {
        this.city = new City(city);
        this.streetName = streetName;
        this.numberOfBuildings = numberOfBuildings;
    }
}
