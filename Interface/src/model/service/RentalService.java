package model.service;

import model.entities.CarRental;
import model.entities.Invoice;

public class RentalService {  // serviço de aluguel

    // ATRIBUTOS
    private Double pricePerDay;  // preço por dia
    private Double pricePerHour;  // preço por hora

    // ASSOCIAÇÕES DE CLASSE
    private BrazilTaxService taxService;  // imposto pelo serviço

    // CONSTRUTOR
    public RentalService(Double pricePerDay, Double pricePerHour, BrazilTaxService taxService) {
        this.pricePerDay = pricePerDay;
        this.pricePerHour = pricePerHour;
        this.taxService = taxService;
    }

    // METODOS
    public void processInvoice(CarRental carRental) {  // processar fatura

        long t1 = carRental.getStart().getTime(); // esse comando pega o valor em milisegundos da minha data inicial
        long t2 = carRental.getFinish().getTime(); // esse comando pega o valor em milisegundas da minha data final
        double hours = (double) (t2 - t1) / 1000 / 60 / 60;  // pegamos o resultado em double para termos o valor em decimais a fim de que possamos fazer a operação matemática de arredondamento
        double basicPayment;  // pagamento básico

        if (hours <= 12.0) {
            basicPayment = Math.ceil(hours) * pricePerHour;
        } else {
            basicPayment = Math.ceil(hours / 24) * pricePerDay;
        }

        double tax = taxService.tax(basicPayment);  // imposto

        carRental.setInvoice(new Invoice(basicPayment, tax));

    }
}
