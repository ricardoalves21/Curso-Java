package entities;

import Service.Prestacao;
import java.util.Date;

public class Contrato {

    // ATRIBUTOS
    private Integer numero;
    private Date dataContrato;
    private Double valorContrato;

    // ASSOCIAÇÕES DE CLASSE
    private Prestacao prestacao;

    // CONSTRUTOR
    public Contrato() {
    }

    public Contrato(Integer numero, Date data, Double valorContrato, Prestacao prestacao) {
        this.numero = numero;
        this.dataContrato = data;
        this.valorContrato = valorContrato;
        this.prestacao = prestacao;
    }

    public Contrato(Integer numero, Date data) {
        this.numero = numero;
        this.dataContrato = data;
    }

    public Contrato(Integer numero, Date data, Double valorContrato) {
        this.numero = numero;
        this.dataContrato = data;
    }

    // GETTERS E SETTERS
    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Date getData() {
        return dataContrato;
    }

    public void setData(Date data) {
        this.dataContrato = data;
    }

    public Double getValorTotal() {
        return valorContrato;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorContrato = valorTotal;
    }

    public Prestacao getPrestacao() {
        return prestacao;
    }

    public void setPrestacao(Prestacao prestacao) {
        this.prestacao = prestacao;
    }
}
