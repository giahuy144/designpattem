package main.java.com.giahuy.designpattem.Structural_pattern_ex2.BridgePattern.buttonbridge.button;

import main.java.com.giahuy.designpattem.Structural_pattern_ex2.BridgePattern.buttonbridge.size.ButtonSize;

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