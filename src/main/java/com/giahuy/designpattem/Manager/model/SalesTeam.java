package main.java.com.giahuy.designpattem.Structural_pattern_ex3.Manager.model;

import java.util.ArrayList;
import java.util.List;

public class SalesTeam implements Payee {
    private List<Payee> members = new ArrayList<>();

    public void addMembers(Payee... payees) {
        for (Payee p : payees) {
            members.add(p);
        }
    }

    @Override
    public void payExpenses(int amount) {
        for (Payee p : members) {
            p.payExpenses(amount);
        }
    }
}
