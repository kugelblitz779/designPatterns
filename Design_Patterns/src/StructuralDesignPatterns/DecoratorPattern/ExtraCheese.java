package StructuralDesignPatterns.DecoratorPattern;

public class ExtraCheese extends PizzaDecorator {
    public ExtraCheese(Pizza pizza) {
        super(pizza);
    }
    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Extra Cheese";
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 25.0;
    }
}
