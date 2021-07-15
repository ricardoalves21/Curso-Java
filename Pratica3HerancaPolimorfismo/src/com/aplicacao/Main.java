package com.aplicacao;

import entidades.Colaborador;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Colaborador> list = new ArrayList<>();
        Colaborador colab[] = new Colaborador[3];

        System.out.println();
        System.out.println("XXXXXXXXXX CADASTRO COLABORADOR XXXXXXXXXX");
        System.out.println();

        System.out.print("Nome: ");
        colab[0].setNome(sc.next());

        System.out.print("Cargo: ");
        colab[0].setCargo(sc.next());

        System.out.print("Idade: ");
        colab[0].setIdade(sc.nextInt());

        System.out.println("Salário: ");


        list.add(new Colaborador(nome, cargo, idade, salario));


    }
}
