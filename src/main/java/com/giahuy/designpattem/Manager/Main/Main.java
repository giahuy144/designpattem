package main.java.com.giahuy.designpattem.Manager.Main;

import main.java.com.giahuy.designpattem.Manager.model.Manager;
import main.java.com.giahuy.designpattem.Manager.model.SalesTeam;
import main.java.com.giahuy.designpattem.Manager.model.Salesperson;
import main.java.com.giahuy.designpattem.Manager.service.ExpenseService;

public class Main {
    public static void main(String[] args) {

        Manager m1 = new Manager("John");
        Manager m2 = new Manager("Anna");

        Salesperson s1 = new Salesperson("Mike", m1);
        Salesperson s2 = new Salesperson("Linda", m2);

        SalesTeam team = new SalesTeam();
        team.addMembers(m1, m2, s1, s2);

        ExpenseService service = new ExpenseService();

        System.out.println("=== Pay individual ===");
        service.processPayment(m1, 1000);

        System.out.println("\n=== Pay whole team ===");
        service.processPayment(team, 500);
    }
}