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
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao(); // criando a rota de conexão com o banco de dados

        System.out.println("\n====== TEST 1: department insert ======");
        Department newDepartment = new Department(null, "Finance");
        departmentDao.insert(newDepartment);
        System.out.println("Inserted! New id = " + newDepartment.getId());

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println("\n====== TEST 2: department findById ======");
        Department department = departmentDao.findById(5);
        System.out.println(department);

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////

//        System.out.println("\n====== TEST 2: seller findByDepartment ======");
//        Department department = new Department(2, null);
//        List<Seller> list = sellerDao.findByDepartment(department);
//
//        for (Seller obj : list) {
//            System.out.println(obj);
//        }

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////

//        System.out.println("\n====== TEST 3: seller findAll ======");
//        list = sellerDao.findAll();
//
//        for (Seller obj : list) {
//            System.out.println(obj);
//        }

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////

//        System.out.println("\n====== TEST 5: seller update ======");
//        seller = sellerDao.findById(1);
//        seller.setName("Martha Waine");
//        sellerDao.update(seller);
//        System.out.println("Update Completed");

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////

//        System.out.println("\n====== TEST 6: seller delete ======");
//        System.out.print("Enter id for delete test: ");
//        int id = sc.nextInt();
//        sellerDao.deleteById(id);
//        System.out.println("Delete completed");
//        sc.close();

    }

}