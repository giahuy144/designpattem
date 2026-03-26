package main.java.com.giahuy.designpattem.buttonbridge.size;

public class SmallSize implements ButtonSize {
    @Override
    public void setSize() {
        System.out.print("Size: Small - ");
    }
}