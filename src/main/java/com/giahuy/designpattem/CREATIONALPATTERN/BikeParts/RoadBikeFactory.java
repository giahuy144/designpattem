package main.java.com.giahuy.designpattem.CREATIONALPATTERN.BikeParts;

public class RoadBikeFactory implements BikeFactory {
    @Override
    public Wheel getWheel() {

        return new RoadBikeWheel();
    }
}