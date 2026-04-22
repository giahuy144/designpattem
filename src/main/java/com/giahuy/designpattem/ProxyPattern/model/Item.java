package main.java.com.giahuy.designpattem.Structural_pattern_ex6.ProxyPattern.model;

public class Item {
    private final String name;
    private final double price;
    private final int quantity;

    public Item(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return String.format("%-20s $%.2f  (qty: %d)", name, price, quantity);
    }
}