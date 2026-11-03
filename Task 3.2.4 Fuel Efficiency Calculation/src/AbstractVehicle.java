public abstract class AbstractVehicle implements Vehicle, ElectricVehicle {
    protected String type;
    protected String fuel;
    protected boolean running;
    protected double fuelEfficiency;    // km/l (km/kWh for electric)

    public AbstractVehicle(String type, String fuel) {
        this.type = type;
        this.fuel = fuel;
        this.running = false;
    }

    @Override
    public void start() {
        running = true;
        System.out.println(type + " is starting...");
    }

    @Override
    public void stop() {
        running = false;
        System.out.println(type + " is stopping...");
    }

    @Override
    public String getInfo() {
        return type + " Information:\nType: " + type + "\nFuel: " + fuel + "\n" + getExtraInfo();
    }

    protected abstract String getExtraInfo();

    @Override
    public void charge() {
        System.out.println(type + ": Not possible to charge.");
    }

    @Override
    public double calculateFuelEfficiency() {
        return fuelEfficiency;
    }

    public double calculateFuel() {
        if (fuel.equals("Electricity")) {
            return fuelEfficiency * 0.621;
        }
        return fuelEfficiency * 2.352;
    }

    public String getM() {
        if (fuel.equals("Electricity")) return "km/kWh";
        return "km/l";
    }

    public String getI() {
        if (fuel.equals("Electricity")) return "miles/kWh";
        return "mpg";
    }


}