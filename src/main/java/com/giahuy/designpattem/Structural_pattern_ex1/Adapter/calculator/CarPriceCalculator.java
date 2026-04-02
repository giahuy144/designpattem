package main.java.com.giahuy.designpattem.Structural_pattern_ex1.Adapter.calculator;

public class CarPriceCalculator implements PriceCalculator {

    @Override
    public double calculatePrice() {
        return 20000;
    }
}