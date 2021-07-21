package com.application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        File file = new File("c:\\temp\\in.txt");  // é preciso duas barras invertidas porque uma barra invertida já possui função pre-definida no Java
        Scanner sc = null;  // é preciso declarar a variável Scanner fora do bloco try/catch

        try {
            sc = new Scanner(file);  // a classe Scanner pode ser utilizada também para ler arquivos
            while (sc.hasNextLine()) {  // esta função hasNextLine testa se ainda existe uma linha no arquivo que está sendo scanneado
                System.out.println(sc.nextLine());  // enquanto existir linhas no arquivo elas serão impressas na tela
            }
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            if (sc != null) {
                sc.close();
            }
        }
    }
}
