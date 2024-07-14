package org.kd4.visitor;

import org.kd4.client.Bank;
import org.kd4.client.Company;
import org.kd4.client.Resident;
import org.kd4.client.Restaurant;

public interface Visitor {
  void visitResident(Resident resident);
  void visitCompany(Company company);
  void visitBank(Bank bank);
  void visitRestaurant(Restaurant restaurant);
}
