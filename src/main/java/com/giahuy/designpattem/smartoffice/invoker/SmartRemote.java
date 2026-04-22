package main.java.com.giahuy.designpattem.smartoffice.invoker;

import main.java.com.giahuy.designpattem.smartoffice.command.Command;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class SmartRemote {
    private Stack<Command> commandHistory;
    private List<String> commandLog;

    public SmartRemote() {
        this.commandHistory = new Stack<>();
        this.commandLog = new ArrayList<>();
    }

    public void executeCommand(Command command) {
        command.execute();
        commandHistory.push(command);
        commandLog.add("Executed: " + command.getClass().getSimpleName());
        System.out.println("[LOG] Command executed - History size: " + commandHistory.size());
    }

    public void undo() {
        if (!commandHistory.isEmpty()) {
            Command lastCommand = commandHistory.pop();
            lastCommand.undo();
            commandLog.add("Undo: " + lastCommand.getClass().getSimpleName());
            System.out.println("[LOG] Undo executed - Remaining history: " + commandHistory.size());
        } else {
            System.out.println("[WARNING] Nothing to undo!");
        }
    }

    public void showLog() {
        System.out.println("\n========== COMMAND LOG ==========");
        for (int i = 0; i < commandLog.size(); i++) {
            System.out.println((i + 1) + ". " + commandLog.get(i));
        }
        System.out.println("=================================\n");
    }
}
