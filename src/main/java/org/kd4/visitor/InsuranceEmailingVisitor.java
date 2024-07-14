package org.kd4.visitor;

import java.util.List;
import org.kd4.client.Bank;
import org.kd4.client.Client;
import org.kd4.client.Company;
import org.kd4.client.Resident;
import org.kd4.client.Restaurant;

public class InsuranceEmailingVisitor implements Visitor{

  @Override
  public void visitResident(Resident resident) {
      System.out.println("Resident Mail : Please consider out medical Insurance insurance plans .... ");
  }

  @Override
  public void visitCompany(Company company) {
    System.out.println("Company Mail : Sending details about new employee flex bean plan....");
  }

  @Override
  public void visitBank(Bank bank) {
    System.out.println("Bank Mail : Sending available plans for theft Insurance ....");
  }

  @Override
  public void visitRestaurant(Restaurant restaurant) {
    System.out.println("Restaurant Mail : Here are the fire and food insurance plans....");
  }
}
