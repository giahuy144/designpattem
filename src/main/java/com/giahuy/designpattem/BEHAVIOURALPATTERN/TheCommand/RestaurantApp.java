package main.java.com.giahuy.designpattem.BEHAVIOURALPATTERN.TheCommand;

public class RestaurantApp {
    public static void main(String[] args) {
        // 1. Create the Receiver
        Kitchen backOfHouse = new Kitchen();

        // 2. Create the Commands (Encapsulated requests)
        Command order1 = new PlaceOrderCommand(backOfHouse, "Margherita Pizza");
        Command order2 = new PlaceOrderCommand(backOfHouse, "Spaghetti Carbonara");
        Command cancel1 = new CancelOrderCommand(backOfHouse, "Margherita Pizza");

        // 3. Create the Invoker
        Waitstaff waiter = new Waitstaff();

        // 4. Simulate the UI/Front-End interaction (Queueing)
        waiter.takeOrder(order1);
        waiter.takeOrder(order2);
        waiter.takeOrder(cancel1);

        // 5. Execute everything
        waiter.sendOrdersToKitchen();
    }
}
