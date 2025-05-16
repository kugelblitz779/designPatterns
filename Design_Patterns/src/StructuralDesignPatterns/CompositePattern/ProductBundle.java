package StructuralDesignPatterns.CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class ProductBundle implements CartItem{
    String bundleName;
    List<CartItem> items = new ArrayList<>();

    public ProductBundle(String bundleName) {
        this.bundleName = bundleName;
    }

    public void addItem(CartItem item) {
        items.add(item);
    }

    @Override
    public double getPrice() {
        double total = 0;
        for(CartItem item : items) {
            total += item.getPrice();
        }
        return total;
    }

    @Override
    public void display() {
        System.out.println("Product Bundle: " + bundleName + ", total price: " + getPrice());
    }
}
