package com.aplicacao;

import entidades.Atendente;
import entidades.Colaborador;
import entidades.Gerente;
import entidades.Vendedor;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Colaborador> list = new ArrayList<>();
        Gerente     colab1 = new Gerente();
        Vendedor    colab2 = new Vendedor();
        Atendente   colab3 = new Atendente();

        System.out.println();
        System.out.println("XXXXXXXXXX CADASTRO COLABORADOR XXXXXXXXXX");
        System.out.println();

        char resp;

        do {
            System.out.print("Qual seu perfil (Gerente/Vendedor/Atendente [g/v/a])? ");
            char ch = sc.next().charAt(0);

            if (ch == 'g') {

                System.out.print("Nome: ");
                colab1.setNome(sc.next());

                System.out.print("Cargo: ");
                colab1.setCargo(sc.next());

                System.out.print("Idade: ");
                colab1.setIdade(sc.nextInt());

                colab1.receberSalario();

                list.add(new Gerente(colab1.getNome(), colab1.getCargo(), colab1.getIdade()));
            }

            if (ch == 'v') {

                System.out.print("Nome: ");
                colab2.setNome(sc.next());

                System.out.print("Cargo: ");
                colab2.setCargo(sc.next());

                System.out.print("Idade: ");
                colab2.setIdade(sc.nextInt());

                System.out.print("Valor total vendido: ");
                colab2.setVenda(sc.nextFloat());

                System.out.print("Percentual de comissão: ");
                colab2.setComissao(sc.nextFloat());

                colab2.salarioComissao();

                list.add(new Vendedor(colab2.getNome(), colab2.getCargo(), colab2.getIdade()));
            }

            System.out.println();
            System.out.print("Continuar lançando (Sim/Não [s/n]? ");
            resp = sc.next().charAt(0);

        } while (resp == 's');

        for (Colaborador dados : list) {
            System.out.println();
            System.out.println("XXXXXXXXXX DADOS DO COLABORADOR XXXXXXXXXX");
            System.out.println(colab2.dadosColaborador());
        }

    }
}
