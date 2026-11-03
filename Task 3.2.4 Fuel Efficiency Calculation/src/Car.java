public class Car extends AbstractVehicle {
    private String color;

    public Car(String fuel, String color) {
        super("Car", fuel);
        fuelEfficiency = 15.4;
        this.color = color;
    }

    @Override
    protected String getExtraInfo() {
        return "Color: " + color;
    }
}