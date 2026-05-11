package main.java.com.giahuy.designpattem.CREATIONALPATTERN.Candy;

public abstract class CandyStore {
    public void orderCandy(String type) {
        Candy candy = createCandy(type);
        candy.prepare();
        System.out.println("Candy is ready!\n");
    }

    protected abstract Candy createCandy (String type);
}
