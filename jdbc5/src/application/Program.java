package application;

import db.DB;
import db.DbException;
import db.DbIntegrityException;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {



    // Método Principal
    public static void main(String[] args) {

        Connection conn = null;
        Statement st = null;

        try {
            conn = DB.getConnection();

            conn.setAutoCommit(false); // Esta cláusula controla a transação só confirmando todas as transações após a leitura do comando 'commit()'

            st = conn.createStatement();

            int rows1 = st.executeUpdate("UPDATE seller SET BaseSalary = 2090 WHERE DepartmentId = 1");

//            int x = 1;
//            if (x < 2) {
//                throw new SQLException("Fake error!");
//            }

            int rows2 = st.executeUpdate("UPDATE seller SET BaseSalary = 3090 WHERE DepartmentId = 2");

            conn.commit(); // Fim do comando 'commit() e conclusão das transações'

            System.out.println("rows1 = " + rows1);
            System.out.println("rows2 = " + rows2);

        } catch (SQLException e) {
            try {
                conn.rollback();
                throw new DbException("Transaction rolled back! Caused by: " + e.getMessage()); // Tratamento para caso seja executado o comando 'rollback()'
            } catch (SQLException e1) {
                throw new DbException("Error trying to rollback! Caused by: " + e1.getMessage()); // Tratamento para caso o comando 'rollback()' seja executado com erro
            }
        }
        finally {
            DB.closeStatment(st);
            DB.closeConnection();
        }

    }
}
