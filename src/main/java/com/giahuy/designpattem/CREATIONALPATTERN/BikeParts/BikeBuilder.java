package main.java.com.giahuy.designpattem.CREATIONALPATTERN.BikeParts;

public class BikeBuilder {
    //nhận 1 factory để áp dụng dependency injection
    public void buildBike(BikeFactory factory) {

        Wheel wheel = factory.getWheel();

        wheel.createWheel();

        System.out.println("Bike duoc tao thanh cong!");
    }
}