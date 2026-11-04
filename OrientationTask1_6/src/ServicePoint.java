import java.util.LinkedList;

public class ServicePoint {
    private LinkedList<Customer> queue = new LinkedList<>();
    private long totalServiceTime = 0;
    private int servedCustomers = 0;
    public void addToQueue(Customer a) {
        queue.addFirst(a);
    }

    public Customer removeFromQueue() {
        return queue.removeLast();
    }

    public void serve() {
        while (!queue.isEmpty()) {
            Customer c = removeFromQueue();
            long serviceStart = System.currentTimeMillis();

            long sleeptime = (long) (Math.random() * 400) + 100;
            try {
                Thread.sleep(sleeptime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            c.setEndTime(System.currentTimeMillis());
            long serviceTime = c.getEndTime() - serviceStart;
            long responseTime = c.getTimeSpent();
            totalServiceTime += serviceTime;
            servedCustomers++;
            System.out.println("Customer " + c.getId() + ": service time " + serviceTime
                    + " ms, response time " + responseTime + " ms");
        }
    }
    public double getAverageServiceTime() {
        if (servedCustomers == 0) return 0;
        return (double) totalServiceTime / servedCustomers;
    }
}