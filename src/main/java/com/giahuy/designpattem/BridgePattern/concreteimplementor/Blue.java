package main.java.com.giahuy.designpattem.BridgePattern.concreteimplementor;

import main.java.com.giahuy.designpattem.BridgePattern.implementor.Color;

public class Blue implements Color {
    @Override
    public void applyColor() {
        System.out.println("Color: Blue");
    }
}