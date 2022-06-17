package application;

import db.DB;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Program {


    public static void main(String[] args) {

        Connection conn = null; // para conectar com o banco de dados
        Statement st = null; // para escrever as querys
        ResultSet rs = null; // para guardar o resultado das querys

        try {
            conn = DB.getConnection();
            st = conn.createStatement();
            rs = st.executeQuery("Select * from seller");

            while (rs.next()) {
                System.out.println(rs.getInt("Id")
                        + "| "
                        + rs.getString("Name")
                        + "| "
                        + rs.getString("Email")
                        + "| "
                        + rs.getDate("BirthDate")
                        + "| "
                        + rs.getDouble("BaseSalary")
                        + "| "
                        + rs.getInt("DepartmentId")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DB.closeResultSet(rs);
            DB.closeStatment(st);
            DB.closeConnection();
        }

    }
}
