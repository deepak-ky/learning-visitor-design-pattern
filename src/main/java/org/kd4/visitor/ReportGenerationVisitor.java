package org.kd4.visitor;

import org.kd4.client.Bank;
import org.kd4.client.Company;
import org.kd4.client.Resident;
import org.kd4.client.Restaurant;

public class ReportGenerationVisitor implements Visitor{

  @Override
  public void visit(Resident resident) {
    System.out.println("Resident, Generating Report");
  }

  @Override
  public void visit(Company company) {
    System.out.println("Company, Generating Report");
  }

  @Override
  public void visit(Bank bank) {
    System.out.println("Bank, Generating Report");
  }

  @Override
  public void visit(Restaurant restaurant) {
    System.out.println("Restaurant, Generating Report");
  }
}
