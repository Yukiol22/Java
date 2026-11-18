public class Event implements Comparable<Event> {
    private double time;
    private EventType type;

    public Event(EventType type, double time) {
        this.type = type;
        this.time = time;
    }

    public double getTime() {
        return time;
    }

    public int compareTo(Event other) {
        if (time == other.time)
            return 0;
        else if (time > other.time)
            return 1;
        else
            return -1;
    }

    public String toString() {
        return "Event at time " + time + ", type: " + type;
    }
}