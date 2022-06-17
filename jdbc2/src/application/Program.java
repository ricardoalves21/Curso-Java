package application;

import db.DB;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {


    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");  // criei um padrão para datas
        Connection conn = null;  // criei uma variável para guardar a conexão com o banco de dados
        PreparedStatement st = null;  // criei uma variável para escrever minhas queryes com o banco de dados

        try {

            conn = DB.getConnection();  // a variável 'conn' está chamando o método 'getConnection()' da classe DB

            /*
            st = conn.prepareStatement(
                    "INSERT INTO seller "
                    + "(Name, Email, BirthDate, BaseSalary, DepartmentId) "
                    + "VALUES "
                    + "(?, ?, ?, ?, ?)",
                    Statement.RETURN_GENERATED_KEYS);

            st.setString(1, "Ricardo");
            st.setString(2, "ricardo@email.com");
            st.setDate(3, new java.sql.Date(sdf.parse("22/04/1985").getTime()));
            st.setDouble(4, 3000.0);
            st.setInt(5, 4);
            */

            /*
            st = conn.prepareStatement("INSERT INTO department (Name) VALUES ('D1'), ('D2')",
                    Statement.RETURN_GENERATED_KEYS);  // executou a query retornou os valores das chaves geradas

            int rowsAffected = st.executeUpdate();  // a variável 'rowsAffected' está guardando a quantidade de registros gerados pela query

            if (rowsAffected > 0) {  // se a quantidade de registros gerados pela query for maior que zero
                ResultSet rs = st.getGeneratedKeys();  // a variável rs do tipo ResultSet guardará todas as chaves geradas pela query
                while (rs.next()) {  // enquanto houver registros para ler
                    int id = rs.getInt(1);  // a variável 'id' receberá o valor da primeira coluna do resultSet
                    System.out.println("Done! Id = " + id);  // apresentar a mensagem informando o valor da variável 'id'
                }
            }
            else {
                System.out.println("No rows affected!");
            }
             */

            st = conn.prepareStatement("CREATE TABLE Cliente (Codigo INT NOT NULL AUTO_INCREMENT, Nome VARCHAR (60) NOT NULL, Data_Nascimento DATE, Telefone CHAR (8), PRIMARY KEY (Codigo))");

        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            DB.closeStatment(st);
            DB.closeConnection();
        }


    }
}
