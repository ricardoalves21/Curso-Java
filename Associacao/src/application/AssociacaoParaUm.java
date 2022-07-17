package application;

import escola.Aluno;
import escola.Turma;
import java.util.Date;

public class AssociacaoParaUm {

    public static void main(String[] args) {

        Turma turma1 = new Turma();
        turma1.setSigla("1A");
        turma1.setAno(1);

        Aluno aluno1 = new Aluno();
        aluno1.setNome("Jão");
        aluno1.setMatricula(123);
        aluno1.setDataNascimento(new Date());
        aluno1.setTurma(turma1);
        turma1.adicionarAluno(aluno1);

        Aluno aluno2 = new Aluno();
        aluno2.setNome("Zé");
        aluno2.setMatricula(999);
        aluno2.setDataNascimento(new Date());
        aluno2.setTurma(turma1);
        turma1.adicionarAluno(aluno2);

        System.out.println("DADOS DO ALUNO");
        System.out.println(aluno1.getNome());
        System.out.println(aluno1.getTurma().getSigla());

        System.out.println("ALUNOS DA TURMA");
        for (int i = 0 ; i < turma1.quantidadeAlunos() ; i++) {
            System.out.println(turma1.getAluno(i).getNome());
        }

    }

}
