import java.util.ArrayList;

class SafeList {
    private ArrayList<String> list = new ArrayList<>();

    public synchronized void add(String item) {
        list.add(item);
    }

    public synchronized int size() {
        return list.size();
    }

    public synchronized boolean remove(String item) {
        return list.remove(item);
    }
}


class Adder implements Runnable {
    private SafeList list;
    private int ammount;

    public Adder(SafeList list, int ammount) {
        this.list = list;
        this.ammount = ammount;
    }

    public void run() {
        for (int i = 0; i < ammount; i++) {
            list.add("eaeaweawe");
        }
    }
}


class Remover implements Runnable {
    private SafeList list;
    private int ammount;

    public Remover(SafeList list, int ammount) {
        this.list = list;
        this.ammount = ammount;
    }

    public void run() {
        for (int i = 0; i < ammount; i++) {
            list.remove("eaeaweawe");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        SafeList list = new SafeList();

        Thread adder1 = new Thread(new Adder(list, 1000));
        Thread adder2 = new Thread(new Adder(list, 1000));

        adder1.start();
        adder2.start();

        try {
            adder1.join();
            adder2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Ammount " + list.size());

        Thread remover = new Thread(new Remover(list, 500));
        remover.start();
        try {
            remover.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Ammount " + list.size());
    }
}