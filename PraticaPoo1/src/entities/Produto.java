package entities;

import java.util.Scanner;

public class Produto {


    // ATRIBUTOS
    private String nmProduto;
    public int qtdEstoque;



    // ASSOCIAÇÃO
    Categoria categoria = new Categoria();



    // CONSTRUTOR
    public Produto() {
        this.qtdEstoque = 0;
    }



    // MÉTODOS ACESSORES
    public String getNmProduto() {
        return nmProduto;
    }

    public void setNmProduto(String nmProduto) {
        this.nmProduto = nmProduto;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    // OUTROS METODOS
    public int cadastrarProduto() {

        Scanner sc = new Scanner(System.in);

        System.out.println("\nCADASTRO DE PRODUTOS:");
        System.out.println("_____________________");

        System.out.print("Nome do Produto: ");
        setNmProduto(sc.nextLine());

        System.out.print("Quantidade em Estoque: ");
        setQtdEstoque(sc.nextInt());

        System.out.println("\nQUAL CATEGORIA: ");
        System.out.println("_____________________");

        System.out.println("[1] Eletronicos");
        System.out.println("[2] Papelaria");
        System.out.println("[3] Bazar");
        System.out.print("R: ");
        int cat = sc.nextInt();

//        if (cat == 1) {
//            setCategoria(categoria1);
//            Categoria.adicionarProduto(produto1);
//        } else if (cat == 2) {
//            setCategoria(categoria2);
//            Categoria.adicionarProduto(produto1);
//        } else {
//            setCategoria(categoria3);
//            Categoria.adicionarProduto(produto1);
//        }

        return cat;
    }



    // MÉTODO TO STRING
    @Override
    public String toString() {
        return "\nPRODUTO: " + "\n" +
               "Descrição do Produto: " + nmProduto + "\n" +
               "Qtd Estoque: " + qtdEstoque + "\n" +
               "Categoria: " + categoria.getNmCategoria() ;
    }
}
