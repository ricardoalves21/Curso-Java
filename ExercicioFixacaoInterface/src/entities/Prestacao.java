package entities;

import Service.ServicoPagamento;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Prestacao extends Contrato implements ServicoPagamento {

    // ATRIBUTOS
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private Date dataVencimento;
    private Double qtdParcelas;
    private Double valorParcela;

    // CONTRUTOR
    public Prestacao(double valorContrato, double qtdParcelas) {
    }

    public Prestacao(Date vencimento, Double qtdParcelas) {
        this.dataVencimento = vencimento;
        this.qtdParcelas = qtdParcelas;
    }

    public Prestacao(Date vencimento, Double qtdParcelas, Double valorParcela) {
        this.dataVencimento = vencimento;
        this.qtdParcelas = qtdParcelas;
        this.valorParcela = valorParcela;
    }

    public Prestacao(Double qtdParcelas) {
        this.qtdParcelas = qtdParcelas;
    }

    public Prestacao(){
    }

    // GETTERS E SETTERS
    public String getVencimento() {
        return sdf.format(dataVencimento);
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

    public Double getValorParcela() {
        return valorParcela;
    }

    public void setValorParcela(Double valorParcela) {
        this.valorParcela = valorParcela;
    }

    @Override
    public Double calcularParcela(Double valorContrato, Double qtdParcelas) {

        double parcCalculada = 0;
        for (int numParc = 1; numParc <= qtdParcelas; numParc++) {

            double parcSemJuros = valorContrato / qtdParcelas;
            double jurosParc = parcSemJuros * 0.01 * numParc;
            double parcComJuros = parcSemJuros + jurosParc;
            parcCalculada = parcComJuros * 0.02 + parcComJuros;
            this.setValorParcela(parcCalculada);
        }
    }

    @Override
    public Date vencParcelas(Date dataContrato, Double qtdParcelas) throws ParseException {

        Calendar cal = Calendar.getInstance();
        cal.setTime(dataContrato);

        int dia = cal.get(Calendar.DAY_OF_MONTH);  // 28
        int mes = 1 + cal.get(Calendar.MONTH);  // 07
        int ano = cal.get(Calendar.YEAR);  // 2021

        for (int i = 1; i <= qtdParcelas; i++) {

            String venc = dia + "/" + mes + "/" + ano;
            Date vencim = sdf.parse(venc);
            sdf.format(vencim);
            this.setVencimento(vencim);
            mes += 1;

        }
    }

    public String parcelamento() {
        return
                getVencimento()
                + "   "
                + getValorParcela();
    }
}
