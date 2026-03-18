package main.java.com.giahuy.designpattem.Adapter.adapter;

import main.java.com.giahuy.designpattem.Adapter.calculator.PriceCalculator;
import main.java.com.giahuy.designpattem.Adapter.external.UKCarPriceCalculator;

public class UKCarPriceAdapter implements PriceCalculator {

    private UKCarPriceCalculator calculator;

    public UKCarPriceAdapter() {
        calculator = new UKCarPriceCalculator();
    }

    @Override
    public double calculatePrice() {
        return calculator.getPrice();
    }
}