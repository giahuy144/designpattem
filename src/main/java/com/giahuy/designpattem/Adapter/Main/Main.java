package main.java.com.giahuy.designpattem.Adapter.Main;

import main.java.com.giahuy.designpattem.Adapter.adapter.UKCarPriceAdapter;
import main.java.com.giahuy.designpattem.Adapter.calculator.CarPriceCalculator;
import main.java.com.giahuy.designpattem.Adapter.calculator.PriceCalculator;
import main.java.com.giahuy.designpattem.Adapter.calculator.TruckPriceCalculator;
import main.java.com.giahuy.designpattem.Adapter.external.UKCarPriceCalculator;

public class Main {
    public static void main(String[] args) {

        PriceCalculator car = new CarPriceCalculator();
        PriceCalculator truck = new TruckPriceCalculator();

        UKCarPriceCalculator ukCar = new UKCarPriceCalculator();
        PriceCalculator ukAdapter = new UKCarPriceAdapter(ukCar);

        System.out.println("Car: " + car.calculatePrice());
        System.out.println("Truck: " + truck.calculatePrice());
        System.out.println("UK Car (converted): " + ukAdapter.calculatePrice());
    }
}