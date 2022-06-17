package application;

import db.DB;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {



    // Método Principal
    public static void main(String[] args) {



        // Criando variáveis e objetos a serem utilizados neste código
        Connection conn = null;  // criei uma variável para guardar a conexão com o banco de dados
        PreparedStatement st = null;  // criei uma variável para escrever minhas queryes com o banco de dados
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");  // criei uma variável para estabelecer um padrão para datas


        try {

            conn = DB.getConnection();  // a variável 'conn' está chamando o método 'getConnection()' da classe DB



            /*
            st = conn.prepareStatement(
                    "DELETE FROM seller "
                            + "WHERE id = ? ",
                    Statement.RETURN_GENERATED_KEYS);

            st.setInt(1, 7);
            */



            st = conn.prepareStatement(
                    "INSERT INTO seller "
                    + "(Name, Email, BirthDate, BaseSalary, DepartmentId) "
                    + "VALUES "
                    + "(?, ?, ?, ?, ?)",
                    Statement.RETURN_GENERATED_KEYS);

            st.setString(1, "Ricardo");
            st.setString(2, "ricardo@email.com");
            st.setDate(3, new java.sql.Date(sdf.parse("21/08/1981").getTime()));
            st.setDouble(4, 10000.0);
            st.setInt(5, 4);




            /*
            st = conn.prepareStatement("INSERT INTO department (Name) VALUES ('D1'), ('D2')",
                    Statement.RETURN_GENERATED_KEYS);  // executou a query retornou os valores das chaves geradas
             */



            // Bloco de código para registrar as linhas afetadas nas tabelas
            int rowsAffected = st.executeUpdate();  // a variável 'rowsAffected' está guardando a quantidade de registros gerados pela query

            if (rowsAffected > 0) {  // se a quantidade de registros gerados pela query e guardados na variável 'rowsAffected' for maior que zero
                ResultSet rs = st.getGeneratedKeys();  // a variável 'rs' do tipo 'ResultSet' guardará todas as chaves geradas pela query

                while (rs.next()) {  // enquanto houver registros para ler na variável 'rs' do tipo 'ResultSet'
                    int id = rs.getInt(1);  // a variável 'id' receberá o valor da primeira coluna do resultSet
                    System.out.println("Done! Id = " + id);  // apresentar a mensagem informando o valor da variável 'id'
                }

            }
            else {
                System.out.println("No rows affected!");
            }

        }
        catch (SQLException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        } finally {
            DB.closeStatment(st);  // antes de fechar a conexão é preciso fechar a declaração do sql
            DB.closeConnection();  // fechar a conexão sempre por último
        }



    }
}
