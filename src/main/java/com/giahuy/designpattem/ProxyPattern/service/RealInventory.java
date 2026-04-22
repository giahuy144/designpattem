package main.java.com.giahuy.designpattem.ProxyPattern.service;


import main.java.com.giahuy.designpattem.ProxyPattern.model.Item;

import java.util.ArrayList;
import java.util.List;

public class RealInventory implements Inventory {
    private List<Item> items;

    public RealInventory() {
        loadFromDatabase();  // ← đây là phần TỐN TÀI NGUYÊN
    }

    private void loadFromDatabase() {
        System.out.println("[DB] Connecting to database...");
        System.out.println("[DB] Fetching inventory data... (simulated 2s delay)");

        // Giả lập độ trễ của DB thực tế
        try { Thread.sleep(2000); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }

        this.items = new ArrayList<>(List.of(
                new Item("Whole Milk 1L",    1.20, 150),
                new Item("Sourdough Bread",  2.50,  60),
                new Item("Free-Range Eggs",  3.80,  90),
                new Item("Beef Mince 500g",  5.40,  40),
                new Item("Organic Apples",   2.10, 200)
        ));

        System.out.println("[DB] Inventory loaded successfully. " + items.size() + " items.\n");
    }

    @Override
    public void displayInventory() {
        System.out.println("=== SUPERMARKET INVENTORY ===");
        items.forEach(System.out::println);
        System.out.println("=============================");
    }
}