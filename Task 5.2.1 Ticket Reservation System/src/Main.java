import java.util.ArrayList;

class Theater {
    private int seats;

    public Theater(int seats) {
        this.seats = seats;
    }


    public synchronized boolean reserve(int tickets) {
        if (tickets <= seats) {
            seats = seats - tickets;
            return true;
        } else {
            return false;
        }
    }

    public int getSeats() {
        return seats;
    }
}


class Customer extends Thread {
    private Theater theater;
    private int id;
    private int tickets;

    public Customer(Theater theater, int id, int tickets) {
        this.theater = theater;
        this.id = id;
        this.tickets = tickets;
    }
    @Override
    public void run() {
        if (theater.reserve(tickets)) {
            System.out.println("Customer " + id + " reserved " + tickets + " tickets.");
        } else {
            System.out.println("Customer " + id + " couldn't reserve " + tickets + " tickets.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Theater theater = new Theater(10);
        ArrayList<Customer> customers = new ArrayList<>();


        for (int i = 1; i <= 15; i++) {
            int tickets = (int) (Math.random() * 4) + 1;
            customers.add(new Customer(theater, i, tickets));
        }

        for (Thread t : customers) {
            t.start();
        }


        for (Thread t : customers) {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Seats left: " + theater.getSeats());
    }
}