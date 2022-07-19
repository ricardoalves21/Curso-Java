package application;

import entities.Departamento;
import entities.Funcionario;


public class Program {

    public static void main(String[] args) {

        //Scanner sc = new Scanner(System.in);

        Departamento departamento1 = new Departamento();
        departamento1.setNmDepartamento("TI");

        Departamento departamento2 = new Departamento();
        departamento1.setNmDepartamento("Marketing");

        Funcionario funcionario1 = new Funcionario();
        funcionario1.setNome("Ricardo");
        funcionario1.setNrDocumento(999);
        funcionario1.setFuncao("Developer");
        funcionario1.setSalario(5000.00);
        funcionario1.setDepartamento(departamento1);
        departamento1.adicionarFuncionario(funcionario1);


        Funcionario funcionario2 = new Funcionario();
        funcionario2.setNome("Elias");
        funcionario2.setNrDocumento(888);
        funcionario2.setFuncao("Analista de Marketing");
        funcionario2.setSalario(10000.00);
        funcionario2.setDepartamento(departamento2);
        departamento1.adicionarFuncionario(funcionario2);

//        Categoria categoria1 = new Categoria();
//        categoria1.setNmCategoria("Eletrônicos");
//
//        Produto produto1 = new Produto();
//        produto1.setNmProduto("Mouse");
//        produto1.setQtdEstoque(10);
//        produto1.setCategoria(categoria1);



        System.out.println("FUNCIONÁRIO DO TI: ");
        for (int i = 0 ; i < departamento1.quantidadeFuncionarios() ; i++) {
            System.out.println(departamento1.getFuncionario(i).getNome());
        }





    }

}
