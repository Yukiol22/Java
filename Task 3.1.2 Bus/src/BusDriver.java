public class BusDriver {
    public static void main(String[] args) {
        Bus bus = new Bus("Volvo 8900", 300, 50);
        System.out.println(bus);

        System.out.println("10 enter: " + bus.passengerEnter(10));
        System.out.println("45 enter: " + bus.passengerEnter(45));
        System.out.println("4 exit: " + bus.passengerExit(4));
        System.out.println("20 exit: " + bus.passengerExit(20));
        System.out.println(bus);

        bus.accelerate();
        bus.accelerate();

        System.out.println(bus.getTypeName() + ": speed is " + bus.getSpeed() + " km/h");
    }
}
