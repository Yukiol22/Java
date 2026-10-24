//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("give me a: ");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.print("give me b: ");
        int b = Integer.parseInt(scanner.nextLine());
        System.out.print("give me c: ");
        int c = Integer.parseInt(scanner.nextLine());
        double discriminant = Math.pow(b, 2) -4 * a * c;

        if (discriminant < 0) {
            System.out.print("No real roots.");
        }
        else {
            double x1 = (-b + Math.sqrt(discriminant));

            double x2 = (-b - Math.sqrt(discriminant));

            System.out.print("Roots "+ x1 + "and, " + x2);

        }

    }
}