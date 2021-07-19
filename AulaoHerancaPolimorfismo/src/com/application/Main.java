package com.application;

import entities.Campany;
import entities.Individual;
import entities.TaxPayer;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        ArrayList<TaxPayer> list = new ArrayList<>();  // esta lista genérica aceita todas as subclasses

        System.out.println();
        System.out.print("Enter the number of taxpayers: ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {

            System.out.println("Taxpayer #" + i + " data:");
            System.out.print("Individual or company (i/c)? ");
            char ch = sc.next().charAt(0); // para pegar o primeiro caractere
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Anual Income: ");
            Double anualIncome = sc.nextDouble();

            if (ch == 'i') {
                System.out.print("Health expenditures: ");
                Double healthExpenditures = sc.nextDouble();
                list.add(new Individual(name, anualIncome, healthExpenditures));
            } else {
                System.out.print("Number os employees: ");
                int numberOfEmployees = sc.nextInt();
                list.add(new Campany(name, anualIncome, numberOfEmployees));
            }
        }
        System.out.println();
        System.out.println("TAXES PAID: ");
        for (TaxPayer e : list) {
            System.out.println(e.taxesPaid());
        }

        double soma = 0.0;
        for (TaxPayer e : list) {
            soma += e.tax();
        }
        System.out.println();
        System.out.print("TOTAL TAXES: " + String.format("%.2f", soma));

        sc.close();
    }
}
