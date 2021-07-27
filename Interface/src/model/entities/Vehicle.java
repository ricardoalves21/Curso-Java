package model.entities;

public class Vehicle {  // veículo

    private String model;  // modelo

    public Vehicle(){
    }

    public Vehicle(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
