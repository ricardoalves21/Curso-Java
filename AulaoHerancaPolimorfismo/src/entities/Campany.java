package entities;

public class Campany extends TaxPayer {

    // ATRIBUTOS
    private int numberOfEmployees;

    // CONSTRUTOR


    public Campany(String name, Double anualIncome, int numberOfEmployees) {
        super(name, anualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public Campany() {
        super();
    }

    // GETTERS E SETTERS
    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    // MÉTODOS
    @Override
    public double tax() {
        if (numberOfEmployees > 10) {
            return getAnualIncome() * 0.14;
        } else {
            return getAnualIncome() * 0.16;
        }
    }
}
