package com.aplicacao;

import entidades.Conta;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Conta> list = new ArrayList<>();

        System.out.println();
        System.out.println("xxxxxxxxxxxxxxxxxxxx CONTA BANCÁRIA xxxxxxxxxxxxxxxxxxxx");

        System.out.print("Titular: ");
        String titular = sc.next();

        System.out.print("Agência: ");
        int agencia = sc.nextInt();

        System.out.print("Conta: ");
        String conta = sc.next();

        System.out.print("Qual operação deseja fazer (Depósito ou Saque [d/s])? ");
        char ch = sc.next().charAt(0);

        if (ch == 'd') {
            System.out.print("Qual o valor do depósito? ");
            Double valor = sc.nextDouble();
            list.add(new Conta(titular, agencia, conta, valor));
        } else if (ch == 's') {
            System.out.print("Qual o valor do saque? ");
            Double valor = sc.nextDouble();
            list.add(new Conta(titular, agencia, conta, valor));
        }


        for (Conta cta : list) {
            System.out.println();
            System.out.println("xxxxxxxxxxxxx ATUALIZAÇÃO DE CONTA BANCÁRIA xxxxxxxxxxxxx");
            System.out.println(cta.dadosConta());
        }

    }
}
