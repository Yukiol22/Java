import java.util.ArrayList;
public class VehicleDemo {
    public static void main(String[] args){
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        Car testcar = new Car("Petrol", "Red");
        Motorcycle testmotor = new Motorcycle("Gasoline","Black");
        Bus testBus = new Bus("diesel", 40);

        vehicles.add(testcar);
        vehicles.add(testmotor);
        vehicles.add(testBus);

        System.out.println("Vehicle Demonstration");
        System.out.println();

        for (Vehicle v : vehicles){
            v.start();
            v.stop();
            System.out.println(v.getInfo());
            System.out.println();
        }

    }
}
