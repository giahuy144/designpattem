package main.java.com.giahuy.designpattem.smartoffice.device;


public class Light implements Device {
    private int brightness; // 0% = off, 100% = max

    public Light() {
        this.brightness = 0;
    }

    @Override
    public void turnOn() {
        if (brightness == 0) {
            setBrightness(100);
        }
    }

    @Override
    public void turnOff() {
        setBrightness(0);
    }

    public void setBrightness(int percent) {
        this.brightness = Math.max(0, Math.min(100, percent));
        System.out.println("Light brightness set to " + this.brightness + "%");
    }

    public int getBrightness() {
        return brightness;
    }
}