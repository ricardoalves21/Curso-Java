package entidades;

public class Vendedor extends Colaborador {

    // ATRIBUTOS
    private float comissao;
    private float venda;

    // CONSTRUTOR
    public Vendedor(String nome, String cargo, int idade, float salario) {
        super(nome, cargo, idade, salario);
        this.comissao = comissao;
        this.venda = venda;
    }

    // GETTERS E SETTERS
    public float getComissao() {
        return comissao;
    }

    public void setComissao(float comissao) {
        this.comissao = comissao;
    }

    public float getVenda() {
        return venda;
    }

    public void setVenda(float venda) {
        this.venda = venda;
    }

    // MÉTODOS
    public float salariComissao() {
        return venda * comissao;
    }

}
