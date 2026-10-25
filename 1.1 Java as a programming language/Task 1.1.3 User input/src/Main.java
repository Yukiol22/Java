//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give the 1st number: ");
        int eka = Integer.parseInt(scanner.nextLine());

        System.out.print("Give the 2nd number: ");
        int toka = Integer.parseInt(scanner.nextLine());

        System.out.print("Give the 3nd number: ");
        int kolmas = Integer.parseInt(scanner.nextLine());

        int pro = eka * toka * kolmas;

        int sum = eka + toka + kolmas;

        int avg = sum / 3;

        System.out.println("Sum is " + sum);
        System.out.println("Product is " + pro);
        System.out.println("Average " + avg);
    }
}