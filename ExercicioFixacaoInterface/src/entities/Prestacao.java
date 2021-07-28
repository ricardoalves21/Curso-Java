package entities;

import Service.ServicoPagamento;

import java.util.Date;

public class Prestacao implements ServicoPagamento {

    // ATRIBUTOS
    private Date dataVencimento;
    private Double qtdParcelas;

    // CONTRUTOR
    public Prestacao() {
    }

    public Prestacao(Date vencimento, Double qtdParcelas) {
        this.dataVencimento = vencimento;
        this.qtdParcelas = qtdParcelas;
    }

    // GETTERS E SETTERS
    public Date getVencimento() {
        return dataVencimento;
    }

    public void setVencimento(Date vencimento) {
        this.dataVencimento = vencimento;
    }

    public Double getQtdParcelas() {
        return qtdParcelas;
    }

    public void setQtdParcelas(Double qtdParcelas) {
        this.qtdParcelas = qtdParcelas;
    }

    @Override
    public double calcularParcela(Double valorContrato, Double qtdParcelas, int numParc) {

        double parcSemJuros = (valorContrato / qtdParcelas);
        double jurosParc = ((valorContrato / qtdParcelas) * 0.01 * numParc);
        double parcComJuros = parcSemJuros + jurosParc;
        double parcCalculada = parcComJuros + (parcComJuros * 0.02);

        return parcCalculada;
    }
}
