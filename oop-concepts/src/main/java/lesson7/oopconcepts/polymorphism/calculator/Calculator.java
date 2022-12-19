package lesson7.oopconcepts.polymorphism.calculator;

public class Calculator {
    //examples of overloading
    public double add(double a, double b){
        return a + b;
    }

    public int add(int a, int b){
        return a + b;
    }

    public double add(double a, int b){
        return a + b;
    }

    public double add(int a, double b){
        return a + b;
    }

    public int add(short a, short b){
        return (int) a + b;
    }
}
