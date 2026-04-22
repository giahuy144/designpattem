package main.java.com.giahuy.designpattem.BridgePattern.abstraction;

import main.java.com.giahuy.designpattem.BridgePattern.implementor.Color;

public abstract class Shape {

    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public abstract void draw();
}