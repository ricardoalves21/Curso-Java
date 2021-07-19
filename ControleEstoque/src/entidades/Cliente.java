package entidades;

public class Cliente extends Produto {

    // ATRIBUTOS
    private String nomeCliente;
    private int compraCliente;
    private int saldoCliente;

    // CONSTRUTOR
    public Cliente(String nomeCliente, int compraCliente, int saldoCliente) {
        this.nomeCliente = nomeCliente;
        this.compraCliente = compraCliente;
        this.saldoCliente = saldoCliente;
    }

    public Cliente() {
    }

    public Cliente(String descricao, float preco, int estoque, int compra, int venda, String nomeCliente, int compraCliente, int saldoCliente) {
        super(descricao, preco, estoque, compra, venda);
        this.nomeCliente = nomeCliente;
        this.compraCliente = compraCliente;
        this.saldoCliente = saldoCliente;
    }

    // GETTERS E SETTERS
    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getCompraCliente() {
        return compraCliente;
    }

    public void setCompraCliente(int compraCliente) {
        this.compraCliente = compraCliente;
    }

    public int getSaldoCliente() {
        return saldoCliente;
    }


    // MÉTODOS
    public  void saldoTotalCliente() {
        saldoCliente += compraCliente;
    }

    public String dadosCliente() {
        return "Cliente: "
                + getNomeCliente()
                + "\n"
                + "Quantidade última compra: "
                + getCompraCliente()
                + "\n"
                + "Saldo do Cliente: "
                + getSaldoCliente()
                + "\n";
    }
}