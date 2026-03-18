package main.java.com.giahuy.designpattem.Adapter.calculator;

public class CarPriceCalculator implements PriceCalculator {

    @Override
    public double calculatePrice() {
        return 20000;
    }
}