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
    public void cadastrarProduto(Produto prod) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\nCADASTRO DE PRODUTOS:");
        System.out.println("_____________________");

        System.out.print("Nome do Produto: ");
        prod.setNmProduto(sc.nextLine());

        System.out.print("Quantidade em Estoque: ");
        prod.setQtdEstoque(sc.nextInt());

        System.out.println("\nQUAL CATEGORIA: ");
        System.out.println("_____________________");

        System.out.println("[1] Eletronicos");
        System.out.println("[2] Papelaria");
        System.out.println("[3] Bazar");
        System.out.print("R: ");
        int cat = sc.nextInt();

        if (cat == 1) {
            Categoria categoria1 = new Categoria();
            categoria1.setNmCategoria("Eletronicos");
            prod.setCategoria(categoria1);
            categoria1.adicionarProduto(prod);
        } else if (cat == 2) {
            Categoria categoria2 = new Categoria();
            categoria2.setNmCategoria("Papelaria");
            prod.setCategoria(categoria2);
            categoria2.adicionarProduto(prod);
        } else {
            Categoria categoria3 = new Categoria();
            categoria3.setNmCategoria("Bazar");
            prod.setCategoria(categoria3);
            categoria3.adicionarProduto(prod);
        }

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
