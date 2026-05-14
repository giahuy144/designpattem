package main.java.com.giahuy.designpattem.BEHAVIOURALPATTERN.Iterator;

public class Main {
    public static void main(String[] args) {
        //Tạo kho hàng
        Inventory warehouse = new Inventory();

        //Thêm item
        warehouse.addItem(new Item("Laptop", true));
        warehouse.addItem(new Item("Graphics Card", false)); // Out of stock
        warehouse.addItem(new Item("Mechanical Keyboard", true));
        warehouse.addItem(new Item("Gaming Mouse", false));  // Out of stock
        warehouse.addItem(new Item("Monitor", true));

        System.out.println("--- Available Items in Warehouse ---");

        //khi chạy java tự động gọi "warehouse.iterator()" và nhận Instockiterator
        for (Item item : warehouse) {
            System.out.println("Available: " + item.getName());
        }
    }
}