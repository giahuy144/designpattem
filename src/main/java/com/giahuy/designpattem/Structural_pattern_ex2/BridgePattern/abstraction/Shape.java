package main.java.com.giahuy.designpattem.Structural_pattern_ex2.BridgePattern.abstraction;

import main.java.com.giahuy.designpattem.Structural_pattern_ex2.BridgePattern.implementor.Color;

public abstract class Shape {

    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public abstract void draw();
}