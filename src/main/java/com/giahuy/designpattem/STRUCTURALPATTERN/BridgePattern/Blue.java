package main.java.com.giahuy.designpattem.STRUCTURALPATTERN.BridgePattern;

public class Blue implements Color {
    @Override
    public void applyColor() {
        System.out.println("Color: Blue");
    }
}