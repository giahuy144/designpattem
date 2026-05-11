package main.java.com.giahuy.designpattem.CREATIONALPATTERN.Candy;

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
