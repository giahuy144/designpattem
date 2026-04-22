package main.java.com.giahuy.designpattem.Manager.service;


import main.java.com.giahuy.designpattem.Manager.model.Payee;

public class ExpenseService {

    public void processPayment(Payee payee, int amount) {
        payee.payExpenses(amount);
    }
}