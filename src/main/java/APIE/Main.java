package APIE;

public class Main {
    public static void main(String[] args){
        Vehicle car = new Car("Volvo", "S60CC");
        Vehicle motorcycle = new Motorcycle("Kawasaki", "Ninja");

        rentVehicle(car);
        rentVehicle(motorcycle);
    }

    public static void rentVehicle(Vehicle vehicle){
        vehicle.drive();
    }
}
