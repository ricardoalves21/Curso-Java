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
        Produto produto1 = new Produto();

        System.out.println("\nINICIO");
        System.out.println("--------------------");
        System.out.println("O que deseja fazer?");
        System.out.println("[C] Cadastrar Produto");
        System.out.println("[L] Listar Produto");
        System.out.print("R: ");
        String R = sc.nextLine();

        if (R.equals("C")) {
            produto1.cadastrarProduto(produto1);

            System.out.println("Continuar cadastrando? ");
            System.out.println("[S] Sim");
            System.out.println("[N] Não");
            System.out.print("R: ");
            String resp = sc.nextLine();

            while (resp.equals("S")) {
                produto1.cadastrarProduto(produto1);
            }

        }
        else if (R.equals("L")) {
            if (produto1.getQtdEstoque() == 0) {
                System.out.println("Não há nenhum produto cadastrado no banco de dados");
            }
            else {
                produto1.toString();
            }
        }

    }
}
