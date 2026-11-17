public class Main {
    public static void main(String[] args) {
        EventList eventList = new EventList();

        eventList.add(new Event(5));
        eventList.add(new Event(10));
        eventList.add(new Event(8));
        eventList.add(new Event(3));
        eventList.add(new Event(12));

        System.out.println("Removed: " + eventList.removeNext());

        System.out.println("Event list:");
        eventList.print();
    }
}