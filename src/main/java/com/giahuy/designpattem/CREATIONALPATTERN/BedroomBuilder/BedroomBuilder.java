package main.java.com.giahuy.designpattem.CREATIONALPATTERN.BedroomBuilder;

public class BedroomBuilder implements Builder {

    private String color;
    private int windows;
    private boolean hasTV;

    //Ghi đè method từ bulder
    //trả về BedroomBuilder để dùng chaining
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

    //tạo bedroom từ dữ liệu đã set trước
    public Bedroom build() {
        return new Bedroom(color, windows, hasTV);
    }
}