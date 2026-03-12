package main.java.com.giahuy.designpattem.BedroomBuilder.model;

public class Bedroom {

    private String color;
    private int windows;
    private boolean hasTV;

    public Bedroom(String color, int windows, boolean hasTV) {
        this.color = color;
        this.windows = windows;
        this.hasTV = hasTV;
    }

    @Override
    public String toString() {
        return "Bedroom{" +
                "color='" + color + '\'' +
                ", windows=" + windows +
                ", hasTV=" + hasTV +
                '}';
    }
}