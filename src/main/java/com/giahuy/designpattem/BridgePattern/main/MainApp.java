package main.java.com.giahuy.designpattem.Structural_pattern_ex2.BridgePattern.main;

import main.java.com.giahuy.designpattem.Structural_pattern_ex2.BridgePattern.abstraction.Shape;
import main.java.com.giahuy.designpattem.Structural_pattern_ex2.BridgePattern.concreteimplementor.Blue;
import main.java.com.giahuy.designpattem.Structural_pattern_ex2.BridgePattern.concreteimplementor.Red;
import main.java.com.giahuy.designpattem.Structural_pattern_ex2.BridgePattern.refinedabstraction.Circle;
import main.java.com.giahuy.designpattem.Structural_pattern_ex2.BridgePattern.refinedabstraction.Triangle;

public class MainApp {

    public static void main(String[] args) {

        Shape shape1 = new Circle(new Red());
        Shape shape2 = new Triangle(new Blue());

        shape1.draw();
        shape2.draw();
    }
}