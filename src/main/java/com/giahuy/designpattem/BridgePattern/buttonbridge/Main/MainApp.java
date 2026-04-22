package main.java.com.giahuy.designpattem.BridgePattern.buttonbridge.Main;

import main.java.com.giahuy.designpattem.BridgePattern.buttonbridge.button.Button;
import main.java.com.giahuy.designpattem.Structural_pattern_ex2.BridgePattern.buttonbridge.button.CheckboxButton;
import main.java.com.giahuy.designpattem.Structural_pattern_ex2.BridgePattern.buttonbridge.button.DropdownButton;
import main.java.com.giahuy.designpattem.BridgePattern.buttonbridge.button.RadioButton;
import main.java.com.giahuy.designpattem.BridgePattern.buttonbridge.size.LargeSize;
import main.java.com.giahuy.designpattem.BridgePattern.buttonbridge.size.MediumSize;
import main.java.com.giahuy.designpattem.BridgePattern.buttonbridge.size.SmallSize;

public class MainApp {
    public static void main(String[] args) {

        Button b1 = new RadioButton(new SmallSize());
        Button b2 = new CheckboxButton(new LargeSize());
        Button b3 = new DropdownButton(new MediumSize());

        b1.draw();
        b2.draw();
        b3.draw();
    }
}