package main.java.com.giahuy.designpattem.STRUCTURALPATTERN.BridgeButton;

public class Main {
    public static void main(String[] args) {

        // Tạo các button với size khác nhau
        Button b1 = new RadioButton(new SmallSize());
        Button b2 = new CheckBoxButton(new MediumSize());
        Button b3 = new DropDownButton(new LargeSize());

        // Gọi draw
        b1.draw();
        b2.draw();
        b3.draw();
    }
}
