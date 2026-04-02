package main.java.com.giahuy.designpattem.Creational_pattern_ex2.Candy.Candy.creator;

import main.java.com.giahuy.designpattem.Creational_pattern_ex2.Candy.Candy.factorymethod.Candy;
import main.java.com.giahuy.designpattem.Creational_pattern_ex2.Candy.Candy.factorymethod.ChocolateCandy;
import main.java.com.giahuy.designpattem.Creational_pattern_ex2.Candy.Candy.factorymethod.GummyCandy;

public class MyCandyStore extends CandyStore {
    @Override
    protected Candy createCandy(String type) {
        if (type.equalsIgnoreCase("chocolate")) {
            return new ChocolateCandy();
        } else if (type.equalsIgnoreCase("gummy")) {
            return new GummyCandy();
        }
        throw new IllegalArgumentException("Unknown candy type");
    }
}
