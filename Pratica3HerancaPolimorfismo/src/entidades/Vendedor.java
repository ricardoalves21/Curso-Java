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

    public Vendedor(String nome, String cargo, int idade) {
        super(nome, cargo, idade);
        this.comissao = comissao;
        this.venda = venda;
    }

    public Vendedor() {
        super();
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
    public void salarioComissao() {
        this.setSalario(getSalario() + venda * comissao);
    }

    @Override
    public String dadosColaborador() {
        return
                "Nome: "
                        + getNome()
                        + "\n"
                        + "Cargo: "
                        + getCargo()
                        + "\n"
                        + "Idade: "
                        + getIdade()
                        + "\n"
                        + "Salário: "
                        + getSalario()
                        + "\n";

    }

}
