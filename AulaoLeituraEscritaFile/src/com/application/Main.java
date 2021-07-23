package com.application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        File file = new File("c:\\temp\\file.csv");  // instanciando o objeto 'file' do tipo FILE que está apontando para o endereço de um arquivo
        Scanner sc = null;  // criando a variável 'sc' do tipo Scanner recebendo null

        try {

            sc = new Scanner(file);  // fazendo a variável 'sc' ser um objeto Scanner para ler o arquivo referenciado no objeto 'file'
            while (sc.hasNextLine()) {  // enquanto não chegar no fim do arquivo continue lendo linha a linha
                String line = sc.nextLine();  // a variável 'line' gravará cada linha que está sendo lida pelo objeto 'sc'
                System.out.println(line);  // imprima cada uma das linhas que foi gravada no objeto 'line'
            }

        } catch (IOException e) {

            System.out.println(e.getMessage());

        } finally {

            if (sc != null) {  // o objeto 'sc' só poderá ser fechado caso tenha sido iniciado, ou seja, caso não seja null
                sc.close();
            }
        }

    }
}
