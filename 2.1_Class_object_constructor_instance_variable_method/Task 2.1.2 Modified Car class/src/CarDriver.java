public class CarDriver {
    public static void main(String[] args) {
        Car myCar;

        myCar = new Car("Toyota Corolla");
        Car fastCar = new Car("Toyota Corolla 2", 50.0, 30.0);
        myCar.fillTank();

        for (int i = 0; i < 6; i++) {
            myCar.accelerate();
            fastCar.accelerate();
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
            System.out.println(fastCar.getTypeName() + ": speed is " + fastCar.getSpeed() + " km/h");
        }

        while (myCar.getSpeed() > 0) {
            myCar.decelerate(15);
            fastCar.decelerate(10);
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
            System.out.println(fastCar.getTypeName() + ": speed is " + fastCar.getSpeed() + " km/h");
        }
    }
}