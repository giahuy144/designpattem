package main.java.com.giahuy.designpattem.buttonbridge.button;

import main.java.com.giahuy.designpattem.buttonbridge.size.ButtonSize;

public abstract class Button {

    protected ButtonSize size;

    public Button(ButtonSize size) {
        this.size = size;
    }

    public abstract void draw();
}