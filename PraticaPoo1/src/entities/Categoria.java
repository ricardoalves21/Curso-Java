package entities;

import java.util.ArrayList;

public class Categoria {


    // ATRIBUTOS
    public String nmCategoria;



    // ASSOCIACAO
    private ArrayList<Produto> produtos;



    // MÉTODOS ACESSORES
    public String getNmCategoria() {
        return nmCategoria;
    }

    public void setNmCategoria(String nmCategoria) {
        this.nmCategoria = nmCategoria;
    }

}
