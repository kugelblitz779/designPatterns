package StructuralDesignPatterns.DecoratorPattern;

public class PlainPizza implements Pizza {

    @Override
    public String getDescription() {
        return "Plain Pizza";
    }

    @Override
    public double getPrice() {
        return 200.0;
    }
}
