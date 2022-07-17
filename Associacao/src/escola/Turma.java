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



    // METODO CONSTRUTOR
    public Turma() {
        alunos = new ArrayList<Aluno>();
    }



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
    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }
    public int quantidadeAlunos() {
        return alunos.size();
    }
    public void excluirAluno(Aluno aluno) {
        alunos.remove(aluno);
    }
    public Aluno getAluno(int posicao) {
        return alunos.get(posicao);
    }


}
