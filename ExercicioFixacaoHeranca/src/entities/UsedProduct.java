package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {

    // ATRIBUTOS
    private static final SimpleDateFormat sdf = new SimpleDateFormat(("dd/MM/yyyy")); // estabelecendo padrão de data
    private Date manufactureDate; // declarando a variável 'Date'

    // CONSTRUTOR
    public UsedProduct(String name, Double price, Date manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    // GETTERS E SETTERS
    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    // MÉTODOS
    @Override
    public String priceTag() {
        return getName()

                + " (used) $ "
                + String.format("%.2f", getPrice())
                + " (Manufacture date: "
                + sdf.format(manufactureDate)
                + ")";
    }
}
