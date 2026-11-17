import java.util.PriorityQueue;

public class EventList {
    private PriorityQueue<Event> list = new PriorityQueue<>();

    public void add(Event event) {
        list.add(event);
    }

    public Event remove() {
        return list.remove();
    }

    public void print() {
        while (list.size() > 0) {
            System.out.println(list.remove().toString());
        }
    }
}