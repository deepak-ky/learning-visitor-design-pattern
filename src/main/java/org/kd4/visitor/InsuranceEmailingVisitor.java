package org.kd4.visitor;

import java.util.List;
import org.kd4.client.Bank;
import org.kd4.client.Client;
import org.kd4.client.Company;
import org.kd4.client.Resident;
import org.kd4.client.Restaurant;

public class InsuranceEmailingVisitor implements Visitor{


  // Need for double dispatch, method overloading cannot solve this
  public void sendInsuranceMails(List<Client> clients){
    for(Client client : clients) {
      //  visit(client); // exact subClass of a Client object, cannot be known in advance and hence the overloading mechanism
      // won't be able to determine the correct method to execute.
    }
  }

  @Override
  public void visit(Resident resident) {
      System.out.println("Resident Mail : Please consider out medical Insurance insurance plans .... ");
  }

  @Override
  public void visit(Company company) {
    System.out.println("Company Mail : Sending details about new employee flex bean plan....");
  }

  @Override
  public void visit(Bank bank) {
    System.out.println("Bank Mail : Sending available plans for theft Insurance ....");
  }

  @Override
  public void visit(Restaurant restaurant) {
    System.out.println("Restaurant Mail : Here are the fire and food insurance plans....");
  }
}
