package StructuralDesignPatterns.CompositePattern;

public class Product implements CartItem{
    String productName;
    double price;

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public void display() {
        System.out.println("Product Name: " + productName + ", Price: " + price);
    }
}
