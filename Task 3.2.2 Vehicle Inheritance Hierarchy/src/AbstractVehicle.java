public abstract class AbstractVehicle implements Vehicle {
    protected String type;
    protected String fuel;
    protected boolean running;

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

    public boolean isRunning() { return running; }
    public String getType()    { return type; }
    public String getFuel()    { return fuel; }
}