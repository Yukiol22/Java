public class Car extends AbstractVehicle {
    private String color;

    public Car(String fuel, String color) {
        super("Car", fuel);
        this.color = color;
    }

    @Override
    protected String getExtraInfo() {
        return "Color: " + color;
    }
}
