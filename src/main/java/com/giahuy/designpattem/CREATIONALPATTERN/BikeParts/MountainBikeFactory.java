package main.java.com.giahuy.designpattem.CREATIONALPATTERN.BikeParts;

public class MountainBikeFactory implements BikeFactory {
    @Override
    public Wheel getWheel() {
        //tạo bánh xe địa hình
        return new MountainBikeWheel();
    }
}
