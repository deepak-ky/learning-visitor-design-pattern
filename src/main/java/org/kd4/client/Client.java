package org.kd4.client;

import org.kd4.visitor.Visitor;

public abstract class Client {
    private final String name;
    private final String address;
    private final String number;

    public Client(String name, String address, String number) {
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public abstract void accept(Visitor visitor);

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
