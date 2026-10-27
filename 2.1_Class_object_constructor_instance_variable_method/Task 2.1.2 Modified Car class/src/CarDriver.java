public class CarDriver {
    public static void main(String[] args) {

        Car fastCar = new Car("Toyota Corolla 2", 50.0, 30.0);


        for (int i = 0; i < 6; i++) {
            fastCar.accelerate();
            System.out.println(fastCar.getTypeName() + ": speed is " + fastCar.getSpeed() + " km/h");
        }

        while (fastCar.getSpeed() > 0) {
            fastCar.decelerate(10);
            System.out.println(fastCar.getTypeName() + ": speed is " + fastCar.getSpeed() + " km/h");
        }
    }
}