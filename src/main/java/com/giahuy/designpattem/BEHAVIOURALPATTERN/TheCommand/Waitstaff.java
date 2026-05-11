package main.java.com.giahuy.designpattem.BEHAVIOURALPATTERN.TheCommand;

import java.util.ArrayList;
import java.util.List;

public class Waitstaff {
    private List<Command> orderQueue = new ArrayList<>();

    // The invoker stores the command to be executed later
    public void takeOrder(Command command) {
        orderQueue.add(command);
        System.out.println("Waitstaff: Command added to the ticket queue.");
    }

    // This method fires all queued commands at once
    public void sendOrdersToKitchen() {
        System.out.println("\n--- Waitstaff is sending the ticket to the kitchen ---");
        for (Command command : orderQueue) {
            command.execute();
        }
        orderQueue.clear(); // Clear the queue after sending
    }
}
