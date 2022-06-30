package application;

import model.dao.Department;
import model.dao.Seller;
import java.util.Date;

public class Program {



    // Método Principal
    public static void main(String[] args) {

        Department obj = new Department(1, "Books");
        Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000.0, obj);
        System.out.println(seller);

    }
}
