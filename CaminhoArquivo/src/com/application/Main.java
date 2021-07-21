package com.application;

import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a file path: ");
        String strPath = sc.nextLine();  // variável que receberá o caminho do arquivo digitado pelo usuário

        File path = new File(strPath);

        System.out.println("getName: " + path.getName());  // imprime somente o nome do arquivo
        System.out.println("getParent: " + path.getParent());  // imprime somente o caminho do arquivo
        System.out.println("getPath: " + path.getPath());  // imprime o caminho completo do arquivo incluindo o nome

        sc.close();  // fechar o objeto sc do tipo Scanner
    }
}
