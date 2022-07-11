package escola;

import java.util.ArrayList;

public class Turma {

    // ATRIBUTOS
    private String sigla;
    private int ano;

    // ASSOCIACOES
    private ArrayList<Aluno> alunos;
    private ArrayList<Professor> professores;
    private ArrayList<Disciplina> disciplinas;

    // METODOS ACESSORES
    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    // OUTROS METODOS
    void adicionarAluno() {}

}
