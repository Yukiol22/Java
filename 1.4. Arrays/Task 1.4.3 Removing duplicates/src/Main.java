import java.util.Scanner;
public class Main {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int repeat = Integer.parseInt(scanner.nextLine());
        int[] integers = new int[repeat];

        System.out.println("Enter the integers into the array:");
        for (int i = 0; i < repeat; i++) {
            System.out.print("Enter the integers " + (i + 1) + ": ");
            integers[i] = scanner.nextInt();
        }
        int[] integers2 = new int[repeat];
        boolean check;
        int num = 0;

        for (int i = 0; i < repeat; i++) {
            check = true;
            for (int j = 0; j < i; j++) {
                if (integers[i] == integers[j]) {
                    check = false;
                    break;
                }
            }
            if (check) {
                integers2[num] = integers[i];
                num++;
            }
        }
        System.out.println("The array without duplicates:");
        for (int i = 0; i < num; i++) {
            System.out.print(integers2[i] + " ");
        }
    }
}