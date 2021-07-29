package Service;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Prestacao implements ServicoPagamento {

    // ATRIBUTOS
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private Date dataVencimento;
    private Double qtdParcelas;


    // CONSTRUTOR
    public Prestacao() {
    }

    public Prestacao(double valorContrato, double qtdParcelas) {
    }

    // GETTERS E SETTERS
    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Double getQtdParcelas() {
        return qtdParcelas;
    }

    public void setQtdParcelas(Double qtdParcelas) {
        this.qtdParcelas = qtdParcelas;
    }

    // MÉTODOS
    public double calcularParcela(Double valorContrato, Double qtdParcelas, int numParc) {
            double parcSemJuros = valorContrato / qtdParcelas;
            double jurosParc = parcSemJuros * 0.01 * numParc;
            double parcComJuros = parcSemJuros + jurosParc;
            double parcCalculada = parcComJuros * 0.02 + parcComJuros;
            return parcSemJuros;
    }


//    public Date vencParcelas(Date dataContrato, Double qtdParcelas) throws ParseException {
//
//        Calendar cal = Calendar.getInstance();
//        cal.setTime(dataContrato);
//        Date dtVencimento = null;
//
//        int dia = cal.get(Calendar.DAY_OF_MONTH);  // extrair o di 29
//        int mes = 2 + cal.get(Calendar.MONTH);  // extrair o mes 07
//        int ano = cal.get(Calendar.YEAR);  // extrair o ano 2021
//
//        for (int i = 1; i <= qtdParcelas; i++) {
//
//            String venc = dia + "/" + mes + "/" + ano;
//            dtVencimento = sdf.parse(venc);
//            sdf.format(dtVencimento);
//            this.setVencimento(dtVencimento);
//            mes += 1;
//
//        }
//        return dtVencimento;
//    }


    @Override
    public String toString() {
        return "Prestacao{" +
                "dataVencimento=" + dataVencimento +
                ", qtdParcelas=" + qtdParcelas +
                '}';
    }
}
