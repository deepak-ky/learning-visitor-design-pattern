package org.kd4.visitor;

import org.kd4.client.Bank;
import org.kd4.client.Company;
import org.kd4.client.Resident;
import org.kd4.client.Restaurant;

public interface Visitor {
  void visit(Resident resident);
  void visit(Company company);
  void visit(Bank bank);
  void visit(Restaurant restaurant);
}
