package main.java.com.giahuy.designpattem.Structural_pattern_ex1.Adapter.Main;

import main.java.com.giahuy.designpattem.Structural_pattern_ex1.Adapter.adapter.UKCarPriceAdapter;
import main.java.com.giahuy.designpattem.Structural_pattern_ex1.Adapter.calculator.CarPriceCalculator;
import main.java.com.giahuy.designpattem.Structural_pattern_ex1.Adapter.calculator.PriceCalculator;
import main.java.com.giahuy.designpattem.Structural_pattern_ex1.Adapter.calculator.TruckPriceCalculator;
import main.java.com.giahuy.designpattem.Structural_pattern_ex1.Adapter.external.UKCarPriceCalculator;

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