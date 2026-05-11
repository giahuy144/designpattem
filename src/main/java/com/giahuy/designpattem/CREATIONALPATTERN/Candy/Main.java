package main.java.com.giahuy.designpattem.CREATIONALPATTERN.Candy;

public class Main {
    public static void main(String[] args) {

        CandyStore store = new MyCandyStore();

        store.orderCandy("chocolate");
        store.orderCandy("gummy");
    }
}
