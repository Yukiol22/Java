import java.util.ArrayList;

public class VehicleDemo {
    public static void main(String[] args) {
        ArrayList<AbstractVehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("Petrol", "Red"));
        vehicles.add(new Motorcycle("Gasoline", "Black"));
        vehicles.add(new Bus("Diesel", 40));
        vehicles.add(new ElectricCar("White", 20));
        vehicles.add(new ElectricMotorcycle("Blue", 35));

        System.out.println("Vehicle Demonstration");
        System.out.println();

        for (AbstractVehicle v : vehicles) {
            v.start();
            v.stop();
            v.charge();
            System.out.println(v.getInfo());
            System.out.println();
        }
    }
}