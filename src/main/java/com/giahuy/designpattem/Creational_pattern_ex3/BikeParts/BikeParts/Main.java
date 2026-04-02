package main.java.com.giahuy.designpattem.Creational_pattern_ex3.BikeParts.BikeParts;

import main.java.com.giahuy.designpattem.Creational_pattern_ex3.BikeParts.BikeParts.Client.BikeBuilder;
import main.java.com.giahuy.designpattem.Creational_pattern_ex3.BikeParts.BikeParts.Factory.BikeFactory;
import main.java.com.giahuy.designpattem.Creational_pattern_ex3.BikeParts.BikeParts.Factory.ElectricBikeFactory;
import main.java.com.giahuy.designpattem.Creational_pattern_ex3.BikeParts.BikeParts.Factory.MountainBikeFactory;
import main.java.com.giahuy.designpattem.Creational_pattern_ex3.BikeParts.BikeParts.Factory.RoadBikeFactory;

public class Main {

    public static void main(String[] args) {

        BikeFactory mountainFactory = new MountainBikeFactory();
        BikeBuilder mountainBike = new BikeBuilder(mountainFactory);
        mountainBike.buildBike();

        BikeFactory roadFactory = new RoadBikeFactory();
        BikeBuilder roadBike = new BikeBuilder(roadFactory);
        roadBike.buildBike();

        BikeFactory electricFactory = new ElectricBikeFactory();
        BikeBuilder electricBike = new BikeBuilder(electricFactory);
        electricBike.buildBike();
    }
}