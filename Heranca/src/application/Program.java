package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

    public static void main(String[] args) {

    Account acc = new Account(1001, "Alex", 0.0);
    BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

    // UPCASTING
    Account acc1 = bacc; // super classe
    Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.00); // objeto da subclasse pegando atributos da super classe
    Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.01); // objeto da subclasse pegando atributos da super classe

    // DOWNCASTING
    BusinessAccount acc4 = (BusinessAccount)acc2; // usando downcasting para forçar o tipo da variável acc2
    acc4.loan(100.0);


    if (acc3 instanceof BusinessAccount) {
        BusinessAccount acc5 = (BusinessAccount) acc3;
        acc5.loan(200.0);
        System.out.println("Loan");
    }

    if(acc3 instanceof SavingsAccount) {
        SavingsAccount acc5 = (SavingsAccount) acc3;
        acc5.updateBalance();
        System.out.println("Update!");
    }
    }

}
