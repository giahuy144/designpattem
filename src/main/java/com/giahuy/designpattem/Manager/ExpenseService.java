package main.java.com.giahuy.designpattem.Manager;


public class ExpenseService {

    public void processPayment(Payee payee, int amount) {
        payee.payExpenses(amount);
    }
}