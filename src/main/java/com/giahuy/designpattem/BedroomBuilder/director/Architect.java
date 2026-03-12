package main.java.com.giahuy.designpattem.BedroomBuilder.director;

import main.java.com.giahuy.designpattem.BedroomBuilder.builder.BedroomBuilder;
import main.java.com.giahuy.designpattem.BedroomBuilder.model.Bedroom;

public class Architect {

    public Bedroom buildSimpleBedroom() {

        return new BedroomBuilder()
                .setColor("Blue")
                .setWindows(2)
                .setTV(true)
                .build();
    }
}