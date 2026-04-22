package main.java.com.giahuy.designpattem.Structural_pattern_ex1.Adapter.calculator;

public class TruckPriceCalculator implements PriceCalculator {
    public double calculatePrice() {
        return 40000; // USD
    }
}