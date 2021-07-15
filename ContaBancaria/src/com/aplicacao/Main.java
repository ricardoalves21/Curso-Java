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
        Conta cliente = new Conta();

        char resp;

        do {
            System.out.println();
            System.out.println("xxxxxxxxxxxxxxxxxxxx CONTA BANCÁRIA xxxxxxxxxxxxxxxxxxxx");

            System.out.print("Titular: ");
            cliente.setTitular(sc.next());

            System.out.print("Agência: ");
            cliente.setAgencia(sc.nextInt());

            System.out.print("Conta: ");
            cliente.setConta(sc.next());

            System.out.print("Qual operação deseja fazer (Depósito ou Saque [d/s])? ");
            char ch = sc.next().charAt(0);

            if (ch == 'd') {
                System.out.print("Qual o valor do depósito? ");
                cliente.setDeposito(sc.nextFloat());
                cliente.depositar();
            } else if (ch == 's') {
                System.out.print("Qual o valor do saque? ");
                cliente.setSaque(sc.nextFloat());
                cliente.sacar();
            }

            System.out.print("Deseja realizar mais alguma operação (s/n)? ");
            resp = sc.next().charAt(0);
        } while (resp == 's');




        list.add(new Conta(cliente.getTitular(), cliente.getAgencia(), cliente.getConta(), cliente.getSaldo()));


        for (Conta cta : list) {
            System.out.println();
            System.out.println("xxxxxxxxxxxxx ATUALIZAÇÃO DE CONTA BANCÁRIA xxxxxxxxxxxxx");
            System.out.println(cta.dadosConta());
        }

    }
}
