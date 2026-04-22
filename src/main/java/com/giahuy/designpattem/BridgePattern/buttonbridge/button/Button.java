package main.java.com.giahuy.designpattem.BridgePattern.buttonbridge.button;

import main.java.com.giahuy.designpattem.BridgePattern.buttonbridge.size.ButtonSize;

public abstract class Button {
    protected ButtonSize size;

    public Button(ButtonSize size) {
        this.size = size;
    }

    public abstract void draw();
}