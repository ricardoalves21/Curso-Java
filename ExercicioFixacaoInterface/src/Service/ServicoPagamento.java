package Service;

import java.text.ParseException;
import java.util.Date;

public interface ServicoPagamento {

    Double calcularParcela(Double valorTotal, Double qtdParcelas);

    Date vencParcelas(Date dataContrato, Double qtdParcelas) throws ParseException {

    }

}
