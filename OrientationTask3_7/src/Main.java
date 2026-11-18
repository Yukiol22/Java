import eduni.distributions.Negexp;

public class Main {
    public static void main(String[] args) {
        Clock clock = Clock.getInstance();
        EventList eventList = new EventList();
        ServicePoint servicePoint = new ServicePoint();
        ArrivalProcess arrivals = new ArrivalProcess(new Negexp(10), EventType.ARRIVAL);


        for (int i = 0; i < 10; i++) {
            Event event = arrivals.generateNextEvent(eventList);
            clock.setTime(event.getTime());
        }
        System.out.println("Clock after creating events: " + clock.getTime());


        while (eventList.size() > 0) {
            Event event = eventList.remove();
            Customer customer = new Customer(event.getTime());
            servicePoint.addToQueue(customer);
        }
        System.out.println("Customers in queue: " + servicePoint.queueLength());


        clock.setTime(clock.getTime() + 5);
        System.out.println("Clock moved to: " + clock.getTime());

        while (servicePoint.queueLength() > 0) {
            Customer customer = servicePoint.removeFromQueue();
            customer.setDepartureTime(clock.getTime());
            double timeInSystem = customer.getDepartureTime() - customer.getArrivalTime();
            System.out.println("Customer " + customer.getId()
                    + " arrived " + customer.getArrivalTime()
                    + ", left " + customer.getDepartureTime()
                    + ", time in system: " + timeInSystem);
        }
    }
}