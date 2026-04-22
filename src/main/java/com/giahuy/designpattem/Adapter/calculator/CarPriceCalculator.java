package main.java.com.giahuy.designpattem.Structural_pattern_ex1.Adapter.calculator;

public class CarPriceCalculator implements PriceCalculator{
    public double calculatePrice() {
        return 20000; // USD
    }
}