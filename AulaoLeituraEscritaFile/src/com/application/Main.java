package com.application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        File file = new File("c:\\temp\\file.csv");  // instanciando um objeto do tipo FILE que está apontando para este endereço
        Scanner sc = null;

        try {

            sc = new Scanner(file);
            while (sc.hasNextLine()) {  // enquanto não chegar no fim do arquivo continue lendo linha a linha
                String line = sc.nextLine();
                System.out.println(line);
            }

        } catch (IOException e) {

            System.out.println(e.getMessage());

        } finally {

            if (sc != null) {
                sc.close();
            }
        }

    }
}
