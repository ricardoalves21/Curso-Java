package application;

import entities.Categoria;
import entities.Departamento;
import entities.Funcionario;
import entities.Produto;
import java.sql.SQLOutput;
import java.util.Scanner;


public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Categoria categoria1 = new Categoria();
        categoria1.setNmCategoria("Eletronicos");
        Categoria categoria2 = new Categoria();
        categoria2.setNmCategoria("Papelaria");
        Categoria categoria3 = new Categoria();
        categoria3.setNmCategoria("Bazar");

        Produto produto1 = new Produto();
        Produto produto2 = new Produto();
        Produto produto3 = new Produto();
        Produto produto4 = new Produto();
        Produto produto5 = new Produto();
        Produto produto6 = new Produto();
        Produto produto7 = new Produto();
        Produto produto8 = new Produto();
        Produto produto9 = new Produto();
        Produto produto10 = new Produto();

        System.out.println("\nINICIO");
        System.out.println("--------------------");
        System.out.println("O que deseja fazer?");
        System.out.println("[C] Cadastrar Produto");
        System.out.println("[L] Listar Produto");
        System.out.print("R: ");
        String R = sc.nextLine();

        if (R.equals("C")) {

            produto1.cadastrarProduto();

//            System.out.println("\nCADASTRO DE PRODUTOS:");
//            System.out.println("_____________________");
//            System.out.print("Nome do Produto: ");
//            produto1.setNmProduto(sc.nextLine());
//            System.out.print("Quantidade em Estoque: ");
//            produto1.setQtdEstoque(sc.nextInt());
//            System.out.println("\nQUAL CATEGORIA: ");
//            System.out.println("_____________________");
//            System.out.println("[1] Eletronicos");
//            System.out.println("[2] Papelaria");
//            System.out.println("[3] Bazar");
//            System.out.print("R: ");
//            int C = sc.nextInt();

//            if (produto1.cadastrarProduto() == 1) {
//                produto1.setCategoria(categoria1);
//                categoria1.adicionarProduto(produto1);
//            } else if (C == 2) {
//                produto1.setCategoria(categoria2);
//                categoria2.adicionarProduto(produto1);
//            } else {
//                produto1.setCategoria(categoria3);
//                categoria3.adicionarProduto(produto1);
//            }

        }


            System.out.print("\nDeseja cadastrar outro produto? ");
            String continuarCadastroProduto = sc.nextLine();



//            while (continuarCadastroProduto.equals("S")) {
//                System.out.println("\nCADASTRO DE PRODUTOS:");
//                System.out.println("_____________________");
//                System.out.print("Nome do Produto: ");
//                produto1.setNmProduto(sc.nextLine());
//                System.out.print("Quantidade em Estoque: ");
//                produto1.setQtdEstoque(sc.nextInt());
//                System.out.println("\nQUAL CATEGORIA: ");
//                System.out.println("_____________________");
//                System.out.println("[1] Eletronicos");
//                System.out.println("[2] Papelaria");
//                System.out.println("[3] Bazar");
//                System.out.print("R: ");
//                int C = sc.nextInt();
//
//                if (C == 1) {
//                    produto1.setCategoria(categoria1);
//                    categoria1.adicionarProduto(produto1);
//                }
//                else if (C ==2) {
//                    produto1.setCategoria(categoria2);
//                    categoria2.adicionarProduto(produto1);
//                }
//                else {
//                    produto1.setCategoria(categoria3);
//                    categoria3.adicionarProduto(produto1);
//                }
//
//            }







//        System.out.println("\nFUNCIONÁRIOS DO TI: ");
//        for (int i = 0 ; i < departamento1.quantidadeFuncionarios() ; i++) {
//            System.out.println(departamento1.getFuncionario(i).getNome());
//        }
//
//        System.out.println("\nPRODUTOS ELETRONICOS: ");
//        for (int i = 0 ; i < categoria1.quantidadeProdutos() ; i++) {
//            System.out.println(categoria1.getProduto(i).getNmProduto());
//        }


    }
}
