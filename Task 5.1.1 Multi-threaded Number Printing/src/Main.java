class Odd extends Thread{
    private int start;
    private int end;

    public Odd(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                System.out.println("Odd Thread: " + i);
            }
        }
    }
}
class Even extends Thread{
    private int start;
    private int end;

    public Even(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.println("Even Thread: " + i);
            }
        }
    }
}


public class Main {
    public static void main(String[] args){
        int start = 0;
        int end = 20;
        Odd odd = new Odd( start, end);
        Even evev = new Even( start, end);
        odd.start();
        evev.start();

        try {
            odd.join();
            evev.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Printing complete.");
    }
}
