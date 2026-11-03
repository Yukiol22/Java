public class ElectricMotorcycle extends AbstractVehicle{
    private String color;
    private int batteryLevel;

    public ElectricMotorcycle(String color, int batteryLevel){
        super("ElectricMotorcycle","Electricity");
        this.color=color;
        this.batteryLevel = batteryLevel;
    }
    @Override
    public void charge(){
        batteryLevel = 100;
        System.out.println(getType() + " is charging... battery now " + batteryLevel + "%");
    }
    @Override
    protected String getExtraInfo(){
        return "Color: " + color + "\nBattery: " + batteryLevel + "%";
    }
}
