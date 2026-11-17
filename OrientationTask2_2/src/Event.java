public class Event implements Comparable<Event>{
    private int time;

    public Event(int time) {
        this.time = time;
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
        return "Event at time " + time;
    }
}
