package model.entities;

public class Account {

    // ATRITUBOS
    private Integer number;  // numero
    private String holder;  //  suporte
    private Double balance;  // saldo
    private Double withdrawLimit;  // limite de saque

    // CONSTRUTOR
    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    // GETTERS E SETTERS
    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    // MÉTODOS
    public void deposit(Double amount) {  // deposito
    }

    public void withdraw(Double amount) {  // saque

    }

}
