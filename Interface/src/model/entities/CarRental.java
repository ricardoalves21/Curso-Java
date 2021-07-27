package model.entities;

import java.util.Date;

public class CarRental {  // aluguel de carro

    // ATRIBUTOS
    private Date start;  // data inicial
    private Date finish;  //  data final

    // ASSOCIAÇÕES DE CLASSES
    private Vehicle vehicle;  // associando a classe 'CarRental' à classe 'Vehicle'
    private Invoice invoice;  // associando a classe 'CarRental' à classe 'Invoice'

    // CONSTRUTOR
    public CarRental() {
    }

    public CarRental(Date start, Date finish, Vehicle vehicle) {
        this.start = start;
        this.finish = finish;
        this.vehicle = vehicle;
    }

    // GETTERS E SETTERS
    public Date getStart() {
        return start;
    }

    public Date getFinish() {
        return finish;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
}
