package com.application;

import org.openjsse.util.RSAKeyUtil;

import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a folder path:");
        String strPath = sc.nextLine();  // string que receberá o caminho da pasta digitado pelo usuário

        File path = new File(strPath);  // variável do tipo 'File' que receberá o caminho gravado na variável 'strPath'

        File[] folders = path.listFiles(File::isDirectory);  // matriz que recebe a função de listar as pastas do diretório referenciado no caminho (arquivo: path)
        System.out.println("FOLDERS:");
        for (File e : folders) {  // varrendo a matriz e apresentando os valores encontrados dentro da matriz
            System.out.println(e);
        }

        File[] files = path.listFiles(File::isFile);  // matriz que recebe a função de listar os arquivos do diretório referenciado no caminho (arquivo: path)
        System.out.println("FILES:");
        for (File e : files) {  // varrendo a matriz e apresentando os valores encontrados dentro da matriz
            System.out.println(e);
        }

        boolean success = new File(strPath + "\\subdir").mkdir();  // variável com a função de criar uma subpasta dentro do caminho especificado na variável 'strPath'
        System.out.println("Directory created successfully:");

        sc.close();

    }
}
