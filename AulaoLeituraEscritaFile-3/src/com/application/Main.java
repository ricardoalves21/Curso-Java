package com.application;

import entities.Product;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String path = "c:\\temp\\file.csv";  // caminho do arquivo que será lido
        List<Product> list = new ArrayList<>();  // criando a lista referente à classe Product que receberá os dados do arquivo lido

    // PARTE 1

        // 1.CAMINHO ONDE A PASTA SERÁ CRIADA
        Scanner sc = new Scanner(System.in);
        System.out.print("Onde será criada a pasta? ");
        String strPath = sc.nextLine();  // string que receberá o caminho da pasta digitada pelo usuário

        // 2.CRIANDO A PASTA
        System.out.print("Qual o nome da pasta? ");
        String nomePasta = sc.nextLine();
        boolean success = new File(strPath + "\\" + nomePasta).mkdir();  // variável com a função de criar uma subpasta dentro do caminho especificado na variável 'strPath'

        // 3.CRIANDO O ARQUIVO DENTRO DA PASTA QUE FOI CRIADA (informar a extensão)
        System.out.print("Qual o nome do arquivo que será criado? ");
        String arquivo = sc.nextLine();
        String path2 = strPath + "\\" + nomePasta + "\\" + arquivo; // variável que receberá o caminho onde o arquivo será criado


    // PARTE 2

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {  // criando o objeto 'br' que fará a leitura do arquivo

            String line = br.readLine();    // esta leitura refere-se à primeira linha do arquivo no path, ou seja, o cabeçalho do arquivo
            line = br.readLine();           // realizando a leitura da linha seguinte do arquivo

            // BLOCO PARA GRAVAR NA LISTA O QUE FOI LIDO
            while (line != null) {

                String[] vect = line.split(",");           // esta função 'split' vai recortar a string realizando os cortes nas vírgulas e então guardará na variável 'vect'

                String name = vect[0];                          // cada palavra recorta será guardada na variável
                Double price = Double.parseDouble(vect[1]);     // cada palavra recorta será guardada na variável
                Integer qte = Integer.parseInt(vect[2]);        // cada palavra recorta será guardada na variável

                Product prod = new Product(name, price, qte);  // cada variável será encaminha ao objeto prod
                prod.total();  // calculando o total (price * quantity
                list.add(prod);  // os valores armazenados no objeto prod serão adicionados à lista 'list'

                line = br.readLine();  //  realizando a leitura da linha
            }

            // ESTE BLOCO É PARA ESCREVER NO ARQUIVO
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(path2))) {  // criando o objeto 'bw' que fará a escrita no arquivo
                for (Product x : list) {  // para cada string cujo nome é 'x' no vetor chamado 'lines'
                    bw.write(x.toString());  // chamamos o objeto 'bw' com o comando 'write' para escrever esta linha no arquivo especificado
                    bw.newLine();  // este comando é apenas para incluir uma quebra de linha
                }
            }

            // BLOCO PARA APRESENTAR NA TELA O QUE FOI ESCRITO NO ARQUIVO
            System.out.println();
            System.out.println("PRODUCTS: ");
            for (Product e : list) {
                System.out.println(e);  // realizando a impressão das informações relacionadas no método toString
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}