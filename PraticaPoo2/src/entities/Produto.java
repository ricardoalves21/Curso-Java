package entities;

public class Produto {


    // ATRIBUTOS
    private String nmProduto;
    private int qtdEstoque;
    private String categoria;



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

    public String getCategoria() { return categoria; }

    public void setCategoria(String categoria) { this.categoria = categoria; }

    public void somaEstoque(String nmProduto, String categoria, int qtdEstoque) {
        if (this.categoria == categoria && this.nmProduto == nmProduto) {
            this.qtdEstoque += qtdEstoque;
        }
    }
}
