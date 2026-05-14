package main.java.com.giahuy.designpattem.BEHAVIOURALPATTERN.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Inventory implements Iterable<Item> {
    //Inventory implements Iterable<Item>
    private List<Item> items = new ArrayList<>();
    public void addItem(Item item) {
        items.add(item);
    }

    // Overide trả về new InStockIterator(items)
    //khi duyệt for-each java sẽ gọi iterator này
    @Override
    public Iterator<Item> iterator() {
        return new InStockIterator(items);
    }
}