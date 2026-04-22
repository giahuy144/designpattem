package main.java.com.giahuy.designpattem.BedroomBuilder.builder;

import main.java.com.giahuy.designpattem.BedroomBuilder.model.Bedroom;

public class BedroomBuilder implements Builder {

    private String color;
    private int windows;
    private boolean hasTV;

    @Override
    public BedroomBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    @Override
    public BedroomBuilder setWindows(int windows) {
        this.windows = windows;
        return this;
    }

    public BedroomBuilder setTV(boolean hasTV) {
        this.hasTV = hasTV;
        return this;
    }

    public Bedroom build() {
        return new Bedroom(color, windows, hasTV);
    }
}