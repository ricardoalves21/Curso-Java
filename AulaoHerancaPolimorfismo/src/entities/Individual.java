package entities;

public class Individual extends TaxPayer {

    // ATRIBUTOS
    private Double healthExpenditures;

    // CONSTRUTOR
    public Individual(String name, Double anualIncome, Double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Individual() {
        super();
    }

    // GETTERS E SETTERS
    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    // MÉTODOS
    @Override
    public double tax() {  // método abstrato da super classe sendo implementado

        double basicTax;

        if (getAnualIncome() < 20000) {
            basicTax = getAnualIncome() * 0.15;
        } else {
            basicTax = getAnualIncome() * 0.25;
        }

        basicTax -= getHealthExpenditures() * 0.5;

        if (basicTax < 0.0) {
            return 0.0;
        } else {
            return basicTax;
        }
    }
}
