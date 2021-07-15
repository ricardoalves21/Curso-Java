package entidades;

public class Colaborador {

    // ATRIBUTOS
    private String nome;
    private String cargo;
    private int idade;
    private float salario = 1500;

    // CONSTRUTOR
    public Colaborador(String nome, String cargo, int idade, float salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.idade = idade;
        this.salario = salario;
    }

    public Colaborador(String nome, String cargo, int idade) {
        this.nome = nome;
        this.cargo = cargo;
        this.idade = idade;
    }

    public Colaborador(){
    }

    // GETTERS E SETTERS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    // METODOS
    public String dadosColaborador() {
        return
                "Nome: "
                + nome
                + "\n"
                + "Cargo: "
                + cargo
                + "\n"
                + "Idade: "
                + idade
                + "\n"
                + "Salário: "
                + this.getSalario()
                + "\n";

    }

}
