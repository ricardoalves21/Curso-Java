package application;

import entities.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Produto> list = new ArrayList<>();
        String resp = "N";

        do {

            System.out.println("\nCADASTRO DE PRODUTOS:");
            System.out.println("_____________________");

            System.out.print("Nome do Produto: ");
            String nome = sc.nextLine();

            System.out.print("Quantidade em Estoque: ");
            int qtdProd = sc.nextInt();

            System.out.print("Qual categoria: ");
            sc.nextLine();
            String cat = sc.nextLine();

            Produto prod = new Produto(nome, qtdProd, cat);
            list.add(prod);

            System.out.println("\nContinuar cadastrando? ");
            System.out.println("[S] Sim");
            System.out.println("[N] Não");
            System.out.print("R: ");
            resp = sc.nextLine();

        }while (resp.equals("S"));

        for (int i = 0 ; i < list.size() ; i++) {
            System.out.println();
            System.out.println(list.get(i).getNmProduto());
            System.out.println(list.get(i).getQtdEstoque());
            System.out.println(list.get(i).getCategoria());
        }

        sc.close();

    }

}
