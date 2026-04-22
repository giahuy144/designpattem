package main.java.com.giahuy.designpattem.BikeParts.Client;

import main.java.com.giahuy.designpattem.BikeParts.Factory.BikeFactory;
import main.java.com.giahuy.designpattem.BikeParts.Wheel.Wheel;

public class BikeBuilder {
    public void buildBike(BikeFactory factory) {

        Wheel wheel = factory.getWheel();

        wheel.createWheel();

        System.out.println("Bike duoc tao thanh cong!");
    }
}