package entidades;

public class Conta {

    // ATRIBUTOS
    private String titular;
    private int agencia;
    private String conta;
    private Double saldo;

    // CONSTRUTOR
    public Conta(String titular, int agencia, String conta, Double saldo) {
        this.titular = titular;
        this.agencia = agencia;
        this.conta = conta;
        this.saldo = saldo;
    }

    // GETTERS E SETTERS
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    // METODOS
    public Double deposito(Double valor) {
        return saldo += valor;
    }

    public void saque(Double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente!");
        } else {
            saldo -= valor;
        }
    }

    public Double saldoFinal() {
        return saldo;
    }

    public String dadosConta() {
        return titular
                + "\n"
                + "Agência: "
                + agencia
                + "\n"
                + "Conta: "
                + conta
                + "\n"
                + "Saldo: "
                + saldo
                + "\n";
    }
}
