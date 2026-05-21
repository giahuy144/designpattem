package main.java.com.giahuy.designpattem.BEHAVIOURALPATTERN.TheCommand;

public class CancelOrderCommand implements Command {
    //là mẫu thiết kết dùng để đống gói một request thành object
    //thay vì gọi trực tiếp hành động, ta tạo ra 1 object đại diện cho lên đó
    private Kitchen kitchen;
    private String item;

    public CancelOrderCommand(Kitchen kitchen, String item) {
        this.kitchen = kitchen;
        this.item = item;
    }

    @Override
    public void execute() {
        kitchen.cancelOrder(item);
    }
}