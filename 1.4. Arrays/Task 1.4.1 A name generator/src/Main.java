import java.util.Scanner;
public class Main{
    public static void main(String[] arg){
        String[] firstNames = {"Alice", "Benjamin", "Chloe", "David"};
        String[] lastNames = {"Smith", "Johnson", "Williams", "Brown"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many random names should I generate? ");
        int repeat = Integer.parseInt(scanner.nextLine());
        String[] fullNames = new String[repeat];
        for (int i = 0; i < repeat; i++){
            String factor1 = firstNames[(int) (Math.random() * firstNames.length)];
            String factor2 = lastNames[(int) (Math.random() * lastNames.length)];
            fullNames[i] = factor1 + " " + factor2;
            System.out.println(fullNames[i]);
        }
    }
}