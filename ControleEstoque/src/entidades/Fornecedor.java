package entidades;

public class Fornecedor extends Produto {

    // ATRIBUTOS
    private String nomeFornecedor;
    private int vendaFornecedor;
    private int saldoFornecedor = 100;


    // CONSTRUTOR
    public Fornecedor(String nomeFornecedor, int vendaFornecedor, int saldoFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
        this.vendaFornecedor = vendaFornecedor;
        this.saldoFornecedor = saldoFornecedor;
    }

    public Fornecedor() {
    }

    public Fornecedor(String descricao, float preco, int estoque, int compra, int venda, String nomeFornecedor, int vendaFornecedor, int saldoFornecedor) {
        super(descricao, preco, estoque, compra, venda);
        this.nomeFornecedor = nomeFornecedor;
        this.vendaFornecedor = vendaFornecedor;
        this.saldoFornecedor = saldoFornecedor;
    }

    // GETTERS E SETTERS
    public String getNomeFornecedor() {
        return nomeFornecedor;
    }

    public void setNomeFornecedor(String nomeFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
    }

    public int getVendaFornecedor() {
        return vendaFornecedor;
    }

    public void setVendaFornecedor(int vendaFornecedor) {
        this.vendaFornecedor = vendaFornecedor;
    }

    public int getSaldoFornecedor() {
        return saldoFornecedor;
    }

    // MÉTODOS
    public void venderProduto() {
        saldoFornecedor -= vendaFornecedor;
    }

    public String dadosFornecedor() {
        return "Fornecedor: "
                + getNomeFornecedor()
                + "\n"
                + "Quantidade última venda: "
                + getVendaFornecedor()
                + "\n"
                + "Saldo do Fornecedor: "
                + getSaldoFornecedor()
                + "\n";
    }
}

