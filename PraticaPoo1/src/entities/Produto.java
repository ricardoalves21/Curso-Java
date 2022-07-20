package entities;

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



    // MÉTODO TO STRING
    @Override
    public String toString() {
        return "\nPRODUTO: " + "\n" +
               "Descrição do Produto: " + nmProduto + "\n" +
               "Qtd Estoque: " + qtdEstoque + "\n" +
               "Categoria: " + categoria.getNmCategoria() ;
    }
}
