package entities;

public class Funcionario {


    // ATRIBUTOS
    private String nome;
    private int nrDocumento;
    private String funcao;
    private double salario;



    // ASSOCIAÇÃO
    Departamento departamento = new Departamento();



    // CONSTRUTOR
    public Funcionario() {
        this.salario = 1000.00;
    }



    // MÉTODOS ACESSORES
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNrDocumento() {
        return nrDocumento;
    }

    public void setNrDocumento(int nrDocumento) {
        this.nrDocumento = nrDocumento;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }



    // METODO TOSTRING
    @Override
    public String toString() {
        return "\nCADASTRO DE FUNCIONÁRIO: \n" +
                "Nome: " + nome + " \n" +
                "Número do Documento: " + nrDocumento + " \n" +
                "Funcao: " + funcao +  " \n" +
                "Salário: " + salario +  " \n" +
                "Departamento: " + departamento.getNmDepartamento() ;
    }
}
