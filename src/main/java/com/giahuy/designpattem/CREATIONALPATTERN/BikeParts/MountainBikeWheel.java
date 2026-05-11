package main.java.com.giahuy.designpattem.CREATIONALPATTERN.BikeParts;

public class MountainBikeWheel implements Wheel{
    @Override
    public void createWheel() {
        System.out.println("Tao banh xe dap dia hinh");
    }
}