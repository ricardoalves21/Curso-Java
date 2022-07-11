package escola;

import java.util.Date;

public class Aluno extends Pessoa {

    // ATRIBUTOS
    private Date dataNascimento;

    // ASSOCIACAO
    private Turma turma;

    // METODOS ACESSORES
    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    // OUTROS METODOS
    void realizarAvaliacao() {}

}
