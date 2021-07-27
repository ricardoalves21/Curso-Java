package model.entities;

import java.util.Date;

public class CarRental {  // aluguel de carro

    private Date start;  // data inicial
    private Date finish;  //  data final

    private Vehicle vehicle;  // associando a classe 'CarRental' à classe 'Vehicle'
    private Invoice invoice;  // associando a classe 'CarRental' à classe 'Invoice'

    public CarRental() {
    }

    public CarRental(Date start, Date finish, Vehicle vehicle) {
        this.start = start;
        this.finish = finish;
        this.vehicle = vehicle;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getFinish() {
        return finish;
    }

    public void setFinish(Date finish) {
        this.finish = finish;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
}
