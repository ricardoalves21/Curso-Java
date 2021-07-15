package entidades;

public class Atendente extends Colaborador {

    // ATRIBUTOS
    private float qtdAtendimento;
    private float grauSatisfacao;

    // CONSTRUTOR
    public Atendente(String nome, String cargo, int idade, float salario) {
        super(nome, cargo, idade, salario);
        this.qtdAtendimento = qtdAtendimento;
        this.grauSatisfacao = grauSatisfacao;
    }

    // GETTERS E SETTERS
    public float getQtdAtendimento() {
        return qtdAtendimento;
    }

    public void setQtdAtendimento(float qtdAtendimento) {
        this.qtdAtendimento = qtdAtendimento;
    }

    public float getGrauSatisfacao() {
        return grauSatisfacao;
    }

    public void setGrauSatisfacao(float grauSatisfacao) {
        this.grauSatisfacao = grauSatisfacao;
    }

    // MÉTODOS
    public float apuracaoAtendimento() {
        return this.qtdAtendimento / this.grauSatisfacao;
    }

    public float salarioAtendente() {
        return this.getSalario() * apuracaoAtendimento();
    }


}
