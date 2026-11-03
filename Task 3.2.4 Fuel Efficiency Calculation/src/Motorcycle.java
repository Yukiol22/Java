public class Motorcycle extends AbstractVehicle {
    private String color;

    public Motorcycle(String fuel, String color) {
        super("Motorcycle", fuel);
        fuelEfficiency = 25.0;
        this.color = color;
    }

    @Override
    protected String getExtraInfo() {
        return "Color: " + color;
    }
}