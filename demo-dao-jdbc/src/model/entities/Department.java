package model.entities;

import java.io.Serializable;
import java.util.Objects;

/* Esta classe é a matriz responsável por gerar todos os departamentos */

public class Department implements Serializable {

    // SERIALIZAÇÃO
    private static final long serialVersionUID = 1L;


    // ATRIBUTOS
    private Integer id;
    private String name;


    // CONSTRUTOR VAZIO
    public Department() {}

    // CONSTRUTOR COM ARGUMENTOS
    public Department(Integer id, String name) {
        this.id = id;
        this.name = name;
    }


    // MÉTODOS ACESSORES
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    // EQUALS
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return id.equals(that.id) &&
                name.equals(that.name);
    }

    // HASHCODE
    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    // MÉTODO TO STRING
    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

}
