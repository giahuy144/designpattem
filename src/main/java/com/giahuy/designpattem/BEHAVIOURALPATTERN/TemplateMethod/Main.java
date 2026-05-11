package main.java.com.giahuy.designpattem.BEHAVIOURALPATTERN.TemplateMethod;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Margherita ===");
        new MargheritaPizza().makePizza();

        System.out.println("=== Pepperoni ===");
        new PepperoniPizza().makePizza();
    }
}
