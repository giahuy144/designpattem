package main.java.com.giahuy.designpattem.Structural_pattern_ex6.ProxyPattern;


import main.java.com.giahuy.designpattem.Structural_pattern_ex6.ProxyPattern.service.Inventory;
import main.java.com.giahuy.designpattem.Structural_pattern_ex6.ProxyPattern.service.InventoryProxy;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        long start = System.currentTimeMillis();

        // ✅ PROXY: khởi tạo tức thì, không đụng DB
        Inventory inventory = new InventoryProxy();

        long afterInit = System.currentTimeMillis();
        System.out.println("[App] Started in " + (afterInit - start) + "ms (Proxy created, no DB call yet)");

        // Ứng dụng làm việc khác mà không cần inventory...
        System.out.println("[App] Loading promotions page...");
        Thread.sleep(500);
        System.out.println("[App] Serving customer at checkout...");
        Thread.sleep(500);

        // Chỉ khi user thực sự click "View Inventory"
        System.out.println("\n[User] Clicked 'View Inventory' button.");
        inventory.displayInventory();  // ← DB được gọi tại đây

        // Lần gọi thứ hai: dùng cached instance
        System.out.println("\n[User] Clicked 'Refresh Inventory'.");
        inventory.displayInventory();  // ← không gọi DB lại
    }
}