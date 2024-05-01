package APIE;

public abstract class Vehicle {
    private String brand;
    private String model;

    public Vehicle(String brand, String model){
        this.brand = brand;
        this.model = model;
    }

    public abstract void drive();

    public String getBrand(){
        return brand;
    }
    public String getModel(){
        return model;
    }
}
