package main.java.com.giahuy.designpattem.Structural_pattern_ex2.BridgePattern.refinedabstraction;

import main.java.com.giahuy.designpattem.Structural_pattern_ex2.BridgePattern.abstraction.Shape;
import main.java.com.giahuy.designpattem.Structural_pattern_ex2.BridgePattern.implementor.Color;

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