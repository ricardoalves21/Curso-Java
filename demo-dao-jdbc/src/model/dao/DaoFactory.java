package model.dao;

import db.DB;
import model.dao.impl.DepartmentDaoJDBC;
import model.dao.impl.SellerDaoJDBC;

/* Esta CLASSE será responsável somente para FABRICAR os DAOs (objetos de acesso a dados) */

public class DaoFactory {


    /* Este método retorna o CONSTRUTOR da classe 'SellerDaoJDBC' passando como parâmetro o método 'getConnection()'
    que está na classe 'DB' */
    public static SellerDao createSellerDao() {
        return new SellerDaoJDBC(DB.getConnection());
    }


    /* Este método retorna o CONSTRUTOR da classe 'DepartmentDaoJDBC' passando como parâmetro o método 'getConnection()'
    que está na classe 'DB' */
    public static DepartmentDao createDepartmentDao() {
        return new DepartmentDaoJDBC(DB.getConnection());
    }

}
