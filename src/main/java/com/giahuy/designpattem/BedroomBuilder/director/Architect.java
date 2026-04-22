package main.java.com.giahuy.designpattem.Creational_pattern_ex4.BedroomBuilder.BedroomBuilder.director;

import main.java.com.giahuy.designpattem.Creational_pattern_ex4.BedroomBuilder.BedroomBuilder.builder.BedroomBuilder;
import main.java.com.giahuy.designpattem.Creational_pattern_ex4.BedroomBuilder.BedroomBuilder.model.Bedroom;

public class Architect {

    public Bedroom buildSimpleBedroom() {

        return new BedroomBuilder()
                .setColor("Blue")
                .setWindows(2)
                .setTV(true)
                .build();
    }
}