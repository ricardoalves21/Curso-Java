package entities;

public class Product {

    // ATRIBUTOS
    private String name;
    private Double price;

    // CONSTRUTOR
    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    // GETTERS E SETTERS
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    // MÉTODOS
    public String priceTag() {
        return name
                    + " $ "
                    + String.format("%.2f", price);
    }
}
