import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" enter two positive integers, start and end (where start < end)");
        System.out.print(" enter the start: ");
        int x = Integer.parseInt(scanner.nextLine());
        System.out.print(" enter the end: ");
        int y = Integer.parseInt(scanner.nextLine());
        String prime = "";
        for (int j = x; j <= y; j++) {
            for (int i = 2; i <= j; i++) {
                if (j % i == 0 && i != j) {
                    break;
                }
                if (j % i == 0 && i == j) {
                    prime += j + ", ";
                }
            }
        }

        System.out.println("Prime numbers between " + x + " and " + y + " : " + prime);
    }
}

