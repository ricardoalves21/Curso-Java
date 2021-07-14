package entities;

public class ImportedProduct extends Product {

    // ATRIBUTOS
    private Double customsFee;

    // CONSTRUTOR
    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    // GETTERS E SETTERS
    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    // MÉTODOS
    public Double totalPrice() {
        return getPrice() + customsFee;
    }

    @Override
    public String priceTag() {
        return getName()
                        + " $ "
                        + String.format("%.2f", totalPrice())
                        + " (Customs fee: $ "
                        + String.format("%.2f", customsFee)
                        + ")";
    }

}
