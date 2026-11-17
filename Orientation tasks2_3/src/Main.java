public class Main {
    public static void main(String[] args) {
        EventList eventList = new EventList();

        eventList.add(new Event(EventType.ARRIVAL, 5));
        eventList.add(new Event(EventType.ARRIVAL, 10));
        eventList.add(new Event(EventType.EXIT, 8));
        eventList.add(new Event(EventType.ARRIVAL, 3));
        eventList.add(new Event(EventType.EXIT, 12));

        System.out.println("Removed: " + eventList.remove());


        System.out.println("Event list:");
        eventList.print();
    }
}