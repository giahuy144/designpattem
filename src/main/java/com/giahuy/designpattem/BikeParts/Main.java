package main.java.com.giahuy.designpattem.Creational_pattern_ex3.BikeParts.BikeParts;

import main.java.com.giahuy.designpattem.Creational_pattern_ex3.BikeParts.BikeParts.Client.BikeBuilder;
import main.java.com.giahuy.designpattem.Creational_pattern_ex3.BikeParts.BikeParts.Factory.MountainBikeFactory;
import main.java.com.giahuy.designpattem.Creational_pattern_ex3.BikeParts.BikeParts.Factory.RoadBikeFactory;

public class Main {
    public static void main(String[] args) {

        BikeBuilder builder = new BikeBuilder();

        System.out.println("Build Mountain Bike");
        builder.buildBike(new MountainBikeFactory());

        System.out.println();

        System.out.println("Build Road Bike");
        builder.buildBike(new RoadBikeFactory());

    }
}