package main.java.com.giahuy.designpattem.Structural_pattern_ex2.BridgePattern.buttonbridge.button;

import main.java.com.giahuy.designpattem.Structural_pattern_ex2.BridgePattern.buttonbridge.size.ButtonSize;

public class CheckBoxButton extends Button{
    public CheckBoxButton (ButtonSize size) {
        super(size);
    }

    @Override
    public void draw() {
        System.out.println(size.getSize() + " Checkbox Button");
    }

}