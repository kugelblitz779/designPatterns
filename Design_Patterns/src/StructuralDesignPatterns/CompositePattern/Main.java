package StructuralDesignPatterns.CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Product iphone  = new Product("Iphone 15", 50000);
        Product book = new Product("Atomic Habits", 299);
        Product earBuds = new Product("Airpods", 15999);

        ProductBundle iphoneCombo = new ProductBundle("Iphone Combo");
        iphoneCombo.addItem(iphone);
        iphoneCombo.addItem(earBuds);

        List<CartItem> cart = new ArrayList<>();
        cart.add(book);
        cart.add(iphoneCombo);

        double totalAmount = 0;
        for(CartItem cartItem : cart) {
            totalAmount += cartItem.getPrice();
        }
        System.out.println(totalAmount);
        iphoneCombo.display();
        iphone.display();
    }
}
