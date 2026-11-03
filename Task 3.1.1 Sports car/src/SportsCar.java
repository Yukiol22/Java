public class SportsCar extends Car {
    public SportsCar(String typeName, double speed, double tankCapacity) {
        super(typeName, speed, tankCapacity);
    }
    @Override
    public void accelerate() {
        super.accelerate();
        super.accelerate();
    }
    @Override
    public void decelerate(int amount) {
        super.decelerate(amount * 2);
    }
}