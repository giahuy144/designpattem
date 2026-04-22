package main.java.com.giahuy.designpattem.CommandPattern.smartoffice.command;

import main.java.com.giahuy.designpattem.CommandPattern.smartoffice.device.Light;

public class LightSetBrighnessCommand {
    private Light light;
    private int newBrightness;
    private int previousBrightness;

    public LightSetBrightnessCommand(Light light, int brightness) {
        this.light = light;
        this.newBrightness = brightness;
    }

    @Override
    public void execute() {
        this.previousBrightness = light.getBrightness();
        light.setBrightness(newBrightness);
    }

    @Override
    public void undo() {
        light.setBrightness(previousBrightness);
    }
}
