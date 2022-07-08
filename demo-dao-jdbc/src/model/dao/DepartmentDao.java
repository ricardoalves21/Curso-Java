package model.dao;

import model.entities.Department;
import model.entities.Seller;
import java.util.List;

/* Esta INTERFACE será usada para chamar os métodos que serão usados associados ao Departamento. */

public interface DepartmentDao {

    void insert(Department obj);

    void update (Department obj);

    void deleteById(Integer id);

    Department findById(Integer id);

    List<Department> findAll();

}
