package org.kd4.client;

import org.kd4.visitor.Visitor;

public class Bank extends Client{
  private final int branchesInsured;

  public Bank(String name, String address, String number, int branchesInsured) {
    super(name, address, number);
    this.branchesInsured = branchesInsured;
  }

  @Override
  public void accept(Visitor visitor) {
    visitor.visitBank(this);
  }

  @Override
  public String toString() {
    return "Bank{" +
        "branchesInsured=" + branchesInsured +
        '}';
  }
}
