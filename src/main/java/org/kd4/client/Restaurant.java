package org.kd4.client;

import org.kd4.visitor.Visitor;

public class Restaurant extends Client{

  public final boolean availableAbroad;

  public Restaurant(String name, String address, String number, boolean availableAbroad) {
    super(name, address, number);
    this.availableAbroad = availableAbroad;
  }
  @Override
  public void accept(Visitor visitor) {
    visitor.visit(this);
  }

  @Override
  public String toString() {
    return "Restaurant{" +
        "availableAbroad=" + availableAbroad +
        '}';
  }
}
