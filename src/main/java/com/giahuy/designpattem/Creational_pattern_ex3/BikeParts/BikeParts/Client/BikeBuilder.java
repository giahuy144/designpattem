package main.java.com.giahuy.designpattem.Creational_pattern_ex3.BikeParts.BikeParts.Client;

import main.java.com.giahuy.designpattem.Creational_pattern_ex3.BikeParts.BikeParts.Factory.BikeFactory;
import main.java.com.giahuy.designpattem.Creational_pattern_ex3.BikeParts.BikeParts.Wheel.Wheel;

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