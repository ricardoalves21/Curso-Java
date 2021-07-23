package com.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        String path = "c:\\temp\\file.csv";  // variável que receberá o caminho do arquivo que será lido
        FileReader fr = null;  // criando a variável na classe 'FileReader' que é a classe padrão para ler uma stream de dados
        BufferedReader br = null; // o BufferedReader gerencia a memória utilizada para a leitura, é uma classe que trata a leitra de forma mais otimizada (rápida)

        try {
            fr = new FileReader(path);
            br = new BufferedReader(fr);  // a variável 'br' nos permite ficar lendo o arquivo

            String line = br.readLine();  // o 'readLine' faz a leitura de um arquivo até a quebra de linha e devolve uma String com a leitura que ele fez

            while (line != null) {  // enquanto a leitra de linhas for diferente de nullo (ao final da leitura do arquivo o comando retornará nullo)
                System.out.println(line);
                line = br.readLine();  // comando responsável por ler cada linha do arquivo
            }

        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            try {
                br.close();
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
