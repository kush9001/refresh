package APIE;

public abstract class Vehicle {
    private final String brand;
    private final String model;

    public Vehicle(String brand, String model){
        this.brand = brand;
        this.model = model;
    }
    //this is abstraction as subclasses can just implement these methods without having it be defined in the parent class
    public abstract void drive();
    //this is encapsulation as subclasses need to use these methods in order to obtain the information from the parent class
    public String getBrand(){
        return brand;
    }
    public String getModel(){
        return model;
    }
}
