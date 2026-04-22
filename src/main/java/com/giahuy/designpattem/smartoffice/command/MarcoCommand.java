package main.java.com.giahuy.designpattem.CommandPattern.smartoffice.command;

import java.util.ArrayList;
import java.util.List;

public class MarcoCommand implements Command{
    private List<Command> commands;

    public MacroCommand(List<Command> commands) {
        this.commands = new ArrayList<>(commands);
    }

    @Override
    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }

    @Override
    public void undo() {
        // Undo ngược từ command cuối lên đầu
        for (int i = commands.size() - 1; i >= 0; i--) {
            commands.get(i).undo();
        }
    }
}
