package model.entities;

import model.exceptions.DomainException;

public class Account {

    // ATRITUBOS
    private Integer number;  // numero
    private String holder;  //  titular
    private Double balance;  // saldo
    private Double withdrawLimit;  // limite de saque

    // CONSTRUTOR
    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Account() {
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
        balance += amount;
    }

    public void withdraw (Double amount) throws DomainException {  // saque
        if (amount > withdrawLimit) {
            throw new DomainException("The amount exceeds withdraw limit");
        } else if (amount > balance) {
            throw new DomainException("Not enough balance");
        } else {
            balance -= amount;
        }
    }

    public String newBalance() {
        return "New balance: "
                + String.format("%.2f", balance);
    }

}
