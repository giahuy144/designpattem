package main.java.com.giahuy.designpattem.Structural_pattern_ex2.BridgePattern.concreteimplementor;

import main.java.com.giahuy.designpattem.Structural_pattern_ex2.BridgePattern.implementor.Color;

public class Red implements Color {
    @Override
    public void applyColor() {
        System.out.println("Color: Red");
    }
}
