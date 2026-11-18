import eduni.distributions.Negexp;

public class Main {
    public static void main(String[] args) {
        Clock clock = Clock.getInstance();
        EventList eventList = new EventList();

        ArrivalProcess arrivals = new ArrivalProcess(new Negexp(10), EventType.ARRIVAL);

        for (int i = 0; i < 10; i++) {
            Event event = arrivals.generateNextEvent(eventList);
            clock.setTime(event.getTime());
        }

        System.out.println("Clock time now: " + clock.getTime());
        System.out.println("Event list:");
        eventList.print();
    }
}