package main.java.com.giahuy.designpattem.BridgePattern.refinedabstraction;

import main.java.com.giahuy.designpattem.BridgePattern.abstraction.Shape;
import main.java.com.giahuy.designpattem.BridgePattern.implementor.Color;

public class Triangle extends Shape {

    public Triangle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.print("Drawing Triangle - ");
        color.applyColor();
    }
}