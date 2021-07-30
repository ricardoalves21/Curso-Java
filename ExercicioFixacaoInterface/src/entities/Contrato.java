package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contrato {

    // ATRIBUTOS
    private Integer numero;
    private Date dataContrato;
    private Double valorContrato;

    // ASSOCIAÇÕES DE CLASSE FEITA POR LISTA
    List<Mensalidade> mensalidade = new ArrayList<>();

    // CONSTRUTOR
    public Contrato() {
    }

    public Contrato(Integer numero, Date dataContrato, Double valorContrato) {
        this.numero = numero;
        this.dataContrato = dataContrato;
        this.valorContrato = valorContrato;
    }

    // GETTERS E SETTERS
    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Date getDataContrato() {
        return dataContrato;
    }

    public void setDataContrato(Date dataContrato) {
        this.dataContrato = dataContrato;
    }

    public Double getValorContrato() {
        return valorContrato;
    }

    public void setValorContrato(Double valorContrato) {
        this.valorContrato = valorContrato;
    }

    public List<Mensalidade> getMensalidade() {  // para lista só precisamos do método get, pois não precisarei trocar a lista com o método set.
        return mensalidade;
    }
}
