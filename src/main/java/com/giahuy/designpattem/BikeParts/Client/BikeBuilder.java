package main.java.com.giahuy.designpattem.BikeParts.Client;

import main.java.com.giahuy.designpattem.BikeParts.Factory.BikeFactory;
import main.java.com.giahuy.designpattem.BikeParts.Wheel.Wheel;

public class BikeBuilder {

    private BikeFactory Factory;

    public BikeBuilder(BikeFactory factory) {
        this.Factory = factory;
    }

    public void buildBike() {
        Wheel wheel = Factory.getWheel();
        wheel.spin();
    }
}