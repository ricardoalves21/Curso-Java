package application;

import entities.Categoria;
import entities.Departamento;
import entities.Funcionario;
import entities.Produto;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Departamento departamento1 = new Departamento();
        departamento1.setNmDepartamento("TI");

        Funcionario funcionario1 = new Funcionario();
        funcionario1.setNome("Ricardo");
        funcionario1.setNrDocumento(999);
        funcionario1.setFuncao("Developer");
        funcionario1.setSalario(5000.00);
        funcionario1.setDepartamento(departamento1);

        System.out.println(funcionario1.toString());

        Categoria categoria1 = new Categoria();
        categoria1.setNmCategoria("Eletrônicos");

        Produto produto1 = new Produto();
        produto1.setNmProduto("Mouse");
        produto1.setQtdEstoque(10);
        produto1.setCategoria(categoria1);

        System.out.println(produto1.toString());


    }

}
