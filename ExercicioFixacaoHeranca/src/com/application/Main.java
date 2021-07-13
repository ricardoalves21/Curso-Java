package com.application;

import entities.ImportedProduct;
import entities.Product;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Product> list = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {

            System.out.println("Product #" + n + " data:");

            System.out.print("Common, used or imported (c/u/i)? ");
            char ch = sc.next().charAt(0);

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Price: ");
            double price = sc.nextDouble();

            if (ch == 'i') {
                System.out.print("Custom fee: ");
                double customsFee = sc.nextDouble();
                Product pro = new ImportedProduct(name, price, customsFee);
                list.add(pro);
            } else if (ch == 'u') {
                System.out.print("Manufacture date (DD/MM/YYY): ");
                Date manufactureDate = sc.nextLine();
            }

        }


    }
}
