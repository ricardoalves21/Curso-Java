package Service;

public class ServicoPaypal implements ServicosPagamento {  // esta classe será a responsável por implementar os métodos descritos na interface.

    // CONSTANTES GLOBAIS
    private static final double TAXA_PAGAMENTO = 0.02;
    private static final double JUROS = 0.01;

    // MÉTODOS
    @Override
    public double taxaPagamento(double valorPagamento) {  // calcula apenas a taxa de pagamento
        return valorPagamento * TAXA_PAGAMENTO;
    }

    @Override
    public double juros(double valorPagamento, Integer meses) {  // calcula apenas a taxa de juros
        return valorPagamento * meses * JUROS;
    }
}


