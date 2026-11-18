import eduni.distributions.ContinuousGenerator;

public class ArrivalProcess {
    private ContinuousGenerator generator;
    private EventType type;

    public ArrivalProcess(ContinuousGenerator generator, EventType type) {
        this.generator = generator;
        this.type = type;
    }


    public Event generateNextEvent(EventList eventList) {
        double eventTime = Clock.getInstance().getTime() + generator.sample();
        Event event = new Event(type, eventTime);
        eventList.add(event);
        return event;
    }
}