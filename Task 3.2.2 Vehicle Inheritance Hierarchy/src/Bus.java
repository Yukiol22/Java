public class Bus extends AbstractVehicle {
    private int capacity;

    public Bus(String fuel, int capacity) {
        super("Bus", fuel);
        this.capacity = capacity;
    }

    @Override
    protected String getExtraInfo() {
        return "Capacity: " + capacity + " passengers";
    }
}