package main.java.com.giahuy.designpattem.STRUCTURALPATTERN.BridgeButton;

public abstract class Button {
    protected ButtonSize size;

    public Button(ButtonSize size) {
        this.size = size;
    }

    public abstract void draw();
}