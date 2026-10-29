public class CarDriver {
    public static void driveWithCruise(Car fastCar) {
        if (!fastCar.speedTargetIsValid()) {
            System.out.println("Trying target speed " + fastCar.getTargetSpeed()
                    + " ... refused (min is " + Car.MIN_CRUISE + ", max is " + Car.MAX_CRUISE + ")");
            return;
        }
        if (!fastCar.isCruisseIsOn()) {
            if (fastCar.getGasolineLevel() <= 0) {
                System.out.println("Tank is empty, cruise control can't turn on");
            } else {
                System.out.println("Cruise control is off, can't drive to " + fastCar.getTargetSpeed() + " km/h");
            }
            return;
        }
        while (fastCar.speedTargetIsValid() && fastCar.isCruisseIsOn()) {
            if (fastCar.getGasolineLevel() <= 0) {
                fastCar.setCruisseOff();
                System.out.println("Cruise control off");
                System.out.println("Gas ran out, cruise control turned off: true");
                break;
            }
            if (fastCar.getSpeed() < fastCar.getTargetSpeed()) {
                fastCar.accelerate();
            } else {
                fastCar.decelerate(10);
            }

            System.out.println(fastCar.getTypeName() + ": speed is " + fastCar.getSpeed() + " km/h");

            if (fastCar.getSpeed() == fastCar.getTargetSpeed()) {
                System.out.println(fastCar.getTypeName() + ": speed is " + fastCar.getSpeed() + " km/h (holding)");
                break;
            }
        }
    }

    public static void main(String[] args) {
        Car test = new Car("Toyota Corolla 2", 0, 30.0);
        test.setTargetSpeed(100);
        System.out.println(test.getTypeName() + " : speed is " + test.getSpeed() + " km/h");
        System.out.println("Target speed set to " + test.getTargetSpeed() + " km/h");

        System.out.println("Cruise control on: " + test.setCruisseOn());

        driveWithCruise(test);

        System.out.println("Cruise control on: " + test.setCruisseOn());
        driveWithCruise(test);

        test.fillTank();
        test.setTargetSpeed(150);
        System.out.println("Target speed set to " + test.getTargetSpeed() + " km/h");
        System.out.println("Cruise control on: " + test.setCruisseOn());
        driveWithCruise(test);

        test.setTargetSpeed(350);
        System.out.println("Target speed set to " + test.getTargetSpeed() + " km/h");
        driveWithCruise(test);
    }
}