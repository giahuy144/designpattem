package main.java.com.giahuy.designpattem.BridgePattern.buttonbridge.button;

import main.java.com.giahuy.designpattem.BridgePattern.buttonbridge.size.ButtonSize;

public class DropDownButton extends Button{

    public DropDownButton(ButtonSize size) {
        super(size);
    }

    @Override
    public void draw() {
        System.out.println(size.getSize() + " Dropdown Button");
    }

}