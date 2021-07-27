package model.entities;

public class Invoice {  // fatura

    // ATRIBUTOS
    private Double basicPayment; // pagamento básico
    private Double tax;  // imposto

    // CONSTRUTOR
    public Invoice() {
    }

    public Invoice(Double basicPayment, Double tax) {
        this.basicPayment = basicPayment;
        this.tax = tax;
    }

    // GETTERS E SETTERS
    public Double getBasicPayment() {
        return basicPayment;
    }

    public Double getTax() {
        return tax;
    }

    // MÉTODOS
    public Double getTotalPayment() {
        return getBasicPayment() + getTax();
    }
}
