package main.java.com.giahuy.designpattem.BedroomBuilder.main;

import main.java.com.giahuy.designpattem.BedroomBuilder.builder.BedroomBuilder;
import main.java.com.giahuy.designpattem.BedroomBuilder.builder.HouseBuilder;
import main.java.com.giahuy.designpattem.BedroomBuilder.model.Bedroom;
import main.java.com.giahuy.designpattem.BedroomBuilder.model.House;

public class MainApp {

    public static void main(String[] args) {

        Bedroom room1 = new BedroomBuilder()
                .setColor("Blue")
                .setWindows(2)
                .setTV(true)
                .build();

        Bedroom room2 = new BedroomBuilder()
                .setColor("White")
                .setWindows(3)
                .setTV(false)
                .build();

        House house = new HouseBuilder()
                .addRoom(room1)
                .addRoom(room2)
                .setFloors(2)
                .build();

        System.out.println(house);
    }
}