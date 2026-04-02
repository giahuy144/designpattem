package main.java.com.giahuy.designpattem.Structural_pattern_ex3.Manager.service;


import main.java.com.giahuy.designpattem.Structural_pattern_ex3.Manager.model.Payee;

public class ExpenseService {

    public void processPayment(Payee payee, int amount) {
        payee.payExpenses(amount);
    }
}