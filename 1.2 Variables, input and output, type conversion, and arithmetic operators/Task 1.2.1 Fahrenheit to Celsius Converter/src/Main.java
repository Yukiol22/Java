import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give Me A Fahrenheit: ");
        int F = Integer.parseInt(scanner.nextLine());
        double C = ((F - 32)/ 1.8);

        System.out.print("Fahrenheit Convert to Celsius is: " + C);
    }
}
