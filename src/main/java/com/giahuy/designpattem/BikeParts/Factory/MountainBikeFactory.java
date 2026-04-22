package main.java.com.giahuy.designpattem.BikeParts.Factory;

import main.java.com.giahuy.designpattem.BikeParts.Wheel.MountainBikeWheel;
import main.java.com.giahuy.designpattem.BikeParts.Wheel.Wheel;

public class MountainBikeFactory implements BikeFactory{
    @Override
    public Wheel getWheel() {
        return new MountainBikeWheel();
    }
}
