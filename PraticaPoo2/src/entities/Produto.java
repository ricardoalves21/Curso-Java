package entities;

import java.util.ArrayList;
import java.util.List;

public class Produto {


    // ATRIBUTOS
    private String nmProduto;
    private int qtdEstoque;
    private String categoria;

    List<Produto> list = new ArrayList<>();


    // CONSTRUTORES
    public Produto() {
        this.qtdEstoque = 0;
    }

    public Produto(String nmProduto, int qtdEstoque, String categoria) {
        this.nmProduto = nmProduto;
        this.qtdEstoque = qtdEstoque;
        this.categoria = categoria;
    }


    // MÉTODOS ACESSORES
    public String getNmProduto() { return nmProduto; }

    public void setNmProduto(String nmProduto) {
        this.nmProduto = nmProduto;
    }

    public int getQtdEstoque() { return qtdEstoque; }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public String getCategoria() { return categoria; }

    public void setCategoria(String categoria) { this.categoria = categoria; }


    // OUTROS MÉTODOS
    public void adicionarProdutos(Produto prod) {
        list.add(prod);
    }

    public int somaPorProduto(String prodPesq) {

        int sum = 0;

        for (int i = 0 ; i < list.size() ; i++) {
            if (list.get(i).getNmProduto().equals(prodPesq)) {
                sum += list.get(i).getQtdEstoque();
            }
        }

        return sum;

    }

}
