package main.java.com.giahuy.designpattem.Adapter.adapter;

import main.java.com.giahuy.designpattem.Adapter.calculator.PriceCalculator;
import main.java.com.giahuy.designpattem.Adapter.external.UKCarPriceCalculator;

public class UKCarPriceAdapter implements PriceCalculator{
    private UKCarPriceCalculator ukCalculator;

    public UKCarPriceAdapter(UKCarPriceCalculator ukCalculator) {
        this.ukCalculator = ukCalculator;
    }

    @Override
    public double calculatePrice() {
        double priceGBP = ukCalculator.getPrice();

        // giả sử 1 GBP = 1.3 USD
        return priceGBP * 1.3;
    }
}