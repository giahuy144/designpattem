package main.java.com.giahuy.designpattem.buttonbridge.button;

import main.java.com.giahuy.designpattem.buttonbridge.size.ButtonSize;

public class RadioButton extends Button {

    public RadioButton(ButtonSize size) {
        super(size);
    }

    @Override
    public void draw() {
        size.setSize();
        System.out.println("Radio Button");
    }
}