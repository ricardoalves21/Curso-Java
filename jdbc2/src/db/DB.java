package db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class DB {



    // ATRIBUTOS
    private static Connection conn = null;



    // Método para LER dados de entrada
    private static Properties loadProperties() {

        try (FileInputStream fs = new FileInputStream("db.properties")) {  // apontando a leitura para o arquivo 'db.properties' para dentro do objeto 'fs'
            Properties props = new Properties();  // Criando um objeto do tipo 'Properties'
            props.load(fs);  // Fazendo o objeto 'props' rodar o arquivo guardado dentro do objeto 'fs'
            return props;  // Retornando o objeto 'props' que rodou o arquivo 'db.properties' guardado no objeto 'fs'
        }
        catch (IOException e) {  // Caso seja gerada uma exceção
            throw new DbException(e.getMessage());  // A classe 'DbException' chamará o seu construtor passando a mensagem capturada pela classe 'IOException' 'e.getMessage()'
        }

    }



    // Método para pegar a conexão
    public static Connection getConnection() {

        if (conn == null) {  // Caso a conexão não tenha sido iniciada
            try {
                Properties props = loadProperties();  // A variável 'props' receberá o método 'loadProperties' criado anteriormente
                String url = props.getProperty("dburl");  // A variável 'url' pegará a propriedade 'dburl' de dentro da variável 'props'
                conn = DriverManager.getConnection(url, props);  // A variável 'conn' receberá da classe 'DriverManager' a conexão que foi pega da variável 'props' e da propriedade capturada pela variável 'url'
            }
            catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
        return conn;  // Retornará a variável 'conn' responsável por estabelecer a conexão
    }



    // Método para fechar a conexão
    public static void closeConnection() {

        if (conn != null) {  // Se a conexão estiver estabelecida
            try {
                conn.close();  // Fechar a conexão
            }
            catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }

    }



    // Método para fechar as declarações de sql (queryes)
    public static void closeStatment(Statement st) {

            if (st != null) {  // Se a variável 'st' estiver em uso
                try {
                    st.close();  // Encerrar a variável 'st'
                } catch (SQLException e) {
                    throw new DbException(e.getMessage());
                }
            }

    }



    // Método para fechar o 'ResultSet'
    public static void closeResultSet(ResultSet rs) {

        if (rs != null) {  // Se o resultSet estiver em uso
            try {
                rs.close();  // Fechar o resultSet
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }

    }



}