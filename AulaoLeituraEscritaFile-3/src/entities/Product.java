package entities;

import java.io.Serializable;

public class Product implements Serializable {  // permite que meu objeto do tipo Product seja transformado em uma sequência de bytes

    private static final long serialVersionUID = 1L;

    private String name;
    private Double price;
    private Integer quantity;

    public Product() {
    }

    public Product(String name, Double price, Integer quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

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

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public double total() {
        return price * quantity;
    }

    @Override
    public String toString() {
        return  name
                + "   "
                + String.format("%.2f", price)
                + "   "
                + quantity
                + "   "
                + String.format("%.2f", total());
    }
}
