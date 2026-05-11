package main.java.com.giahuy.designpattem.STRUCTURALPATTERN.BridgePattern;

public class MainApp {

    public static void main(String[] args) {

        Shape shape1 = new Circle(new Red());
        Shape shape2 = new Triangle(new Blue());

        shape1.draw();
        shape2.draw();
    }
}