package main.java.com.giahuy.designpattem.BedroomBuilder.model;

import java.util.List;

public class House {

    private List<Bedroom> rooms;
    private int floors;

    public House(List<Bedroom> rooms, int floors) {
        this.rooms = rooms;
        this.floors = floors;
    }

    public List<Bedroom> getRooms() {
        return rooms;
    }

    public int getFloors() {
        return floors;
    }

    @Override
    public String toString() {
        return "House{" +
                "floors=" + floors +
                ", rooms=" + rooms +
                '}';
    }
}