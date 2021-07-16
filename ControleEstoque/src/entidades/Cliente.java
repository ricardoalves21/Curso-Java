package entidades;

public class Cliente {

    // ATRIBUTOS
    private String nomeCliente;
    private int saldoCliente;
    private int compraCliente;

    // CONSTRUTOR
    public Cliente(String nomeCliente, int saldoCliente, int compraCliente) {
        this.nomeCliente = nomeCliente;
        this.saldoCliente = saldoCliente;
        this.compraCliente = compraCliente;
    }

    // GETTERS E SETTERS
    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getSaldoCliente() {
        return saldoCliente;
    }

    public void setSaldoCliente(int saldoCliente) {
        this.saldoCliente = saldoCliente;
    }

    public int getCompraCliente() {
        return compraCliente;
    }

    public void setCompraCliente(int compraCliente) {
        this.compraCliente = compraCliente;
    }

    // MÉTODOS
    public void comprarProduto() {
        saldoCliente += compraCliente;
    }
}
