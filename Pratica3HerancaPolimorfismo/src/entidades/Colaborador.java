package entidades;

public abstract class Colaborador {

    // ATRIBUTOS
    private String nome;
    private String cargo;
    private int idade;
    private float salario;

    // CONSTRUTOR
    public Colaborador(String nome, String cargo, int idade, float salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.idade = idade;
        this.salario = 1500;
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

}