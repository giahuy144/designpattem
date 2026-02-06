package main.java.com.giahuy.designpattem.Candy;

import main.java.com.giahuy.designpattem.Candy.creator.CandyStore;
import main.java.com.giahuy.designpattem.Candy.creator.MyCandyStore;

public class Main {
    public static void main(String[] args) {

        CandyStore store = new MyCandyStore();

        store.orderCandy("chocolate");
        store.orderCandy("gummy");
    }
}
