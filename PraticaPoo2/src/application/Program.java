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

            // aqui código para cadastrar em lista

            System.out.println("\nContinuar cadastrando? ");
            System.out.println("[S] Sim");
            System.out.println("[N] Não");
            System.out.print("R: ");
            resp = sc.nextLine();

        }while (resp.equals("S"));


        System.out.println("\nDeseja listar os produtos cadastrados?");
        System.out.println("[S] Sim");
        System.out.println("[N] Não");
        System.out.print("R: ");
        String R = sc.nextLine();

//        if (R.equals("S")) {
//            if (produto1.getQtdEstoque() == 0) {
//                System.out.println("Não há nenhum produto cadastrado no banco de dados");
//            }
//            else {
//                System.out.println(produto1.getCategoria().toString());;
//            }
//        }

        System.out.println("\nLISTAGEM DE PRODUTOS");

//        for (int i = 0 ; i < produto1.getCategoria().quantidadeProdutos() ; i++) {
//            System.out.println("------------------------------------------");
//            System.out.print("| ");
//            System.out.print(produto1.getCategoria().nmCategoria);
//            System.out.print(" | ");
//            System.out.print(produto1.getNmProduto());
//            System.out.print(" | ");
//            System.out.print(produto1.getQtdEstoque());
//            System.out.println();
//            System.out.println("------------------------------------------");
//        }

    }
}
