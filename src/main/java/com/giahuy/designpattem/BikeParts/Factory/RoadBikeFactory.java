package main.java.com.giahuy.designpattem.BikeParts.Factory;

import main.java.com.giahuy.designpattem.BikeParts.Wheel.RoadBikeWheel;
import main.java.com.giahuy.designpattem.BikeParts.Wheel.Wheel;

public class RoadBikeFactory implements BikeFactory{
    @Override
    public Wheel getWheel() {
        return new RoadBikeWheel();
    }
}