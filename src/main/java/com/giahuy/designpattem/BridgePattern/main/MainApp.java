package main.java.com.giahuy.designpattem.BridgePattern.main;

import main.java.com.giahuy.designpattem.BridgePattern.abstraction.Shape;
import main.java.com.giahuy.designpattem.BridgePattern.concreteimplementor.Blue;
import main.java.com.giahuy.designpattem.BridgePattern.concreteimplementor.Red;
import main.java.com.giahuy.designpattem.BridgePattern.refinedabstraction.Circle;
import main.java.com.giahuy.designpattem.BridgePattern.refinedabstraction.Triangle;

public class MainApp {

    public static void main(String[] args) {

        Shape shape1 = new Circle(new Red());
        Shape shape2 = new Triangle(new Blue());

        shape1.draw();
        shape2.draw();
    }
}