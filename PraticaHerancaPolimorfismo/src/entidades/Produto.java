package entidades;

public class Produto {

    // ATRIBUTOS
    private String nome;
    private Double preco;

    // CONSTRUTOR
    public Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    // GETTERS E SETTERS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    // MÉTODOS
    public String etiquetaPreco() {
        return nome
                + " $ "
                + String.format("%.2f", preco);
    }
}
