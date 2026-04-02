package main.java.com.giahuy.designpattem.Structural_pattern_ex6.ProxyPattern.service;

import main.java.com.giahuy.designpattem.Structural_pattern_ex6.ProxyPattern.model.Item;

import java.util.List;

public class InventoryProxy implements Inventory {

    private RealInventory realInventory;

    @Override
    public List<Item> getItems() {

        if (realInventory == null) {
            System.out.println("🟡 Proxy: Creating real inventory...");
            realInventory = new RealInventory();
        }

        return realInventory.getItems();
    }
}