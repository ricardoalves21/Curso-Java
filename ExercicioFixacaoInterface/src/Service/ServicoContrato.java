package Service;

import entities.Contrato;
import entities.Mensalidade;
import java.util.Calendar;
import java.util.Date;

public class ServicoContrato {  // responsável pelo processamento do contrato

    // ATRIBUTOS
    private ServicosPagamento servicosPagamento;  // inversão de controles e injeção de dependências.

    // CONSTRUTOR
    public ServicoContrato(ServicosPagamento servicosPagamento) {
        this.servicosPagamento = servicosPagamento;
    }

    // MÉTODOS


    // MÉTODO RESPONSÁVEL POR INSTANCIAR OS OBJETOS PARCELAS DO CONTRATO
    public void processarContrato (Contrato contrato, int meses) {

        double parcelaBasica = contrato.getValorContrato() / meses;  // parcela do contrato sem o juros.

        for (int i = 1; i <= meses; i++) {  // este looping irá calcular o valor de cada mensalidade

            // CALCULANDO O VALOR DAS MENSALIDADES
            double taxaAtualizada = parcelaBasica + servicosPagamento.juros(parcelaBasica, i);  // aqui estou somando a parcela basica (sem juros) ao juros.
            double taxaTotal = taxaAtualizada + servicosPagamento.taxaPagamento(taxaAtualizada);  // aqui estou somando a parcela com juros à taxa de pagamento.

            // CALCULANDO O VENCIMENTO DAS MENSALIDADES
            Date dataVencimento = addMeses(contrato.getDataContrato(), i);  // pego a data do contrato e vou adicionando i meses a cada loop (aumenta o mês a cada looping.

            // ADICIONANDO AS INSTANCIAS DE MENSALIDADES AO CONTRATO
            contrato.getMensalidade().add(new Mensalidade(dataVencimento, taxaTotal));
        }
    }


    // MÉTODO RESPONSÁVEL POR ADICIONAR OS MESES DE VENCIMENTO AO OBJETO PARCELAS
    private Date addMeses(Date date, int N) {
        Calendar calendar = Calendar.getInstance();  // instanciando o objeto 'calendar'
        calendar.setTime(date);  // setando a data do contrato
        calendar.add(Calendar.MONTH, N); // adicionando o número de meses 'N' ao calendário
        return calendar.getTime();  // retornando a data para o formato correto
    }

}
