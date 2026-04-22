package main.java.com.giahuy.designpattem.Candy.factorymethod;

public class GummyCandy implements Candy {
    @Override
    public void prepare() {
        System.out.println("Preparing Gummy Candy");
    }
}
