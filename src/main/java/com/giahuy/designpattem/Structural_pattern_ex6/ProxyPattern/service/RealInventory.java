package main.java.com.giahuy.designpattem.Structural_pattern_ex6.ProxyPattern.service;

import main.java.com.giahuy.designpattem.Structural_pattern_ex6.ProxyPattern.model.Item;

import java.util.ArrayList;
import java.util.List;

public class RealInventory implements Inventory {

    private List<Item> items;

    public RealInventory() {
        loadFromDatabase();
    }

    private void loadFromDatabase() {
        System.out.println(" Loading inventory from DATABASE...");

        items = new ArrayList<>();

        // giả lập dữ liệu lớn
        items.add(new Item("Milk", 2.5));
        items.add(new Item("Bread", 1.2));
        items.add(new Item("Eggs", 3.0));
    }

    @Override
    public List<Item> getItems() {
        return items;
    }
}