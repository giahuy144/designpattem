package main.java.com.giahuy.designpattem.Creational_pattern_ex2.Candy.Candy;

import main.java.com.giahuy.designpattem.Creational_pattern_ex2.Candy.Candy.creator.CandyStore;
import main.java.com.giahuy.designpattem.Creational_pattern_ex2.Candy.Candy.creator.MyCandyStore;

public class Main {
    public static void main(String[] args) {

        CandyStore store = new MyCandyStore();

        store.orderCandy("chocolate");
        store.orderCandy("gummy");
    }
}
