package main.java.com.giahuy.designpattem.Creational_pattern_ex3.BikeParts.BikeParts.Factory;

import main.java.com.giahuy.designpattem.Creational_pattern_ex3.BikeParts.BikeParts.Wheel.Wheel;

public interface BikeFactory {
    Wheel getWheel();
}