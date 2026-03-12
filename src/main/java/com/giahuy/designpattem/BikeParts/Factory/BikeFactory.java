package main.java.com.giahuy.designpattem.BikeParts.Factory;

import main.java.com.giahuy.designpattem.BikeParts.Wheel.Wheel;

public interface BikeFactory {
    Wheel getWheel();
}
