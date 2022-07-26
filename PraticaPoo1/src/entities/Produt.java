package entities;

public interface Produt {
    // MÉTODOS ACESSORES
    String getNmProduto();

    void setNmProduto(String nmProduto);

    int getQtdEstoque();

    void setQtdEstoque(int qtdEstoque);

    Categoria getCategoria();

    void setCategoria(Categoria categoria);

    // OUTROS METODOS
    void cadastrarProduto(Produto prod);

    // MÉTODO TO STRING
    String toString(Produto produt);
}
