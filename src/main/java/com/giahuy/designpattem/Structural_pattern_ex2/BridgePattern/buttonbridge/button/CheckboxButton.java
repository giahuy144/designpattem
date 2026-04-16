package main.java.com.giahuy.designpattem.Structural_pattern_ex2.BridgePattern.buttonbridge.button;

import main.java.com.giahuy.designpattem.Structural_pattern_ex2.BridgePattern.buttonbridge.size.ButtonSize;

public class CheckboxButton extends Button{
    public CheckboxButton (ButtonSize size) {
        super(size);
    }

    @Override
    public void draw() {
        System.out.println(size.getSize() + " Checkbox Button");
    }

}