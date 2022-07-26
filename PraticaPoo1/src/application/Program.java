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
        String resp = "N";

        do {
            produto1.cadastrarProduto(produto1);

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

        if (R.equals("S")) {
            if (produto1.getQtdEstoque() == 0) {
                System.out.println("Não há nenhum produto cadastrado no banco de dados");
            }
            else {
                System.out.println(produto1.getCategoria().toString());;
            }
        }
    }
}
