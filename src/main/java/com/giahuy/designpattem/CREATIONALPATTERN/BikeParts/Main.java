package main.java.com.giahuy.designpattem.CREATIONALPATTERN.BikeParts;

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