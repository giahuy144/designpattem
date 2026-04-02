package main.java.com.giahuy.designpattem.Creational_pattern_ex3.BikeParts.BikeParts.Factory;

import main.java.com.giahuy.designpattem.Creational_pattern_ex3.BikeParts.BikeParts.Wheel.ElectricBikeWheel;
import main.java.com.giahuy.designpattem.Creational_pattern_ex3.BikeParts.BikeParts.Wheel.Wheel;

public class ElectricBikeFactory implements BikeFactory {

    @Override
    public Wheel getWheel() {
        return new ElectricBikeWheel();
    }
}