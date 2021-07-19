package entities;

public abstract class TaxPayer {  // se a classe possui pelo menos um método abstrato a classe deverá ser abstrata.

    // ATRIBUTOS
    private String name;
    private Double anualIncome;

    // CONSTRUTOR
    public TaxPayer(String name, Double anualIncome) {
        this.name = name;
        this.anualIncome = anualIncome;
    }

    public TaxPayer() {
    }

    // GETTERS E SETTERS
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAnualIncome() {
        return anualIncome;
    }

    public void setAnualIncome(Double anualIncome) {
        this.anualIncome = anualIncome;
    }

    // MÉTODOS
    public abstract double tax(); // método abstrato

    public String taxesPaid() {
        return name
                + ": $ "
                + String.format("%.2f", tax());
    }
}
