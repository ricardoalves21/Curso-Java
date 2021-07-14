package com.application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        List<Product> list = new ArrayList<>();

        System.out.println();
        System.out.print("Enter the number of products: ");
        System.out.println();
        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {

            System.out.println("Product #" + n + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char ch = sc.next().charAt(0);

            System.out.print("Name: ");
            sc.nextLine(); // consumir uma quebra de linha
            String name = sc.nextLine();

            System.out.print("Price: ");
            double price = sc.nextDouble();

            if (ch == 'i') {
                System.out.print("Custom fee: ");
                double customsFee = sc.nextDouble();
                Product pro = new ImportedProduct(name, price, customsFee);
                list.add(pro);
                System.out.println();
            } else if (ch == 'u') {
                System.out.println("Manufacture date (DD/MM/YYY): ");
                Date date = sdf.parse(sc.next());
                list.add(new UsedProduct(name, price, date));
                System.out.println();
            } else {
                Product pro = new Product(name, price);
                list.add(pro);
                System.out.println();
            }

        }
        System.out.println("PRICE TAGS:");
            for (Product pro : list) {
                System.out.println(pro.getName() + " $ " + pro.getPrice() + " " + pro.);
            }
        }
    }
}
