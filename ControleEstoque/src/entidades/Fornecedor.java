package entidades;

public class Fornecedor {

    // ATRIBUTOS
    private int codFornecedor;
    private String nomeFornecedor;
    private int saldoFornecedor;
    private int vendaFornecedor;

    // CONSTRUTOR
    public Fornecedor(int codFornecedor, String nomeFornecedor, int saldoFornecedor, int vendaFornecedor) {
        this.codFornecedor = codFornecedor;
        this.nomeFornecedor = nomeFornecedor;
        this.saldoFornecedor = saldoFornecedor;
        this.vendaFornecedor = vendaFornecedor;
    }

    // GETTERS E SETTERS
    public int getCodFornecedor() {
        return codFornecedor;
    }

    public void setCodFornecedor(int codFornecedor) {
        this.codFornecedor = codFornecedor;
    }

    public String getNomeFornecedor() {
        return nomeFornecedor;
    }

    public void setNomeFornecedor(String nomeFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
    }

    public int getSaldoFornecedor() {
        return saldoFornecedor;
    }

    public void setSaldoFornecedor(int saldoFornecedor) {
        this.saldoFornecedor = saldoFornecedor;
    }

    public int getVendaFornecedor() {
        return vendaFornecedor;
    }

    public void setVendaFornecedor(int compraFornecedor) {
        this.vendaFornecedor = compraFornecedor;
    }

    // MÉTODOS
    public void venderProduto() {
        saldoFornecedor -= vendaFornecedor;
    }
}

