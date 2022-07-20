package escola;

import java.util.ArrayList;

public class Professor extends Pessoa {

    // ATRIBUTOS
    private String formacaoAcademica;
    private double salario;

    // ASSOCIAÇÕES
    private ArrayList<Disciplina> disciplinas;
    private ArrayList<Turma> turmas;

    // CONSTRUTOR
    public Professor() {
        disciplinas = new ArrayList<Disciplina>();
    }

    // MÉTODOS ACESSORES
    public String getFormacaoAcademica() {
        return formacaoAcademica;
    }

    public void setFormacaoAcademica(String formacaoAcademica) {
        this.formacaoAcademica = formacaoAcademica;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // OUTROS MÉTODOS
    public void adicionaDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    public void excluirDisciplina(Disciplina disciplina) {
        disciplinas.remove(disciplina);
    }

    public int quantidadeDisciplinas() {
        return disciplinas.size();
    }

    public Disciplina getDisciplina(int posicao) {
        return disciplinas.get(posicao);
    }

    public void aplicarAvaliacao() {}


}
