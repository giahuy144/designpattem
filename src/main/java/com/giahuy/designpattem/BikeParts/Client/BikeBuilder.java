package main.java.com.giahuy.designpattem.Creational_pattern_ex3.BikeParts.BikeParts.Client;

import main.java.com.giahuy.designpattem.Creational_pattern_ex3.BikeParts.BikeParts.Factory.BikeFactory;
import main.java.com.giahuy.designpattem.Creational_pattern_ex3.BikeParts.BikeParts.Wheel.Wheel;

public class BikeBuilder {
    public void buildBike(BikeFactory factory) {

        Wheel wheel = factory.getWheel();

        wheel.createWheel();

        System.out.println("Bike duoc tao thanh cong!");
    }
}