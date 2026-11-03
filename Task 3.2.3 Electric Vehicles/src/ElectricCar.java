public class ElectricCar extends AbstractVehicle{
    private int batteryLevel;
    private String color;

    public ElectricCar(String color, int batteryLevel){
        super("Electric Car", "Electricity");
        this.batteryLevel = batteryLevel;
        this.color = color;
    }
    @Override
    public void charge(){
        batteryLevel = 100;
        System.out.println(getType() + " is charging... battery now " + batteryLevel + "%");
    }

    @Override
    protected String getExtraInfo(){
        return "Color: " + color +
                "\nBattery: " + batteryLevel + "%";

    }
}
