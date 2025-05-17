package StructuralDesignPatterns.DecoratorPattern;

public class StuffedCrust extends PizzaDecorator{
    public StuffedCrust(Pizza pizza) {
        super(pizza);
    }
    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Stuffed Crust";
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 80;
    }
}
