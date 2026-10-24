//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give me lengths of the legs");
        System.out.print("Starting with first length: ");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.print("then another one: ");
        double b = Double.parseDouble(scanner.nextLine());

        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.print("The length of the hypotenuse of the triangle is : " + c);
    }
}