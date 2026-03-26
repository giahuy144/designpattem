package main.java.com.giahuy.designpattem.buttonbridge.size;

public class LargeSize implements ButtonSize {
    @Override
    public void setSize() {
        System.out.print("Size: Large - ");
    }
}