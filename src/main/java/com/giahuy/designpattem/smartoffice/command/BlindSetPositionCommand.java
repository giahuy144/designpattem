package main.java.com.giahuy.designpattem.CommandPattern.smartoffice.command;

import main.java.com.giahuy.designpattem.CommandPattern.smartoffice.device.Blind;

public class BlindSetPositionCommand implements Command {
    private Blind blind;
    private int newPosition;
    private int previousPosition;

    public BlindSetPositionCommand(Blind blind, int position) {
        this.blind = blind;
        this.newPosition = position;
    }

    @Override
    public void execute() {
        this.previousPosition = blind.getPosition();
        blind.setPosition(newPosition);
    }

    @Override
    public void undo() {
        blind.setPosition(previousPosition);
    }
}
