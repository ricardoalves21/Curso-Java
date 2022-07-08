package model.dao.impl;

import db.DB;
import db.DbException;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* Esta classe CRIA a conexão com o banco de dados e IMPLEMENTA os métodos criados na interface 'DepartmentDao'  */

public class DepartmentDaoJDBC implements DepartmentDao {


    // ATRIBUTOS
    private Connection conn;

    // CONSTRUTOR
    public DepartmentDaoJDBC(Connection conn) {
        this.conn = conn;
    }

    // MÉTODOS
    @Override
    public void insert(Department obj) {

        PreparedStatement st = null;

        try {
            st = conn.prepareStatement(
                    "INSERT INTO department "
                            + "(Name) "
                            + "VALUES (?)",
                    Statement.RETURN_GENERATED_KEYS); // preciso desse comando para pegar o 'Id' do novo departamento inserido

            st.setString(1, obj.getName());

            int rowsAffected = st.executeUpdate(); // para pegar a quantidade de linhas afetadas na tabela

            if (rowsAffected > 0) {
                ResultSet rs = st.getGeneratedKeys();
                if (rs.next()) {
                    int id = rs.getInt(1);
                    obj.setId(id);
                }
                DB.closeResultSet(rs);
            }
            else {
                throw new DbException("Unexpected error! No rows affected");
            }

        }
        catch (SQLException e) {
            throw new DbException(e.getMessage());
        }
        finally {
            DB.closeStatment(st);
        }

    }

    @Override
    public void update(Department obj) {

    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public Department findById(Integer id) {

        PreparedStatement st = null;
        ResultSet rs = null;

        try {
            st = conn.prepareStatement(
                    "SELECT department.* "
                            + "FROM department "
                            + "WHERE Id = ?");

            st.setInt(1, id); // aqui diz que o primeiro ponto de interrogacao de PreparedStatement receberá a coluna 'id' que chaga como parametro deste metodo.
            rs = st.executeQuery();

            if (rs.next()) {
                Department dep = instantiateDepartment(rs);
                return dep;
            }

            return null;

        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        }
        finally {
            DB.closeStatment(st);
            DB.closeResultSet(rs);
        }

    }

    @Override
    public List<Department> findAll() {
        return null;
    }

    private Department instantiateDepartment(ResultSet rs) throws SQLException {
        Department dep = new Department();
        dep.setId(rs.getInt("Id"));
        dep.setName(rs.getString("Name"));
        return dep;
    }


}
