package entidades;

public class ProdutoImportado extends Produto {

    // ATRIBUTOS
    public Double taxaImportacao;

    // CONSTRUTOR
    public ProdutoImportado(String nome, Double preco, Double taxaImportacao) {
        super(nome, preco);
        this.taxaImportacao = taxaImportacao;
    }

    // GETTERS E SETTERS
    public Double getTaxaImportacao() {
        return taxaImportacao;
    }

    public void setTaxaImportacao(Double taxaImportacao) {
        this.taxaImportacao = taxaImportacao;
    }

    // MÉTODOS
    public Double precoTotal() {
        return getPreco() + taxaImportacao;
    }

    public String etiquetaPreco() {
        return getNome()
                + " $ "
                + String.format("%.2f", precoTotal())
                + " (Taxa de Importação: $ "
                + taxaImportacao
                + ")";
    }
}
