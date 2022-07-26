package entities;

import java.util.Scanner;

public class Produto implements Produt {


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
    @Override
    public String getNmProduto() {
        return nmProduto;
    }

    @Override
    public void setNmProduto(String nmProduto) {
        this.nmProduto = nmProduto;
    }

    @Override
    public int getQtdEstoque() {
        return qtdEstoque;
    }

    @Override
    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    @Override
    public Categoria getCategoria() {
        return categoria;
    }

    @Override
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    // OUTROS METODOS
    @Override
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
    public String toString(Produto produt) {
        return "\nPRODUTOS CADASTRADOS: " + "\n" +
               "Descrição do Produto: " + produt.getNmProduto() + "\n" +
               "Qtd Estoque: " + produt.getQtdEstoque() + "\n" +
               "Categoria: " + produt.getCategoria().nmCategoria ;
    }
}
