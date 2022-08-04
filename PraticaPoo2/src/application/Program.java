package application;

import entities.Produto;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Produto> list = new ArrayList<>();  // criando a lista com o nome 'list'
        String resp = "N";

        do {

            System.out.println("\nCADASTRO DE PRODUTOS:");
            System.out.println("_____________________");

            System.out.print("Nome do Produto: ");
            String nome = sc.nextLine();  // variavel que recebera o nome do produto

            System.out.print("Quantidade em Estoque: ");
            int qtdProd = sc.nextInt();  // variavel que recebera a quantidade comprada

            System.out.print("Qual categoria: ");
            sc.nextLine();
            String cat = sc.nextLine();  // variavel que recebera a categoria do produto

            Produto prod = new Produto(nome, qtdProd, cat);  // objeto que guardara os valores atribuidos ao produto (temporario)
            list.add(prod);  // lista que guardara todos os produtos (permanente)


            System.out.println("\nContinuar cadastrando? ");
            System.out.println("[S] Sim");
            System.out.println("[N] Não");
            System.out.print("R: ");
            resp = sc.nextLine();

        }while (resp.equals("S"));

        System.out.println();
        System.out.println("LISTAGEM DE PRODUTOS");
        System.out.println("----------------------------------------");

        System.out.println();
        System.out.println("TOTAL DO PRODUTO 1");
        System.out.println("----------------------------------------");

        int sum = 0;

        for (int i = 0 ; i < list.size() ; i++) {
            if (list.get(i).getNmProduto().equals(list.get(0).getNmProduto())) {
                sum += list.get(0).getQtdEstoque();
            }
        }

        System.out.println("Produto: " + list.get(0).getNmProduto() + "   |   Estoque: " + sum);

        sc.close();


        //System.out.println(" | " + item.getNmProduto() + " | " + item.getQtdEstoque() + " | " + item.getCategoria() + " | ");

    }
}
