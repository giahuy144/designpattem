package main.java.com.giahuy.designpattem.Structural_pattern_ex6.ProxyPattern;

import main.java.com.giahuy.designpattem.Structural_pattern_ex6.ProxyPattern.service.Inventory;
import main.java.com.giahuy.designpattem.Structural_pattern_ex6.ProxyPattern.service.InventoryProxy;

public class Main {
    public static void main(String[] args) {

        Inventory inventory = new InventoryProxy();

        System.out.println(" App started...");

        // Chưa load DB

        System.out.println(" Doing something else...");

        // Chỉ khi cần mới load
        System.out.println(" Access inventory:");
        System.out.println(inventory.getItems());
    }
}