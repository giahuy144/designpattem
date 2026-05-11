package main.java.com.giahuy.designpattem.STRUCTURALPATTERN.BridgePattern;

public abstract class Shape {

    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public abstract void draw();
}