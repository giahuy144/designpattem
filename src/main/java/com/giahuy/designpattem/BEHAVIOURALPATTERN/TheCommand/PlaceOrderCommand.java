package main.java.com.giahuy.designpattem.BEHAVIOURALPATTERN.TheCommand;

public class PlaceOrderCommand implements Command {
    private Kitchen kitchen;
    private String item;

    public PlaceOrderCommand(Kitchen kitchen, String item) {
        this.kitchen = kitchen;
        this.item = item;
    }

    @Override
    public void execute() {
        kitchen.prepareOrder(item);
    }
}