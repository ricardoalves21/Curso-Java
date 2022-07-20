package application;

import entities.Categoria;
import entities.Departamento;
import entities.Funcionario;
import entities.Produto;
import java.util.Scanner;


public class Program {

    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
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

        Produto produto1 = new Produto();
        produto1.setNmProduto("Mouse");
        produto1.setQtdEstoque(10);
        produto1.setCategoria(categoria1);
        categoria1.adicionarProduto(produto1);

        System.out.println(categoria1.getProduto(0).getNmProduto());

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
