package lesson4.basics_of_programming;

public class Car {
    String model; // instance variable
    String color;
    int year;
    double engineCapacity;
    double price;

    static String dealerCompany = "Super Lux Auto"; //class variable

    public Car(String model, String color, int year, double engineCapacity, double price) {
        this.model = model;
        this.color = color;
        this.year = year;
        this.engineCapacity = engineCapacity;
        this.price = price;
    }

    public Car(String model, double engineCapacity, double price) {
        this.model = model;
        this.color = "Unknown";
        this.year = 0;
        this.engineCapacity = engineCapacity;
        this.price = price;
    }

    public Car() {
    }

    Car honda = new Car("Honda Civic","Blue", 2009, 1.339,4999.99);

    public static void main(String[] args) {

    }

}
