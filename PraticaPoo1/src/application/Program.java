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
//
//        Departamento departamento1 = new Departamento();
//        System.out.print("Qual o nome do departamento 1? ");
//        departamento1.setNmDepartamento(sc.nextLine());
//
//        Departamento departamento2 = new Departamento();
//        System.out.print("Qual o nome do departamento 2? ");
//        departamento2.setNmDepartamento(sc.nextLine());
//
//        Funcionario funcionario1 = new Funcionario();
//        funcionario1.setNome("Ricardo");
//        funcionario1.setNrDocumento(999);
//        funcionario1.setFuncao("Senior Developer");
//        funcionario1.setSalario(5000.00);
//        funcionario1.setDepartamento(departamento1);
//        departamento1.adicionarFuncionario(funcionario1);
//
//        Funcionario funcionario2 = new Funcionario();
//        funcionario2.setNome("Elias");
//        funcionario2.setNrDocumento(888);
//        funcionario2.setFuncao("Analist Developer");
//        funcionario2.setSalario(10000.00);
//        funcionario2.setDepartamento(departamento2);
//        departamento2.adicionarFuncionario(funcionario2);

        Categoria categoria1 = new Categoria();
        categoria1.setNmCategoria("Eletronicos");
        Categoria categoria2 = new Categoria();
        categoria1.setNmCategoria("Papelaria");
        Categoria categoria3 = new Categoria();
        categoria1.setNmCategoria("Bazar");

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

        System.out.println("O que deseja fazer?");
        System.out.println("[C] Cadastrar Produto");
        System.out.println("[L] Listar Produto");
        System.out.print("R: ");
        String R = sc.nextLine();

        if (R.equals("C")) {
            System.out.println("CADASTRO DE PRODUTOS:");
            System.out.println("_____________________");
            System.out.print("Nome do Produto: ");
            produto1.setNmProduto(sc.nextLine());
            System.out.print("Quantidade em Estoque: ");
            produto1.setQtdEstoque(sc.nextInt());
            System.out.println("Qual Categoria: ");
            System.out.println("[1] Eletronicos");
            System.out.println("[2] Papelaria");
            System.out.println("[3] Bazar");
            int C = sc.nextInt();
            if (C == 1) {
                System.out.print("R: ");
                produto1.setCategoria(categoria1);
            }
            else if (C ==2) {
                System.out.print("R: ");
                produto1.setCategoria(categoria2);
            }
            else {
                System.out.print("R: ");
                produto1.setCategoria(categoria3);
            }

        }



//
//        System.out.println(categoria1.getProduto(0).getNmProduto());





//        Produto produto2 = new Produto();
//        produto2.setNmProduto("Monitor");
//        produto2.setQtdEstoque(70);
//        produto2.setCategoria(categoria1);
//
//        categoria1.adicionarProduto(produto1);
//        categoria1.adicionarProduto(produto2);

//        System.out.println("\nFUNCIONÁRIOS DO DEPARTAMENTO: " + departamento1.getNmDepartamento());
//        for (int i = 0 ; i < departamento1.quantidadeFuncionarios() ; i++) {
//            System.out.println(departamento1.getFuncionario(i).getNome());
//        }

//        System.out.println("\nPRODUTOS ELETRONICOS: ");
//        for (int i = 0 ; i < categoria1.quantidadeProdutos() ; i++) {
//            System.out.println(categoria1.getProduto(i).getNmProduto());
//        }
//
//        departamento1.excluirFuncionario(funcionario1);
//        categoria1.excluirProduto(produto2);
//
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
