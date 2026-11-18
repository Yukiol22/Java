import java.util.LinkedList;

public class ServicePoint {
    private LinkedList<Customer> queue = new LinkedList<>();

    public void addToQueue(Customer customer) {
        queue.add(customer);
    }

    public Customer removeFromQueue() {
        return queue.poll();
    }

    public int queueLength() {
        return queue.size();
    }
}