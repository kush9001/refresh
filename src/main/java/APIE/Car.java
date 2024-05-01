package APIE;

public class Car extends Vehicle{
    public Car(String brand, String model){
        super(brand, model);
    }

    @Override
    public void drive(){
        System.out.println("I am driving a car with brand " + this.getBrand() + " and model " + this.getModel());
    }

}
