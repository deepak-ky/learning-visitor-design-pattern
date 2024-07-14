package org.kd4.client;

import org.kd4.visitor.Visitor;

public class Company extends Client{
    private final int nbrOfEmployees;

    public Company(String name, String address, String number, int nbrOfEmployees) {
        super(name, address, number);
        this.nbrOfEmployees = nbrOfEmployees;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "Company{" +
            "nbrOfEmployees=" + nbrOfEmployees +
            '}';
    }
}
