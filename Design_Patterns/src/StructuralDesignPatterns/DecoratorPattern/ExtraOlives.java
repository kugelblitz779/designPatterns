package StructuralDesignPatterns.DecoratorPattern;

public class ExtraOlives extends PizzaDecorator{
    public ExtraOlives(Pizza pizza) {
        super(pizza);
    }
    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Extra Olives";
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 40.0;
    }
}
