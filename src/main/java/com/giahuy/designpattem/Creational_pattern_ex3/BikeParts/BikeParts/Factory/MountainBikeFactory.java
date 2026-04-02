package main.java.com.giahuy.designpattem.Creational_pattern_ex3.BikeParts.BikeParts.Factory;

import main.java.com.giahuy.designpattem.Creational_pattern_ex3.BikeParts.BikeParts.Wheel.MountainBikeWheel;
import main.java.com.giahuy.designpattem.Creational_pattern_ex3.BikeParts.BikeParts.Wheel.Wheel;

public class MountainBikeFactory implements BikeFactory {

    @Override
    public Wheel getWheel() {
        return new MountainBikeWheel();
    }
}
