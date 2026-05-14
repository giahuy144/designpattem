package main.java.com.giahuy.designpattem.BEHAVIOURALPATTERN.Iterator;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class InStockIterator implements Iterator<Item> {
    private List<Item> inventoryList;
    private int currentIndex = 0;
    //Iterator cho phép duyệt qua các phần tử trong collection mà không cần biết bên trong như thế nào

    public InStockIterator(List<Item> inventoryList) {
        this.inventoryList = inventoryList;
    }

    @Override
    public boolean hasNext() {
        // nếu item hiện tại hết hàng, tự động skip
        while (currentIndex < inventoryList.size() && !inventoryList.get(currentIndex).isInStock()) {
            currentIndex++;
        }

        return currentIndex < inventoryList.size();
    }

    @Override
    public Item next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        // trả item hiện tại rôi tăng index
        return inventoryList.get(currentIndex++);
    }
}