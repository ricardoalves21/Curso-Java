package application;

import entities.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String resp = "N";
        List<Produto> listProd = new ArrayList<>();

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
            listProd.add(prod);

            System.out.println("\nContinuar cadastrando? ");
            System.out.println("[S] Sim");
            System.out.println("[N] Não");
            System.out.print("R: ");
            resp = sc.nextLine();

            if (resp.equals("N")){
                System.out.println();
                System.out.print("Quer somar o estoque de qual produto? ");
                String produtoSomar = sc.nextLine();

                for (int i = 0 ; i < listProd.size() ; i++) {
                    prod.adicionarProdutos(listProd.get(i));
                }

                System.out.println();
                System.out.println("LISTAGEM DE PRODUTOS");
                System.out.println("----------------------------------------");
                System.out.println("Produto: " + produtoSomar + "   |   Estoque: " + prod.somarProduto(produtoSomar));
            }

        }while (resp.equals("S"));
        sc.close();
    }
}
