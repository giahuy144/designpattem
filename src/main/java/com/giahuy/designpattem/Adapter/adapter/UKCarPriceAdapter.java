package main.java.com.giahuy.designpattem.Adapter.adapter;

import main.java.com.giahuy.designpattem.Adapter.calculator.PriceCalculator;
import main.java.com.giahuy.designpattem.Adapter.external.UKCarPriceCalculator;

public class UKCarPriceAdapter implements PriceCalculator {

    private UKCarPriceCalculator calculator;
    //cầu nối giữa pricecalculator và UKCarPriceCalculator
    public UKCarPriceAdapter() {
        calculator = new UKCarPriceCalculator();
    }
    //nhận request calculateprice(), gọi getprice của class ngoài để trả kết quả
    @Override
    public double calculatePrice() {
        return calculator.getPrice();
    }
}