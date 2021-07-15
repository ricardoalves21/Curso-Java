package entidades;

public class Gerente extends Colaborador {

    // CONSTRUTOR
    public Gerente(String nome, String cargo, int idade, float salario) {
        super(nome, cargo, idade, salario);
    }

    public Gerente() {
        super();
    }

    public Gerente(String nome, String cargo, int idade) {
        super(nome, cargo, idade);
    }

    // MÉTODOS
    public void receberSalario() {
        this.setSalario(getSalario() * 5);
    }

    @Override
    public String dadosColaborador() {
        return
                "Nome: "
                        + getNome()
                        + "\n"
                        + "Cargo: "
                        + getCargo()
                        + "\n"
                        + "Idade: "
                        + getIdade()
                        + "\n"
                        + "Salário: "
                        + getSalario()
                        + "\n";

    }

}
