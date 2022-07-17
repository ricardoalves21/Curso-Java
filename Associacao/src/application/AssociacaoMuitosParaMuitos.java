package application;

import escola.Disciplina;
import escola.Professor;

public class AssociacaoMuitosParaMuitos {

    public static void main(String[] args) {

        Disciplina disciplina1 = new Disciplina();
        disciplina1.setNome("Matematica");
        disciplina1.setCargaHoraria(80);

        Disciplina disciplina2 = new Disciplina();
        disciplina2.setNome("Portugues");
        disciplina2.setCargaHoraria(80);

        Professor professor1 = new Professor();
        professor1.setNome("Jão");
        professor1.setMatricula(123);
        professor1.setFormacaoAcademica("Licenciado");
        professor1.setSalario(10);

        Professor professor2 = new Professor();
        professor2.setNome("Maria");
        professor2.setMatricula(999);
        professor2.setFormacaoAcademica("Licenciada");
        professor2.setSalario(30);

        professor1.adicionaDisciplina(disciplina1);  // associação do professor com a disciplina
        professor1.adicionaDisciplina(disciplina2);  // associação do professor com a disciplina
        professor2.adicionaDisciplina(disciplina2);
        disciplina1.adicionaProfessor(professor1);  // associação da disciplina com o professor
        disciplina2.adicionaProfessor(professor1);
        disciplina2.adicionaProfessor(professor2);

        System.out.println("DISCIPLINAS DO PROFESSOR JÃO:");
        for (int i = 0 ; i < professor1.quantidadeDisciplinas(); i++ ) {
            System.out.println(professor1.getDisciplina(i).getNome());
        }

        System.out.println("\nPROFESSORES DA DISCIPLINA DE PORTUGUES:");
        for (int i = 0 ; i < disciplina2.quantidadeProfessor(); i++ ) {
            System.out.println(disciplina2.getProfessor(i).getNome());
        }

    }

}
