package escola;

import java.util.ArrayList;

public class Disciplina {


    // ATRIBUTOS
    private String nome;
    private int cargaHoraria;



    // ASSOCIAÇÕES
    private ArrayList<Professor> professores;
    private ArrayList<Turma> turmas;



    // CONSTRUTOR
    public Disciplina() {
        professores = new ArrayList<>();
    }



    // MÉTODOS ACESSORES
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {

        if (cargaHoraria >= 0) {
            this.cargaHoraria = cargaHoraria;
        }

    }



    // OUTROS MÉTODOS
    public void adicionaProfessor(Professor professor) {
        professores.add(professor);
    }

    public void excluirProfessor(Professor professor) {
        professores.remove(professor);
    }

    public int quantidadeProfessor() {
        return professores.size();
    }

    public Professor getProfessor(int posicao) {
        return professores.get(posicao);
    }

}
