package main.java.com.giahuy.designpattem.STRUCTURALPATTERN.BridgePattern;

public class Red implements Color {
    @Override
    public void applyColor() {
        System.out.println("Color: Red");
    }
}
