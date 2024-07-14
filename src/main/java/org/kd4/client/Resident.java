package org.kd4.client;

import org.kd4.visitor.Visitor;

public class Resident extends Client{
    private final String insuranceClass;

    public Resident(String name, String address, String number, String insuranceClass) {
        super(name, address, number);
        this.insuranceClass = insuranceClass;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitResident(this);
    }

    @Override
    public String toString() {
        return "Resident{" +
            "insuranceClass='" + insuranceClass + '\'' +
            '}';
    }
}
