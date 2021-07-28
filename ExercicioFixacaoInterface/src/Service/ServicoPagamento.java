package Service;

public interface ServicoPagamento {

    double calcularParcela(Double valorTotal, Double qtdParcelas, int numParc);
}
