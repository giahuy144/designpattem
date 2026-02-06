package main.java.com.giahuy.designpattem.Candy.factorymethod;

public class ChocolateCandy implements Candy {
    @Override
    public void prepare() {
        System.out.println("Preparing Chocolate Candy");
    }
}
