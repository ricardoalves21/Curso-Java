package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Mensalidade {

    // ATRIBUTOS
    private Date dataVencimento;
    private Double valorParcela;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    // CONSTRUTOR
    public Mensalidade() {
    }

    public Mensalidade(Date dataVencimento, Double valorParcela) {
        this.dataVencimento = dataVencimento;
        this.valorParcela = valorParcela;
    }

    // GETTERS E SETTERS
    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Double getValorParcela() {
        return valorParcela;
    }

    public void setValorParcela(Double valorParcela) {
        this.valorParcela = valorParcela;
    }

    // TO STRING
    @Override
    public String toString() {
        return
                sdf.format(dataVencimento) + " - " + String.format("%.2f", valorParcela);
    }

}
