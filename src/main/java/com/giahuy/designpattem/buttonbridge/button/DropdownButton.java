package main.java.com.giahuy.designpattem.buttonbridge.button;

import main.java.com.giahuy.designpattem.buttonbridge.size.ButtonSize;

public class DropdownButton extends Button {

    public DropdownButton(ButtonSize size) {
        super(size);
    }

    @Override
    public void draw() {
        size.setSize();
        System.out.println("Dropdown Button");
    }
}