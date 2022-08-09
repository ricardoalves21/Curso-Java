package application;

import entities.Produto;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String resp = "N";
        String resp2 = "N";
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

            Produto prod = new Produto(nome, qtdProd, cat);  // objeto 'prod' guarda valores atribuidos ao produto (temporario)
            listProd.add(prod); // objeto 'listProd' acumula os valores adicionados no objeto 'prod' (permanente)

            System.out.println("\nContinuar cadastrando? ");
            System.out.println("[S] Sim");
            System.out.println("[N] Não");
            System.out.print("R: ");
            resp = sc.nextLine();

            if (resp.equals("N")){
                System.out.println();
                System.out.println("Quer somar o estoque de algum produto? ");
                System.out.println("[S] Sim");
                System.out.println("[N] Não");
                System.out.print("R: ");
                resp2 = sc.nextLine();

                if (resp2.equals("S")) {
                    System.out.print("Quer somar o estoque de qual produto? ");
                    System.out.print("R: ");
                    sc.nextLine();
                    String produtoSomar = sc.nextLine();

                    for (int i = 0 ; i < listProd.size() ; i++) {
                        prod.adicionarProdutos(listProd.get(i));
                    }

                    System.out.println();
                    System.out.println("LISTAGEM DE PRODUTOS");
                    System.out.println("----------------------------------------");
                    System.out.println("Produto: " + produtoSomar + "   |   Estoque: " + prod.somaPorProduto(produtoSomar));
                }
                else {
                    System.out.println();
                    System.out.println("LISTAGEM DE PRODUTOS");
                    System.out.println("----------------------------------------");


                    for (int i = 0 ; i < listProd.size() ; i++) {
                        prod.adicionarProdutos(listProd.get(i));
                    }

                    System.out.println();
                    System.out.println("LISTAGEM DE PRODUTOS");
                    System.out.println("----------------------------------------");

                    for (int i = 0 ; i < listProd.size(); i++) {
                        System.out.println(
                                " | Produto: " + listProd.get(i).getNmProduto() +
                                " | Categoria: " + listProd.get(i).getCategoria() +
                                " | Estoque: " + prod.somaPorProduto(listProd.get(i).getNmProduto()));
                    }


                }
            }

        }while (resp.equals("S"));

        System.out.println();
        sc.close();
    }
}
