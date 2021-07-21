package com.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        String path = "c:\\temp\\in.txt";  // variável 'path' criada para receber o caminho do arquivo que será lido

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {  // objeto 'br' criado para ler dinâmicas o arquivo especificado

            // FileReader: faz leitura de um arquivo
            // BufferedReader: faz leitura mais rápida de um arquivo

            String line = br.readLine();  // variável criada para ler cada linha do arquivo especificado

            while (line != null) {
                System.out.println(line); // imprimir a linha que foi lida
                line = br.readLine();  // variável definida dentro do while para ler cada linha do arquivo especificado
            }

        } catch (IOException e) {  // caso dê algum erro irá pegar uma exceção da classe IOException
            System.out.println("Error: " + e.getMessage());  // imprimir na tela a mensagem de erro pega da classe IOException
        }
    }
}
