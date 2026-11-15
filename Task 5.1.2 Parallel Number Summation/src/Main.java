import java.util.ArrayList;
class MultiThreadSum extends Thread {
    private int[] numbers;
    private int id;
    private long sum;
    private int from;
    private int to;
    public MultiThreadSum(int[] numbers, int from, int to, int id) {
        this.numbers = numbers;
        this.id = id;
        this.from = from;
        this.to = to;
        this.sum = 0;
    }

    @Override
    public void run() {
        for (int i = from; i < to; i++) {   // only this thread's part
            sum += numbers[i];
        }
    }
    public int getNumber() {
        return id;
    }
    public long getSum() {
        return sum;
    }
}
public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[100000];
        for (int j = 0; j < numbers.length; j++) {
            numbers[j] = (int) (Math.random() * 100);
        }
        int cores = Runtime.getRuntime().availableProcessors();
        System.out.println("Our system has " + cores + " processor cores");

        ArrayList<MultiThreadSum> threads = new ArrayList<>();
        int divided = numbers.length / cores;
        for (int i = 0; i < cores; i++){
            int from = i * divided;
            int to = from + divided;
            if (i == cores - 1){
                to = numbers.length;
            }
            threads.add(new MultiThreadSum(numbers, from , to ,i));
        }


        for (MultiThreadSum t : threads) {
            t.start();
        }
        long total = 0;

        for (MultiThreadSum t : threads) {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread " + t.getNumber() + " sum: " + t.getSum());
            total += t.getSum();
        }
        long check = 0;

        for (int n : numbers) {
            check += n;
        }
        System.out.println(check);

        System.out.println("Total sum: " + total);
    }
}