package main.java.com.giahuy.designpattem.Structural_pattern_ex6.ProxyPattern.service;

public class InventoryProxy implements Inventory {
    private RealInventory realInventory;  // null cho đến khi thực sự cần

    @Override
    public void displayInventory() {
        if (realInventory == null) {
            // Lazy initialization — chỉ tạo khi được gọi lần đầu
            System.out.println("[Proxy] First access detected. Initializing RealInventory...");
            realInventory = new RealInventory();
        } else {
            System.out.println("[Proxy] Using cached RealInventory instance.");
        }
        realInventory.displayInventory();
    }
}