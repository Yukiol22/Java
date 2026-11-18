public class Customer {
    private static int count = 0;
    private int id;
    private double arrivalTime;
    private double departureTime;

    public Customer(double arrivalTime) {
        count++;
        this.id = count;
        this.arrivalTime = arrivalTime;
    }

    public int getId() {
        return id;
    }

    public double getArrivalTime() {
        return arrivalTime;
    }

    public double getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(double departureTime) {
        this.departureTime = departureTime;
    }
}

