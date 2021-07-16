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

        ArrayList<Colaborador>  colab = new ArrayList<>();
        ArrayList<Gerente>      ger = new ArrayList<>();
        ArrayList<Vendedor>     ven = new ArrayList<>();
        ArrayList<Atendente>    atend = new ArrayList<>();

        Gerente     colab1 = new Gerente();
        Vendedor    colab2 = new Vendedor();
        Atendente   colab3 = new Atendente();

        System.out.println();
        System.out.println("XXXXXXXXXX CADASTRO COLABORADOR XXXXXXXXXX");
        System.out.println();

        char resp;
        int cont = 0;
        char perfil;
        do {
            System.out.print("Qual seu perfil (Gerente/Vendedor/Atendente [g/v/a])? ");
            perfil = sc.next().charAt(0);

            if (perfil == 'g') {

                colab1.setPerfil(perfil);

                System.out.print("Nome: ");
                colab1.setNome(sc.next());

                System.out.print("Cargo: ");
                colab1.setCargo(sc.next());

                System.out.print("Idade: ");
                colab1.setIdade(sc.nextInt());

                colab1.receberSalario();

                ger.add(new Gerente(colab1.getNome(), colab1.getCargo(), colab1.getIdade(), colab1.getSalario()));
            }

            if (perfil == 'v') {

                colab2.setPerfil(perfil);

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

                ven.add(new Vendedor(colab2.getNome(), colab2.getCargo(), colab2.getIdade(), colab2.getSalario()));
            }

            if (perfil == 'a') {

                colab3.setPerfil(perfil);

                System.out.print("Nome: ");
                colab3.setNome(sc.next());

                System.out.print("Cargo: ");
                colab3.setCargo(sc.next());

                System.out.print("Idade: ");
                colab3.setIdade(sc.nextInt());

                System.out.print("Quantidade de atendimentos: ");
                colab3.setQtdAtendimento(sc.nextFloat());

                System.out.print("Grau de satisfação: ");
                colab3.setGrauSatisfacao(sc.nextFloat());

                colab3.salarioAtendente();

                atend.add(new Atendente(colab3.getNome(), colab3.getCargo(), colab3.getIdade(), colab3.getSalario()));
            }

            cont++;
            System.out.print("Continuar lançando (Sim/Não [s/n]? ");
            resp = sc.next().charAt(0);
            System.out.println();

        } while (resp == 's');

        for (Gerente e : ger) {
            System.out.println();
            System.out.println("XXXXXXXXXX DADOS DO COLABORADOR XXXXXXXXXX");
                System.out.println(e.dadosColaborador());
        }

        for (Vendedor e : ven) {
            System.out.println();
            System.out.println("XXXXXXXXXX DADOS DO COLABORADOR XXXXXXXXXX");
            System.out.println(e.dadosColaborador());
        }

        for (Atendente e : atend) {
            System.out.println();
            System.out.println("XXXXXXXXXX DADOS DO COLABORADOR XXXXXXXXXX");
            System.out.println(e.dadosColaborador());
        }
    }
}