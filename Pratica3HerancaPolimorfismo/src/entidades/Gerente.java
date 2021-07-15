package entidades;

public class Gerente extends Colaborador {

    // ATRIBUTOS
    private float salario;

    // CONSTRUTOR
    public Gerente(String nome, String cargo, int idade, float salario) {
        super(nome, cargo, idade, salario);
        this.salario = salario;
    }

    // GETTERS E SETTERS
    @Override
    public float getSalario() {
        return salario;
    }

    @Override
    public void setSalario(float salario) {
        this.salario = salario;
    }

    // MÉTODOS
    public void receberSalario() {
        this.setSalario(this.getSalario() * 5);
    }

}
