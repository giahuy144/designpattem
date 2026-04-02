package main.java.com.giahuy.designpattem.Structural_pattern_ex2.BridgePattern.buttonbridge.button;

import main.java.com.giahuy.designpattem.Structural_pattern_ex2.BridgePattern.buttonbridge.size.ButtonSize;

public abstract class Button {

    protected ButtonSize size;

    public Button(ButtonSize size) {
        this.size = size;
    }

    public abstract void draw();
}