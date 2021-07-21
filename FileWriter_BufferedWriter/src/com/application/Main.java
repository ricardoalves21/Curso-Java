package com.application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        String[] lines = new String[] {"Good morning", "Good afternoon", "Good night"};  // criando um vetor com três valores

        String path = "c:\\temp\\out.txt";  // variável que receberá o caminho onde o arquivo será criado

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {  // instanciando o objeto 'bw' que criará o arquivo no caminho especificado em 'path'

            // FileWriter: cria/escreve no arquivo cujo caminho foi especificado
            // BufferedWriter: cria/escreve mais rapidamente no arquivo cujo caminho foi especificado

            for (String line : lines) {  // para cada string cujo nome é 'line' no vetor chamado 'lines'
                bw.write(line);  // chamamos o objeto 'br' com o comando 'write' para escrever esta linha no arquivo especificado
                bw.newLine();  // este comando é apenas para incluir uma quebra de linha
            }

        } catch (IOException e) {
            e.printStackTrace();  // caso ocorra uma exceção será impresso na tela a exceção com o comando 'printStachTrace()'
        }
    }
}
