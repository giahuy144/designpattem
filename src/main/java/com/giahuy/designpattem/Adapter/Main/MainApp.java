package main.java.com.giahuy.designpattem.Adapter.Main;

import main.java.com.giahuy.designpattem.Adapter.adapter.UKCarPriceAdapter;
import main.java.com.giahuy.designpattem.Adapter.calculator.CarPriceCalculator;
import main.java.com.giahuy.designpattem.Adapter.calculator.PriceCalculator;
import main.java.com.giahuy.designpattem.Adapter.calculator.TruckPriceCalculator;

public class MainApp {

    public static void main(String[] args) {

        PriceCalculator car = new CarPriceCalculator();
        PriceCalculator truck = new TruckPriceCalculator();
        PriceCalculator ukCar = new UKCarPriceAdapter();

        System.out.println(car.calculatePrice());
        System.out.println(truck.calculatePrice());
        System.out.println(ukCar.calculatePrice());
    }
}