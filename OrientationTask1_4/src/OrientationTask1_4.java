import java.util.LinkedList;
import java.util.Scanner;

public class OrientationTask1_4 {
    public static void main(String[] args) {
        LinkedList<Customer> queue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1 = queue a customer, 2 = dequeue a customer, 0 = quit");
            int answer = Integer.parseInt(scanner.nextLine());

            if (answer == 1) {
                Customer c = new Customer();
                c.setStartTime(System.nanoTime());
                queue.addFirst(c);
                System.out.println("Customer " + c.getId() + " joined the queue. Queue size: " + queue.size());
            } else if (answer == 2) {
                if (queue.isEmpty()) {
                    System.out.println("The queue is empty.");
                } else {
                    Customer c = queue.removeLast();
                    c.setEndTime(System.nanoTime());
                    double seconds = c.getTimeSpent() /1_000_000_000.0;
                    double rounded = Math.round(seconds * 100) / 100.0;
                    System.out.println("Customer " + c.getId() + "left. Time in queue: " + rounded + " seconds");
                }

            }
            else if (answer == 0) {
                System.out.println("Quit");
                break;
            } else {
                System.out.println("Unknown choice.");
            }
        }
    }
}
