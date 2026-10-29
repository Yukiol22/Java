public class Car {
    public static final int MIN_CRUISE = 30;
    public static final int MAX_CRUISE = 150;

    private double speed;
    private double gasolineLevel;
    private double tankCapacity;
    private String typeName;
    private int targetSpeed;
    private boolean cruisseIsOn;
    private boolean speedTargetIsValid;

    public Car(String typeName) {
        this(typeName, 0, 100);
        gasolineLevel = 0;
    }

    public Car(String typeName, double speed, double tankCapacity) {
        this.typeName = typeName;
        this.speed = speed;
        this.tankCapacity = tankCapacity;
        this.gasolineLevel = tankCapacity;
    }

    public void accelerate() {
        if (gasolineLevel > 0) {
            speed += 10;
            gasolineLevel = Math.max(0, gasolineLevel - 5);
        } else {
            speed = 0;
            cruisseIsOn = false;
        }
    }

    void decelerate(int amount) {
        if (gasolineLevel > 0) {
            if (amount > 0)
                speed = Math.max(0, speed - amount);
        } else {
            speed = 0;
            cruisseIsOn = false;
        }
    }

    public void setTargetSpeed(int targetSpeed) {
        this.targetSpeed = targetSpeed;
        if (targetSpeed >= MIN_CRUISE && targetSpeed <= MAX_CRUISE) {
            speedTargetIsValid = true;
        } else {
            speedTargetIsValid = false;
        }
    }

    int getTargetSpeed() {
        return targetSpeed;
    }

    boolean speedTargetIsValid() {
        return speedTargetIsValid;
    }


    boolean setCruisseOn() {
        cruisseIsOn = speedTargetIsValid && gasolineLevel > 0;
        return cruisseIsOn;
    }

    boolean setCruisseOff() {
        cruisseIsOn = false;
        return cruisseIsOn;
    }

    boolean isCruisseIsOn() {
        return cruisseIsOn;
    }

    double getSpeed() {
        return speed;
    }

    String getTypeName() {
        return typeName;
    }

    void fillTank() {
        gasolineLevel = tankCapacity;
    }

    double getGasolineLevel() {
        return gasolineLevel;
    }
}