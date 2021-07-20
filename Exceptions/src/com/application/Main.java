package com.application;

import model.entities.Account;
import model.exceptions.DomainException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        try (Scanner sc = new Scanner(System.in)) {  // o objeto Scanner pode ser instanciado no bloco try

            System.out.println();
            System.out.println("Enter account data");
            System.out.print("Number: ");
            int number = sc.nextInt();
            System.out.print("Holder: ");
            sc.nextLine();  // consumir quebra de linha
            String holder = sc.nextLine();
            System.out.print("Initial balance: ");
            Double balance = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            Double withdrawLimit = sc.nextDouble();
            System.out.print("Enter amount for withdraw: ");
            Double amount = sc.nextDouble();
            Account c1 = new Account(number, holder, balance, withdrawLimit);
            c1.withdraw(amount);
            System.out.println(c1.newBalance());

        } catch (DomainException e) {
            System.out.println("Withdraw error: " + e.getMessage());
        }

    }
}
