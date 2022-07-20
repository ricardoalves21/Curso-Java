package entities;

import java.util.ArrayList;

public class Categoria {


    // ATRIBUTOS
    public String nmCategoria;



    // ASSOCIACAO
    private ArrayList<Produto> produtos = new ArrayList<>();



    // MÉTODOS ACESSORES
    public String getNmCategoria() {
        return nmCategoria;
    }

    public void setNmCategoria(String nmCategoria) {
        this.nmCategoria = nmCategoria;
    }



    // OUTROS MÉTODOS
    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void excluirProduto(Produto produto) {
        produtos.remove(produto);
    }

    public int quantidadeProdutos() {
        return produtos.size();
    }

    public Produto getProduto(int posicao) {
        return produtos.get(posicao);
    }

}
