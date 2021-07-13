package entities;

public class SavingsAccount extends Account {

    private Double interestRate; // taxa de juros

    public SavingsAccount() {
        super();
    }

    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) { // construtor da super classe
        super(number, holder, balance);
        this.interestRate = interestRate; // atributo desta classe
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance() {
        balance += balance * interestRate; // saldo += saldo * taxa de juros
    }

    @Override
    public void withdraw(double amount) {
        balance -= amount;
    }
    
}
