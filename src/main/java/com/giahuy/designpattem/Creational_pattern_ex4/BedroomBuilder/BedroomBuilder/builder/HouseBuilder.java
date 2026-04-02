package main.java.com.giahuy.designpattem.Creational_pattern_ex4.BedroomBuilder.BedroomBuilder.builder;

import main.java.com.giahuy.designpattem.Creational_pattern_ex4.BedroomBuilder.BedroomBuilder.model.Bedroom;
import main.java.com.giahuy.designpattem.Creational_pattern_ex4.BedroomBuilder.BedroomBuilder.model.House;

import java.util.ArrayList;
import java.util.List;

public class HouseBuilder {

    private List<Bedroom> rooms = new ArrayList<>();
    private int floors;

    public HouseBuilder addRoom(Bedroom room) {
        rooms.add(room);
        return this;
    }

    public HouseBuilder setFloors(int floors) {
        this.floors = floors;
        return this;
    }

    public House build() {
        return new House(rooms, floors);
    }
}