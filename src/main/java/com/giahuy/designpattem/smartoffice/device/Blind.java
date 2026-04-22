package main.java.com.giahuy.designpattem.CommandPattern.smartoffice.device;

public class Blind implements Device {
    private int position; // 0% = closed (down), 100% = open (up)

    public Blind() {
        this.position = 100;
    }

    @Override
    public void turnOn() {
        setPosition(100);
    }

    @Override
    public void turnOff() {
        setPosition(0);
    }

    public void setPosition(int percent) {
        this.position = Math.max(0, Math.min(100, percent));
        System.out.println("Blind position set to " + this.position + "%");
    }

    public int getPosition() {
        return position;
    }
}
