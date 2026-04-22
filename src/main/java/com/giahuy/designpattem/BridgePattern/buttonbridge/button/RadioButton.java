package main.java.com.giahuy.designpattem.BridgePattern.buttonbridge.button;

import main.java.com.giahuy.designpattem.BridgePattern.buttonbridge.size.ButtonSize;

public class RadioButton extends Button{

    public RadioButton (ButtonSize size) {
        super(size);
    }

    @Override
    public void draw() {
        System.out.println(size.getSize() + " Radio Button");
    }

}