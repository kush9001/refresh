package APIE;

public class Main {
    public static void main(String[] args){
        Vehicle car = new Car("Volvo", "S60CC");
        Vehicle motorcycle = new Motorcycle("Kawasaki", "Ninja");

        rentVehicle(car);
        rentVehicle(motorcycle);
    }
    //polymorphism as vehicle has many forms and car and motorcycle can both have a drive method even though their respective methods are different.
    public static void rentVehicle(Vehicle vehicle){
        vehicle.drive();
    }
}
