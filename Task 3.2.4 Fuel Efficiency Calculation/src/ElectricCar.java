public class ElectricCar extends AbstractVehicle {
    private String color;
    private int batteryLevel;

    public ElectricCar(String color, int batteryLevel) {
        super("Electric Car", "Electricity");
        fuelEfficiency = 6.3;
        this.color = color;
        this.batteryLevel = batteryLevel;
    }

    @Override
    public void charge() {
        batteryLevel = 100;
        System.out.println(type + " is charging... battery now " + batteryLevel + "%");
    }

    @Override
    protected String getExtraInfo() {
        return "Color: " + color + "\nBattery: " + batteryLevel + "%";
    }
}