package entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado extends Produto{

    // ATRIBUTOS
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy"); // criando um padrão de apresentação de datas
    private Date dataValidade; // variável que guardará a data

    // CONSTRUTOR
    public ProdutoUsado(String nome, Double preco, Date dataValidade) {
        super(nome, preco);
        this.dataValidade = dataValidade;
    }

    // GETTERS E SETTERS
    public Date getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }

    // MÉTODOS
    @Override
    public String etiquetaPreco() {
        return getNome()
                + " (usado) $ "
                + String.format("%.2f", getPreco())
                + " (Data de Validade: "
                + sdf.format(dataValidade) // junção do formato estabelecido para a data com variável (atributo) que recebe a data
                + ")";
    }
}
