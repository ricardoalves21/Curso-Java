package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // criando o Scanner para registrar entrada de dados pelo usuário
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao(); // criando a variável 'departmentDao' e atribuindo a ela a rota de conexão com o banco de dados
        SellerDao sellerDao = DaoFactory.createSellerDao();

//        System.out.println("\n====== TEST 1: department insert ======");
//        Department newDepartment = new Department(null, "Marketing");
//        departmentDao.insert(newDepartment);
//        System.out.println("Inserted! New id = " + newDepartment.getId());

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////

//        System.out.println("\n====== TEST 2: department findById ======");
//        Department department = departmentDao.findById(7);
//        System.out.println(department);

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////

//        System.out.println("\n====== TEST 3: department update ======");
//        Department department = departmentDao.findById(7);
//        department.setName("Production");
//        departmentDao.update(department);
//        System.out.println("Update Completed");

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////

//        System.out.println("\n====== TEST 4: department delete ======");
//        System.out.print("Enter id for delete the department: ");
//        int id = sc.nextInt();
//        departmentDao.deleteById(id);
//        System.out.println("Delete completed");
//        sc.close();

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println("\n====== TEST 5: department findAll ======");
        List<Department> list = departmentDao.findAll();

        for (Department obj : list) {
            System.out.println(obj);
        }

    }

}