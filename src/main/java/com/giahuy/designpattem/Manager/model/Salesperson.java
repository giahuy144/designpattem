package main.java.com.giahuy.designpattem.Manager.model;

public class Salesperson implements Payee {
    private String name;
    private Manager manager;

    public Salesperson(String name, Manager manager) {
        this.name = name;
        this.manager = manager;
    }

    public void payExpenses(int amount) {
        System.out.println(" Salesperson " + name + " has been paid " + amount + "$(Manager: " + manager + ")");

    }
}
