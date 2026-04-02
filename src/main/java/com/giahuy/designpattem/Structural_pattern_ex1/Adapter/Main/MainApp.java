package main.java.com.giahuy.designpattem.Structural_pattern_ex1.Adapter.Main;

import main.java.com.giahuy.designpattem.Structural_pattern_ex1.Adapter.adapter.UKCarPriceAdapter;
import main.java.com.giahuy.designpattem.Structural_pattern_ex1.Adapter.calculator.CarPriceCalculator;
import main.java.com.giahuy.designpattem.Structural_pattern_ex1.Adapter.calculator.PriceCalculator;
import main.java.com.giahuy.designpattem.Structural_pattern_ex1.Adapter.calculator.TruckPriceCalculator;

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