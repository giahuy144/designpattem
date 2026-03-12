package main.java.com.giahuy.designpattem.BikeParts.Factory;

import main.java.com.giahuy.designpattem.BikeParts.Wheel.ElectricBikeWheel;
import main.java.com.giahuy.designpattem.BikeParts.Wheel.Wheel;

public class ElectricBikeFactory implements BikeFactory {

    @Override
    public Wheel getWheel() {
        return new ElectricBikeWheel();
    }
}