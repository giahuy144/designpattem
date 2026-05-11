package main.java.com.giahuy.designpattem.CREATIONALPATTERN.BedroomBuilder;

public class Architect {

    public Bedroom buildSimpleBedroom() {
        //tạo builder mới, set từng thuộc tính, tạo object
        return new BedroomBuilder()
                .setColor("Blue")
                .setWindows(2)
                .setTV(true)
                .build();
    }
}