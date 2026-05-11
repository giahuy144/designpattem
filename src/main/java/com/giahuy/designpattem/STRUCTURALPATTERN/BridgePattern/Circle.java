package main.java.com.giahuy.designpattem.STRUCTURALPATTERN.BridgePattern;

public class Circle extends Shape {

    public Circle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.print("Drawing Circle - ");
        color.applyColor();
    }
}