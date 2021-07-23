package com.application;

import entities.Product;

import javax.annotation.processing.FilerException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        String path = "c:\\temp\\file.csv";

        List<Product> list = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();  // esta leitura refere-se à primeira linha do arquivo, ou seja, o cabeçalho dos produtos
            line = br.readLine();
            while (line != null) {
                String[] vect = line.split(",");  // esta função 'split' vai recortar a string realizando os cortes nas vírgulas e então guardará na variável 'vect'
                String name = vect[0];
                Double price = Double.parseDouble(vect[1]);
                Integer qte = Integer.parseInt(vect[2]);

                Product prod = new Product(name, price, qte);
                prod.total();
                list.add(prod);

                line = br.readLine();
            }

            System.out.println("PRODUCTS: ");
            for (Product e : list) {
                System.out.println(e);
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}