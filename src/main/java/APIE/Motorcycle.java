package APIE;

public class Motorcycle extends Vehicle {
    public Motorcycle(String brand, String model){
        super(brand, model);
    }

    @Override
    public void drive(){
        System.out.println("I am driving the Motorcycle of brand " + this.getBrand() + " and model " + this.getModel());
    }
}
