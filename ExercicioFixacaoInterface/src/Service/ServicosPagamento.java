package Service;

public interface ServicosPagamento {  // todos os serviços de pagamentos devem ser inseridos nesta interface.
                                      // a interface serve como um contrato onde deverá ser relacionados os métodos que serão implementados

    double taxaPagamento(double valorPagamento);
    double juros(double valorPagamento, Integer meses);
}
