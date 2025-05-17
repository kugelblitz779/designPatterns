package StructuralDesignPatterns.DecoratorPattern;

public class Main {
    public static void main(String[] args) {

        Pizza pizza = new PlainPizza();
        Pizza olivePizza = new ExtraOlives(pizza);
        Pizza cheesePizza = new ExtraCheese(pizza);
        Pizza oliveCheesePizza = new ExtraOlives(cheesePizza);
        Pizza olivePizzaWithStuffedCrust = new StuffedCrust(olivePizza);


        System.out.println("Olive Pizza details: " + olivePizza.getDescription() + " = " + olivePizza.getPrice());
        System.out.println("Cheese Pizza details: " + cheesePizza.getDescription() + " = " + cheesePizza.getPrice());
        System.out.println("Olive Cheese Pizza details: " + oliveCheesePizza.getDescription() + " = " + oliveCheesePizza.getPrice());
        System.out.println("Olive Pizza with Stuffed crust details: " + olivePizzaWithStuffedCrust.getDescription() + " = " + olivePizzaWithStuffedCrust.getPrice());
    }
}
