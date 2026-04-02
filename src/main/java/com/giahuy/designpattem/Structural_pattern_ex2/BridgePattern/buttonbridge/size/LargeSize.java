package main.java.com.giahuy.designpattem.Structural_pattern_ex2.BridgePattern.buttonbridge.size;

public class LargeSize implements ButtonSize {
    @Override
    public void setSize() {
        System.out.print("Size: Large - ");
    }
}