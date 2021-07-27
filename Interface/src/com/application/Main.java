package com.application;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.service.BrazilTaxService;
import model.service.RentalService;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:ss");

        System.out.println("Enter rental data");

        System.out.print("Car model: ");  // modelo
        String carModel = sc.nextLine();

        System.out.print("Pickup (dd/MM/yyyy hh:ss): ");  // entrada
        Date start = sdf.parse(sc.nextLine());

        System.out.print("Return (dd/MM/yyyy hh:ss): ");  // saida
        Date finish = sdf.parse(sc.nextLine());

            CarRental cr = new CarRental(start, finish, new Vehicle(carModel));  // aluguel

        System.out.print("Enter price per hour: ");  // preço da hora
        double pricePerHour = sc.nextDouble();

        System.out.print("Enter price per day: ");  // preço do dia
        double pricePerDay = sc.nextDouble();

            RentalService rentalService = new RentalService(pricePerDay, pricePerHour, new BrazilTaxService());

        rentalService.processInvoice(cr);

        System.out.println("INVOICE: ");
        System.out.println("Basic payment: " + String.format("%.2f", cr.getInvoice().getBasicPayment()));
        System.out.println("Tax: " + String.format("%.2f", cr.getInvoice().getTax()));
        System.out.println("Total payment: " + String.format("%.2f", cr.getInvoice().getTotalPayment()));

        sc.close();
    }
}
