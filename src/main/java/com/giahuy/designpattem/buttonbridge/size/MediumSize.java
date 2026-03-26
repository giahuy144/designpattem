package main.java.com.giahuy.designpattem.buttonbridge.size;

public class MediumSize implements ButtonSize {
    @Override
    public void setSize() {
        System.out.print("Size: Medium - ");
    }
}