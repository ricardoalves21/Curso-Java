package com.application;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // CAMINHO DA PASTA
        Scanner sc = new Scanner(System.in);
        System.out.print("Onde será criada a pasta? ");
        String strPath = sc.nextLine();  // string que receberá o caminho da pasta digitado pelo usuário

        // CRIANDO A PASTA
        System.out.print("Qual o nome da pasta? ");
        String nomePasta = sc.nextLine();
        boolean success = new File(strPath + "\\" + nomePasta).mkdir();  // variável com a função de criar uma subpasta dentro do caminho especificado na variável 'strPath'

        // CRIANDO O ARQUIVO (informar a extensão)
        System.out.print("Qual o nome do arquivo que será criado? ");
        String arquivo = sc .nextLine();
        String path = strPath + "\\" + nomePasta + "\\" + arquivo; // variável que receberá o caminho onde o arquivo será criado

        // INICIANDO A LEITURA DE UM ARQUIVO
        String pathRead = "c:\\temp\\file.csv";

            try (BufferedReader br = new BufferedReader(new FileReader(pathRead))) {

                String line = br.readLine();

                while (line != null) {
                    System.out.println(line);
                    line = br.readLine();
                }

            } catch (IOException e) {

                e.printStackTrace();

            }


        // CAPTURANDO AS INFORMAÇÕES QUE SERÃO GRAVADAS NO ARRAY
        String[] lines = new String[] {"TV LED", "1290.99", "1"}; // criando um vetor com três valores


        // INSERINDO AS INFORMAÇÕES DO VETOR NO ARQUIVO CRIADO
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))){  // instanciando o objeto 'bw' que criará o arquivo no caminho especificado em 'path'

            for (String x : lines) {  // para cada string cujo nome é 'x' no vetor chamado 'lines'
                bw.write(x);  // chamamos o objeto 'bw' com o comando 'write' para escrever esta linha no arquivo especificado
                bw.newLine();  // este comando é apenas para incluir uma quebra de linha
            }

        } catch (IOException e) {

            e.printStackTrace();

        }

        sc.close();

    }
}