package org.kd4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.kd4.client.Bank;
import org.kd4.client.Client;
import org.kd4.client.Company;
import org.kd4.client.Resident;
import org.kd4.client.Restaurant;
import org.kd4.visitor.InsuranceEmailingVisitor;
import org.kd4.visitor.ReportGenerationVisitor;

public class Main {

  public static void main(String[] args) {
    Resident r1 = new Resident("Deepak Kumar", "557", "23424",
        "first");

    Company c1 = new Company("PhonePe", "Salarpuria Softzone", "9999", 2500);

    Bank b1 = new Bank("SBI", "Mumbai", "234234", 3000);

    Restaurant rt1 = new Restaurant("Iron Hill", "Banglore", "23424", true);

    List<Client> clientList = new ArrayList<>(Arrays.asList(r1, c1, b1, rt1));
    InsuranceEmailingVisitor insuranceEmailingVisitor = new InsuranceEmailingVisitor();

    /*
    // NEED FOR DOUBLE DISPATCH

    for (Client client : clientList) {
      insuranceEmailingVisitor.visit(client);
      // exact subClass of a Client object, cannot be known in advance and hence the overloading mechanism
      // won't be able to determine the correct method to execute.
    }

    // If there was no accept method in the Client Class, then we would have to figure the subClass of every client,
    // and then execute the corresponding function

     for (Client client : clientList) {
      if (client instanceof Resident) {
        insuranceEmailingVisitor.visit((Resident) client);
      } else if (client instanceof Company) {
        insuranceEmailingVisitor.visit((Company) client);
      } else if (client instanceof Bank) {
        insuranceEmailingVisitor.visit((Bank) client);
      } else if (client instanceof Restaurant) {
        insuranceEmailingVisitor.visit((Restaurant) client);
      }
    }
    }*/

    System.out.println(
        "-----------------------------------------------------------------------------------------");

    for (Client client : clientList) {
      client.accept(insuranceEmailingVisitor);
    }

    System.out.println(
        "-----------------------------------------------------------------------------------------");

    ReportGenerationVisitor reportGenerationVisitor = new ReportGenerationVisitor();
    for(Client client : clientList) {
      client.accept(reportGenerationVisitor);
    }

  }
}
