package application;

import escola.Disciplina;

public class Program {

    public static void main(String[] args) {

        // Instanciação
        Disciplina disciplina1 = new Disciplina();
        disciplina1.setNome("Ricardo");
        disciplina1.setCargaHoraria(2);

        System.out.println(disciplina1.getNome());
        System.out.println(disciplina1.getCargaHoraria());

    }

}
