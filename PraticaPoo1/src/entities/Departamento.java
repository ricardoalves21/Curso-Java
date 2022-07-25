package entities;

import java.util.ArrayList;

public class Departamento {


    // ATRIBUTOS
    public String nmDepartamento;



    // ASSOCIACAO
    private ArrayList<Funcionario> funcionarios = new ArrayList<>();



    // MÉTODOS ACESSORES
    public String getNmDepartamento() {
        return nmDepartamento;
    }

    public void setNmDepartamento(String nmDepartamento) {
        this.nmDepartamento = nmDepartamento;
    }



    // OUTROS MÉTODOS
    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void excluirFuncionario(Funcionario funcionario) {
        funcionarios.remove(funcionario);
    }

    public int quantidadeFuncionarios() {
        return funcionarios.size();
    }

    public Funcionario getFuncionario(int posicao) {
        return funcionarios.get(posicao);
    }

}
