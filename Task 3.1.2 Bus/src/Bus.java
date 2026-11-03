public class Bus extends Car {
    private int passengers;
    private int maxPassengers;

    public Bus(String typeName, double tankCapacity, int maxPassengers) {
        super(typeName, 0, tankCapacity);
        this.passengers = 0;
        this.maxPassengers = maxPassengers;
    }

    public boolean passengerEnter(int count) {
        if (count <= 0 || passengers + count > maxPassengers) {
            return false;
        }
        passengers += count;
        return true;
    }

    public boolean passengerExit(int count) {
        if (count <= 0 || count > passengers) {
            return false;
        }
        passengers -= count;
        return true;
    }

    public int getPassengers() {
        return passengers;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    @Override
    public String toString() {
        return getTypeName() + " (" + passengers + "/" + maxPassengers + " passengers)";
    }
}
