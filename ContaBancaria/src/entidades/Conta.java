package entidades;

public class Conta {

    // ATRIBUTOS
    private String titular;
    private int agencia;
    private String conta;
    private float saldo;
    private float saque;
    private float deposito;

    // CONSTRUTOR
    public Conta() {
        this.setSaldo(0);
    }

    public Conta(String titular, int agencia, String conta, float saldo) {
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

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getSaque() {
        return saque;
    }

    public void setSaque(float saque) {
        this.saque = saque;
    }

    public float getDeposito() {
        return deposito;
    }

    public void setDeposito(float deposito) {
        this.deposito = deposito;
    }

    // METODOS
    public void depositar() {
        this.setSaldo(this.getSaldo() + this.getDeposito());
    }

    public void sacar() {
        if (this.getSaldo() >= this.getSaque()) {
            this.setSaldo(this.getSaldo() - this.getSaque());
        } else {
            System.out.println("Saldo insuficiente!");
        }
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
