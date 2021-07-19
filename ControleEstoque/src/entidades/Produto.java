package entidades;

public class Produto {

    // ATRIBUTOS
    private String descricao;
    private float preco;
    private int estoque;
    private int compra;
    private int venda;

    // CONSTRUTOR
    public Produto(String descricao, float preco, int estoque, int compra, int venda) {
        this.descricao = descricao;
        this.preco = preco;
        this.estoque = estoque;
        this.compra = compra;
        this.venda = venda;
    }

    public Produto(String descricao, float preco) {
        this.descricao = descricao;
        this.preco = preco;
    }

    public Produto() {
    }

    // GETTERS E SETTERS
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public int getCompra() {
        return compra;
    }

    public void setCompra(int compra) {
        this.compra = compra;
    }

    public int getVenda() {
        return venda;
    }

    public void setVenda(int venda) {
        this.venda = venda;
    }

    // MÉTODOS
    public void comprar() {
        estoque += compra;
    }

    public void vender() {
        estoque -= venda;
    }

    public String dadosProduto() {
        return "Descrição: "
            + getDescricao()
            + "\n"
            + "Preço: "
            + getPreco()
            + "\n"
            + "Estoque: "
            + getEstoque()
            + "\n"
            + "Compra: "
            + getCompra()
            + "\n"
            + "Venda: "
            + getVenda()
            + "\n";
    }
}